package www.hambalyo.com.jigajigacityapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class AirportsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_airports);

        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        //Write spinner and arrayAdapter for list the String stored in array

        final Spinner spinner = (Spinner) findViewById(R.id.SpinnerOrginal);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(
                this, R.array.Airports, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.airports, menu);
        return true;
    }

}

