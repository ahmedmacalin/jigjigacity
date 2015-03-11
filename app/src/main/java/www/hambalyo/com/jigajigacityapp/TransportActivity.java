package www.hambalyo.com.jigajigacityapp;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class TransportActivity extends Activity  implements OnClickListener {


    private Button airports;

    private Button bus;

    private Button air;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transport);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        airports = (Button)findViewById(R.id.airports_btn);
        air= (Button)findViewById(R.id.other_button);
        bus = (Button)findViewById(R.id.bus_button);

        air.setOnClickListener(this);
        airports.setOnClickListener(this);

        bus.setOnClickListener(this);

    }


    public void onClick(View v) {
        // onClick takes a View as argument

        switch(v.getId()) {
            // get the id of the view
            case R.id.airports_btn :
                Intent intent1 = new Intent(TransportActivity.this,AirportsActivity.class);
                startActivity(intent1);
                break;
            case R.id.bus_button :
                Intent intent2 = new Intent(TransportActivity.this,BusActivity.class);
                startActivity(intent2);
                break;
             case R.id.other_button :
                Intent intent3 = new Intent(TransportActivity.this,ListViewactivivty.class);
                startActivity(intent3);
                break;
        }
    }
		




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.transport, menu);
        return true;
    }
/*	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings_2) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}*/
}
