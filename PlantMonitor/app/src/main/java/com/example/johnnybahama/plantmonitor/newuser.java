package com.example.johnnybahama.plantmonitor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

import java.security.Provider;

public class newuser extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newuser);

        Button navtomain = (Button) findViewById(R.id.create);

        navtomain.setOnClickListener(new View.OnClickListener() {

            Profile profileHolder;
            @Override
            public void onClick(View view) {



                //profileHolder.setEmail();

                Intent intent = new Intent(newuser.this, WelcomeScreen.class);
                startActivity(intent);
            }
        });
    }
}
