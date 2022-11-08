package com.seventeen.natright;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View.OnClickListener;
import android.widget.Toolbar;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class section_1 extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section1);

        Button button3;
        BottomNavigationView bottomNavigationView;

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.nav_Organization);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.nav_Rights:
                        startActivity(new Intent(getApplicationContext(), homeScreen.class));
                        overridePendingTransition(R.anim.lefttoright, R.anim.righttoleft);
                        return true;
                    case R.id.nav_Organization:
                        startActivity(new Intent(getApplicationContext(), organizationScreen.class));
                        overridePendingTransition(R.anim.righttoleft, R.anim.lefttoright);
                        return true;

                    case R.id.nav_Information:
                        startActivity(new Intent(getApplicationContext(), infoScreen.class));
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                        return true;
                }

                return false;
            }
        });


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

        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(section_1.this, law_base1.class));
            }
        });

    }

    public void toHomeScreen() {
        Intent i = new Intent (this, homeScreen.class);
        startActivity(i);
    }




}