package com.soulkitchen.serifenuruysal.flightsearchapp;

import androidx.lifecycle.Observer;
import androidx.databinding.DataBindingUtil;
import android.os.PersistableBundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.soulkitchen.serifenuruysal.flightsearchapp.data.models.SkyResponse;
import com.soulkitchen.serifenuruysal.flightsearchapp.databinding.MainActivityBinding;
import com.soulkitchen.serifenuruysal.flightsearchapp.viewmodel.FlightInfoModel;
import com.soulkitchen.serifenuruysal.flightsearchapp.viewmodel.MainViewModel;

public class MainActivity extends AppCompatActivity {
    MainActivityBinding binding;
    private static final String TAG = "MainActivity";
    int pastVisiblesItems, visibleItemCount, totalItemCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Flight Info");
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        ApiClient.getInstance();
        binding.setLifecycleOwner(this);
        binding.setViewModel(new MainViewModel(this));
        binding.getViewModel().getSkyResponse().observe(this, new Observer<SkyResponse>() {
            @Override
            public void onChanged(@Nullable SkyResponse skyResponse) {
                binding.setFlightInfoModel(new FlightInfoModel(skyResponse));
                binding.getViewModel().fillCardData();

            }
        });
        binding.getViewModel().pollData();
        binding.rvResponse.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                if (dy > 0) //check for scroll down
                {
                    LinearLayoutManager mLayoutManager = (LinearLayoutManager) binding.getViewModel().getLayoutManager();
                    visibleItemCount = mLayoutManager.getChildCount();
                    totalItemCount = mLayoutManager.getItemCount();
                    pastVisiblesItems = mLayoutManager.findFirstVisibleItemPosition();

                    {
//                        Log.v("...", "Last Item Wow ! ");
                        binding.getViewModel().pageIndex++;
                        binding.getViewModel().pollData();

                    }
                }
            }
        });

    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        binding.getViewModel().getSkyResponse().removeObservers(this);
    }


}
