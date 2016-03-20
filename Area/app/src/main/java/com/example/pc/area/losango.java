package com.example.pc.area;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
/**
 * O método abaixo referencia o botão 'Exemplo' que está dentro da página 'Losando'.
 * O que mostrar exemplo mostrar exemplos de questões com a figura geométrica losango..
 */
public class losango extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_losango2);
    }
    public void exemploLosango (View view){
        Intent Exemplo = new Intent(this, exemploLosango.class);
        startActivity(Exemplo);
    }
}
