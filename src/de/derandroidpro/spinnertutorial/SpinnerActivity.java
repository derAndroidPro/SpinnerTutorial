package de.derandroidpro.spinnertutorial;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class SpinnerActivity extends Activity {
	public Spinner spinner1;
	public TextView tv1;
	public String [] spinnertext = {"Eintrag 1" , "Eintrag 2" , "Eintrag 3"};
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.spinner_layout);
		
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		tv1 = (TextView) findViewById(R.id.textView1);
		
		ArrayAdapter<String> spinneradapter = new ArrayAdapter<String> (SpinnerActivity.this, android.R.layout.simple_spinner_dropdown_item, spinnertext);
		spinner1.setAdapter(spinneradapter);
		spinner1.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				
				int spinnerposition = spinner1.getSelectedItemPosition();
				
				switch (spinnerposition) {
				case 0:{
					tv1.setText("Das erste Item ist ausgewählt.");
					break;
				}
				
				case 1:{
					tv1.setText("Das zweite Item ist ausgewählt.");
					break;
				}
				
				case 2: {
					tv1.setText("Das dritte Item ist ausgewählt.");
					break;
				}
				
				}
				
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		
	}


}
