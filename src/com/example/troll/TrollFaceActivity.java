package com.example.troll;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class TrollFaceActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_troll_face);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.troll_face, menu);
		return true;
	}

}
