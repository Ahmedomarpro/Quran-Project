package com.ao.quranproject.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ao.quranproject.R;

public class One_Rec_Adapter extends RecyclerView.Adapter<One_Rec_Adapter.ViewHolder> {

	String [] item;

	public One_Rec_Adapter(String[] item) {
		this.item = item;
	}

	@NonNull
	@Override
	public One_Rec_Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

		View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_one_frag,parent, false);

		return new ViewHolder(view);
	}

	@Override
	public void onBindViewHolder(@NonNull One_Rec_Adapter.ViewHolder holder, final int position) {

		final String name = item[position];
		holder.textView.setText(item[position]);

		if (onclickItemview != null){
			holder.textView.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					onclickItemview.onItem(position,name);
				}
			});
		}

	}

	public void setOnclickItemview(One_Rec_Adapter.onclickItemview onclickItemview) {
		this.onclickItemview = onclickItemview;
	}

	onclickItemview onclickItemview;
	public interface onclickItemview{
		void onItem(int pos,String name);

	}

	@Override
	public int getItemCount() {
		if (item==null)return 0;
		return item.length;
	}

	public class ViewHolder extends RecyclerView.ViewHolder {

		TextView textView;

		public ViewHolder(@NonNull View itemView) {
			super(itemView);
			 textView = itemView.findViewById(R.id.text_one);
		}
	}
}