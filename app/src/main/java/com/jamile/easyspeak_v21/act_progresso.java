package com.jamile.easyspeak_v21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class act_progresso extends MainActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_progresso);
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);

       final TextView txprogresso1 = (TextView)findViewById(R.id.txprogress);
        final TextView txprogresso2 = (TextView)findViewById(R.id.txprogress2);
        final TextView txprogresso3 = (TextView)findViewById(R.id.txprogress3);
        final TextView txprogresso4 = (TextView)findViewById(R.id.txprogress4);

      SharedPreferences preferences =  PreferenceManager.getDefaultSharedPreferences(this);
        boolean ch1 = preferences.getBoolean("ch1", true);
        boolean ch2 = preferences.getBoolean("ch2", true);
        boolean ch3 = preferences.getBoolean("ch3", true);
        boolean ch4 = preferences.getBoolean("ch4", true);

        if(preferences.getBoolean("ch1", false)==true){
            txprogresso1.setText("Aula 1 ✔✔");
        }else{
            txprogresso1.setText("Aula 1 ✘");
        }

        if(preferences.getBoolean("ch2", false)==true){
            txprogresso2.setText("Aula 2 ✔✔");
        }else{
            txprogresso2.setText("Aula 2 ✘");
        }

        if(preferences.getBoolean("ch3", false)==true){
            txprogresso3.setText("Aula 3 ✔✔");
        }else{
            txprogresso3.setText("Aula 3 ✘");
        }

        if(preferences.getBoolean("ch4", false)==true){
            txprogresso4.setText("Aula 4 ✔✔");
        }else{
            txprogresso4.setText("Aula 4 ✘");
        }

    }}