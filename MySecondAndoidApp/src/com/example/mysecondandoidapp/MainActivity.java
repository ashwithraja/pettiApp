package com.example.mysecondandoidapp;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	Button b;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		addListenerOnButton();
	}
	private void addListenerOnButton() {
		b= (Button) findViewById(R.id.start);
		b.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {

				//Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
				//startActivity(browserIntent);
				Intent intent=new Intent(getApplicationContext(),SecondScreen.class);
				startActivity(intent);

			}

		});


	}
}
