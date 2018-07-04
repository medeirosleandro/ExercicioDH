package com.e.leandro.exercicio1intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Sender extends AppCompatActivity {

    EditText nome, apelido, idade;
    Button botaoEnviar;
    String valorCampoNome, valorCampoApelido, valorcampoIdade;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sender);

        //Identificando os elementos

        nome = (EditText) findViewById(R.id.campoNome);
        apelido = (EditText) findViewById(R.id.campoApelido);
        idade = (EditText) findViewById(R.id.campoIdade);
        botaoEnviar = (Button) findViewById(R.id.buttonEnviar);


    }

    public void apertandoBotao (View v){

        Toast.makeText(this,"Conteudo da minha mensagem",Toast.LENGTH_SHORT).show();
        Intent meuIntent = new Intent(this,Receptor.class);

        valorCampoNome = nome.getText().toString();
        valorCampoApelido = apelido.getText().toString();
        valorcampoIdade = idade.getText().toString();

       //Empacotadando o Bundle com as informaçoes

        Bundle meuBundle = new Bundle();
        meuBundle.putString("1",valorCampoNome);
        meuBundle.putString("2",valorCampoApelido);
        meuBundle.putString("3",valorcampoIdade);

        meuIntent.putExtras(meuBundle);
        startActivity(meuIntent);


    }

}
