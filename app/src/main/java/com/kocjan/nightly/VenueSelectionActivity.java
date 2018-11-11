package com.kocjan.nightly;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class VenueSelectionActivity extends AppCompatActivity {
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venue_selection);

        FragmentManager fragmentManager = getSupportFragmentManager();

        mViewPager = (ViewPager)findViewById(R.id.container);
        mViewPager.setAdapter(new FragmentPagerAdapter(fragmentManager) {
            @Override
            public Fragment getItem(int i) {

                switch (i){
                    case 0:
                        SelectionOne one = new SelectionOne();
                        return one;
                    case 1:
                        SelectionTwo two = new SelectionTwo();
                        return two;
                    case 2:
                        SelectionThree three = new SelectionThree();
                        return three;
                }

                return null;
            }

            @Override
            public int getCount() {
                return 3;
            }
        });
    }


}
