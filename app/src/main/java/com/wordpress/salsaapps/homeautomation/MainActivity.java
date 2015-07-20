package com.wordpress.salsaapps.homeautomation;

import android.app.ActionBar;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mainLightOn(View view)
    {
        String onUrl = "http://192.168.1.178/arduino/digital/13/1";
        Intent launchUrl = new Intent(Intent.ACTION_VIEW, Uri.parse(onUrl));
        startActivity(launchUrl);
    }

    public void mainLightOff(View view)
    {
        String onUrl = "http://192.168.1.178/arduino/digital/13/0";
        Intent launchUrl = new Intent(Intent.ACTION_VIEW, Uri.parse(onUrl));
        startActivity(launchUrl);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        switch (id) {
            case R.id.action_settings:
                Toast.makeText(this, "Settings not yet implemented", Toast.LENGTH_SHORT)
                        .show();
                break;
            case R.id.hide_actionbar:
                Toast.makeText(this, "Action Bar Hidden", Toast.LENGTH_SHORT)
                        .show();
                android.support.v7.app.ActionBar actionBar = getSupportActionBar();
                actionBar.hide();

                break;
            default:
                break;
        }
        return true;



    }
}
