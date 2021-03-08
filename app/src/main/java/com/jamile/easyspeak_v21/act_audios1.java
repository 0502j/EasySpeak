package com.jamile.easyspeak_v21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class act_audios1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_audios1);
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);

        //var toast
        Context contexto = getApplicationContext();
        String toastcorreto="Parabéns! Você acertou!";
        String toastincorreto = "Você errou... tente novamente.";
        int duracao = Toast.LENGTH_LONG;
        final Toast toastcerto=Toast.makeText(contexto, toastcorreto, duracao);
        final Toast toasterrado = Toast.makeText(contexto, toastincorreto, duracao);



        //CONFIG VIDEOVIEW

        VideoView audio1 = findViewById(R.id.audio1);
        String audiopath1 ="android.resource://"+getPackageName()+"/"+R.raw.bnnemojis;
        Uri audiouri1 = Uri.parse(audiopath1);
        audio1.setVideoURI(audiouri1);
        MediaController audiocontroller = new MediaController(this);
        audio1.setMediaController(audiocontroller);
        audiocontroller.setAnchorView(audio1);

        //CONFIG RESPOSTAS

        final Button op1 =(Button)findViewById(R.id.op1);
        final Button op2 =(Button)findViewById(R.id.op2);
        final Button op3 =(Button)findViewById(R.id.op3);

        op1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op1.setBackgroundColor(Color.GREEN);
                toastcerto.show();

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
                op3.setBackgroundColor(Color.RED);
                toasterrado.show();
            }
        });


        //PROX EX

        final Button btproximo = (Button)findViewById(R.id.audiprox);
        btproximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            startActivity(new Intent(act_audios1.this, act_audios2.class));
            }
        });



    }
}