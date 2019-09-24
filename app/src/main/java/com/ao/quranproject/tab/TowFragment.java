package com.ao.quranproject.tab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.ao.quranproject.R;


public class TowFragment extends Fragment {

	public int conter = 0;

	private TextView textView;
	private Button button;
	private Button button2;
	private TextView textViewV;

	public TowFragment() {
		// Required empty public constructor

	}

	@Override
	public View onCreateView(LayoutInflater inflater, final ViewGroup container,
							 Bundle savedInstanceState) {
		// Inflate the layout for this fragment

		View view = inflater.inflate(R.layout.fragment_tow, container, false);
		textView = view.findViewById(R.id.text_view);
		button = view.findViewById(R.id.button);
		button2 = view.findViewById(R.id.button2);
		textViewV = view.findViewById(R.id.textViewV);



		button.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				textViewV.setVisibility(textViewV.getVisibility() == View.VISIBLE ? View.GONE : View.GONE);
				conter++;
				textView.setText(Integer.toString(conter));

			}
		});
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				conter = 0;
				textView.setText(Integer.toString(conter));
				textViewV.setVisibility(textViewV.getVisibility() == View.VISIBLE ? View. VISIBLE : View.VISIBLE);

			}
		});

		return view;
	}
}
