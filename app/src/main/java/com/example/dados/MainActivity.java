package com.example.dados;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

import static java.lang.Math.random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void rolarDados(View view) {



        LottieAnimationView animacao = findViewById(R.id.dadosRodando);

        if(animacao.isAnimating() == false) {
            animacao.setSpeed(5.0F);
            animacao.playAnimation();
            int random_int = (int)(Math.random() * 6) + 1;
            TextView tv1 = (TextView)findViewById(R.id.numDados);
            tv1.setText(String.valueOf(random_int));
        }


    }
}