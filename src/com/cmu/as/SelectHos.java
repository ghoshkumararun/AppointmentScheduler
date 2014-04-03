package com.cmu.as;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SelectHos extends Activity{

	public void onCreate(Bundle savedInstanceState) 
	{
	      super.onCreate(savedInstanceState); // call superclass's version
	      setContentView(R.layout.select_hos); // inflate the GUI
	      
	      if ( savedInstanceState == null ) // the app just started running
	      {
	      } // end if
	      else // app is being restored from memory, not executed from scratch
	      {
	         // initialize the bill amount to saved amount
	      } // end else
	}
	
	public void confirm(View view) {
		Intent intent = new Intent(this, SelectDoc.class);
		startActivity(intent);
	}
	
	public void msButton(View view) {
		Intent intent = new Intent(this, SelectHosManually.class);
		startActivity(intent);
	}
	
	public void newTab(View view) {
		Intent intent = new Intent(this, SelectHos.class);
		startActivity(intent);
	}

}
