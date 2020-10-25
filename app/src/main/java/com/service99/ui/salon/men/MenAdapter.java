package com.service99.ui.salon.men;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.service99.ui.salon.men.fragments.FaceCareFragment;
import com.service99.ui.salon.men.fragments.HairColorFragment;
import com.service99.ui.salon.men.fragments.HairSpaMen;
import com.service99.ui.salon.men.fragments.HairTreatmentFragment;
import com.service99.ui.salon.men.fragments.HaircutFragment;

public class MenAdapter extends FragmentStateAdapter {

    public MenAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0) {
            return new HaircutFragment();
        }else if (position == 1) {
            return new FaceCareFragment();
        }else if (position == 2) {
            return new HairColorFragment();
        }else if (position == 3){
            return new HairTreatmentFragment();
        }else {
            return new HairSpaMen();
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }

}
