package com.module.listView;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {
	String[] countries;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		countries = new String[] { "Bangladesh", "New Zealand", "India",
				"America", "Canada" };
		ListView listView = (ListView) findViewById(R.id.listView);
		ArrayList<Integer> imageList = getImageList();
		MyAdapter mlistAdapter = new MyAdapter(countries, this, imageList);
		ArrayAdapter<String> listAdapter = new ArrayAdapter<String>(this,
				R.layout.item_layout, R.id.row_text, countries);
		listView.setAdapter(mlistAdapter);
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				/*
				 * parent -> The AdapterView where the click happened. view The
				 * view ->   within the AdapterView that was clicked (this will be a
				             view provided by the adapter) 
				  position -> The position of the
				 * view in the adapter. id The row id of the item that was
				 * clicked.
				 */
				// Toast.makeText(getApplicationContext(), countries[position],
				// Toast.LENGTH_LONG).show();

			}

		});

	}

	private ArrayList<Integer> getImageList() {
		ArrayList<Integer> imageList = new ArrayList();
		imageList.add(R.drawable.bd_image);
		imageList.add(R.drawable.nz_image);
		imageList.add(R.drawable.ind_image);
		imageList.add(R.drawable.usa_image);
		imageList.add(R.drawable.canada_image);
		return imageList;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
