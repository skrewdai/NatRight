package com.seventeen.natright;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class law_base1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_law_base1);

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