package com.example.pc.area;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 *O método abaixo representa o o botão 'Exemplo' que está dentro da trapézio.
 *O que diferencia ele do botão 'trapézio' que está página principal,
 * é o conteúdo de cada um deles.
 */
public class trapezi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapezi);
    }
    public void exemploTrapezio (View view){
        Intent Exemplo = new Intent(this, exemploTrapezio.class);
        startActivity(Exemplo);
    }
}
