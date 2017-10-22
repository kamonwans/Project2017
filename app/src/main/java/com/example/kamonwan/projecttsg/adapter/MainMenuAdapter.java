package com.example.kamonwan.projecttsg.adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.kamonwan.projecttsg.R;
import com.example.kamonwan.projecttsg.activity.MainContactActivity;


public class MainMenuAdapter extends RecyclerView.Adapter<MainMenuAdapter.ViewHolder> {
    int[] icon;
    int[] nameMenu;
    int[] colorLayout;


    public MainMenuAdapter(int[] icon, int[] nameMenu,int[] colorLayout) {
        this.icon = icon;
        this.nameMenu = nameMenu;
        this.colorLayout = colorLayout;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_fragment_main_menu, parent, false);
        return new ViewHolder(view);
    }



    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.imageIcon.setImageResource(icon[position]);
        holder.textViewNameMenu.setText(nameMenu[position]);
        holder.linearLayout.setBackgroundResource(colorLayout[position]);
    }

    @Override
    public int getItemCount() {
        return icon.length;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageIcon;
        public TextView textViewNameMenu;
        public LinearLayout linearLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            imageIcon = (ImageView) itemView.findViewById(R.id.icon);
            textViewNameMenu = (TextView) itemView.findViewById(R.id.nameMenu);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.linearLayoutMainMenu);


        }
    }

}
