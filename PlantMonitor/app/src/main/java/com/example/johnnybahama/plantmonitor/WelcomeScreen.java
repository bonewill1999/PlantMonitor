package com.example.johnnybahama.plantmonitor;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;

public class WelcomeScreen extends AppCompatActivity {

    private ArrayList<Profile> profiles = new ArrayList<Profile>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);
    }
}
