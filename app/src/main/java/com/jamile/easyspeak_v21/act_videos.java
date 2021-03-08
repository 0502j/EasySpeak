package com.jamile.easyspeak_v21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import org.w3c.dom.Text;

public class act_videos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_videos);
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                |View.SYSTEM_UI_FLAG_FULLSCREEN);

        // CONFIG VIDEOVIEW PARA TOCAR VIDEO
        VideoView videoview1=findViewById(R.id.video);
        String videoPath="android.resource://"+getPackageName()+"/"+R.raw.magurl;
        Uri uri=Uri.parse(videoPath);
        videoview1.setVideoURI(uri);
        MediaController mediacontroller=new MediaController(this);
        videoview1.setMediaController(mediacontroller);
        mediacontroller.setAnchorView(videoview1);

        //CONFIG VIDEO 1 MY GIRL
        Button btresposta = (Button)findViewById(R.id.btterminar1);
        final TextView txtresposta=(TextView)findViewById(R.id.txresposta1);
        btresposta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtresposta.setVisibility(View.VISIBLE);
            }
        });

        Button btnovovid=(Button)findViewById(R.id.btnovovideo);
        btnovovid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(act_videos.this,act_videos2.class));
            }
        });
    }
}