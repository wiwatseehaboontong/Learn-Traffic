package alignsolution.seehaboontong.wiwat.learntraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this, MainActivity.class));
                finish();
            }
        }, 5000); //unit is second on move

        MediaPlayer mediaPlayer = new MediaPlayer().create(getBaseContext(), R.raw.intro_start_horse);
        mediaPlayer.start();


    }   //Main Method

}   //Main Class
