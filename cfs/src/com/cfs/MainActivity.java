package com.cfs;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.support.v4.app.NavUtils;

public class MainActivity extends Activity {

	private Context context = this;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView welcomeMsg = (TextView)findViewById(R.id.welcome);
        welcomeMsg.setText("Welcome to my storage");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.menu_settings:
                showSettings();
                return true;            
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    // Shows the settings activity
	private void showSettings() {
		// TODO open an intent and show settings activity
		startActivity(new Intent(context,SettingsActivity.class));			
	}

    
}
