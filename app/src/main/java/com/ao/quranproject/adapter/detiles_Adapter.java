package com.ao.quranproject.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ao.quranproject.R;

import java.util.List;

public class detiles_Adapter extends RecyclerView.Adapter<detiles_Adapter.viewHolder> {

	List<String> item;

	public detiles_Adapter(List<String> item) {
		this.item = item;
	}

	@NonNull
	@Override
	public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_detalis_quran,parent, false);
		return new viewHolder(view);
	}

	@Override
	public void onBindViewHolder(@NonNull viewHolder holder, int position) {

		String name = item.get(position);
		holder.title.setText(name);

	}

	@Override
	public int getItemCount() {
		if (item == null)return 0;
		return item.size();
	}

	public class viewHolder extends RecyclerView.ViewHolder{
		TextView title;
		public viewHolder(@NonNull View itemView) {
			super(itemView);
			title = itemView.findViewById(R.id.content);
		}
	}
}
