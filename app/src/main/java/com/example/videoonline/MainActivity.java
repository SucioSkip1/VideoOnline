package com.example.videoonline;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    private VideoView mVideoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      mVideoView = findViewById(R.id.video);
/*
        String videoUrl = "https://www.youtube.com/watch?v=dQw4w9WgXcQ";
        mVideoView.setVideoURI(Uri.parse(videoUrl));
        mVideoView.start();
        mVideoView.setMediaController(new MediaController(this));
        mVideoView.requestFocus();
*/

       mVideoView.setVideoURI(Uri.parse(
                "https://joy1.videvo.net/videvo_files/video/free/video0476/large_watermarked/_import_621c57f606fce0.63604907_preview.mp4"));
        mVideoView.start();
        mVideoView.setMediaController(new MediaController(this));
        mVideoView.requestFocus();


    }
}