package com.example.test3;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
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
	
	public native int evaluateProduct(int a, int b);

	public native int evaluateThis(int a, int b);
	
//	public native int sumVector(int[] a, int[] b, int[] c);
	
//	public native int testSumVector(int a, int b);

	private static final String TAG = "MainActivity";
			
	public void Evaluate(View v)
	{
		TextView txtResult = (TextView) findViewById(R.id.txtResult);
		try
		{
			txtResult.setText(Integer.toString(evaluateProduct(3, 7)));	
//			txtResult.setText(Integer.toString(testSumVector(10, 4)));	
		}
		catch (Exception ex)
		{
			txtResult.setText(ex.toString());
		}
	}
	
	public void ChangeActivity(View v)
	{
		try
		{
			 Intent intent = new Intent(v.getContext(), ArrayActivity.class);  
			 v.getContext().startActivity(intent);  
		}
		catch (Exception ex)
		{
			Log.e(TAG, ex.toString());
		}
	}
	
	static {
		System.loadLibrary("evaluate-module");
	}

}
