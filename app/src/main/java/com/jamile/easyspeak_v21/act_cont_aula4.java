package com.jamile.easyspeak_v21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class act_cont_aula4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_cont_aula4);
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);

        //CONFIG INICIO

        final TextView txaula4p1=(TextView)findViewById(R.id.txaula4parte1);
        txaula4p1.setText(" Aula 4- Emoções (Feelings) \n" +
                "Olá! Nessa página, vamos aprender sobre algumas emoções." +
                "Observe a tabela abaixo.\n" +
                "Nessa tabela, podemos ver as emoções mais comuns que sentimos. \n");


        //FINAL

        final TextView txaula4p2 = (TextView)findViewById(R.id.txaula4parte2);
        txaula4p2.setText("EXEMPLOS DE USO \n"+
                "a) I am sad today. - Eu estou triste hoje.\n"+
                "b) She is happy. - Ela é/está feliz. \n"+
                "c) You scared me! - Você me assustou!. \n"+
                "d) This class makes me bored. - Essa aula me deixa entediado. \n");

        //BOTAO EX

        Button ex4=(Button)findViewById(R.id.btex4);
        ex4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(act_cont_aula4.this, act_aula4_exercicios.class));
            }
        });

    }
}