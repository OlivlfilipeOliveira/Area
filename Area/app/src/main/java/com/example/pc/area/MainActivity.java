package com.example.pc.area;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 *Os métodos representados abaixo referenciam os botões que contém a página principal do aplicativo.
 * Os nomes dos métodos são definidos no código xml de de cada botão.
 * A função definida no código xml pelo comando onClicktem o mesmo nome do método que o faz referencia no código java.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void quadrado (View view){
        Intent Quadrado = new Intent(this, quadrado.class);
        startActivity(Quadrado);
    }
    public void retangulo (View view){
        Intent Retângulo = new Intent(this, retangulo.class);
        startActivity(Retângulo);
    }
    public void triangulo (View view){
        Intent Triângulo = new Intent(this, triangulo.class);
        startActivity(Triângulo);
    }
    public void circulo (View view){
        Intent Círculo = new Intent(this, circulo.class);
        startActivity(Círculo);
    }
    public void trapezi (View view){
        Intent Trapézio = new Intent(this, trapezi.class);
        startActivity(Trapézio);
    }
    public void losango (View view){
        Intent Losango = new Intent(this, losango.class);
        startActivity(Losango);
    }
}

