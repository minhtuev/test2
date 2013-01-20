/**
 * 
 */
package com.example.test3;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * @author drl-leopard
 * 
 * The second Activity class in this project.
 * This Activity class demonstrates the use of array in Android NDK.
 *
 */
public class ArrayActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_array);
	}
	
	public native int sumVector(int[] a, int[] b, int[] c);
	
	public native int testSumVector(int a, int b);
	
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
