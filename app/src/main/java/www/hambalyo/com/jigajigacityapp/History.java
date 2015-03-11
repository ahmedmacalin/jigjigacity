package www.hambalyo.com.jigajigacityapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class History extends Activity implements View.OnClickListener {
    private Button videos;
    private Button gallery;
    private Button History;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        overridePendingTransition(R.anim.fadein, R.anim.fadeout);

        videos = (Button)findViewById(R.id.hbtn_4);
        gallery = (Button)findViewById(R.id.hbtn_3);
        History = (Button)findViewById(R.id.hbtn_2);


        videos.setOnClickListener(this);
        gallery.setOnClickListener(this);
        History.setOnClickListener(this);
    }
    public void onClick(View v) {
        // onClick takes a View as argument

        switch (v.getId()) {
            // get the id of the view


            case R.id.hbtn_4:
                Intent intent1 = new Intent(History.this,SelectActivity.class);
                startActivity(intent1);
                break;

            case R.id.hbtn_3:
                Intent intent2 = new Intent(History.this,Main1Activity.class);
                startActivity(intent2);
                break;
          /*  case R.id.hbtn_2:
                Intent intent3 = new Intent(History.this,ScreenSlideHistoryActivity.class);
                startActivity(intent3);
                break;*/
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.history, menu);
        return true;

    }
}