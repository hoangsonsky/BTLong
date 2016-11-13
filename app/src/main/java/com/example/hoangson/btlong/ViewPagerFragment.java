package com.example.hoangson.btlong;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class ViewPagerFragment extends Fragment {

    ViewPager viewPager;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_view_pager, container, false);
        viewPager = (ViewPager) view.findViewById(R.id.viewPager);
        addViewPager();
        return view;
    }

    private void addViewPager(){
        final ViewPagerAdapter adapter = new ViewPagerAdapter
                (getActivity().getSupportFragmentManager(), 3);
        viewPager.setAdapter(adapter);
//        viewPager.setCurrentItem(1);
    }

}
