package com.example.mp3voicerec;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity{
	
	private RecMicToMp3 mRecMicToMp3 = new RecMicToMp3(Environment.getExternalStorageDirectory() + "/anirban.mp3", 8000);
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_layout);
	}
	
	public void startingRec(View v) 
	{
		mRecMicToMp3.start();
		Toast.makeText(MainActivity.this, "Rec Started !!", Toast.LENGTH_LONG).show();
	}
	
	public void stoppingRec(View v) 
	{
		mRecMicToMp3.stop();
		Toast.makeText(MainActivity.this, "Rec Stoped !!", Toast.LENGTH_LONG).show();
	}
}
