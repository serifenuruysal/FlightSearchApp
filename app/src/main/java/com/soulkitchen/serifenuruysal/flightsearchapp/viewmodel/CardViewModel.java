package com.soulkitchen.serifenuruysal.flightsearchapp.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.soulkitchen.serifenuruysal.flightsearchapp.utils.CardTransition;

/**
 * Created by S.Nur Uysal on 27.11.2018.
 */
public class CardViewModel extends ViewModel  {
    private CardTransition mCardData;

    public CardViewModel(CardTransition card) {
        mCardData = card;
    }

    public String getInBoundTime() {
        return mCardData.getInBoundTime();
    }

    public String getInImageUrl() {
        return mCardData.getInImageUrl();
    }

    public String getOutBoundTime() {
        return mCardData.getOutBoundTime();
    }

    public String getOutImageUrl() {
        return mCardData.getOutImageUrl();
    }

    public String getIsInDirect() {
        return mCardData.getIsInDirect();
    }

    public String getIsOutDirect() {
        return mCardData.getIsOutDirect();
    }

    public String getInDuration() {
        return mCardData.getInDuration();
    }

    public String getOutDuration() {
        return mCardData.getOutDuration();
    }

    public String getInSubtitle() {
        return mCardData.getInSubtitle();
    }

    public String getOutSubtitle() {
        return mCardData.getOutSubtitle();
    }

    public String getPrice() {
        return mCardData.getPrice();
    }

    public String getAgent() {
        return mCardData.getAgent();
    }

    /**
     * download image from url and set imageView. This method is in use by xml
     *
     * @param view imageView
     * @param url  image url
     */
    @BindingAdapter({"imageUrl"})
    public static void setImage(ImageView view, String url) {
        RequestManager requestManager = Glide.with(view.getContext());
        RequestBuilder requestBuilder = requestManager.load(url);
        requestBuilder.into(view);
    }

}
