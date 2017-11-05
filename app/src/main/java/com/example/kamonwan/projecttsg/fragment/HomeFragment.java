package com.example.kamonwan.projecttsg.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.media.MediaDescriptionCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kamonwan.projecttsg.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.squareup.picasso.Picasso;


public class HomeFragment extends Fragment {
    private TextView tvProfile;
    private ImageView profilePic;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home,
                container, false);
        initInstances(view);
        return view;
    }

    private void initInstances(View view){
        tvProfile = (TextView) view.findViewById(R.id.tvProfile);
        profilePic = (ImageView) view.findViewById(R.id.profilePic);

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

        if (user != null){
            String name = user.getDisplayName();
            String email = user.getEmail();
            String uid = user.getUid();
            String photoUrl = user.getPhotoUrl().toString();

            setTvProfile(name);

            //Picasso.with(this).load(photoUrl).into(profilePic);
        }else {
            //goLoginScreen();
        }

    }

    public void setTvProfile(String text){
        tvProfile.setText(text);
    }





}
