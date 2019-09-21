package com.ao.quranproject;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.ao.quranproject.adapter.TabAdapter;
import com.ao.quranproject.tab.TowFragment;
import com.ao.quranproject.tab.oneFragment;
import com.ao.quranproject.tab.threeFragment;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

	private TabAdapter adapter;
	private TabLayout tabLayout;
	private ViewPager viewPager;





	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);


		viewPager =  findViewById(R.id.viewpager_id);
		tabLayout =  findViewById(R.id.tablayout_id);


		adapter = new TabAdapter(getSupportFragmentManager());
		adapter.addFragment(new oneFragment(), "Tab 1");
		adapter.addFragment(new TowFragment(), "Tab 2");
		adapter.addFragment(new threeFragment(), "Tab 3");

		viewPager.setAdapter(adapter);
		tabLayout.setupWithViewPager(viewPager);





	}
}
