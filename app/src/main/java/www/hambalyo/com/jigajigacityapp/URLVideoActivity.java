package www.hambalyo.com.jigajigacityapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.VideoView;


public class URLVideoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.url_activity_video);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
		VideoView video = (VideoView)findViewById(R.id.videoView);
		video.setVideoPath("http://djpendu.com/dl.php?id=qAVhr13ShdE&td=DEEQA--AXMED-JIGJIGA-2014720.mp4");
		video.start();

	}

}
