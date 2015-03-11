package www.hambalyo.com.jigajigacityapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class SelectActivity extends Activity implements OnClickListener {

	private Button playFromUrlButton;
	private Button playOnYouTubeButton;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_select);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
		playFromUrlButton = (Button) findViewById(R.id.buttonURL);
		playOnYouTubeButton = (Button) findViewById(R.id.buttonOnYouTube);

		// Set onClickListener
		playFromUrlButton.setOnClickListener(this);
		playOnYouTubeButton.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		
		// Check which button was clicked
		if (playFromUrlButton.isPressed()) {
			Intent i = new Intent(SelectActivity.this, URLVideoActivity.class);
			SelectActivity.this.startActivity(i);
	        
		} else if (playOnYouTubeButton.isPressed()) {
			Intent i = new Intent(Intent.ACTION_VIEW);
	        i.setData(Uri.parse("https://www.youtube.com/watch?v=r_sHXFpAIc8"));
	        SelectActivity.this.startActivity(i);
	        
		}

	}

	
}
