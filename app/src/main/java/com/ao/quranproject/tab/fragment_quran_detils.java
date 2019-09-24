package com.ao.quranproject.tab;


import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ao.quranproject.R;
import com.ao.quranproject.adapter.detiles_Adapter;
import com.ao.quranproject.content_Text;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class fragment_quran_detils extends AppCompatActivity {
	int pos;
	String name;

	RecyclerView recyclerView;
	List<String> date;
	RecyclerView.LayoutManager layoutManager;
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_fragment_quran_detils);



		pos = getIntent().getIntExtra(content_Text.EXTRETA_POTIONE, -1);

		name =  getIntent().getStringExtra(content_Text.EXTRETA_NAME);

		List<String> contentx = redfile((pos+1) + ".txt");

		TextView Title = findViewById(R.id.sura_name);
		Title.setText(name);

		recyclerView = findViewById(R.id.recyclerView);
		 layoutManager =new LinearLayoutManager(this);
		detiles_Adapter detiles_adapter = new detiles_Adapter(contentx);

		recyclerView.setAdapter(detiles_adapter);

		recyclerView.setLayoutManager(layoutManager);

	}


	public List<String> redfile(String fileNme)
	{

		date = new ArrayList<>();
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(
					new InputStreamReader(getAssets().open(fileNme)));

			// do reading, usually loop until end of file reading
			String mLine;
			while ((mLine = reader.readLine()) != null) {
				//process line

				if (!mLine.isEmpty())
				date.add(mLine);

 			}
		} catch (IOException e) {
			//log the exception
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					//log the exception
				}
			}
		}

		return date;
	}

}

