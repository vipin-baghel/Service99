package com.service99.ui.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;


import com.service99.R;
import com.service99.ui.utilities.Help;

import java.util.Objects;

public class FreshPaintingActivity extends AppCompatActivity {

    String choice = "Wall Painting";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fresh_painting);

        //toolbar
        Objects.requireNonNull(getSupportActionBar()).setTitle("Fresh Painting Services");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Button b = findViewById(R.id.cnf_btn);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Help.schedule(FreshPaintingActivity.this, "Service:\n "+choice);
            }
        });

        RadioGroup radioGroup = findViewById(R.id.myRadioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // find which radio button is selected
                if(checkedId == R.id.wall) {

                    choice = "Fresh Wall Painting";

                } else if(checkedId == R.id.water) {

                    choice = "Fresh Water Painting";

                } else if(checkedId == R.id.wood){

                    choice = "Fresh Wood Painting";

                }  else if(checkedId == R.id.texture){

                    choice = "Fresh Texture Painting";

                } else {
                    choice= "Multiple Fresh Painting Services";
                }
            }

        });


    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
