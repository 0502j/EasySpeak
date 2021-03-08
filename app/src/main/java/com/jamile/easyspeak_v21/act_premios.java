package com.jamile.easyspeak_v21;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;



public class act_premios extends AppCompatActivity {


    int moedas = 0;

Intent intent = new Intent();

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_premios);

        final TextView txmoedas = (TextView)findViewById(R.id.txmoedas);
        final Button btskin1 = (Button)findViewById(R.id.btskin);
        final Button btskin2 = (Button)findViewById(R.id.btskin2);
        final Button btskin3 = (Button)findViewById(R.id.btskin3);
        final Button btskin4 = (Button)findViewById(R.id.btskin4);
        final TextView sempremios = (TextView)findViewById(R.id.tx_sempremios);
        final TextView txroupa1= (TextView)findViewById(R.id.txroupas1);
        final TextView txroupa2= (TextView)findViewById(R.id.txroupas2);
        final TextView txlivros= (TextView)findViewById(R.id.txlivros);
        final TextView txmusicas= (TextView)findViewById(R.id.txmusicas);
        final ImageView personamain  = findViewById(R.id.personamain);
        final ImageView personamain2 = findViewById(R.id.personamain2);
        btskin1.setVisibility(View.INVISIBLE);
        btskin2.setVisibility(View.INVISIBLE);
        sempremios.setVisibility(View.VISIBLE);


        //ABRIR TELA PERGUNTANDO SE QUER COMPRAR O ITEM
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("Comprar");
        builder.setMessage("Quer comprar esse item?");

        builder.setPositiveButton("SIM", new DialogInterface.OnClickListener() {    // CRIA BOTÃO SIM

            public void onClick(DialogInterface dialog, int which) {    //AO CLICAR NO BOTÃO SIM FAZ O CÓDIGO
                moedas=moedas-100;  //TIRA 100 MOEDAS DO VALOR
                txmoedas.setText(String.valueOf(moedas));   //DEIXA O TEXTO COM O VALOR DE MOEDAS

                intent.setClass(act_premios.this, MainActivity.class);
                intent.putExtra("Uniqid","From_Activity_A");
                act_premios.this.startActivity(intent);

                dialog.dismiss();


            }
            

        });

        builder.setNegativeButton("NÃO", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.dismiss();
            }
        });





        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        boolean ch1 = preferences.getBoolean("ch1", true);
        boolean ch2= preferences.getBoolean("ch2", true);
        boolean ch3 = preferences.getBoolean("ch3", true);
        boolean ch4 = preferences.getBoolean("ch4", true);

        if(preferences.getBoolean("ch1", false) == true){

            sempremios.setVisibility(View.INVISIBLE);
            btskin1.setVisibility(View.VISIBLE);
            moedas=moedas+100;
            txmoedas.setText(String.valueOf(moedas));
            txroupa1.setVisibility(View.VISIBLE);


        }

        if(preferences.getBoolean("ch2", false)==true){

            sempremios.setVisibility(View.INVISIBLE);
            btskin2.setVisibility(View.VISIBLE);
            txroupa2.setVisibility(View.VISIBLE);
            moedas=moedas+100;
            txmoedas.setText(String.valueOf(moedas));

        }

        if(preferences.getBoolean("ch3", false)==true){
            sempremios.setVisibility(View.INVISIBLE);
            moedas=moedas+100;
            txmoedas.setText(String.valueOf(moedas));
            txmusicas.setVisibility(View.VISIBLE);
            btskin3.setVisibility(View.VISIBLE);
        }

        if(preferences.getBoolean("ch4", false)==true){
            sempremios.setVisibility(View.INVISIBLE);
            moedas = moedas+100;
            txmoedas.setText(String.valueOf(moedas));
            txlivros.setVisibility(View.VISIBLE);
            btskin4.setVisibility(View.VISIBLE);
        }

        btskin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog alert = builder.create();
                alert.show();

            }


        });

        btskin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog alert = builder.create();
                alert.show();

            }


        });








    }
}