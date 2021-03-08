package com.jamile.easyspeak_v21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class act_aula1_exercicios extends AppCompatActivity {

    boolean a1r1click;
    boolean a1r2click;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_aula1_exercicios);
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);


        final TextView a1p1 = (TextView)findViewById(R.id.a1p1);
        final Button a1r1 = (Button) findViewById(R.id.a1r1);
        final Button a1r2 = (Button) findViewById(R.id.a1r2);
        final Button a1r3 = (Button) findViewById(R.id.a1r3);
        final Button prox = (Button)findViewById(R.id.btprox);
        final Button prox2 = (Button)findViewById(R.id.btprox2);
        final TextView txtermino = (TextView)findViewById(R.id.txtermino);
        prox2.setVisibility(View.INVISIBLE);
        Context contexto = getApplicationContext();
        String toastcorreto="Você acertou!";
        String toastincorreto="Você errou...";
        int duracao = Toast.LENGTH_SHORT;
        final Toast toastcerto = Toast.makeText(contexto, toastcorreto,duracao);
        final Toast toasterrado = Toast.makeText(contexto, toastincorreto,duracao);

        a1r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a1r1.setBackgroundColor(Color.GREEN);
                toastcerto.show();
            }
        });

        a1r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a1r2.setBackgroundColor(Color.RED);
                toasterrado.show();
            }
        });

        a1r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a1r3.setBackgroundColor(Color.RED);
                toasterrado.show();
            }
        });

        prox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                a1p1.setText("2) Como se diz ''Bom dia, como você está?'' em inglês?");
                a1r1.setText("Good morning, how are you?");
                a1r2.setText("Good night, how old are you?");
                a1r3.setText("Hello, where are you from?");

                a1r1.setBackgroundColor(Color.GRAY);
                a1r2.setBackgroundColor(Color.GRAY);
                a1r3.setBackgroundColor(Color.GRAY);
                prox.setVisibility(View.INVISIBLE);
                prox2.setVisibility(View.VISIBLE);

            }
        });

        prox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a1p1.setText("3) Como se diz ''Eu tenho 18 anos'' em inglês?");
                a1r1.setText("I am 18 years old.");
                a1r2.setText("I age 18 years old.");
                a1r3.setText("I am old of 18 years");

                a1r1.setBackgroundColor(Color.GRAY);
                a1r2.setBackgroundColor(Color.GRAY);
                a1r3.setBackgroundColor(Color.GRAY);
                prox.setVisibility(View.INVISIBLE);
                prox2.setVisibility(View.INVISIBLE);
                txtermino.setVisibility(View.VISIBLE);

            }
        });


    }
}