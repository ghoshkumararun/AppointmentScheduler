package com.cmu.as;

import com.cmu.as.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LogIn extends Activity {

	
	public void onCreate(Bundle savedInstanceState) 
	{
	      super.onCreate(savedInstanceState); // call superclass's version
	      setContentView(R.layout.log_in); // inflate the GUI
	      
	      if ( savedInstanceState == null ) // the app just started running
	      {
	      } // end if
	      else // app is being restored from memory, not executed from scratch
	      {
	         // initialize the bill amount to saved amount
	      } // end else
	}
	
	public void logIn(View view) {
		Intent intent = new Intent(this, SelectHos.class);
		startActivity(intent);
	}


	}



