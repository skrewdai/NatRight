package com.seventeen.natright;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class law_completeFields extends AppCompatActivity {
    public String law_ra, law_name, law_chap, law_chapsub, law_section,law_secsub, law_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_law_model_complete);

        Intent i = getIntent();
        law_ra = i.getExtras().getString("law_ra");
        law_name = i.getExtras().getString("law_name");
        law_chap = i.getExtras().getString("law_chap");
        law_chapsub = i.getExtras().getString("law_chapsub");
        law_section = i.getExtras().getString("law_section");
        law_secsub = i.getExtras().getString("law_secsub");
        law_content = i.getExtras().getString("law_content");

        TextView text_ra = (TextView)findViewById(R.id.text_ra);
        TextView text_name = (TextView)findViewById(R.id.text_name);
        TextView sec_top = (TextView)findViewById(R.id.sec_top);
        TextView secsub_top = (TextView)findViewById(R.id.ssecsub_top);
        TextView sec_bot = (TextView)findViewById(R.id.sec_bot);
        TextView secsub_bot = (TextView)findViewById(R.id.secsub_bot);
        TextView text_content = (TextView)findViewById(R.id.text_content);

        text_ra.setText(law_ra);
        text_name.setText(law_name);
        sec_top.setText(law_chap);
        secsub_top.setText(law_chapsub);
        sec_bot.setText(law_section);
        secsub_bot.setText(law_secsub);
        text_content.setText(law_content);

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
            public void onClick(View v) {
                toSection_1();
            }
        });
    }

    public void toSection_1() {
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this);
        Intent intent = new Intent(getApplicationContext(), section_1.class);
        startActivity(intent, options.toBundle());
    }
}