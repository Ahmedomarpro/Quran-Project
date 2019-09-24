package com.ao.quranproject.tab;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

import com.ao.quranproject.R;
import com.ao.quranproject.adapter.One_Rec_Adapter;
import com.ao.quranproject.content_Text;

import me.relex.circleindicator.CircleIndicator2;


/**
 * A simple {@link Fragment} subclass.
 */
public class oneFragment extends Fragment {

	RecyclerView recyclerView;
	One_Rec_Adapter one_rec_adapter;
	RecyclerView.LayoutManager layoutManager;

	CircleIndicator2 indicator;

	public oneFragment() {
		// Required empty public constructor
	}


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		View view = inflater.inflate(R.layout.fragment_one, container, false);
 		recyclerView = view.findViewById(R.id.recycler_view);
		indicator = view.findViewById(R.id.indicator);
		layoutManager = new GridLayoutManager(getContext(),3,GridLayoutManager.HORIZONTAL,false);
		recyclerView.setLayoutManager(layoutManager);

		one_rec_adapter = new One_Rec_Adapter(content_Text.ArSuras);
		recyclerView.setAdapter(one_rec_adapter);


		PagerSnapHelper pagerSnapHelper = new PagerSnapHelper();
		indicator.attachToRecyclerView(recyclerView, pagerSnapHelper);


		one_rec_adapter.registerAdapterDataObserver(indicator.getAdapterDataObserver());


		indicator.createIndicators(12	,1);

		indicator.animatePageSelected(1);

		one_rec_adapter.setOnclickItemview(new One_Rec_Adapter.onclickItemview() {
			@Override
			public void onItem(int pos, String name) {
				Toast.makeText(getContext(), ""+pos, Toast.LENGTH_SHORT).show();

				Intent intent= new Intent(getContext(),fragment_quran_detils.class);

				intent.putExtra(content_Text.EXTRETA_POTIONE, pos);
				intent.putExtra(content_Text.EXTRETA_NAME,name);
				 startActivity(intent);
			}
		});
		return view;
	}

}
