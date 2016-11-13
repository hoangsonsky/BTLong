package com.example.hoangson.btlong;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


/**
 * Created by Administrator on 25/04/2016.
 */
public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    int mNumTab;

    public ViewPagerAdapter(FragmentManager fm, int mNumTab) {
        super(fm);
        this.mNumTab = mNumTab;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                BlankFragment blankFragment = new BlankFragment();
                return blankFragment;
            case 1:
                Blank1Fragment blank1Fragment
                        = new Blank1Fragment();
                return blank1Fragment;
            case 2:
                Blank2Fragment blank2Fragment = new Blank2Fragment();
                return blank2Fragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumTab;
    }
}
