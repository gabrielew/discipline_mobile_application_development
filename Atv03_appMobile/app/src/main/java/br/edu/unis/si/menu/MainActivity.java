package br.edu.unis.si.menu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Toolbar.OnMenuItemClickListener, View.OnClickListener{

    TextView txtMenu;
    Button btnAnderson, btnBreno, btnBruno, btnCamilo, btnGabriel, btnLauro, btnLuis;
    Button btnMarcelo, btnPedro, btnRegis, btnRenan, btnSamuel, btnVinicius;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAnderson =(Button)findViewById(R.id.btnAnderson);
        btnAnderson.setOnClickListener(this);

        btnBreno =(Button)findViewById(R.id.btnBreno);
        btnBreno.setOnClickListener(this);

        btnBruno =(Button)findViewById(R.id.btnBruno);
        btnBruno.setOnClickListener(this);

        btnCamilo =(Button)findViewById(R.id.btnCamilo);
        btnCamilo.setOnClickListener(this);

        btnGabriel =(Button)findViewById(R.id.btnGabriel);
        btnGabriel.setOnClickListener(this);

        btnLauro =(Button)findViewById(R.id.btnLauro);
        btnLauro.setOnClickListener(this);

        btnLuis =(Button)findViewById(R.id.btnLuis);
        btnLuis.setOnClickListener(this);

        btnMarcelo =(Button)findViewById(R.id.btnMarcelo);
        btnMarcelo.setOnClickListener(this);

        btnPedro =(Button)findViewById(R.id.btnPedro);
        btnPedro.setOnClickListener(this);

        btnRegis =(Button)findViewById(R.id.btnRegis);
        btnRegis.setOnClickListener(this);

        btnRenan =(Button)findViewById(R.id.btnRenan);
        btnRenan.setOnClickListener(this);

        btnSamuel =(Button)findViewById(R.id.btnSamuel);
        btnSamuel.setOnClickListener(this);

        btnVinicius =(Button)findViewById(R.id.btnVinicius);
        btnVinicius.setOnClickListener(this);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.mipmap.ic_launcher);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarPrincipal);
        toolbar.inflateMenu(R.menu.activity_menu);
        toolbar.setTitle("");
        toolbar.setNavigationIcon(R.mipmap.ic_launcher);
        toolbar.setOnMenuItemClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.btnAnderson:
                Intent a = new Intent(MainActivity.this, verMaisAnderson_activity.class);
                startActivity(a);
                break;

            case R.id.btnBreno:
                Intent b = new Intent(MainActivity.this, verMaisBreno_activity.class);
                startActivity(b);
                break;

            case R.id.btnBruno:
                Intent br = new Intent(MainActivity.this, verMaisBruno_activity.class);
                startActivity(br);
                break;

            case R.id.btnCamilo:
                Intent c = new Intent(MainActivity.this, verMaisCamilo_activity.class);
                startActivity(c);
                break;

            case R.id.btnGabriel:
                Intent g = new Intent(MainActivity.this, verMaisGabriel_activity.class);
                startActivity(g);
                break;

            case R.id.btnLauro:
                Intent l = new Intent(MainActivity.this, verMaisLauro_activity.class);
                startActivity(l);
                break;

            case R.id.btnLuis:
                Intent lu = new Intent(MainActivity.this, verMaisLuis_activity.class);
                startActivity(lu);
                break;

            case R.id.btnMarcelo:
                Intent m = new Intent(MainActivity.this, verMaisMarcelo_activity.class);
                startActivity(m);
                break;

            case R.id.btnPedro:
                Intent p = new Intent(MainActivity.this, verMaisPedro_activity.class);
                startActivity(p);
                break;

            case R.id.btnRegis:
                Intent r = new Intent(MainActivity.this, verMaisRegis_activity.class);
                startActivity(r);
                break;

            case R.id.btnRenan:
                Intent re = new Intent(MainActivity.this, verMaisRenan_activity.class);
                startActivity(re);
                break;

            case R.id.btnSamuel:
                Intent s = new Intent(MainActivity.this, verMaisSamuel_activity.class);
                startActivity(s);
                break;

            case R.id.btnVinicius:
                Intent vi = new Intent(MainActivity.this, verMaisVinicius_activity.class);
                startActivity(vi);
                break;
        }
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
                Intent li = new Intent(MainActivity.this, MainActivity.class);
                startActivity(li);
                return false;
            case R.id.menu_apagar:
                texto = "APAGAR";
                Intent ap = new Intent(this, add_activity.class);
                startActivity(ap);
                return false;
            case R.id.menu_ajuda:
                texto = "AJUDA";
                Intent aj = new Intent(MainActivity.this, verMaisGabriel_activity.class);
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
                Intent li = new Intent(MainActivity.this, MainActivity.class);
                startActivity(li);
                return false;
            case R.id.menu_apagar:
                texto = "APAGAR";
                Intent ap = new Intent(this, add_activity.class);
                startActivity(ap);
                return false;
            case R.id.menu_ajuda:
                texto = "AJUDA";
                Intent aj = new Intent(MainActivity.this, verMaisGabriel_activity.class);
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
