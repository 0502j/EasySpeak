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

public class act_aula3_exercicios extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_aula3_exercicios);
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);

        //declaração
        final TextView a3p1 = (TextView)findViewById(R.id.a3p1);
        final Button a3r1=(Button)findViewById(R.id.a3r1);
        final Button a3r2=(Button)findViewById(R.id.a3r2);
        final Button a3r3=(Button)findViewById(R.id.a3r3);
        final Button prox=(Button)findViewById(R.id.btprox);
        final Button prox2=(Button)findViewById(R.id.btprox2);
        final TextView txtermino3=(TextView)findViewById(R.id.txtermino3);
        prox2.setVisibility(View.INVISIBLE);
        Context contexto = getApplicationContext();
        String toastcorreto = "Você acertou!";
        String toastincorreto = "Você errou...";
        int duracao = Toast.LENGTH_SHORT;
        final Toast toastcerto = Toast.makeText(contexto, toastcorreto, duracao);
        final Toast toasterrado = Toast.makeText(contexto, toastincorreto, duracao);

        // config respostas

        a3r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a3r1.setBackgroundColor(Color.RED);
                toasterrado.show();

            }
        });

        a3r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a3r2.setBackgroundColor(Color.RED);
                toasterrado.show();
            }
        });

        a3r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a3r3.setBackgroundColor(Color.GREEN);
                toastcerto.show();
            }
        });

        prox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a3p1.setText("2) Como se diz ''meu cachorro é branco'' em inglês? ");
                a3r1.setText("My cat is black.");
                a3r2.setText("My dog is yellow.");
                a3r3.setText("My dog is white.");

                a3r1.setBackgroundColor(Color.GRAY);
                a3r2.setBackgroundColor(Color.GRAY);
                a3r3.setBackgroundColor(Color.GRAY);

                prox.setVisibility(View.INVISIBLE);
                prox2.setVisibility(View.VISIBLE);

            }
        });

        prox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a3p1.setText("3) Como se diz ''olhe, um gato!'' em inglês? ");
                a3r1.setText("Look, a bat!");
                a3r2.setText("View, a dog!");
                a3r3.setText("Look, a cat!");
                prox.setVisibility(View.INVISIBLE);
                prox2.setVisibility(View.VISIBLE);

                a3r1.setBackgroundColor(Color.GRAY);
                a3r2.setBackgroundColor(Color.GRAY);
                a3r3.setBackgroundColor(Color.GRAY);

                prox.setVisibility(View.INVISIBLE);
                prox2.setVisibility(View.INVISIBLE);
                txtermino3.setVisibility(View.VISIBLE);

            }
        });


    }
}