package com.example.stuti.marintimer2;

import android.app.Activity;
import android.os.Bundle;
import android .widget.VideoView;
import android.net.Uri;
import android.widget.MediaController;

/**
 * Created by stutisrivastava on 10/04/17.
 */

public class VideoActivity extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.res2);
        VideoView vidView = (VideoView) findViewById(R.id.myVideo);
        String vidAddress = "https://www.dropbox.com/s/y3sif3fwe8ufcy8/video.mp4?dl=0";
        Uri vidUri = Uri.parse(vidAddress);
        vidView.setVideoURI(vidUri);

        MediaController vidControl = new MediaController(this);
        vidControl.setAnchorView(vidView);
        vidView.setMediaController(vidControl);

        vidView.start();
    }
}
