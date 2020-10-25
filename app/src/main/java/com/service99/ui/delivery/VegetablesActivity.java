package com.service99.ui.delivery;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.service99.R;
import com.service99.ui.utilities.Help;

import java.util.Objects;

public class VegetablesActivity extends AppCompatActivity {

    CheckBox Potato, Onion, Tomato_Hybrid, Tomato_Local, Lemon, Ginger, Garlic, Carrot,
            Lady_Finger, Capsicum, Cauliflower, Cabbage, Coriander;

    Button cnf_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetables);

        //toolbar
        Objects.requireNonNull(getSupportActionBar()).setTitle("Vegetables Delivery");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Potato = findViewById(R.id.potato);
        Onion = findViewById(R.id.onion);
        Tomato_Local = findViewById(R.id.tomato_l);
        Tomato_Hybrid = findViewById(R.id.tomato_h);
        Lemon = findViewById(R.id.lemon);
        Ginger = findViewById(R.id.ginger);
        Garlic = findViewById(R.id.garlic);
        Carrot = findViewById(R.id.carrot);
        Lady_Finger = findViewById(R.id.lady_finger);
        Capsicum = findViewById(R.id.capsicum);
        Cauliflower = findViewById(R.id.cauliflower);
        Cabbage = findViewById(R.id.cabbage);
        Coriander = findViewById(R.id.coriander);

        cnf_btn = findViewById(R.id.cnf_btn);
        cnf_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //int counter=0;
                StringBuilder result = new StringBuilder();
                result.append("Delivery Items:  ");
                if (Potato.isChecked()) {
                    result.append("Potato,  ");
                    //counter++;
                }
                if (Onion.isChecked()) {
                    result.append("Onion,  ");
                    //counter++;
                }
                if (Tomato_Local.isChecked()) {
                    result.append("Tomato Local,  ");
                    //counter++;
                }
                if (Tomato_Hybrid.isChecked()) {
                    result.append("Tomato Hybrid,  ");
                    // counter++;
                }
                if (Lemon.isChecked()) {
                    result.append("Lemon,  ");
                    // counter++;
                }
                if (Ginger.isChecked()) {
                    result.append("Ginger,  ");
                    //  counter++;
                }
                if (Garlic.isChecked()) {
                    result.append("Garlic,  ");
                    //   counter++;
                }
                if (Carrot.isChecked()) {
                    result.append("Carrot,  ");
                    //  counter++;
                }
                if (Lady_Finger.isChecked()) {
                    result.append("Lady Finger,  ");
                    //  counter++;
                }
                if (Capsicum.isChecked()) {
                    result.append("Capsicum,  ");
                    // counter++;
                }
                if (Cauliflower.isChecked()) {
                    result.append("Cauliflower,  ");
                    // counter++;
                }
                if (Cabbage.isChecked()) {
                    result.append("Cabbage,  ");
                    //  counter++;
                }
                if (Coriander.isChecked()) {
                    result.append("Coriander,  ");
                    //  counter++;
                }

                // if (counter<6){
                Help.schedule(VegetablesActivity.this, result.toString());
                //}else{
                //     Toast.makeText(VegetablesActivity.this, "Please select upto 5 items at a time", Toast.LENGTH_SHORT).show();
                // }

            }
        });

    }
}
