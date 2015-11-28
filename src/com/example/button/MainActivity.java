package com.example.button;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity 
{
	//STEP 1: Declare the button as b 
	Button b;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
     	//STEP 2: Refer the button from xml(Layout file ) with its ID(button1) 
	b=(Button)findViewById(R.id.button1);
	
	//STEP 3: Set the listener and create the object for the listener ( button-b )
	/**Since we want perform action on button click we are using OnClickListener()**/
	b.setOnClickListener(new OnClickListener()
	{
		
		@Override
		public void onClick(View arg0)
		{
			// TODO Auto-generated method stub
			/**Action to be performed on Button click**/
			
			//The message to shown in toast when user clicks on the button
			//Toast.makeText(Context,"text",duration).method for showing text;
			Toast.makeText(MainActivity.this,"You have cliked a button",Toast.LENGTH_LONG).show();
			
			
		}
	});
	
		
	}



}
