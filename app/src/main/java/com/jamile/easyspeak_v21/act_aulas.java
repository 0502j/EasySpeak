package com.jamile.easyspeak_v21;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ProgressBar;

public class act_aulas extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_aulas);
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN);

        //SALVAR CHECKBOXES -----------------------------------------------------------------------------------------------

        final CheckBox ch1 = (CheckBox)findViewById(R.id.chaula1);
        final CheckBox ch2= (CheckBox)findViewById(R.id.chaula2);
        final CheckBox ch3= (CheckBox)findViewById(R.id.chaula3);
        final CheckBox ch4= (CheckBox)findViewById(R.id.chaula4);

        SharedPreferences preferences=PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor=preferences.edit();
        if(preferences.getBoolean("ch1", false)==true){
            ch1.setChecked(true);
        }else{
            ch1.setChecked(false);
        }
        ch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(ch1.isChecked()){
                    editor.putBoolean("ch1",true);
                    editor.apply();
                }else{
                    editor.putBoolean("ch1",false);
                    editor.apply();
                }
            }
        });

        //CH2-------------------------------------------------------------------------

        if(preferences.getBoolean("ch2", false)==true){
            ch2.setChecked(true);
        }else{
            ch2.setChecked(false);
        }
        ch2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(ch2.isChecked()){
                    editor.putBoolean("ch2",true);
                    editor.apply();
                }else{
                    editor.putBoolean("ch2",false);
                    editor.apply();
                }
            }
        });

        //CH3-----------------------------------------------

        if(preferences.getBoolean("ch3", false)==true){
            ch3.setChecked(true);
        }else{
            ch3.setChecked(false);
        }
        ch3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(ch3.isChecked()){
                    editor.putBoolean("ch3",true);
                    editor.apply();
                }else{
                    editor.putBoolean("ch3",false);
                    editor.apply();
                }
            }
        });

//CH4----------------------------------------------
        if(preferences.getBoolean("ch4", false)==true){
            ch4.setChecked(true);
        }else{
            ch4.setChecked(false);
        }
        ch4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(ch4.isChecked()){
                    editor.putBoolean("ch4",true);
                    editor.apply();
                }else{
                    editor.putBoolean("ch4",false);
                    editor.apply();
                }
            }
        });

        Intent intent = new Intent(act_aulas.this, act_progresso.class);
                intent.putExtra("ch1", ch1.isChecked());
                intent.putExtra("ch2", ch2.isChecked());
                intent.putExtra("ch3", ch3.isChecked());
                intent.putExtra("ch4", ch4.isChecked());

        Intent intent2 = new Intent(act_aulas.this, act_premios.class);
        intent2.putExtra("ch1", ch1.isChecked());
        intent2.putExtra("ch2", ch2.isChecked());
        intent2.putExtra("ch3", ch3.isChecked());
        intent2.putExtra("ch4", ch4.isChecked());

        //CONFIG AULA1
        Button saudacao=(Button)findViewById(R.id.btaula1);
        saudacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(act_aulas.this, act_cont_aula1.class));
            }
        });

        //CONFIG AULA 2
        Button tobe=(Button)findViewById(R.id.btaula2);
        tobe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(act_aulas.this, act_cont_aula2.class));
            }
        });

        //CONFIG AULA 3
        Button animais=(Button)findViewById(R.id.btaula3);
        animais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(act_aulas.this, act_cont_aula3.class));
            }
        });

        //CONFIG AULA 4
        Button emocoes=(Button)findViewById(R.id.btaula4);
        emocoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(act_aulas.this, act_cont_aula4.class));
            }
        });

    //CONFIG NOVO BLOCO DE AULAS

        Button novasaulas = (Button)findViewById(R.id.novasaulas);
        novasaulas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(act_aulas.this, act_aulas2.class));
            }
        });




    }


 }