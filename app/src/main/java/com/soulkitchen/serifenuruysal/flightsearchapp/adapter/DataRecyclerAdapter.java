package com.soulkitchen.serifenuruysal.flightsearchapp.adapter;

import android.content.Context;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.soulkitchen.serifenuruysal.flightsearchapp.R;
import com.soulkitchen.serifenuruysal.flightsearchapp.utils.CardTransition;
import com.soulkitchen.serifenuruysal.flightsearchapp.databinding.CardRowBinding;
import com.soulkitchen.serifenuruysal.flightsearchapp.viewmodel.CardViewModel;

import java.util.ArrayList;

/**
 * Created by S.Nur Uysal on 27.11.2018.
 */
public class DataRecyclerAdapter extends RecyclerView.Adapter<DataRecyclerAdapter.ViewHolder> {

    private Context mContext;
    private ArrayList<CardTransition> mItems;
    private OnItemClickListener mListener;

    public DataRecyclerAdapter(Context context, ArrayList<CardTransition> items, OnItemClickListener listener) {
        mContext = context;
        mItems = items;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CardRowBinding binding = DataBindingUtil.inflate(LayoutInflater.from(mContext), R.layout.row_card, parent, false);
        LayoutInflater layoutInflater =
                LayoutInflater.from(parent.getContext());
        CardRowBinding itemBinding =
                CardRowBinding.inflate(layoutInflater, parent, false);
        return new ViewHolder(itemBinding);

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        CardTransition card = mItems.get(position);
        holder.mBinding.setViewModel(new CardViewModel(card));
        holder.bind(card);


    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private CardRowBinding mBinding;

        public ViewHolder(CardRowBinding binding) {
            super(binding.getRoot());
            mBinding = binding;

            mBinding.getRoot().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mListener.onItemClicked(mItems.get(getAdapterPosition()));
                }
            });
        }
        public void bind(CardTransition obj) {
            mBinding.executePendingBindings();
        }
        public void setViewModel(CardViewModel viewModel) {
            mBinding.setViewModel(viewModel);
        }
    }

    public interface OnItemClickListener {
        void onItemClicked(CardTransition wrapper);
    }

}