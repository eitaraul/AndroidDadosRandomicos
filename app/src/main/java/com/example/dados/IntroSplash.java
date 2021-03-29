package com.example.dados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import com.airbnb.lottie.LottieAnimationView;

public class IntroSplash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_splash);

        //Pegando a animação Lottie e setando velocidade pra 5.0 Float
        //LottieAnimationView animacao = findViewById(R.id.dadosSplash);
        //animacao.setSpeed(2.5F);
        //animacao.playAnimation();

        //Sumindo com a action bar para dar uma aparencia de APP
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);



        //Criando o splash screen
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getBaseContext(),MainActivity.class));
                finish();
            }
        },5000);
    }
}