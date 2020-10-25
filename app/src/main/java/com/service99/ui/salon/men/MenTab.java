package com.service99.ui.salon.men;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.service99.R;

import java.util.Objects;

public class MenTab extends AppCompatActivity {

    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_men_tab);

        position = getIntent().getIntExtra("pos",0);

        //toolbar
        Objects.requireNonNull(getSupportActionBar()).setTitle("Salon for men");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        ViewPager2 viewPager2 = findViewById(R.id.view_pager);
        viewPager2.setAdapter(new MenAdapter(this));
        viewPager2.setCurrentItem(position);
        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setTabGravity(0);
        new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                if (position == 0) {
                    tab.setText("Haircut");
                } else if (position == 1) {
                    tab.setText("Face Care");
                } else if (position == 2) {
                    tab.setText("Hair Color");
                } else if (position ==3){
                    tab.setText("Hair Treatment");
                } else {
                    tab.setText("Hair Spa");
                }
            }
        }).attach();

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
