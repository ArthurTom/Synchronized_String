package com.eway.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findViewById(R.id.start).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {

		switch (v.getId()) {
			case R.id.start:
				
				Service serviceA = new Service();
				ThreadA threadA = new ThreadA(serviceA);
				threadA.setName("A");
				threadA.start();
				ThreadB threadB = new ThreadB(serviceA);
				threadB.setName("B");
				threadB.start();

				break;
			default:
				break;
		}
	}
}
