package com.moict.main;

import java.util.ArrayList;

import com.google.android.gms.maps.SupportMapFragment;
import com.moict.mapmodule.MapViewActivity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

 private ArrayList<String>	pagerTitles;
	
	public SectionsPagerAdapter(FragmentManager fm,ArrayList<String> titles) {
		super(fm);
		this.pagerTitles = titles;
	}

	@Override
	public Fragment getItem(int position) {
		
		Fragment fragment = null;
		SupportMapFragment spmFragment  = null;
		
		switch (position) {

		case 0:
			fragment = new ActivityMain();
			Bundle args = new Bundle();
			args.putInt(ActivityMain.ARG_SECTION_NUMBER, position + 1);
			fragment.setArguments(args);
			break;

		case 1:

			fragment = new ActivityMotionCapturing();
			Bundle args1 = new Bundle();
			args1.putInt(ActivitySetting.ARG_SECTION_NUMBER, position + 1);
			fragment.setArguments(args1);
			//return spmFragment;
			break;
		case 2:

			fragment = new ActivityMotionCapturing();
			Bundle args3 = new Bundle();
			args3.putInt(ActivityMotionCapturing.ARG_SECTION_NUMBER, position + 1);
			fragment.setArguments(args3);
			break;	
		case 3:
			fragment = new ActivitySetting();
			Bundle args4 = new Bundle();
			args4.putInt(ActivitySetting.ARG_SECTION_NUMBER, position + 1);
			fragment.setArguments(args4);
			break;
		}

		return fragment;
	}

	@Override
	public int getCount() {
		// Show 3 total pages.
		return pagerTitles.size();
	}

	@Override
	public CharSequence getPageTitle(int position) {

		return pagerTitles.get(position);
	}
}




