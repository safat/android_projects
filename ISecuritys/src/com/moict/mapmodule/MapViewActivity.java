package com.moict.mapmodule;

import java.util.ArrayList;
import java.util.HashMap;

import com.infinity.swippager.R;
import com.moict.videomonitoring.LiveVideoFeedActivity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.SupportMapFragment;
import android.support.v4.app.*;

public class MapViewActivity extends FragmentActivity implements
		OnMarkerClickListener {
	// Google Map
	private GoogleMap googleMap;
	HashMap<Marker,String> camIds = new HashMap();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_map);

		try {
			// Loading map
			initilizeMap();
			getCameraMarkers();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void getCameraMarkers() {
		double latitude = 23.739243;
		double longitude = 90.375589;
		MarkerOptions marker1 = new MarkerOptions().position(
				new LatLng(latitude, longitude)).title("cam1");
		marker1.icon(BitmapDescriptorFactory
				.fromResource(R.drawable.marker_camera));
		CameraPosition cameraPosition = new CameraPosition.Builder()
				.target(new LatLng(latitude, longitude)).zoom(17).build();
		googleMap.addMarker(marker1);
		
		latitude = 23.740967;
		longitude = 90.374559;
		MarkerOptions marker2 = new MarkerOptions().position(
				new LatLng(latitude, longitude)).title("cam2");
		marker2.icon(BitmapDescriptorFactory
				.fromResource(R.drawable.marker_camera));
		googleMap.addMarker(marker2);

		googleMap.animateCamera(CameraUpdateFactory
				.newCameraPosition(cameraPosition));

	}

	@Override
	protected void onResume() {
		super.onResume();
		initilizeMap();
	}

	/**
	 * function to load map If map is not created it will create it for you
	 * */
	private void initilizeMap() {

		if (googleMap == null) {
			googleMap = ((SupportMapFragment) getSupportFragmentManager()
					.findFragmentById(R.id.map)).getMap();
			googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
			googleMap.getUiSettings().setZoomControlsEnabled(true);
			googleMap.getUiSettings().setMyLocationButtonEnabled(true);
			googleMap.getUiSettings().setCompassEnabled(true);
			googleMap.getUiSettings().setRotateGesturesEnabled(true);
			googleMap.getUiSettings().setZoomGesturesEnabled(true);
			googleMap.setOnMarkerClickListener(this);
			// check if map is created successfully or not
			if (googleMap == null) {
				Toast.makeText(getApplicationContext(),
						"Sorry! unable to create maps", Toast.LENGTH_SHORT)
						.show();
			}
		}
	}

	@Override
	public boolean onMarkerClick(Marker marker) {
		//temporarily using title ans marker identifier..will do it with hashmap of marker object referrence
		Toast.makeText(getApplicationContext(), "Wait for Video Feed.."+marker.getTitle(), Toast.LENGTH_LONG).show();
		Intent intent = new Intent(MapViewActivity.this,
				LiveVideoFeedActivity.class);
		intent.putExtra("cam",marker.getTitle());
		startActivity(intent);
		return true;
	}

}
