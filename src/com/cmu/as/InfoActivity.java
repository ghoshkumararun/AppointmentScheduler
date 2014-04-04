package com.cmu.as;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;



public class InfoActivity extends Activity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.setContentView(R.layout.info);
	}
	
	public void newTab(View view) {
		Intent intent = new Intent(this, SelectHos.class);
		startActivity(intent);
	}
	
	public void past(View view){
		Intent intent = new Intent(this, PastActivity.class);
		startActivity(intent);

	}
	
	public void future(View view){
		Intent intent = new Intent(this, FutureActivity.class);
		startActivity(intent);

	}
	
	public void info(View view){
		Intent intent = new Intent(this, InfoActivity.class);
		startActivity(intent);

	}

	
}
		
