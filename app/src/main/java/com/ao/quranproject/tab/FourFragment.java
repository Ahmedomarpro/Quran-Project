package com.ao.quranproject.tab;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.ao.quranproject.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FourFragment extends Fragment {


	public FourFragment() {
		// Required empty public constructor
	}


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		// Inflate the layout for this fragment
		return inflater.inflate(R.layout.fragment_four, container, false);
	}

}
