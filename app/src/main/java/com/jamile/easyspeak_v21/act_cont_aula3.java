package com.jamile.easyspeak_v21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class act_cont_aula3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_cont_aula3);
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);



        //CONFIG INICIO DA AULA

        final TextView txaula3p1=(TextView)findViewById(R.id.txaula3parte1);
        txaula3p1.setText("Aula 3 – Animais\n" +
                "Olá! Nessa página, vamos aprender sobre alguns animais." +
                "Observe a tabela abaixo.\n" +
                "Nessa tabela, podemos ver os animais mais comuns e que fazem mais parte do nosso vocabulário. \n");

        final TextView txaula3p2=(TextView)findViewById(R.id.txaula3parte2);
        txaula3p2.setText("EXEMPLOS DE USO \n"+
                "a) Look, a lion! - Olhe, um leão! \n"+
                "b) I have a white cat. - Eu tenho um gato branco. \n"+
                "c) The tiger is wild - O tigre é selvagem. \n"+
                "d) This dog is black. - Esse cachorro é preto. \n");

        //BUTTON
        Button ex3=(Button)findViewById(R.id.btex3);
        ex3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(act_cont_aula3.this, act_aula3_exercicios.class));
            }
        });







    }
}