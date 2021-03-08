package com.jamile.easyspeak_v21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class act_ajuda extends AppCompatActivity {
    int click=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_ajuda);

        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);

        //Declarações
        final TextView txajuda;
        txajuda=(TextView)findViewById(R.id.txtajuda);
        final Button persona;
        persona=(Button)findViewById(R.id.btpersonagem);
        Context contexto = getApplicationContext();
        String txtoast="Você completou o tutorial!";
        int duracao = Toast.LENGTH_SHORT;
        final Toast toast= Toast.makeText(contexto, txtoast,duracao);

      persona.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {

              click=click+1;
              if(click==1){
                  txajuda.setText("Meu nome é Oliver, e eu vou te auxiliar durante as aulas!");
              }else if(click==2){

                  txajuda.setText("Na tela inicial, clique em ''Aulas''. Uma lista de aulas aparecerá para serem feitas.");
              }else if(click==3){
                  txajuda.setText("Ao terminar uma aula, marque na caixa acima do título da aula, indicando que completou.");
              }else if(click==4){
                  txajuda.setText("O seu progresso ficará salvo na sessão ''Progresso'', disponível na tela inicial.");
              }else if(click==5){
                  txajuda.setText("Os três botões restantes contém conversas e músicas para treinar sua compreensão e audição.");
              }else if(click==6){

                  txajuda.setText("LEMBRE-SE: algumas vezes é preciso clicar 2x nos botões para que funcionem.");

              }else if(click==7){
                 txajuda.setText("Pronto! Agora você já sabe por onde iniciar! Eaí, vamos descobrir a língua mais falada do mundo?");
              }else if(click==8){
                  toast.show();
              }

          }
      });

    }




}