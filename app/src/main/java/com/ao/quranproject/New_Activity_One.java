package com.ao.quranproject;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.ao.quranproject.adapter.detiles_Adapter;

public class New_Activity_One extends AppCompatActivity {
	RecyclerView recyclerView;
	detiles_Adapter detiles_adapter;
	RecyclerView.LayoutManager layoutManager;



	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_nwe_one);


	}
}
