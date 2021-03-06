package com.example.kamonwan.projecttsg.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.kamonwan.projecttsg.activity.MainActivity;
import com.example.kamonwan.projecttsg.activity.MainContactActivity;
import com.example.kamonwan.projecttsg.adapter.MainMenuAdapter;
import com.example.kamonwan.projecttsg.R;

import static com.example.kamonwan.projecttsg.R.layout.fragment_rank;

public class MainMenuFragment extends Fragment {
    int[] icon, nameMenu, colorLayout;
    MainMenuAdapter menuAdapter;
    RecyclerView recyclerViewMain;



    public MainMenuFragment() {
    }


    private void MocdataMainMenu() {
        icon = new int[]{R.drawable.icon_learn, R.drawable.icon_test, R.drawable.icon_profile,
                R.drawable.icon_setting, R.drawable.icon_contact};
        nameMenu = new int[]{R.string.name_menu_learn, R.string.name_menu_test, R.string.name_menu_profile
                , R.string.name_menu_setting, R.string.name_menu_contact};
        colorLayout = new int[]{R.color.colorMenuLearn, R.color.colorMenuTest, R.color.colorMenuProfile,
                R.color.colorMenuSetting, R.color.colorMenuContact};
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main_menu, container, false);
        initInstance(view);


        return view;
    }


    private void initInstance(View view) {
        MocdataMainMenu();
        recyclerViewMain = (RecyclerView) view.findViewById(R.id.recyclerViewMain);
        recyclerViewMain.setLayoutManager(new GridLayoutManager(getContext(), 1));
        menuAdapter = new MainMenuAdapter(icon, nameMenu, colorLayout);
        recyclerViewMain.setAdapter(menuAdapter);



    }

}