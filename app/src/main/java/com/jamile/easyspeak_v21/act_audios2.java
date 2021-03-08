package com.jamile.easyspeak_v21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class act_audios2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_audios2);
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);


        //var toast
        Context context = getApplicationContext();
        String toastcorreto = "Parabéns! Você acertou!";
        String toastincorreto = "Você errou... tente novamente.";
        int duracao = Toast.LENGTH_LONG;
        final Toast toastcerto = Toast.makeText(context, toastcorreto, duracao);
        final Toast toasterrado = Toast.makeText(context, toastincorreto, duracao);
        final Button btprox2 = (Button)findViewById(R.id.audiprox);
        btprox2.setVisibility(View.INVISIBLE);

        //CONFIG VIDEOVIEW
        VideoView audio2=findViewById(R.id.audio2);
        String audiopath2="android.resource://"+getPackageName()+"/"+R.raw.bnnerased;
        Uri audiouri2=Uri.parse(audiopath2);
        audio2.setVideoURI(audiouri2);
        MediaController audiocontroller2 = new MediaController(this);
        audio2.setMediaController(audiocontroller2);
        audiocontroller2.setAnchorView(audio2);

        //config respostas

        final Button op1=(Button)findViewById(R.id.op1);
        final Button op2=(Button)findViewById(R.id.op2);
        final Button op3=(Button)findViewById(R.id.op3);

        op1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op1.setBackgroundColor(Color.RED);
                toasterrado.show();
            }
        });

        op2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op2.setBackgroundColor(Color.RED);
                toasterrado.show();
            }
        });

        op3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op3.setBackgroundColor(Color.GREEN);
                toastcerto.show();
            }
        });




    }
}