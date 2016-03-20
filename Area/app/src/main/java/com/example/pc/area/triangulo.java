package com.example.pc.area;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 *O método abaixo representa o o botão 'Exemplo' que está dentro da página triângulo.
 *É um botão com as mesmas funções do botão triângulo, que está na página principal, o que diferencia é apenas o conteúdo.
 */
public class triangulo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);
    }
    public void exemploTriangulo (View view){
        Intent Exemplo = new Intent(this, exemploTriangulo.class);
        startActivity(Exemplo);
    }

}
