package com.ao.quranproject;

import android.content.DialogInterface;
import android.os.Bundle;

import androidx.viewpager.widget.ViewPager;

import com.ao.quranproject.adapter.TabAdapter;
import com.ao.quranproject.bas.Bae_Activity;
import com.ao.quranproject.tab.FiveFragment;
import com.ao.quranproject.tab.FourFragment;
import com.ao.quranproject.tab.TowFragment;
import com.ao.quranproject.tab.oneFragment;
import com.ao.quranproject.tab.threeFragment;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends Bae_Activity {

	private TabAdapter adapter;
	private TabLayout tabLayout;
	private ViewPager viewPager;


	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);


		viewPager = findViewById(R.id.viewpager_id);
		tabLayout = findViewById(R.id.tablayout_id);


		adapter = new TabAdapter(getSupportFragmentManager());
		adapter.addFragment(new oneFragment(), "Tab 1");
		adapter.addFragment(new TowFragment(), "Tab 2");
		adapter.addFragment(new threeFragment(), "Tab 3");
		adapter.addFragment(new FourFragment(), "Tab 4");
		adapter.addFragment(new FiveFragment(), "Tab 5");

		viewPager.setAdapter(adapter);
		tabLayout.setupWithViewPager(viewPager);

		int[] tabIcons = {
				R.drawable.ic_action_name,
				R.drawable.ic_action_search,
				R.drawable.ic_action_trans,
				R.drawable.ic_action_book,
				R.drawable.ic_action_head

		};
		tabLayout.getTabAt(0).setIcon(tabIcons[0]);
		tabLayout.getTabAt(1).setIcon(tabIcons[1]);
		tabLayout.getTabAt(2).setIcon(tabIcons[2]);
		tabLayout.getTabAt(3).setIcon(tabIcons[3]);
		tabLayout.getTabAt(4).setIcon(tabIcons[4]);


	}

	@Override
	public void onBackPressed() {
	//	showMessage("","");

		Ahmed("A1", "A2", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
			dialog.dismiss();
			}
		});



	}
}
