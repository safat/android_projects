package com.moict.videomonitoring;

import com.infinity.swippager.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends DashBoardActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        setHeader(getString(R.string.HomeActivityTitle), false, true);
        
    }
    
    /**
     * Button click handler on Main activity
     * @param v
     */
    public void onButtonClicker(View v)
    {
    	Intent intent;
    	
    	switch (v.getId()) {
		case R.id.main_btn_live_video1:
			intent = new Intent(this, LiveVideoFeedActivity.class);
			startActivity(intent);
			break;

		case R.id.main_btn_live_video_2:
			intent = new Intent(this, LiveVideoFeedActivity.class);
			startActivity(intent);
			break;
			
		case R.id.main_btn_live_video_3:
			intent = new Intent(this, LiveVideoFeedActivity.class);
			startActivity(intent);
			break;
			
		case R.id.main_btn_live_video_4:
			intent = new Intent(this, LiveVideoFeedActivity.class);
			startActivity(intent);
			break;
			
		case R.id.main_btn_live_video_5:
			intent = new Intent(this, LiveVideoFeedActivity.class);
			startActivity(intent);
			break;
			
		case R.id.main_btn_live_video_6:
			intent = new Intent(this, LiveVideoFeedActivity.class);
			startActivity(intent);
			break;	
		default:
			break;
		}
    }
}

