package com.module.listView;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {
	String[] myList;
	Context mContex;
	ArrayList<Integer> imageList;

	public MyAdapter(String myList[], Context mContex,
			ArrayList<Integer> imageList) {
		this.myList = myList;
		this.mContex = mContex;
		this.imageList = imageList;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return myList.length;
	}

	@Override
	public Object getItem(int index) {
		// TODO Auto-generated method stub
		return myList[index];
	}

	@Override
	public long getItemId(int index) {
		// TODO Auto-generated method stub
		return index;
	}

	@Override
	public View getView(int index, View convertView, ViewGroup root) {
		if (convertView == null) {
			View view = convertView;
			LayoutInflater inflater = (LayoutInflater) mContex
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			view = inflater.inflate(R.layout.item_layout, root,false);
			TextView txtView = (TextView) view.findViewById(R.id.row_text);
			txtView.setText(myList[index]);
			ImageView image = (ImageView) view.findViewById(R.id.row_image);
			image.setImageResource(imageList.get(index));
			return view;
		} else
			return convertView;
	}
}
