package com.example.mysecondandoidapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;
import android.widget.Toast;

public class Thirdscreen extends Activity {

	TextView t;
	private static final int LENGTH_LONG = 3500;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_thirdscreen);
		t=(TextView)findViewById(R.id.answer);

		Bundle bundle = this.getIntent().getExtras();  

		if(bundle !=null)
		{


			CharSequence  strdata = bundle.getString("time"); 
            t.setText(strdata);
		}
		else
		{

			Context context = getApplicationContext();
			CharSequence text = "Hello toast!";
			int duration = Toast.LENGTH_LONG;

			Toast toast = Toast.makeText(context, text, duration);
			toast.show();
			//Do something here if data not received
		}
	}

}
