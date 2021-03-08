package com.jamile.easyspeak_v21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class act_sobre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_sobre);
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                |View.SYSTEM_UI_FLAG_FULLSCREEN);

        TextView txsobre=(TextView) findViewById(R.id.txsobre2);
        txsobre.setText("   O EasySpeak, como o nome sugere, está aqui para te ajudar a falar inglês facilmente! É comum pensarmos que temos dificuldade em aprender idiomas, especialmente quando adotamos a experiência autodidata.\n" +
                "   Imagine estar viajando, e não conseguir cumprimentar alguém, ou pedir uma comida no restaurante? É para situações simples como essas que estamos aqui para auxiliar nossos usuários! Oferecemos à você aulas comuns, em texto, podendo acompanhar seu progresso quando quiser, em conjunto a atividades extras como completar conversas fictícias e praticar a audição com clipes de música famosos. Escolha um lugar tranquilo, acomode-se, escolha um tema que julgar interessante e mãos à obra!\n" +
                "\n" +
                "         © Jamile de Sousa – EasySpeak\n");
    }
}