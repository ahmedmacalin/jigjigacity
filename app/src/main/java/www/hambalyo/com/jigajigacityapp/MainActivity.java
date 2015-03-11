package www.hambalyo.com.jigajigacityapp;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{
    private Button transport;
    private Button HistoryCulture;
    private Button education;
    private Button Hotels;

/*private Button videos;*/
/*private Button spinner;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        overridePendingTransition(R.anim.fadein, R.anim.fadeout);

        transport = (Button)findViewById(R.id.transport_btn);
        HistoryCulture = (Button)findViewById(R.id.history_btn);
        education = (Button)findViewById(R.id.education_btn);
        Hotels = (Button)findViewById(R.id.hotel_btn);

/*        videos = (Button)findViewById(R.id.video_btn);*/
		/*spinner=(Button)findViewById(R.id.spinnertest);*/



        transport.setOnClickListener(this);
        HistoryCulture.setOnClickListener(this);
        education.setOnClickListener(this);
        Hotels.setOnClickListener(this);

      /*  videos.setOnClickListener(this);*/
       /* spinner.setOnClickListener(this);*/
    }

    public void goToSo (View view) {
        goToUrl ( "http://hambalyo.com/");
    }


    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    public void onClick(View v) {
        // onClick takes a View as argument

        switch(v.getId()) {
            // get the id of the view
            case R.id.transport_btn :

                final Animation animTranslate = AnimationUtils.loadAnimation(this, R.anim.anim_translate);
                transport.startAnimation(animTranslate);

                Intent intent = new Intent(MainActivity.this,TransportActivity.class);
                startActivity(intent);

                break;

            case R.id.history_btn :

                final Animation animTranslate1 = AnimationUtils.loadAnimation(this, R.anim.anim_translate);
                HistoryCulture.startAnimation(animTranslate1);
                Intent intent1 = new Intent(MainActivity.this,History.class);
                startActivity(intent1);
                break;

            case R.id.education_btn:
                final Animation animTranslate3 = AnimationUtils.loadAnimation(this, R.anim.anim_translate);
                education.startAnimation(animTranslate3);
                Intent intent2 = new Intent(MainActivity.this,EducationActivity.class);
                startActivity(intent2);
                break;

            case R.id.hotel_btn:
                final Animation animTranslate4 = AnimationUtils.loadAnimation(this, R.anim.anim_translate);
                Hotels.startAnimation(animTranslate4);
                Intent intent3 = new Intent(MainActivity.this,Hotel.class);
                startActivity(intent3);
                break;


        }
    }



    @Override
    public Object getSystemService(String name) {
        // TODO Auto-generated method stub


        return super.getSystemService(name);
    }

    protected void onPause(){
        super.onPause();
        Log.d("main","onPause");

			/*WindowManager.LayoutParams lp = getWindow().getAttributes();*/
        // adjust the level of brightness

		/*	lp.screenBrightness = 5 / 100.0f;*/

        // set the attributes to the new brightness level

			/*getWindow().setAttributes(lp);
			*/
    }

    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        Log.d("main","onStart");
    }

    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        super.onResume();
        Log.d("main","onResume");
    }

    @Override
    protected void onStop() {
        // TODO Auto-generated method stub
        super.onStop();
        Log.d("main","onStop");
    }
    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
        Log.d("main","onDestroy");
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;

    }

/*	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.setting_1){
			return true;
		}

		return super.onOptionsItemSelected(item);
	}

	public boolean onOptionsItemSelected1(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.rateapp){
			return true;
		}

		return super.onOptionsItemSelected(item);
	}

	public boolean onOptionsItemSelected2(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.cont){
			return true;
		}

		return super.onOptionsItemSelected (item);
	}
	public boolean onOptionsItemSelected3(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.email){
			return true;
		}

		return super.onOptionsItemSelected(item);
	}*/




}
