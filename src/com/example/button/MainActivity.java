package com.example.button;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity 
{
	// Define and declare a button here 
	Button b;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
        //Refer the button from xml with the id of button b1 which is "button1"
	b=(Button)findViewById(R.id.button1);
	
	// Set the listener for button , i'm using on click listener for button
	b.setOnClickListener(new OnClickListener()
	{
		
		@Override
		public void onClick(View arg0)
		{
			// TODO Auto-generated method stub
			
			//The message to shown in toast when user clicks on the button
			Toast.makeText(MainActivity.this,"You have cliked a button",Toast.LENGTH_LONG).show();
			
			
		}
	});
	
		
	}



}
