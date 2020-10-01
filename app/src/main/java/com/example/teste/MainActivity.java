package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void aleatorio(View v){
        TextView tvtela = findViewById(R.id.tvResultado);
        int sorte = new Random().nextInt(11); // Tem que ser 11 no netInt porque ele começa a contar do 0
        tvtela.setText("Randomico "+sorte);
    }
}