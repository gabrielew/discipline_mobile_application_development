package br.edu.unis.si7app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ConfirmationScreenActivity extends AppCompatActivity {

    TextView nome;
    TextView email;
    TextView telefone;
    TextView cpf;
    TextView address;
    Button voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation_screen);

        Bundle bundle = getIntent().getExtras();

        nome = (TextView) findViewById(R.id.txtConfNome);
        email = (TextView) findViewById(R.id.txtConfEmail);
        telefone = (TextView) findViewById(R.id.txtConfTelefone);
        cpf = (TextView) findViewById(R.id.txtConfCpf);
        address = (TextView) findViewById(R.id.txtConfAddress);

        nome.setText(bundle.getString("extraNome"));
        email.setText(bundle.getString("extraEmail"));
        telefone.setText(bundle.getString("extraTelefone"));
        cpf.setText(bundle.getString("extraCpf"));
        address.setText(bundle.getString("extraAddress"));
        voltar = (Button) findViewById(R.id.btnConfVoltar);
        voltar.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v){
                finish();
            }
        });
    }
}
