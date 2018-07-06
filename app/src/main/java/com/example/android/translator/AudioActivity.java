package com.example.android.translator;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static android.media.MediaPlayer.create;

public class AudioActivity extends AppCompatActivity {

    private MediaPlayer mp = MediaPlayer.create(AudioActivity.this,R.raw.tiger);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio);
    }



    public void playAudio(View view){
        mp.start();
    }

    public void pauseAudio(View view){
        if(mp.isPlaying()){
            mp.pause();
        }
    }
}
