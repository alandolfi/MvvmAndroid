package com.ar.mvvmpattern;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.ar.mvvmpattern.databinding.ItemListBinding;

import java.util.List;


public class ArticleAdapter extends RecyclerView.Adapter<ArticleAdapter.BindingHolder> {

    private List<Article> mArticles;
    private Context mContext;


    public ArticleAdapter(List<Article> mArticles, Context mContext) {
        this.mArticles = mArticles;
        this.mContext = mContext;
    }

    @Override
    public BindingHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ItemListBinding  binding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.item_list, parent, false);

        return new BindingHolder(binding);
    }

    @Override
    public void onBindViewHolder(BindingHolder holder, int position) {
        ItemListBinding binding = holder.binding;
        binding.setAvm(new ArticleViewModel(mArticles.get(position), mContext));
    }

    @Override
    public int getItemCount() {
        return mArticles.size();
    }

    public static class BindingHolder extends RecyclerView.ViewHolder {
        private ItemListBinding binding;

        public BindingHolder(ItemListBinding binding) {
            super(binding.contactCard);
            this.binding = binding;
        }
    }
}

