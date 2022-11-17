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
        int positionVal = position;
        switch (positionVal) {
            case 0:
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this);
                Intent intent = new Intent(getApplicationContext(), section_1.class);
                startActivity(intent, options.toBundle());
                break;
            case 1:
                ActivityOptions options1 = ActivityOptions.makeSceneTransitionAnimation(this);
                Intent intent1 = new Intent(getApplicationContext(), section_2.class);
                startActivity(intent1, options1.toBundle());
                break;
            case 2:
                ActivityOptions options2 = ActivityOptions.makeSceneTransitionAnimation(this);
                Intent intent2 = new Intent(getApplicationContext(), section_3.class);
                startActivity(intent2, options2.toBundle());
                break;
            case 3:
                ActivityOptions options3 = ActivityOptions.makeSceneTransitionAnimation(this);
                Intent intent3 = new Intent(getApplicationContext(), section_4.class);
                startActivity(intent3, options3.toBundle());
                break;
            case 4:
                ActivityOptions options4 = ActivityOptions.makeSceneTransitionAnimation(this);
                Intent intent4 = new Intent(getApplicationContext(), section_5.class);
                startActivity(intent4, options4.toBundle());
                break;
            case 5:
                ActivityOptions options5 = ActivityOptions.makeSceneTransitionAnimation(this);
                Intent intent5 = new Intent(getApplicationContext(), section_6.class);
                startActivity(intent5, options5.toBundle());
                break;
            case 6:
                ActivityOptions options6 = ActivityOptions.makeSceneTransitionAnimation(this);
                Intent intent6 = new Intent(getApplicationContext(), section_7.class);
                startActivity(intent6, options6.toBundle());
                break;
            case 7:
                ActivityOptions options7 = ActivityOptions.makeSceneTransitionAnimation(this);
                Intent intent7 = new Intent(getApplicationContext(), section_8.class);
                startActivity(intent7, options7.toBundle());
                break;
            case 8:
                ActivityOptions options8 = ActivityOptions.makeSceneTransitionAnimation(this);
                Intent intent8 = new Intent(getApplicationContext(), section_9.class);
                startActivity(intent8, options8.toBundle());
                break;
            case 9:
                ActivityOptions options9 = ActivityOptions.makeSceneTransitionAnimation(this);
                Intent intent9 = new Intent(getApplicationContext(), section_10.class);
                startActivity(intent9, options9.toBundle());
                break;
            case 10:
                ActivityOptions options10 = ActivityOptions.makeSceneTransitionAnimation(this);
                Intent intent10 = new Intent(getApplicationContext(), section_11.class);
                startActivity(intent10, options10.toBundle());
                break;
            case 11:
                ActivityOptions options11 = ActivityOptions.makeSceneTransitionAnimation(this);
                Intent intent11 = new Intent(getApplicationContext(), section_12.class);
                startActivity(intent11, options11.toBundle());
                break;
            case 12:
                ActivityOptions options12 = ActivityOptions.makeSceneTransitionAnimation(this);
                Intent intent12 = new Intent(getApplicationContext(), section_13.class);
                startActivity(intent12, options12.toBundle());
                break;
            case 13:
                ActivityOptions options13 = ActivityOptions.makeSceneTransitionAnimation(this);
                Intent intent13 = new Intent(getApplicationContext(), section_14.class);
                startActivity(intent13, options13.toBundle());
                break;
            case 14:
                ActivityOptions options14 = ActivityOptions.makeSceneTransitionAnimation(this);
                Intent intent14 = new Intent(getApplicationContext(), section_15.class);
                startActivity(intent14, options14.toBundle());
                break;
            case 15:
                ActivityOptions options15 = ActivityOptions.makeSceneTransitionAnimation(this);
                Intent intent15 = new Intent(getApplicationContext(), section_16.class);
                startActivity(intent15, options15.toBundle());
                break;
            case 16:
                ActivityOptions options16 = ActivityOptions.makeSceneTransitionAnimation(this);
                Intent intent16 = new Intent(getApplicationContext(), section_17.class);
                startActivity(intent16, options16.toBundle());
                break;
            case 17:
                ActivityOptions options17 = ActivityOptions.makeSceneTransitionAnimation(this);
                Intent intent17 = new Intent(getApplicationContext(), section_18.class);
                startActivity(intent17, options17.toBundle());
                break;
            case 18:
                ActivityOptions options18 = ActivityOptions.makeSceneTransitionAnimation(this);
                Intent intent18 = new Intent(getApplicationContext(), section_19.class);
                startActivity(intent18, options18.toBundle());
                break;
            case 19:
                ActivityOptions options19 = ActivityOptions.makeSceneTransitionAnimation(this);
                Intent intent19 = new Intent(getApplicationContext(), section_20.class);
                startActivity(intent19, options19.toBundle());
                break;
            case 20:
                ActivityOptions options20 = ActivityOptions.makeSceneTransitionAnimation(this);
                Intent intent20 = new Intent(getApplicationContext(), section_21.class);
                startActivity(intent20, options20.toBundle());
                break;
            case 21:
                ActivityOptions options21 = ActivityOptions.makeSceneTransitionAnimation(this);
                Intent intent21 = new Intent(getApplicationContext(), section_22.class);
                startActivity(intent21, options21.toBundle());
                break;
        }
    }
}