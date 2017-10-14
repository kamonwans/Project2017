package com.example.kamonwan.projecttsg.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.kamonwan.projecttsg.fragment.FreindsOnlineFragment;
import com.example.kamonwan.projecttsg.fragment.HomeFragment;
import com.example.kamonwan.projecttsg.fragment.RankFragment;

/**
 * Created by kamonwan on 10/14/2017.
 */

public class TabAdapter extends FragmentStatePagerAdapter {
    int numOfTab;
    public TabAdapter(FragmentManager fm,int numOfTab) {
        super(fm);
        this.numOfTab = numOfTab;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                HomeFragment homeMenu = new HomeFragment();
                return homeMenu;
            case 1:
                FreindsOnlineFragment freindsOnlineMenu = new FreindsOnlineFragment();
                return freindsOnlineMenu;
            case 2:
                RankFragment rankMenu = new RankFragment();
                return rankMenu;
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return numOfTab;
    }
}
