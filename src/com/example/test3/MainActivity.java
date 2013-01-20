package com.example.test3;

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
	
	public native int evaluateProduct(int a, int b);

	public native int evaluateThis(int a, int b);
	
	public native int sumVector(int[] a, int[] b, int[] c);
	
	public native int testSumVector(int a, int b);

	//public native int sumVector(int[] a, int[] b, int[] c);

	public void Evaluate(View v)
	{
		TextView txtResult = (TextView) findViewById(R.id.txtResult);
		try
		{
			int a[] = new int[10];
			
			for (int i = 0; i < 10; i++) a[i] = i;
			
			int b[] = new int[10];
			
			for (int i = 2; i < 12; i++) b[i - 2] = i % 10 + 5;
			
			int c[] = new int[10];
			
			sumVector(a, b, c);
			
			String s = "";
			
			for (int i = 0; i < 10; i++) s += (Integer.toString(c[i]) + " ");
			
			txtResult.setText(s);	
//			txtResult.setText(Integer.toString(testSumVector(10, 4)));	
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
