package com.seventeen.natright;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class infoScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_screen);

        BottomNavigationView bottomNavigationView;

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.nav_Information);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.nav_Rights:
                        startActivity(new Intent(getApplicationContext(), homeScreen.class));
                        overridePendingTransition(R.anim.slide_in_left,
                                R.anim.slide_out_right);
                        return true;
                    case R.id.nav_Organization:
                        startActivity(new Intent(getApplicationContext(), organizationScreen.class));
                        overridePendingTransition(R.anim.slide_in_left,
                                R.anim.slide_out_right);
                        return true;

                    case R.id.nav_Information:
                        startActivity(new Intent(getApplicationContext(), infoScreen.class));
                        overridePendingTransition(0,0);
                        return true;
                }

                return false;
            }
        });
    }
}