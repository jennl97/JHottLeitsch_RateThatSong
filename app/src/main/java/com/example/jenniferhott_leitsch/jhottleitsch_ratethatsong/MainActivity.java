package com.example.jenniferhott_leitsch.jhottleitsch_ratethatsong;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button1, button2, button3;
    MediaPlayer mpFreedom, mpRock, mpSkateboard;
    int playing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button)findViewById(R.id.btnFreedom);
        button2 = (Button)findViewById(R.id.btnRock);
        button3 = (Button)findViewById(R.id.btnSkateboard);
        button1.setOnClickListener(bFreedom);
        button2.setOnClickListener(bRock);
        button3.setOnClickListener(bSkateboard);
        mpFreedom = new MediaPlayer();
        mpFreedom = MediaPlayer.create(this, R.raw.roadtrip);
        mpRock = new MediaPlayer();
        mpRock = MediaPlayer.create(this, R.raw.dudelrock);
        mpSkateboard = new MediaPlayer();
        mpSkateboard = MediaPlayer.create(this, R.raw.goformore);
        playing = 0;
    }

    Button.OnClickListener bFreedom = new Button.OnClickListener(){
        @Override
        public void onClick(View v) {
            switch (playing){
                case 0:
                    mpFreedom.start();
                    playing = 1;
                    button1.setText("Pause");
                    button2.setVisibility(View.INVISIBLE);
                    button3.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    mpFreedom.pause();
                    playing = 0;
                    button1.setText("Play Roadtrip Song");
                    button2.setVisibility(View.VISIBLE);
                    button3.setVisibility(View.VISIBLE);
                    break;

            }

        }
    };

    Button.OnClickListener bRock = new Button.OnClickListener(){

        @Override
        public void onClick(View v) {
            switch (playing){
                case 0:
                    mpRock.start();
                    playing = 1;
                    button1.setVisibility(View.INVISIBLE);
                    button2.setText("Pause");
                    button3.setVisibility(View.INVISIBLE);
                    break;
                case 1:
                    mpRock.pause();
                    playing = 0;
                    button1.setVisibility(View.VISIBLE);
                    button2.setText("Play Dudle Rock Song");
                    button3.setVisibility(View.VISIBLE);
                    break;

            }

        }
    };

    Button.OnClickListener bSkateboard = new Button.OnClickListener(){

        @Override
        public void onClick(View v) {
            switch (playing){
                case 0:
                    mpSkateboard.start();
                    playing = 1;
                    button1.setVisibility(View.INVISIBLE);
                    button2.setVisibility(View.INVISIBLE);
                    button3.setText("Pause");
                    break;
                case 1:
                    mpSkateboard.pause();
                    playing = 0;
                    button1.setVisibility(View.VISIBLE);
                    button2.setVisibility(View.VISIBLE);;
                    button3.setText("Play Go For More Song");
                    break;

            }

        }
    };
}
