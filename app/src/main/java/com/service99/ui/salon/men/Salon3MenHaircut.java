package com.service99.ui.salon.men;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.service99.R;
import com.service99.ui.utilities.Help;

import java.util.Objects;

public class Salon3MenHaircut extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salon3_men_haircut);

        //toolbar
        Objects.requireNonNull(getSupportActionBar()).setTitle("Men's Haircut");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Button b = findViewById(R.id.cnf_btn);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Help.schedule(Salon3MenHaircut.this, "Service:\n Men's Haircut");
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
