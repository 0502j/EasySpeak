package com.jamile.easyspeak_v21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class act_aula2_exercicios extends AppCompatActivity {

    boolean a2r1click;
    boolean a2r2click;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_aula2_exercicios);
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);

        final TextView a2p1 = (TextView)findViewById(R.id.a2p1);
        final Button a2r1 = (Button) findViewById(R.id.a2r1);
        final Button a2r2 = (Button) findViewById(R.id.a2r2);
        final Button a2r3 = (Button) findViewById(R.id.a2r3);
        final Button prox = (Button)findViewById(R.id.btprox);
        final Button prox2 = (Button)findViewById(R.id.btprox2);
        final TextView txtermino2 = (TextView) findViewById(R.id.txtermino2);
        prox2.setVisibility(View.INVISIBLE);
        Context contexto = getApplicationContext();
        String toastcorreto="Você acertou!";
        String toastincorreto="Você errou...";
        int duracao = Toast.LENGTH_SHORT;
        final Toast toastcerto = Toast.makeText(contexto, toastcorreto,duracao);
        final Toast toasterrado = Toast.makeText(contexto, toastincorreto,duracao);


        a2r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a2r1.setBackgroundColor(Color.RED);
                toasterrado.show();
            }
        });

        a2r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a2r2.setBackgroundColor(Color.GREEN);
                toastcerto.show();
            }
        });

        a2r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a2r3.setBackgroundColor(Color.RED);
                toasterrado.show();
            }
        });

        prox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                a2p1.setText("2) Como se diz ''Eu gostaria de um suco de laranja'' em inglês?");
                a2r1.setText("I'd like a red juice");
                a2r2.setText("I'd like an orange juice.");
                a2r3.setText("I want pasta.");

                a2r1.setBackgroundColor(Color.GRAY);
                a2r2.setBackgroundColor(Color.GRAY);
                a2r3.setBackgroundColor(Color.GRAY);
                prox.setVisibility(View.INVISIBLE);
                prox2.setVisibility(View.VISIBLE);

            }
        });

        prox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a2p1.setText("3) Como se diz água em inglês?");
                a2r1.setText("Walter");
                a2r2.setText("Water");
                a2r3.setText("Aqua");

                a2r1.setBackgroundColor(Color.GRAY);
                a2r2.setBackgroundColor(Color.GRAY);
                a2r3.setBackgroundColor(Color.GRAY);
                prox.setVisibility(View.INVISIBLE);
                prox2.setVisibility(View.INVISIBLE);
                txtermino2.setVisibility(View.VISIBLE);
            }
        });

    }
}