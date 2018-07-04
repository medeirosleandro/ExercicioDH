package com.e.leandro.exercicio1intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Receptor extends AppCompatActivity {


    TextView infoNome, infoApelido, infoIdade;
    String valorUM, valorDOIS, valorTRES;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receptor);

        infoNome = (TextView) findViewById(R.id.receptorNome);
        infoApelido = (TextView) findViewById(R.id.receptorApelido);
        infoIdade = (TextView) findViewById(R.id.receptorIdade);

        Intent outroIntent = getIntent();
        Bundle outroBundle = outroIntent.getExtras();
        valorUM = outroBundle.getString("1");
        valorDOIS = outroBundle.getString("2");
        valorTRES = outroBundle.getString("3");

        infoNome.setText(valorUM);
        infoApelido.setText(valorDOIS);
        infoIdade.setText(valorTRES);


    }
}
