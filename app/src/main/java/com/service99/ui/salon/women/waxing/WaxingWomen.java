package com.service99.ui.salon.women.waxing;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.service99.R;

import java.util.Objects;

public class WaxingWomen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waxing_women);

        //toolbar
        Objects.requireNonNull(getSupportActionBar()).setTitle("Waxing for women");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        ViewPager2 viewPager2 = findViewById(R.id.view_pager);
        viewPager2.setAdapter(new WaxAdapterWomen(this));
        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setTabGravity(0);
        new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                if (position == 0) {
                    tab.setText("Honey Wax");
                } else if (position == 1) {
                    tab.setText("Brazilian Wax");
                } else if (position == 2) {
                    tab.setText("Rica Wax");
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
