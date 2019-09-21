package com.ao.quranproject.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class One_Rec_Adapter extends RecyclerView.Adapter<One_Rec_Adapter.ViewHolder> {

	@NonNull
	@Override
	public One_Rec_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		return null;
	}

	@Override
	public void onBindViewHolder(@NonNull One_Rec_Adapter.ViewHolder holder, int position) {

	}

	@Override
	public int getItemCount() {
		return 0;
	}

	public class ViewHolder extends RecyclerView.ViewHolder {

		public ViewHolder(@NonNull View itemView) {
			super(itemView);
		}
	}
}