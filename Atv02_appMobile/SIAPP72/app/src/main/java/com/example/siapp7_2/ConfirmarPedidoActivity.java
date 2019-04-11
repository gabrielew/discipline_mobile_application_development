package com.example.siapp7_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class ConfirmarPedidoActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemClickListener {

    TextView confComida, confMetPagagamento, txtSpnSobremesa;
    Spinner spnArea;
    ArrayAdapter<String> adapterArea;
    ArrayAdapter<String> adapterSobremesa;
    ArrayList<String> arraySobremesa;
    Button confSobremesa, confComentarios;
    ListView lstComentarios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_pedido);

        Bundle bundle = getIntent().getExtras();

        confComida = (TextView) findViewById(R.id.txtConfComida);
        confMetPagagamento = (TextView) findViewById(R.id.txtConfMetPagamento);
        confSobremesa = (Button) findViewById(R.id.btnConfSobremesa);
        confComentarios = (Button) findViewById(R.id.btnConfComentarios);
        confSobremesa.setOnClickListener(this);
        confComentarios.setOnClickListener(this);

        confComida.setText(bundle.getString("extraCardapio"));
        confMetPagagamento.setText(bundle.getString("extraMetPagamento"));

        String[] sobremesas = {"Sorvete", "Pudim", "Brigadeiro", "Torta"};
        adapterArea = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, sobremesas);
        spnArea = (Spinner) findViewById(R.id.spnArea);
        spnArea.setAdapter(adapterArea);

        arraySobremesa = new ArrayList<String>();
        adapterSobremesa = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, arraySobremesa);
        lstComentarios = (ListView) findViewById(R.id.lstConfComentarios);
        lstComentarios.setAdapter(adapterSobremesa);
        lstComentarios.setOnItemClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnConfSobremesa:
                txtSpnSobremesa = (TextView) findViewById(R.id.txtSpnSobremesa);
                txtSpnSobremesa.setText("Sobremesa: " + spnArea.getSelectedItem().toString());
                break;

            case R.id.btnConfComentarios:
                EditText edtConfComentarios = (EditText) findViewById(R.id.edtConfComentarios);
                String txtComentarios = edtConfComentarios.getText().toString();
                if(!txtComentarios.isEmpty()){
                    arraySobremesa.add(txtComentarios);
                    adapterSobremesa.notifyDataSetChanged();
                }
                edtConfComentarios.setText("");
                break;
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        arraySobremesa.remove(position);
        adapterSobremesa.notifyDataSetChanged();
    }
}
