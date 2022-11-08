package com.seventeen.natright;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

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
                    overridePendingTransition(R.anim.slide_out_right, R.anim.slide_in_left);
                    return true;

                case R.id.nav_Information:
                    startActivity(new Intent(getApplicationContext(), infoScreen.class));
                    overridePendingTransition(R.anim.lefttoright, R.anim.righttoleft);
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
        int positionVal = position;
        switch (positionVal) {
            case 0:
                Intent intent = new Intent(homeScreen.this, section_1.class);
                startActivity(intent);
                break;
            case 1:
                Intent intent1 = new Intent(homeScreen.this, section_2.class);
                startActivity(intent1);
                break;
        }
    }
}