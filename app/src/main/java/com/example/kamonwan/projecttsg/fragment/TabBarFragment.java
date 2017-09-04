package com.example.kamonwan.projecttsg.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kamonwan.projecttsg.R;
import com.example.kamonwan.projecttsg.adapter.MainTabBarAdapter;


public class TabBarFragment extends Fragment {
    RecyclerView recyclerViewTabBar;
    int[] iconTabBar;
    MainTabBarAdapter tabBarAdapter;


    public TabBarFragment() {
        // Required empty public constructor
    }

    private void MocDataTabBar() {
        iconTabBar = new int[]{R.drawable.icon_home, R.drawable.icon_online_user, R.drawable.icon_rank};

    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab_bar, container, false);
        initInstance(view);
        return view;
    }

    private void initInstance(View view) {
        MocDataTabBar();
        recyclerViewTabBar = (RecyclerView) view.findViewById(R.id.recyclerViewTabBar);
        recyclerViewTabBar.setLayoutManager(new GridLayoutManager(getContext(), 3));
        tabBarAdapter = new MainTabBarAdapter(iconTabBar);
        recyclerViewTabBar.setAdapter(tabBarAdapter);

    }

}
