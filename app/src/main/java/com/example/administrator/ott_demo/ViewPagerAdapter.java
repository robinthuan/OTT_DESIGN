package com.example.administrator.ott_demo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.administrator.ott_demo.Fragment.FragmentOne;
import com.example.administrator.ott_demo.Fragment.FragmentThree;
import com.example.administrator.ott_demo.Fragment.FragmentTwo;

/**
 * Created by administrator on 12/14/17.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new FragmentOne();
                break;
            case 1:
                fragment = new FragmentTwo();
                break;
            case 2:
                fragment = new FragmentThree();
                break;
            default:
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position) {
            case 0:
                title = "DIAL";
                break;
            case 1:
                title = "CALLlOGS";
                break;
            case 2:
                title = "SETTINGS";
                break;
            default:
                break;

        }
        return title;
    }
}
