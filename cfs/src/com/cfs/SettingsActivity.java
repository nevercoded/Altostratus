package com.cfs;

import java.util.ArrayList;
import java.util.Arrays;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class SettingsActivity extends Activity {

	private ArrayAdapter<String> listAdapter ;
	
	/* This should show the settings activity.
	 * Once settings menu is clicked this activity will be activated.
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
        ListView cloudServicesListView = (ListView) findViewById(R.id.settings);
        
        // Create and populate a List of cloud storage services         
        ArrayList<String> servicesList = new ArrayList<String>();
        // Create ArrayAdapter using the planet list.
        listAdapter = new ArrayAdapter<String>(this, R.layout.settingsrow, servicesList);        
        listAdapter.add( "SkyDrive" );
        listAdapter.add( "Google Drive" );
        listAdapter.add( "Dropbox" );
        listAdapter.add( "Amazon Drive" );        
        
        // Set the ArrayAdapter as the ListView's adapter.
        cloudServicesListView.setAdapter( listAdapter );      
        
    }

}
