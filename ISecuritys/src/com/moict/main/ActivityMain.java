package com.moict.main;



import com.infinity.swippager.R;
import com.moict.videomonitoring.LiveVideoFeedActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityMain extends Fragment  implements View.OnClickListener{
	

	/**
	 * The fragment argument representing the section number for this
	 * fragment.
	 */
	public static final String ARG_SECTION_NUMBER = "section_number";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
	
		
	
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.main, container, false);
	//	TextView dummyTextView = (TextView) rootView.findViewById(R.id.page1_label);
		Button live_btn = (Button) rootView.findViewById(R.id.main_btn_live_video1);
		live_btn.setOnClickListener(this);
		Button live_btn2 = (Button) rootView.findViewById(R.id.main_btn_live_video_2);
		live_btn2.setOnClickListener(this);
	//	dummyTextView.setText(Integer.toString(getArguments().getInt(ARG_SECTION_NUMBER)));
		
		
		return rootView;
		
	
	}

	@Override
	public void onClick(View v) {
Intent intent;
    	
    	switch (v.getId()) {
    	
		case R.id.main_btn_live_video1:
			Toast.makeText(getActivity(), "waiting for cam-1 feed", Toast.LENGTH_SHORT).show();
			intent = new Intent(getActivity(), LiveVideoFeedActivity.class);
			intent.putExtra("cam", "cam1");
			getActivity().startActivity(intent);
			
			//Toast.makeText(getActivity(), "Clicked", Toast.LENGTH_LONG).show();
			
			break;

		case R.id.main_btn_live_video_2:
			Toast.makeText(getActivity(), "waiting for cam-2 feed", Toast.LENGTH_SHORT).show();
			intent = new Intent(getActivity(), LiveVideoFeedActivity.class);
			intent.putExtra("cam", "cam2");
			startActivity(intent);
			break;
			
		case R.id.main_btn_live_video_3:
			intent = new Intent(getActivity(), LiveVideoFeedActivity.class);
			intent.putExtra("cam", "cam1");
			getActivity().startActivity(intent);
			break;
			
		case R.id.main_btn_live_video_4:
			intent = new Intent(getActivity(), LiveVideoFeedActivity.class);
			intent.putExtra("cam", "cam1");
			getActivity().startActivity(intent);
			break;
			
		case R.id.main_btn_live_video_5:
			intent = new Intent(getActivity(), LiveVideoFeedActivity.class);
			intent.putExtra("cam", "cam1");
			getActivity().startActivity(intent);
			break;
			
		case R.id.main_btn_live_video_6:
			intent = new Intent(getActivity(), LiveVideoFeedActivity.class);
			intent.putExtra("cam", "cam1");
			getActivity().startActivity(intent);
			break;	
		default:
			break;
		}
		
	}

	
}



