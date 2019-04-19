package br.edu.unis.si.menu;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class iniciando_activity extends AppCompatActivity {

    private static int openningTime = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciando_activity);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(iniciando_activity.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, openningTime);
    }
}
