package com.jamile.easyspeak_v21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class act_videos2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_videos2);
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                |View.SYSTEM_UI_FLAG_FULLSCREEN);

        TextView txresposta2=(TextView)findViewById(R.id.txresposta2);
        txresposta2.setText("Don't show up, don't come out\n" +
                "Don't start caring about me now\n" +
                "Walk away, you know how\n" +
                "Don't start caring about me now");

        // CONFIG VIDEOVIEW PARA TOCAR VIDEO
        VideoView videoview2=findViewById(R.id.video2);
        String videoPath2="android.resource://"+getPackageName()+"/"+R.raw.dontstartnow;
        Uri uri2=Uri.parse(videoPath2);
        videoview2.setVideoURI(uri2);
        MediaController mediacontroller2=new MediaController(this);
        videoview2.setMediaController(mediacontroller2);
        mediacontroller2.setAnchorView(videoview2);

        //CONFIG VIDEO 2 DONT START NOW
        Button btresposta2 = (Button)findViewById(R.id.btterminar2);
        final TextView txtresposta2=(TextView)findViewById(R.id.txresposta2);
        btresposta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtresposta2.setVisibility(View.VISIBLE);
            }
        });

        Button btnovovideo2=(Button)findViewById(R.id.btnovovideo2);
        btnovovideo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(act_videos2.this,act_videos3.class));
            }
        });
    }
}