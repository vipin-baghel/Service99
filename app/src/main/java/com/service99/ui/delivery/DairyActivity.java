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

public class DairyActivity extends AppCompatActivity {

    CheckBox milk, curd, butter_milk, butter, paneer,
            shrikhand, lassi, ghee, bisleri1, bisleri20, mineral20, tea, coffee;

    Button cnf_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dairy);

        //toolbar
        Objects.requireNonNull(getSupportActionBar()).setTitle("Dairy & Beverages");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        milk = findViewById(R.id.milk);
        curd = findViewById(R.id.curd);
        butter_milk = findViewById(R.id.butter_milk);
        butter = findViewById(R.id.butter);
        paneer = findViewById(R.id.paneer);
        shrikhand = findViewById(R.id.shrikhand);
        lassi = findViewById(R.id.lassi);
        ghee = findViewById(R.id.ghee);
        bisleri1 = findViewById(R.id.bisleri1);
        bisleri20 = findViewById(R.id.bisleri20);
        mineral20 = findViewById(R.id.mineral20);
        tea = findViewById(R.id.tea);
        coffee = findViewById(R.id.coffee);

        cnf_btn = findViewById(R.id.cnf_btn);
        cnf_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //int counter=0;
                StringBuilder result = new StringBuilder();
                result.append("Delivery Items:  ");
                if (milk.isChecked()) {
                    result.append("Milk,  ");
                    //counter++;
                }
                if (curd.isChecked()) {
                    result.append("Curd,  ");
                    //counter++;
                }
                if (butter_milk.isChecked()) {
                    result.append("Butter Milk,  ");
                    //counter++;
                }
                if (butter.isChecked()) {
                    result.append("Butter,  ");
                    //counter++;
                }
                if (paneer.isChecked()) {
                    result.append("Paneer,  ");
                    //counter++;
                }
                if (shrikhand.isChecked()) {
                    result.append("Shrikhand,  ");
                    //counter++;
                }
                if (lassi.isChecked()) {
                    result.append("Lassi,  ");
                    //counter++;
                }
                if (ghee.isChecked()) {
                    result.append("Ghee,  ");
                    //counter++;
                }
                if (bisleri1.isChecked()) {
                    result.append("Bisleri 1 Ltr,  ");
                    //counter++;
                }
                if (bisleri20.isChecked()) {
                    result.append("Bisleri 20 Ltr,  ");
                    //counter++;
                }
                if (mineral20.isChecked()) {
                    result.append("Mineral 20 Ltr,  ");
                    //counter++;
                }
                if (tea.isChecked()) {
                    result.append("Tea,  ");
                    //counter++;
                }
                if (coffee.isChecked()) {
                    result.append("Coffee,  ");
                    //counter++;
                }

                // if (counter<6){
                Help.schedule(DairyActivity.this, result.toString());
                // }else{
                //    Toast.makeText(DairyActivity.this, "Please select upto 5 items at a time", Toast.LENGTH_SHORT).show();
                // }


            }
        });

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
