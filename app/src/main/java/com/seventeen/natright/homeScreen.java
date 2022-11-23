package com.seventeen.natright;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class homeScreen extends AppCompatActivity implements recyclerViewInterface {

    ArrayList<section_model> sectionModels = new ArrayList<>();
    int[] sectionImages = {R.drawable.sec1, R.drawable.sec2, R.drawable.sec3, R.drawable.sec4,
            R.drawable.sec5, R.drawable.sec6, R.drawable.sec7, R.drawable.sec8, R.drawable.sec9, R.drawable.sec10,
            R.drawable.sec11, R.drawable.sec12, R.drawable.sec13, R.drawable.sec14, R.drawable.sec15, R.drawable.sec16,
            R.drawable.sec17, R.drawable.sec18, R.drawable.sec19, R.drawable.sec20, R.drawable.sec21, R.drawable.sec22};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        RecyclerView recyclerView = findViewById(R.id.homeRecycler);
        setupSection_Model();

        sec_Adapter adapter = new sec_Adapter(this, sectionModels, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener((item -> {
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
        }));
    }

    private void setupSection_Model() {
        String[] sectionfinalNames = getResources().getStringArray(R.array.sections_name_array);
        for (int i = 0; i < sectionfinalNames.length; i++) {
            sectionModels.add(new section_model(sectionfinalNames[i], sectionImages[i]));
        }
    }

    @Override
    public void onItemClick(int position) {
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this);
        Intent intent = null;
        switch (position) {
            case 0:
                intent = new Intent(getApplicationContext(), section_1.class);
                break;
            case 1:
                intent = new Intent(getApplicationContext(), section_2.class);
                break;
            case 2:
                intent = new Intent(getApplicationContext(), section_3.class);
                break;
            case 3:
                intent = new Intent(getApplicationContext(), section_4.class);
                break;
            case 4:
                intent = new Intent(getApplicationContext(), section_5.class);
                break;
            case 5:
                intent = new Intent(getApplicationContext(), section_6.class);
                break;
            case 6:
                intent = new Intent(getApplicationContext(), section_7.class);
                break;
            case 7:
                intent = new Intent(getApplicationContext(), section_8.class);
                break;
            case 8:
                intent = new Intent(getApplicationContext(), section_9.class);
                break;
            case 9:
                intent = new Intent(getApplicationContext(), section_10.class);
                break;
            case 10:
                intent = new Intent(getApplicationContext(), section_11.class);
                break;
            case 11:
                intent = new Intent(getApplicationContext(), section_12.class);
                break;
            case 12:
                intent = new Intent(getApplicationContext(), section_13.class);
                break;
            case 13:
                intent = new Intent(getApplicationContext(), section_14.class);
                break;
            case 14:
                intent = new Intent(getApplicationContext(), section_15.class);
                break;
            case 15:
                intent = new Intent(getApplicationContext(), section_16.class);
                break;
            case 16:
                intent = new Intent(getApplicationContext(), section_17.class);
                break;
            case 17:
                intent = new Intent(getApplicationContext(), section_18.class);
                break;
            case 18:
                intent = new Intent(getApplicationContext(), section_19.class);
                break;
            case 19:
                intent = new Intent(getApplicationContext(), section_20.class);
                break;
            case 20:
                intent = new Intent(getApplicationContext(), section_21.class);
                break;
            case 21:
                intent = new Intent(getApplicationContext(), section_22.class);
                break;
        }
        startActivity(intent, options.toBundle());
    }
}