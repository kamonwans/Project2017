package com.example.kamonwan.projecttsg.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.kamonwan.projecttsg.R;
import com.example.kamonwan.projecttsg.adapter.MainMenuAdapter;
import com.example.kamonwan.projecttsg.adapter.TabAdapter;
import com.example.kamonwan.projecttsg.fragment.MainMenuFragment;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initInstance();

    }

    private void initInstance() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.pager);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        FragmentTabMenu();
        FragmentMainMenu();
        actionBarDrawerToggle = new ActionBarDrawerToggle(MainActivity.this, drawerLayout,
                R.string.open_drawer, R.string.close_drawer);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("ThaiSpellingGame");
    }

    public void FragmentTabMenu() {
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_home));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_friends));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_badge));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        final TabAdapter tabAdapter = new TabAdapter(getSupportFragmentManager(),
                tabLayout.getTabCount());
        viewPager.setAdapter(tabAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                checkTabChange(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    private void checkTabChange(int position) {
        switch (position){
            case 0:
                viewPager.setCurrentItem(0);
                break;
            case 1:
                viewPager.setCurrentItem(1);
                break;
            case 2:
                viewPager.setCurrentItem(2);
                break;
            default:
                break;
        }
    }

    public void FragmentMainMenu() {
        MainMenuFragment mainMenuFragment = new MainMenuFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.contentContainer, mainMenuFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        getSupportFragmentManager().popBackStack();
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        actionBarDrawerToggle.syncState();

    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        actionBarDrawerToggle.onConfigurationChanged(newConfig);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (actionBarDrawerToggle.onOptionsItemSelected(item))
            return true;
        return super.onOptionsItemSelected(item);
    }
}
