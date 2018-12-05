package com.soulkitchen.serifenuruysal.flightsearchapp.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import android.content.Context;
import androidx.databinding.ObservableInt;
import androidx.databinding.PropertyChangeRegistry;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.soulkitchen.serifenuruysal.flightsearchapp.ApiClient;
import com.soulkitchen.serifenuruysal.flightsearchapp.R;
import com.soulkitchen.serifenuruysal.flightsearchapp.adapter.DataRecyclerAdapter;
import com.soulkitchen.serifenuruysal.flightsearchapp.utils.CardTransition;
import com.soulkitchen.serifenuruysal.flightsearchapp.data.models.ItinerariesItem;
import com.soulkitchen.serifenuruysal.flightsearchapp.data.models.SessionResponse;
import com.soulkitchen.serifenuruysal.flightsearchapp.data.models.SkyResponse;
import com.soulkitchen.serifenuruysal.flightsearchapp.utils.Utils;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by S.Nur Uysal on 28.11.2018.
 */
public class MainViewModel extends ViewModel implements androidx.databinding.Observable {
    public static final String TAG = "MainViewModel";
    private PropertyChangeRegistry callbacks = new PropertyChangeRegistry();
    public ObservableInt isLoading = new ObservableInt(View.VISIBLE);
    public ObservableInt isInfoVisible = new ObservableInt(View.GONE);
    private MutableLiveData<SkyResponse> skyResponse = new MutableLiveData<>();
    private DataRecyclerAdapter adapter;
    private ArrayList<CardTransition> mItems = new ArrayList<>();
    private Context mContext;
    public int pageIndex = 0;

    public MainViewModel(Context context) {
        mContext = context;
    }

    public RecyclerView.Adapter getAdapter() {

        adapter = new DataRecyclerAdapter(mContext, mItems, new DataRecyclerAdapter.OnItemClickListener() {
            @Override
            public void onItemClicked(CardTransition wrapper) {

            }
        });
        return adapter;
    }

    public RecyclerView.LayoutManager getLayoutManager() {
        return new LinearLayoutManager(mContext);
    }

    @Override
    public void addOnPropertyChangedCallback(OnPropertyChangedCallback callback) {
        callbacks.add(callback);
    }

    @Override
    public void removeOnPropertyChangedCallback(OnPropertyChangedCallback callback) {
        callbacks.remove(callback);
    }

    /**
     * Notifies observers that all properties of this instance have changed.
     */
    void notifyChange() {
        callbacks.notifyCallbacks(this, 0, null);
    }

    /**
     * Notifies observers that a specific property has changed. The getter for the
     * property that changes should be marked with the @Bindable annotation to
     * generate a field in the BR class to be used as the fieldId parameter.
     *
     * @param fieldId The generated BR id for the Bindable field.
     */
    void notifyPropertyChanged(int fieldId) {
        callbacks.notifyCallbacks(this, fieldId, null);
    }

    public void pollData() {
        isLoading.set(View.VISIBLE);

        if (skyResponse != null && skyResponse.getValue() != null && "UpdatesPending".equals(skyResponse.getValue().getStatus())) {
            Toast.makeText(mContext, R.string.message, Toast.LENGTH_SHORT).show();
            return;
        }

          ApiClient.getSession(new Callback<SessionResponse>() {
            @Override
            public void onResponse(Call<SessionResponse> call, retrofit2.Response<SessionResponse> response) {
                final String[] sessinId = {""};
                if (response != null && response.headers() != null && response.headers().get("Location") != null) {
                    sessinId[0] = (String) response.headers().get("Location");

                    if (sessinId != null && sessinId.length > 0) {

                        ApiClient.getInstance().getDetail(Utils.getSessionId(sessinId[0]), Utils.getDefaultParamaters(pageIndex)).enqueue(new Callback<SkyResponse>() {
                            @Override
                            public void onResponse(Call<SkyResponse> call, Response<SkyResponse> response) {
                                if (response.body() != null) {
                                    skyResponse.postValue(response.body());
                                    isLoading.set(View.GONE);


                                }
                            }

                            @Override
                            public void onFailure(Call<SkyResponse> call, Throwable t) {
//                                pollData();
                                isLoading.set(View.GONE);
                            }
                        });
                    }
                }
            }

            @Override
            public void onFailure(Call<SessionResponse> call, Throwable t) {
                isLoading.set(View.GONE);
            }
        });
    }

    public MutableLiveData<SkyResponse> getSkyResponse() {
        return skyResponse;
    }

    public void fillCardData() {
        if (skyResponse != null && skyResponse.getValue() != null && "UpdatesPending".equals(skyResponse.getValue().getStatus())) {
            pageIndex = 0;
            pollData();
        } else {
            isLoading.set(View.GONE);
        }

        ArrayList<CardTransition> tempItems = new ArrayList<>();
        if (skyResponse != null) {
            List<ItinerariesItem> itinaries = skyResponse.getValue().getItineraries();
            for (ItinerariesItem item : itinaries) {
                CardTransition cardItem = new CardTransition(item, skyResponse.getValue());
                tempItems.add(cardItem);
            }

            if (tempItems != null && tempItems.size() > 0 && adapter != null) {
                if (pageIndex > 0) {
                    mItems.addAll(tempItems);
                } else {
                    mItems = new ArrayList(tempItems);
                }
                adapter.notifyDataSetChanged();
                notifyChange();
            }
            isInfoVisible.set(View.VISIBLE);
        }
    }

    public void release() {
        callbacks.clear();
    }

}
