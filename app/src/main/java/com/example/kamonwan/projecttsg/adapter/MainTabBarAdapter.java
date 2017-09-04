package com.example.kamonwan.projecttsg.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.kamonwan.projecttsg.R;

/**
 * Created by kamonwan on 9/4/2017.
 */

public class MainTabBarAdapter extends RecyclerView.Adapter<MainTabBarAdapter.ViewHolder> {
    int[] iconTabBar;

    public MainTabBarAdapter(int[] iconTabBar) {
        this.iconTabBar = iconTabBar;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_fragment_main, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.imageIconTabBar.setImageResource(iconTabBar[position]);
    }

    @Override
    public int getItemCount() {
        return iconTabBar.length;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageIconTabBar;

        public ViewHolder(View itemView) {
            super(itemView);
            imageIconTabBar = (ImageView) itemView.findViewById(R.id.iconTabBar);
        }
    }

}
