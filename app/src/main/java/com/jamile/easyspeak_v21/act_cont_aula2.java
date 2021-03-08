package com.jamile.easyspeak_v21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class act_cont_aula2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_cont_aula2);
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);

       //CONFIG TEXTVIEW INICIO DA AULA

        final TextView txaula2p1=(TextView)findViewById(R.id.txaula2parte1);
        txaula2p1.setText("Aula 2 – Alimentos\n" +
                "Olá! Nessa página, vamos aprender sobre alguns alimentos básicos." +
                "Agora que sabemos cumprimentar as pessoas, podemos continuar o conteúdo.\n" +
                "Imagine que você vai para um restaurante, sabe cumprimentar os funcionários, mas não sabe pedir o que quer. Observe a tabela abaixo, ela contém os alimentos mais comuns. \n");



        //CONFIG TEXTVIEW FINAL DA AULA

        final TextView txaula2p2=(TextView)findViewById(R.id.txaula2parte2);
        txaula2p2.setText("EXEMPLOS DE USO DE SAUDAÇÕES \n"+
                "a) I'd like a coffee. - Eu gostaria de um café. \n"+
                "b) Can I have a soda, please? - Um refrigerante, por favor? \n"+
                "c) This rice has no salt! - Esse arroz não tem sal! \n"+
                "d) I am drinking an orange juice. - Eu estou bebendo um suco de laranja.\n");

//CONFIG BOTAO EXERCICIOS
        Button ex2=(Button)findViewById(R.id.btex2);
        ex2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(act_cont_aula2.this, act_aula2_exercicios.class));
            }
        });


    }



}