package com.jamile.easyspeak_v21;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Locale;

public class act_pronuncia extends AppCompatActivity {

    private static final int REQUEST_CODE_SPEECH_INPUT = 1000;
    //views from activity
    TextView mtexttv;
    ImageButton mvoicebbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_pronuncia);

        final Button btproximo = (Button)findViewById(R.id.proxpron);
        final Button btproximo2=(Button)findViewById(R.id.proxpron2);
        btproximo2.setVisibility(View.INVISIBLE);
        final TextView txfrase = (TextView)findViewById(R.id.pron1);
        btproximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                txfrase.setText("2) Clique no microfone abaixo e diga: ''My dog is white''.");
                btproximo.setVisibility(View.INVISIBLE);

            }
        });

        btproximo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txfrase.setText("3) Clique no microfone abaixo e diga:''I am sad today.''");
                btproximo2.setVisibility(View.INVISIBLE);
            }
        });


        mtexttv = findViewById(R.id.pron);
        mvoicebbtn = findViewById(R.id.btpron);

        //button click to show speech to text
        mvoicebbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                speak();
            }
        });


        //botão prox



    }

    private void speak(){
        //intent to show speech o txt dialog
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT, "Clique e diga algo");

        //start intent
        try {
            //show dialog
            startActivityForResult(intent, REQUEST_CODE_SPEECH_INPUT);
        }catch (Exception ex){
            //error
            Toast.makeText(this, ""+ex.getMessage(), Toast.LENGTH_SHORT).show();
        }


    }

    @Override
    protected void onActivityResult (int requestCode, int resultCode, @Nullable Intent data){

        super.onActivityResult(requestCode, resultCode, data);

        switch(requestCode){
            case REQUEST_CODE_SPEECH_INPUT:{
                    if(resultCode == RESULT_OK && null!=data){
                        ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                        mtexttv.setText("Você disse..."+result.get(0)+". Tente novamente ou clique em próximo.");
                    }
                break;
            }


        }

    }
}