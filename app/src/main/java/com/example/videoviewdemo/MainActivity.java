package com.example.videoviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    Button btnPlay;
    VideoView videoView;
    MediaController mediaC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // get reference to the button and the video view
        btnPlay = (Button)findViewById(R.id.btnPlay);
        videoView = (VideoView)findViewById(R.id.videoView);

        // create a MediaController
        mediaC = new MediaController(this);
    }

    public void videoPlay(View v){
        // get the path of the video
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.dittoconga;
        // set the path of the video to the video view
        videoView.setVideoPath(videoPath);

        // set the media controller to the videoview
        videoView.setMediaController(mediaC);

        // The controls will float above the view specified with setAnchorView().
        mediaC.setAnchorView(videoView);

        // Start the video
        videoView.start();
    }
}
