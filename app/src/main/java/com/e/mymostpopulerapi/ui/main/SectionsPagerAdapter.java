package com.e.mymostpopulerapi.ui.main;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;

import com.e.mymostpopulerapi.fragment.EmailedFragment;
import com.e.mymostpopulerapi.R;
import com.e.mymostpopulerapi.fragment.SharedFragment;
import com.e.mymostpopulerapi.fragment.ViewedFragment;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_emailed, R.string.tab_shared, R.string.tab_viewed};
    private final Context mContext;
    SparseArray<View> views = new SparseArray<>();

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new EmailedFragment();
            case 1:
                return new SharedFragment();
            case 2:
                return new ViewedFragment();
            default:
                return null;
        }
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
      //  return PlaceholderFragment.newInstance(position + 1);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
       return super.instantiateItem(container, position);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }

}