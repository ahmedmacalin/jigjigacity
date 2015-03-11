package www.hambalyo.com.jigajigacityapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Hotel extends Activity implements View.OnClickListener {
    private Button hotels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);

        hotels = (Button) findViewById(R.id.hotelbtn_2);

        hotels.setOnClickListener(this);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.hotel, menu);
        return true;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            // get the id of the view
            case R.id.hotelbtn_2:
                Intent intent1 = new Intent(Hotel.this, Hotels_Names.class);
                startActivity(intent1);
                break;
        }

/*	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}*/
    }
}