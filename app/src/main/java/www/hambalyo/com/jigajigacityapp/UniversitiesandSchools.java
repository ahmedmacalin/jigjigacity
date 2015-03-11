package www.hambalyo.com.jigajigacityapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class UniversitiesandSchools extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_universitiesand_schools);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);


    }

    public void goToSo3(View view) {
        goToUrl("http://www.jju.edu.et");
    }


    private void goToUrl(String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }
}
/*
        });
    }
}*/
