package com.example.dartstest;

import uk.co.senab.photoview.PhotoView;
import uk.co.senab.photoview.PhotoViewAttacher.OnPhotoTapListener;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class DartsFragment extends Fragment {
	
	private PhotoView mDartsView;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.darts_fragment, container, false);
		mDartsView = (PhotoView)v.findViewById(R.id.darts_view);
		mDartsView.setOnPhotoTapListener(new OnPhotoTapListener() {
			
			@Override
			public void onPhotoTap(View view, float x, float y) {

				Toast.makeText(getActivity(), "x = "+x+
						"\ny = "+y+
						"\nangle = "+((Math.atan2(y-0.5, x-0.5) * 180 / Math. PI)), Toast.LENGTH_SHORT).show();
			}
		});
		return v;
	}
	
	

}
