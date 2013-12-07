/*MainActivity.java*/
package com.example.androidtest;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

//import android.widget.ViewFlipper;

public class MainActivity extends Activity {

	// private ViewFlipper aViewFlipper;
	private static final String TEST_DEVICE_ID = "B3EEABB8EE11C2BE770B684D95219ECB";

	// private static final String AD_UNIT_ID =
	// "ca-app-pub-3473515938685532/2453404004";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// setContentView(R.layout.tutorial);

		// aViewFlipper = (ViewFlipper) findViewById(R.id.viewFlipper1);

		AdView adView = (AdView) this.findViewById(R.id.adView2);
		AdRequest adRequest = new AdRequest.Builder()
				.addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
				.addTestDevice(TEST_DEVICE_ID).build();
		adView.loadAd(adRequest);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;

		// sample update trying to add more stuff

		// edit

	}

	// set text label with string object value
	public void onClickButton1(View view) {
		String aString = (String) getString(R.string.messageString3);
		TextView aTextView = (TextView) findViewById(R.id.txtView);
		aTextView.setText(aString);
	}

	// open toast notification to display string value
	public void onClickButton2(View view) {
		String aString = (String) getString(R.string.messageString2);
		Toast aToast = Toast.makeText(getApplicationContext(), aString,
				Toast.LENGTH_SHORT);
		aToast.show();
	}

	// close the application
	public void onClickButton3(View view) {
		// The right way to "close" an application
		// http://stackoverflow.com/questions/3226495/android-exit-application-code
		// http://stackoverflow.com/questions/2033914/quitting-an-application-is-that-frowned-upon/2034238#2034238
		// In summary, never use exit() or finish()
		Intent anIntent = new Intent(Intent.ACTION_MAIN);
		anIntent.addCategory(Intent.CATEGORY_HOME);
		anIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		startActivity(anIntent);
	}

	public void onClickButton4(View view) {
		// Layout aLayout = (Layout) findViewById(R.layout.profile_main)
		// aViewFlipper.setDisplayedChild( aViewFlipper.indexOfChild(
		// findViewById(R.layout.profile_main) ) );
		setContentView(R.layout.profile_view);

		AdView adView = (AdView) this.findViewById(R.id.adView3);
		AdRequest adRequest = new AdRequest.Builder()
				.addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
				.addTestDevice(TEST_DEVICE_ID).build();
		adView.loadAd(adRequest);
	}

}
