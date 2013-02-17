/* Author: varman
 * Date: 17/02/2013
 */

package com.example.viewpagersample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

public class MainActivity extends FragmentActivity {
	 private MyAdapter mAdapter;
	 private ViewPager mPager;
	
	 @Override
	protected void onCreate(Bundle savedInstanceState) {
		   super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main);
	        mAdapter = new MyAdapter(getSupportFragmentManager());
	        mPager = (ViewPager) findViewById(R.id.pager);
	        mPager.setAdapter(mAdapter);
	}

	public static class MyAdapter extends FragmentPagerAdapter {
        public MyAdapter(FragmentManager fm) {
            super(fm);
        }
 
        @Override
        public int getCount() {
            return 2;
        }
 
        @Override
        public Fragment getItem(int position) {
            switch (position) {
            case 0:
                return new FirstFormFragment();
            case 1:
                return new SecondFormFragment();
            default:
                return null;
            }
        }
    }
}
