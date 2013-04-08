package com.example.mysecondandoidapp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondScreen extends Activity {
	Button b2;
	Bundle d;
	EditText start;
	EditText magic;
	TextView p;
	private boolean validate(String string)
	{
		if(string.equals(""))
		{
			return false;
		}
		else
		{
			return true;
		}

	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second_screen);
		addListenerOnButton();
	}
	private void addListenerOnButton() {
		b2= (Button) findViewById(R.id.send);
		start=(EditText)findViewById(R.id.firstTextBox);
		magic=(EditText)findViewById(R.id.secondTextBox);
		p=(TextView)findViewById(R.id.pettiQuestion);


		/*magic.setOnFocusChangeListener(new OnFocusChangeListener() {

				@Override
				public void onFocusChange(View arg0, boolean arg1) {
					// TODO Auto-generated method stub
					p.setText("please answer my question");
				}
			});*/

		magic.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String s = magic.getText().toString();

				boolean a=validate(s);
				if(a)
				{
					p.setText("Petti Please answer my question");
				}
				else
				{
					Context context = getApplicationContext();
					CharSequence text = "ask petti for the anser";
					int duration = Toast.LENGTH_SHORT;

					Toast toast = Toast.makeText(context, text, duration);
					toast.show();
				}

			}
		});

		b2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

				Intent goToSendServer=new Intent(getApplicationContext(),Thirdscreen.class);
				Bundle basket = new Bundle();
				basket.putString("time", magic.getText().toString());

				goToSendServer.putExtras(basket);
				boolean isQuestion = validate(start.getText().toString());
				boolean isAnswer = validate(magic.getText().toString());
				//p.setText("Petti Please answer my question");

				if(isQuestion&&isAnswer)
				{
					startActivity(goToSendServer);
				}	
				else if(isQuestion && !isAnswer)
				{

					Context context = getApplicationContext();
					CharSequence text = "i cant find the answer";
					int duration = Toast.LENGTH_SHORT;

					Toast toast = Toast.makeText(context, text, duration);
					toast.show();
				}
				else
				{
					Context context = getApplicationContext();
					CharSequence text = "enter the question";
					int duration = Toast.LENGTH_SHORT;

					Toast toast = Toast.makeText(context, text, duration);
					toast.show();

				}
			}



		});


	}

}
