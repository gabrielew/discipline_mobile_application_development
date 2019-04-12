package br.edu.unis.si.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Toolbar.OnMenuItemClickListener{

    TextView txtMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.mipmap.ic_launcher);

        txtMenu = (TextView) findViewById(R.id.txtMenu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarPrincipal);
        toolbar.inflateMenu(R.menu.activity_menu);
        toolbar.setTitle("Atalho");
        toolbar.setNavigationIcon(R.mipmap.ic_launcher);
        toolbar.setOnMenuItemClickListener(this);

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
                break;
            case R.id.menu_editar:
                texto = "EDITAR";
                break;
            case R.id.menu_apagar:
                texto = "APAGAR";
                break;
            case R.id.menu_ajuda:
                texto = "AJUDA";
                break;
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
                break;
            case R.id.menu_editar:
                texto = "EDITAR";
                break;
            case R.id.menu_apagar:
                texto = "APAGAR";
                break;
            case R.id.menu_ajuda:
                texto = "AJUDA";
                break;
            case android.R.id.home:
                texto = "ICONE";
                break;
        }
        txtMenu.setText(texto);
        return false;
    }
}
