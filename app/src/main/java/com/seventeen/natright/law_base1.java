package com.seventeen.natright;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class law_base1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_law_base1);

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
                tosection_1();
            }
        });
    }

    public void tosection_1() {
        Intent i = new Intent (this, section_1.class);
        startActivity(i);
    }
}