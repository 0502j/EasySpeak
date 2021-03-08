package com.jamile.easyspeak_v21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class act_cont_aula1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_cont_aula1);
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);



        //CONFIG TEXTVIEW INTRODUÇÃO DA AULA
        final TextView txaula1p1=(TextView)findViewById(R.id.txaula1parte1);
        txaula1p1.setText("Aula 1 – Saudações\n" +
                "Olá, tudo bem? Nessa página, vamos aprender sobre as saudações." +
                "Saudar significa “gesto ou palavra de cumprimento”. Vamos começar?\n" +
                "Imagine que você vai viajar, mas não consegue cumprimentar as pessoas de maneira correta, muito menos em todos os períodos do dia. Para cada situação, você deve usar um tipo de saudação. Observe:\n");

        //CONFIG TEXTVIEW FINAL DA AULA


        final TextView txaula1p2=(TextView)findViewById(R.id.txaula1parte2);
        txaula1p2.setText(" EXEMPLOS DE USO DE SAUDAÇÕES \n"+
                "a) Good morning, how are you? - Olá, como você está?\n"+
                "b) Hello, I am from Brazil. - Olá, eu sou do Brasil.\n"+
                "c) I'm fine, thank you. - Estou bem, obrigado(a).\n"+
                "d) I have to go, see you tomorrow. - Eu tenho que ir, te vejo amanhã.\n");

        //CONFIG BOTAO EXERCICIOS
        Button ex1=(Button)findViewById(R.id.btex1);
        ex1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(act_cont_aula1.this, act_aula1_exercicios.class));
            }
        });




    }
}