package com.ao.quranproject.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class TabAdapter extends FragmentStatePagerAdapter {

	private final List<Fragment> mFragmentList = new ArrayList<>();
	private final List<String> mFragmentTitleList = new ArrayList<>();
	//private final List<Integer> mFragmentIconList = new ArrayList<>();


	public TabAdapter(@NonNull FragmentManager fm) {
		super(fm);
	}


	public void addFragment(Fragment fragment, String title) {
		mFragmentList.add(fragment);
		mFragmentTitleList.add(title);
	//	mFragmentIconList.add(tabion);
	}
	public CharSequence getPageTitle(int position) {
		return mFragmentTitleList.get(position);
	}



	@NonNull
	@Override
	public Fragment getItem(int position) {
		return mFragmentList.get(position);
	}

	@Override
	public int getCount() {
		return mFragmentList.size();
	}
}
