package com.seventeen.natright;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View.OnClickListener;
import android.widget.Toolbar;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class section_2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section2);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener((item -> {
            switch (item.getItemId())
            {
                case R.id.nav_Rights:
                    startActivity(new Intent(getApplicationContext(), homeScreen.class));
                    overridePendingTransition(0,0);
                    return true;
                case R.id.nav_Organization:
                    startActivity(new Intent(getApplicationContext(), organizationScreen.class));
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                    return true;

                case R.id.nav_Information:
                    startActivity(new Intent(getApplicationContext(), infoScreen.class));
                    overridePendingTransition(R.anim.slide_in_right,
                            R.anim.slide_out_left);
                    return true;
            }
            return false;
        }));
        View toolbar = findViewById(R.id.topToolbar);
        toolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toHomeScreen();
            }
        });

        Button button = (Button)findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { toLaw_base_model();}
        });


    }

    public void toHomeScreen() {
        Intent i = new Intent (this, homeScreen.class);
        startActivity(i);
    }

    public void toLaw_base_model() {
        Intent intent = new Intent (this, law_base_model.class);
        startActivity(intent);
    }
}