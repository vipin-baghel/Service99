package com.service99.ui.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.service99.R;
import com.service99.ui.utilities.Help;

import java.util.Objects;

public class PestControlActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pest_control);

        //toolbar
        Objects.requireNonNull(getSupportActionBar()).setTitle("Pest Control Services");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Button b = findViewById(R.id.cnf_btn);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Help.schedule(PestControlActivity.this, "Service:\n Pest Control");
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
