package com.example.test3;

import java.io.Console;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	public native int evaluateThis(int a, int b);
	
	public void Evaluate(View v)
	{
		TextView txtResult = (TextView) findViewById(R.id.txtResult);
		try
		{
			txtResult.setText(Integer.toString(evaluateThis(10, 20)));	
		}
		catch (Exception ex)
		{
			txtResult.setText(ex.toString());
		}
	}
	
	static {
		System.loadLibrary("evaluate-module");
	}

}
