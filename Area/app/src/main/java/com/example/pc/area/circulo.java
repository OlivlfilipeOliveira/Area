package com.example.pc.area;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
/**
 * O método abaixo referencia o botão 'exempo' que está dentro do página 'Círculo'.
 * O que vai mudar de um botão para o outro é somente o conteúdo que tem em cada um deles.
 */
public class circulo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo);
    }
    public void exemploCirculo (View view){
        Intent Exemplo = new Intent(this, exemploCirculo.class);
        startActivity(Exemplo);
    }
}
