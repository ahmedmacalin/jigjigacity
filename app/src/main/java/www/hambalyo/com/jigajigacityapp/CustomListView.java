package www.hambalyo.com.jigajigacityapp;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;


public class CustomListView extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_custom_list_view, menu);
        return true;
    }

}
