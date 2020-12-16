package com.example.ninersocial;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }
    public void home(View view) {
        Toast.makeText(Profile.this, "Hi there", Toast.LENGTH_SHORT).show();
    }
}