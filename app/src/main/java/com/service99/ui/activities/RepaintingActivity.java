package com.service99.ui.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

import com.service99.R;
import com.service99.ui.utilities.Help;

import java.util.Objects;

public class RepaintingActivity extends AppCompatActivity {

    String choice = "Wall Repainting";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repainting);

        //toolbar
        Objects.requireNonNull(getSupportActionBar()).setTitle("Repainting Services");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Button b = findViewById(R.id.cnf_btn);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Help.schedule(RepaintingActivity.this, "Service:\n " + choice);
            }
        });

        RadioGroup radioGroup = findViewById(R.id.myRadioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // find which radio button is selected
                if(checkedId == R.id.wall) {

                    choice = "Wall Repainting";

                } else if(checkedId == R.id.water) {

                    choice = "Water Repainting";

                } else if(checkedId == R.id.wood){

                    choice = "Wood Repainting";

                }  else if(checkedId == R.id.texture){

                    choice = "Texture Repainting";

                } else {
                    choice= "Multiple Repainting Services";
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
