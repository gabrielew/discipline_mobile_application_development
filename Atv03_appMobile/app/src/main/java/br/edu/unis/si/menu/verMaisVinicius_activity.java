package br.edu.unis.si.menu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class verMaisVinicius_activity extends AppCompatActivity implements Toolbar.OnMenuItemClickListener {

    TextView txtMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_mais_vinicius_activity);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.mipmap.ic_launcher);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        String texto = "";
        switch (item.getItemId()) {
            case R.id.menu_adicionar:
                texto = "ADICIONAR";
                Intent add = new Intent(this, add_activity.class);
                startActivity(add);
                return false;
            case R.id.menu_listar:
                texto = "LISTAR";
                Intent li = new Intent(this, MainActivity.class);
                startActivity(li);
                return false;
            case R.id.menu_apagar:
                texto = "APAGAR";
                Intent ap = new Intent(this, add_activity.class);
                startActivity(ap);
                return false;
            case R.id.menu_ajuda:
                texto = "AJUDA";
                Intent aj = new Intent(this, verMaisGabriel_activity.class);
                startActivity(aj);
                return false;
            case android.R.id.home:
                texto = "Você clicou no ICONE";
                break;
        }
        txtMenu.setText(texto);

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        String texto = "";
        switch (menuItem.getItemId()) {
            case R.id.menu_adicionar:
                texto = "ADICIONAR";
                Intent add = new Intent(this, add_activity.class);
                startActivity(add);
                return false;
            case R.id.menu_listar:
                texto = "LISTAR";
                Intent li = new Intent(this, MainActivity.class);
                startActivity(li);
                return false;
            case R.id.menu_apagar:
                texto = "APAGAR";
                Intent ap = new Intent(this, add_activity.class);
                startActivity(ap);
                return false;
            case R.id.menu_ajuda:
                texto = "AJUDA";
                Intent aj = new Intent(this, verMaisGabriel_activity.class);
                startActivity(aj);
                return false;
            case android.R.id.home:
                texto = "ICONE";
                break;
        }
        txtMenu.setText(texto);
        return false;
    }
}
