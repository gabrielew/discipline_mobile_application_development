package br.edu.unis.si7app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Date;
import java.util.Random;

public class FormScreenActivity extends AppCompatActivity {

    EditText nome;
    EditText email;
    EditText telefone;
    EditText cpf;
    EditText address;
    Button cadastrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_screen);


        nome = (EditText) findViewById(R.id.edtNome);
        email = (EditText) findViewById(R.id.edtEmail);
        telefone = (EditText) findViewById(R.id.edtTelefone);
        cpf = (EditText) findViewById(R.id.edtCpf);
        address = (EditText) findViewById(R.id.edtAddress);
        cadastrar = (Button) findViewById(R.id.btnCadastrar);
        cadastrar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(FormScreenActivity.this, ConfirmationScreenActivity.class);
                i.putExtra("extraNome", nome.getText().toString());
                i.putExtra("extraEmail", email.getText().toString());
                i.putExtra("extraTelefone", telefone.getText().toString());
                i.putExtra("extraCpf", cpf.getText().toString());
                i.putExtra("extraAddress", address.getText().toString());
                startActivity(i);
            }
        });
    }
}
