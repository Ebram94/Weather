package com.example.ebram.weather.Adapter;



import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.ebram.weather.View.Cairo;
import com.example.ebram.weather.View.London;
import com.example.ebram.weather.View.Moscow;
import com.example.ebram.weather.View.Paris;
import com.example.ebram.weather.View.Roma;


/**
 * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */

public class SectionsPagerAdapter extends FragmentStatePagerAdapter {

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Cairo E =new Cairo();
                return  E;

            case 1:
                London U =new London();
                return U;
            case 2:
                Paris R =new Paris();
                return R;
            case 3:
                Roma A =new Roma();
                return  A;
            case 4:
                Moscow M =new Moscow();
                return  M;


        }
        return null;
    }

    @Override
    public int getCount() {
        return 5;
    }
}