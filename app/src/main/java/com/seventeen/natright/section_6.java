package com.seventeen.natright;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class section_6 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section6);

        Button button3;

        BottomNavigationView bottomNavigationView;
        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.nav_Rights);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.nav_Rights:
                        startActivity(new Intent(getApplicationContext(), homeScreen.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.nav_Organization:
                        startActivity(new Intent(getApplicationContext(), organizationScreen.class));
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                        return true;
                    case R.id.nav_Information:
                        startActivity(new Intent(getApplicationContext(), infoScreen.class));
                        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                        return true;
                }
                return false;
            }
        });

        View toolbar = findViewById(R.id.topToolbar);
        toolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { toHomeScreen(); }
        });

        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) { toLaw1(); }
        });
    }

    public void toHomeScreen() {
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this);
        Intent intent = new Intent(getApplicationContext(), homeScreen.class);
        startActivity(intent, options.toBundle());
    }

    public void toLaw1() {
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this);
        Intent intent = new Intent(getApplicationContext(), law_sec1_1.class);
        startActivity(intent, options.toBundle());
    }
}