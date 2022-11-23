package com.seventeen.natright;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class section_5 extends AppCompatActivity {
    public String pass_law_ra, pass_law_name, pass_law_chap, pass_law_chapsub, pass_law_section, pass_law_secsub, pass_law_content;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section5);

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

    }

    public void toHomeScreen() {
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this);
        Intent intent = new Intent(getApplicationContext(), homeScreen.class);
        startActivity(intent, options.toBundle());
    }

    public void toLaw1(View v) {
        pass_law_ra = getString(R.string.sec_5_law_ra_1);
        pass_law_name = getString(R.string.sec_5_law_name_1);
        pass_law_chap = getString(R.string.sec_5_law_chap_1);
        pass_law_chapsub = getString(R.string.sec_5_law_chapsub_1);
        pass_law_section = getString(R.string.sec_5_law_section_1);
        pass_law_secsub = getString(R.string.sec_5_law_secsub_1);
        pass_law_content = getString(R.string.sec_5_law_content_1);
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this);
        Intent intent = new Intent(getApplicationContext(), law_model_incomplete.class);
        intent.putExtra("activity", "section_5");
        intent.putExtra("law_ra", pass_law_ra);
        intent.putExtra("law_name", pass_law_name);
        intent.putExtra("law_chap", pass_law_chap);
        intent.putExtra("law_chapsub", pass_law_chapsub);
        intent.putExtra("law_section", pass_law_section);
        intent.putExtra("law_secsub", pass_law_secsub);
        intent.putExtra("law_content", pass_law_content);
        startActivity(intent, options.toBundle());
    }

    public void toLaw2(View v) {
        pass_law_ra = getString(R.string.sec_5_law_ra_2);
        pass_law_name = getString(R.string.sec_5_law_name_2);
        pass_law_chap = getString(R.string.sec_5_law_chap_2);
        pass_law_chapsub = getString(R.string.sec_5_law_chapsub_2);
        pass_law_section = getString(R.string.sec_5_law_section_2);
        pass_law_secsub = getString(R.string.sec_5_law_secsub_2);
        pass_law_content = getString(R.string.sec_5_law_content_2);
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this);
        Intent intent = new Intent(getApplicationContext(), law_model_complete.class);
        intent.putExtra("activity", "section_5");
        intent.putExtra("law_ra", pass_law_ra);
        intent.putExtra("law_name", pass_law_name);
        intent.putExtra("law_chap", pass_law_chap);
        intent.putExtra("law_chapsub", pass_law_chapsub);
        intent.putExtra("law_section", pass_law_section);
        intent.putExtra("law_secsub", pass_law_secsub);
        intent.putExtra("law_content", pass_law_content);
        startActivity(intent, options.toBundle());
    }
}