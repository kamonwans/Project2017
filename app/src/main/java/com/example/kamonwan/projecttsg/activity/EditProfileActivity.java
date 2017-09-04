package com.example.kamonwan.projecttsg.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.kamonwan.projecttsg.R;

public class EditProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        initInstance();
    }

    private void initInstance() {
        getSupportActionBar().setTitle("โปรไฟล์");
    }
}
