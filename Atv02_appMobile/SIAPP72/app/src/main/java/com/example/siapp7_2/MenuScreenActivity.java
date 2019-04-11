package com.example.siapp7_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MenuScreenActivity extends AppCompatActivity implements View.OnClickListener {

    CheckBox arroz, feijao, batataFrita, cocaCola;
    RadioGroup metodoPagamento;
    Button realizarPedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_screen);

         arroz = (CheckBox) findViewById(R.id.chkArroz);
         feijao = (CheckBox) findViewById(R.id.chkFeijao);
         batataFrita = (CheckBox) findViewById(R.id.chkBatataFrita);
         cocaCola = (CheckBox) findViewById(R.id.chkCocaCola);
         metodoPagamento = (RadioGroup) findViewById(R.id.rgMetodoPag);
         realizarPedido = (Button) findViewById(R.id.btnRealizarPedido);
         realizarPedido.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String cardapio = getCardapio();
        String metPagamento = getMetPagamento();

        Intent i = new Intent(MenuScreenActivity.this, ConfirmarPedidoActivity.class);
            i.putExtra("extraCardapio", cardapio);
            i.putExtra("extraMetPagamento", metPagamento);
            startActivity(i);
    }

    private String getCardapio(){

        String cardapio = "Cardapio: ";
        if(arroz.isChecked()) {
            cardapio += arroz.getText().toString() + ", ";
        }
        if(feijao.isChecked()) {
            cardapio += feijao.getText().toString() + ", ";
        }
        if(batataFrita.isChecked()) {
            cardapio += batataFrita.getText().toString() + ", ";
        }
        if(cocaCola.isChecked()) {
            cardapio += cocaCola.getText().toString() + ", ";
        }
        return cardapio;
    }

    private String getMetPagamento(){
        String metPagamento = "Metodo de Pagamento: ";
        if(metodoPagamento.getCheckedRadioButtonId() != -1){
            RadioButton metPag = (RadioButton) findViewById(metodoPagamento.getCheckedRadioButtonId());
            metPagamento += metPag.getText().toString();
        }
        return metPagamento;
    }
}
