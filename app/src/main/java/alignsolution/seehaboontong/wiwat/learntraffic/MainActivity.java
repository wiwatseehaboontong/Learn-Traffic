package alignsolution.seehaboontong.wiwat.learntraffic;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    //Explicit การประกาศตัวแปร
    private ListView trafficListView;
    private Button aboutMeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget การผูกความสัมพันธ์ของตัวแปร Variable and Widget
        trafficListView = (ListView) findViewById(R.id.listView);
        aboutMeButton = (Button) findViewById(R.id.btnAboutMe);

        //Get Event on button
        aboutMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //sound effect
                MediaPlayer mediaPlayer = MediaPlayer.create(getBaseContext(), R.raw.sheep);
                mediaPlayer.start();
            }   //onclick
        });

    }   //Main Method

}   //Main Class
