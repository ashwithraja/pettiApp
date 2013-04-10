package com.example.mysecondandoidapp;



import com.example.mysecondandoidapp.R.string;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnKeyListener;
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
	private String pass="asss";
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
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
		EditText ek = (EditText)findViewById(R.id.Hiden);
		ek.setOnKeyListener(new OnKeyListener() {
			
			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				if (event.getAction() == KeyEvent.ACTION_DOWN)

					while((keyCode == KeyEvent.KEYCODE_COMMA)){
						EditText e = (EditText)findViewById(R.id.Hiden);
					
						setPass(e.getText().toString());
						return true;
					}
				return false;
			}
		});


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


		/*magic.setOnClickListener(new OnClickListener() {

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

					Context context = getApplicationContext();
					CharSequence text = "ask petti for the anser";
					int duration = Toast.LENGTH_SHORT;

					Toast toast = Toast.makeText(context, text, duration);
					toast.show();
				}

			}
		});*/
		final EditText E=(EditText)findViewById(R.id.Hiden);
		
		E.addTextChangedListener(new TextWatcher() {

			@Override
			public void onTextChanged(CharSequence s, int start, int before, int count) {
				// TODO Auto-generated method stub
				int b=E.getText().toString().length();
				EditText k=(EditText)findViewById(R.id.secondTextBox);
				display(b,k);

				
			}


			private void display(int b,EditText k) {
				// TODO Auto-generated method stub
				for(int i=0;i<b;i++)
				{

					if(i==0){
						k.setText("");}
					else if(i==1){k.setText("p|");}
					else if(i==2){k.setText("pe|");}
					else if(i==3){k.setText("pet|");}
					else if(i==4){k.setText("petti|");}
					else if(i==5){k.setText("petti |");}
					else if(i==6){k.setText("petti a|");}
					else if(i==7){k.setText("petti an|");}
					else if(i==8){k.setText("petti ans|");}
					else if(i==9){k.setText("petti answ|");}
					else if(i==10){k.setText("petti answe|");}
					else if(i==11){k.setText("petti answer|");}
					else if(i==12){k.setText("petti answer |");}
					else if(i==13){k.setText("petti answer m|");}
					else if(i==14){k.setText("petti answer my |");}
					else if(i==15){k.setText("petti answer my q|");}
					else if(i==16){k.setText("petti answer my qu|");}
					else if(i==17){k.setText("petti answer my que|");}
					else if(i==18){k.setText("petti answer my ques|");}
					else if(i==19){k.setText("petti answer my quest|");}
					else if(i==20){k.setText("petti answer my questi|");}
					else if(i==21){k.setText("petti answer my questio|");}
					else{k.setText("petti answer my question");}


				}
				
			}

			@Override
			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
				// TODO Auto-generated method stub
				

			}

			@Override
			public void afterTextChanged(Editable s) {
				// TODO Auto-generated method stub

			}
		});

		start=(EditText)findViewById(R.id.firstTextBox);
		start.setOnKeyListener(new OnKeyListener() {

			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				// TODO Auto-generated method stub
				if (event.getAction() == KeyEvent.ACTION_DOWN)

					while((keyCode == KeyEvent.KEYCODE_ENTER)){
						EditText e = (EditText)findViewById(R.id.Hiden);
					
						e.requestFocus();
						return true;
					}
				return false;
			}

		});


		magic.setOnKeyListener(new OnKeyListener() {

			@Override
			public boolean onKey(View v, int keyCode, KeyEvent event) {
				// TODO Auto-generated method stub
				String x=magic.getText().toString();
				int a=x.length();
				int i=0;
				if (event.getAction() == KeyEvent.ACTION_DOWN)

					while((keyCode == KeyEvent.KEYCODE_COMMA)){
						EditText e = (EditText)findViewById(R.id.Hiden);
						if(keyCode==KeyEvent.KEYCODE_A)
						{
							magic.requestFocus();
						}
						 if(keyCode==KeyEvent.KEYCODE_1){

						e.requestFocus();}
						return true;
					}
				return false;
			}

		});
		EditText s=(EditText)findViewById(R.id.secondTextBox);
		s.setOnFocusChangeListener(new OnFocusChangeListener() {

			@Override
			public void onFocusChange(View v, boolean hasFocus) {
				// TODO Auto-generated method stub
				EditText e=(EditText)findViewById(R.id.Hiden);
				e.requestFocus();
			}
		});



		b2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				EditText d = (EditText)findViewById(R.id.Hiden);
				Intent goToSendServer=new Intent(getApplicationContext(),Thirdscreen.class);
				Bundle basket = new Bundle();
				basket.putString("time", getPass());

				goToSendServer.putExtras(basket);
				boolean isQuestion = validate(start.getText().toString());
				boolean isAnswer = validate(d.getText().toString());
				//p.setText("Petti Please answer my question");

				if(isQuestion&&isAnswer)
				{
					startActivity(goToSendServer);
				}	
				else if(isQuestion && !isAnswer)
				{

					Context context = getApplicationContext();
					CharSequence text = "please ask petti";
					int duration = Toast.LENGTH_SHORT;

					Toast toast = Toast.makeText(context, text, duration);
					toast.show();
				}
				else
				{
					Context context = getApplicationContext();
					CharSequence  text = "enter the question";
					int duration = Toast.LENGTH_SHORT;

					Toast toast = Toast.makeText(context, text, duration);
					toast.show();

				}
			}



		});



	}

}
