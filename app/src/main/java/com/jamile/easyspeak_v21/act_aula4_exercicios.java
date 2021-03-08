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

public class act_aula4_exercicios extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_act_aula4_exercicios);

        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);

            //declaraçao

            final TextView a4p1 = (TextView)findViewById(R.id.a4p1);
            final Button a4r1 = (Button)findViewById(R.id.a4r1);
            final Button a4r2 = (Button)findViewById(R.id.a4r2);
            final Button a4r3 = (Button)findViewById(R.id.a4r3);
            final Button prox=(Button)findViewById(R.id.btprox);
            final Button prox2=(Button)findViewById(R.id.btprox2);
            final TextView txtermino4 = (TextView)findViewById(R.id.txtermino4);
            Context contexto = getApplicationContext();
            String toastcorreto = "Você acertou!";
            String toastincorreto = "Você errou...";
            int duracao = Toast.LENGTH_SHORT;
            prox2.setVisibility(View.INVISIBLE);
            final Toast toastcerto = Toast.makeText(contexto, toastcorreto, duracao);
            final Toast toasterrado = Toast.makeText(contexto, toastincorreto, duracao);

            //config respostas

            a4r1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    a4r1.setBackgroundColor(Color.RED);
                    toasterrado.show();
                }
            });

            a4r2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    a4r2.setBackgroundColor(Color.GREEN);
                    toastcerto.show();
                }
            });

            a4r3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    a4r3.setBackgroundColor(Color.RED);
                    toasterrado.show();
                }
            });

            prox.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    a4p1.setText("2) Qual a tradução de ''Eu estou feliz hoje!''? ");
                    a4r1.setText("I'm hungry yesterday.");
                    a4r2.setText("I'm happy today!");
                    a4r3.setText("I'm thirsty today.");

                    a4r1.setBackgroundColor(Color.GRAY);
                    a4r2.setBackgroundColor(Color.GRAY);
                    a4r3.setBackgroundColor(Color.GRAY);
                    prox.setVisibility(View.INVISIBLE);
                    prox2.setVisibility(View.VISIBLE);
                }
            });


            prox2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    a4p1.setText("3) O que significa a palavra happiness?? ");
                    a4r1.setText("Tristeza.");
                    a4r2.setText("Felicidade.");
                    a4r3.setText("Angústia.");

                    a4r1.setBackgroundColor(Color.GRAY);
                    a4r2.setBackgroundColor(Color.GRAY);
                    a4r3.setBackgroundColor(Color.GRAY);
                    prox.setVisibility(View.INVISIBLE);
                    prox2.setVisibility(View.INVISIBLE);
                    txtermino4.setVisibility(View.VISIBLE);


                }
            });

    }
}