package com.jamile.easyspeak_v21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class carregatela extends AppCompatActivity {

    ProgressBar progressbar;
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carregatela);

        //PROGRESSBAR--------------------------------------

        progressbar=findViewById(R.id.progressBar);
        textview=findViewById(R.id.text_view);
        progressbar.setMax(100);
        progressbar.setScaleY(3f);
        progressAnimation();

    }
    public void progressAnimation(){

        ProgressBarAnimation anim = new ProgressBarAnimation(this, progressbar, textview, 0f, 100f);
        anim.setDuration(7000);
        progressbar.setAnimation(anim);


    }
}