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

public class section_1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section1);

        View toolbar = findViewById(R.id.topToolbar);
        toolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toHomeScreen();
            }
        });
    }

    public void toHomeScreen() {
        Intent i = new Intent (this, homeScreen.class);
        startActivity(i);
    }


}