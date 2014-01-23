package com.moict.videomonitoring;


import com.infinity.swippager.R;
import com.moict.main.CameraIps;

import android.os.Bundle;
import android.view.Menu;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class LiveVideoFeedActivity extends DashBoardActivity {
	WebView webView;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_feed);
        String ip = CameraIps.getIp(getIntent().getStringExtra("cam"));
		webView = (WebView) findViewById(R.id.webView);
		webView.getSettings().setJavaScriptEnabled(true);
	//	webView.setWebViewClient(new WebViewClient());
		Toast.makeText(getApplicationContext(), ip, Toast.LENGTH_LONG).show();
		webView.setWebViewClient(new WebViewClient() {
			 @Override
			public void onPageFinished(WebView view, String url)
			{
				 webView.loadUrl("javascript:(function() { " +  
			                "document.body.style.background = 'light-gray';document.getElementsByTagName('a')[0].style.display = 'none';document.getElementsByTagName('p')[2].style.display = 'none';" +  
			                "})()");
			}
			});
	
		webView.loadUrl(ip);
		
}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
