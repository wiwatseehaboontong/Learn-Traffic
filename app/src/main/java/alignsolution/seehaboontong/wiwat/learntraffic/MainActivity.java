package alignsolution.seehaboontong.wiwat.learntraffic;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
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

                //web view
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://youtu.be/jATOeljOzkA"));
                startActivity(intent);
            }   //onclick
        });

        //create ListView

        //assign value to variable array
        //Type 1
        final int[] iconInts = {R.drawable.traffic_01, R.drawable.traffic_02, R.drawable.traffic_03, R.drawable.traffic_04,
                R.drawable.traffic_05, R.drawable.traffic_06, R.drawable.traffic_07, R.drawable.traffic_08,
                R.drawable.traffic_09, R.drawable.traffic_10, R.drawable.traffic_11, R.drawable.traffic_12,
                R.drawable.traffic_13, R.drawable.traffic_14, R.drawable.traffic_15, R.drawable.traffic_16,
                R.drawable.traffic_17, R.drawable.traffic_18, R.drawable.traffic_19, R.drawable.traffic_20};

        //Type 2
        final String[] titleStrings = new String[20];
        titleStrings[0] = "หัวข้อที่ 1";
        titleStrings[1] = "หัวข้อที่ 2";
        titleStrings[2] = "หัวข้อที่ 3";
        titleStrings[3] = "หัวข้อที่ 4";
        titleStrings[4] = "หัวข้อที่ 5";
        titleStrings[5] = "หัวข้อที่ 6";
        titleStrings[6] = "หัวข้อที่ 7";
        titleStrings[7] = "หัวข้อที่ 8";
        titleStrings[8] = "หัวข้อที่ 9";
        titleStrings[9] = "หัวข้อที่ 10";
        titleStrings[10] = "หัวข้อที่ 11";
        titleStrings[11] = "หัวข้อที่ 12";
        titleStrings[12] = "หัวข้อที่ 13";
        titleStrings[13] = "หัวข้อที่ 14";
        titleStrings[14] = "หัวข้อที่ 15";
        titleStrings[15] = "หัวข้อที่ 16";
        titleStrings[16] = "หัวข้อที่ 17";
        titleStrings[17] = "หัวข้อที่ 18";
        titleStrings[18] = "หัวข้อที่ 19";
        titleStrings[19] = "หัวข้อที่ 20";

        //Type 3
        String[] descripStrings = getResources().getStringArray(R.array.description);

        //create ListView
        MyAdapter myAdapter = new MyAdapter(this, titleStrings, descripStrings, iconInts);
        trafficListView.setAdapter((myAdapter));

        trafficListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(MainActivity.this, ShowDetail.class);
                intent.putExtra("Title", titleStrings[i]);
                intent.putExtra("Icon", iconInts[i]);
                intent.putExtra("Index", i);
                startActivity(intent);


            }   //onItemClick
        });

    }   //Main Method

}   //Main Class
