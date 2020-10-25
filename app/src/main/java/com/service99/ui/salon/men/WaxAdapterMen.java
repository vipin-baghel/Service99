package com.service99.ui.salon.men;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.service99.ui.salon.men.fragments.WaxFragmentMen;

public class WaxAdapterMen extends FragmentStateAdapter {
    String[] brazil = {"29", "29", "149", "199", "89", "199", "299", "199", "149", "249"};
    String[] honey = {"19", "19", "99", "149", "49", "149", "199", "99", "99", "199"};
    String[] rica = {"39", "39", "199", "249", "129", "249", "349", "249", "199", "299"};

    public WaxAdapterMen(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if (position == 0) {
            return new WaxFragmentMen(this.honey);
        }
        if (position == 1) {
            return new WaxFragmentMen(this.brazil);
        }
        return new WaxFragmentMen(this.rica);
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
