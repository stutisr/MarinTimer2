package com.example.stuti.marintimer2;

import android.content.Context;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;

import android.app.Activity;
import android.os.Bundle;
import android.os.CountDownTimer;
import java.util.concurrent.TimeUnit;

import android.widget.MediaController;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import java.util.Date;
import java.util.Calendar;
import android.content.Intent;
import android.widget.VideoView;


public class MainActivity extends Activity {


    TextView text1,text2;

    private static final String FORMAT = "%02d:%02d:%02d:%02d";

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Context context = this;


        /*if(isTimeExpired) {
            Intent intent = new Intent(context, VideoActivity.class);
            startActivity(intent);
        }*/
        text2 = (TextView) findViewById(R.id.textView2);
        //text2.setText("TIME REMAINING");

        text1 = (TextView) findViewById(R.id.textView1);
       /* if(true) {
            *//*Intent intent = new Intent(this, VideoActivity.class);
            startActivity(intent);
*//*
            setContentView(R.layout.res2);
            VideoView vidView = (VideoView) findViewById(R.id.myVideo);
            String vidAddress = "https://archive.org/download/video_20170410/video.mp4";
            Uri vidUri = Uri.parse(vidAddress);
            vidView.setVideoURI(vidUri);

            MediaController vidControl = new MediaController(this);
            vidControl.setAnchorView(vidView);
            vidView.setMediaController(vidControl);

            vidView.start();
        }
        else
        {*/

            new CountDownTimer(160000000, 1000) { // adjust the milli seconds here

                public void onTick(long millisUntilFinished) {

                    text1.setText("" + String.format(FORMAT, TimeUnit.MILLISECONDS.toDays(millisUntilFinished),
                            TimeUnit.MILLISECONDS.toHours(millisUntilFinished) - TimeUnit.DAYS.toHours(
                                    TimeUnit.MILLISECONDS.toDays(millisUntilFinished)),
                            TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished) - TimeUnit.HOURS.toMinutes(
                                    TimeUnit.MILLISECONDS.toHours(millisUntilFinished)),
                            TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) - TimeUnit.MINUTES.toSeconds(
                                    TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished))));
                }

                public void onFinish() {
                    text1.setText("");

                }
            }.start();
        }
    //}
   /* public Date printDifference(Date startDate, Date endDate) {

        //milliseconds
        long different = endDate.getTime() - startDate.getTime();

        long secondsInMilli = 1000;
        long minutesInMilli = secondsInMilli * 60;
        long hoursInMilli = minutesInMilli * 60;
        long daysInMilli = hoursInMilli * 24;

        long elapsedDays = different / daysInMilli;
        different = different % daysInMilli;

        long elapsedHours = different / hoursInMilli;
        different = different % hoursInMilli;

        long elapsedMinutes = different / minutesInMilli;
        different = different % minutesInMilli;

        long elapsedSeconds = different / secondsInMilli;


    }*/

}
