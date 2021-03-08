package com.jamile.easyspeak_v21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.net.Uri;
import android.nfc.Tag;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

      //  requestWindowFeature(Window.FEATURE_NO_TITLE);
      //  this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

            View decorView = getWindow().getDecorView();
            decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);

        ImageView personamain=(ImageView)findViewById(R.id.personamain);
        ImageView personamain2 = (ImageView) findViewById(R.id.personamain2);

        //BT PROGRESSO------------------------------------
        Button btprogresso = (Button)findViewById(R.id.btprogresso);
        btprogresso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, act_progresso.class));
            }
        });

        //BT AULAS----------------------------------------
        Button btaulas = (Button)findViewById(R.id.btaulas);
        btaulas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, act_aulas.class));
            }
        });

        //BT AJUDA--------------------------------
        Button btajuda = (Button)findViewById(R.id.btajuda);
        btajuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, act_ajuda.class));
            }
        });

            //BT VIDEOS-----------------------------------
            Button btvid=(Button)findViewById(R.id.btvideo);
            btvid.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    startActivity(new Intent(MainActivity.this, act_videos.class));
                }
                    });

            //BT CHAT-------

       /** Button btpronuncia=(Button)findViewById(R.id.btpronuncia);
        btpronuncia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,act_conv_um.class));
            }
        });
        */

       // BT AUDIOS---------
         Button btaudio=(Button)findViewById(R.id.btaudio);
         btaudio.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        startActivity(new Intent(MainActivity.this,act_audios1.class));
        }
        });


        //BOTÃO SOBRE NÓS

        Button btsobre=(Button)findViewById(R.id.btsobre);
        btsobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, act_sobre.class));

            }
        });

        //BOTÃO PRONÚNCIA

        Button btpron = (Button)findViewById(R.id.btpronun);
        btpron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, act_pronuncia.class));
            }
        });

        //BOTAO LIVROS

        Button btlivros = (Button)findViewById(R.id.btlivro);
        btlivros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, act_livros.class));
            }
        });








//BOTAO PREMIOS

        Button btpremio = (Button)findViewById(R.id.btpremio);
        btpremio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, act_premios.class));
            }
        });

        //PASSAR IMAGEM












    }








//----------------------------ANIMATE BUTTONS
  //  public void tapToAnimate(View view) {
     //   Button btaulas=(Button)findViewById(R.id.btaulas);
      //  final Animation animation= AnimationUtils.loadAnimation(this,R.anim.bounce);
      //  MyBounceInterpolator interpolator=new MyBounceInterpolator(0.2,20);
       // animation.setInterpolator(interpolator);
       // btaulas.startAnimation(animation);


     //   Button btvideos=(Button)findViewById(R.id.btvideo);
      //  btvideos.startAnimation(animation);

       // Button btchat=(Button)findViewById(R.id.btpronun);
       // btchat.startAnimation(animation);




}