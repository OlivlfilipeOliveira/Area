package com.example.pc.area;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 *O método abaixo representa o o botão 'Exemplo' que está dentro da página retângulo.
 *É um botão com as mesmas funções do botão retângulo, que está na página principal. O que diferencia é apenas o conteúdo.
 */
public class retangulo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retangulo);
    }
    public void exemploRetangulo (View view){
        Intent Exemplo = new Intent(this, exemploRetangulo.class);
        startActivity(Exemplo);
    }
}
