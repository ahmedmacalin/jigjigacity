package www.hambalyo.com.jigajigacityapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class EducationActivity extends Activity implements View.OnClickListener {
private Button unversities;


	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education1);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);

        unversities = (Button)findViewById(R.id.ebtn_3);



        unversities.setOnClickListener(this);

    }
    public void onClick(View v) {
        // onClick takes a View as argument

        switch (v.getId()) {
            // get the id of the view

            case R.id.ebtn_3:
                Intent intent1 = new Intent(EducationActivity.this,UniversitiesandSchools.class);
                startActivity(intent1);
                break;
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.educ, menu);
        return true;

    }
}