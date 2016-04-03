package alignsolution.seehaboontong.wiwat.learntraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowDetail extends AppCompatActivity {

    //Explicit
    private TextView titTextView, detailTextView;
    ImageView trafficImageView; //no declare = default is private

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_detail);

        //bind widget
        titTextView = (TextView) findViewById(R.id.textView4);
        detailTextView = (TextView) findViewById(R.id.textView5);
        trafficImageView = (ImageView) findViewById(R.id.imageView2);

        //receive and show
        String strTitle = getIntent().getStringExtra("Title");
        titTextView.setText(strTitle);

        int intImage = getIntent().getIntExtra("Icon", R.drawable.traffic_01); //parameter2 is default when not found image
        trafficImageView.setImageResource(intImage);

        int intIndex = getIntent().getIntExtra("Index",0); //parameter2 is default when not found image

        String[] detailString = getResources().getStringArray(R.array.detail);
        detailTextView.setText(detailString[intIndex]);


    }   //Main Method

}   //Main Class
