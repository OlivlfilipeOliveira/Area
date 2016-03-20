package com.example.pc.area;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
/**
 * O método representado abaixo referencia o botão 'Exemplo' que está dentro da página 'Quadrado'.
 * É um botão com as mesmas funções do botão pai, porém só mudará o conteúdo que contém em cada um deles.
 */
public class quadrado extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quadrado);
    }
    public void exemploQuadrado (View view){
        Intent Exemplo = new Intent(this, exemploQuadrado.class);
        startActivity(Exemplo);
    }
}
