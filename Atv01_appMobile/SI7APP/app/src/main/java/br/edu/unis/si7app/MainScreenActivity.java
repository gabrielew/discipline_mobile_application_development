package br.edu.unis.si7app;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainScreenActivity extends AppCompatActivity {

    private static int openningTime = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainScreenActivity.this, FormScreenActivity.class);
                startActivity(i);
                finish();
            }
        }, openningTime);

    }
}
