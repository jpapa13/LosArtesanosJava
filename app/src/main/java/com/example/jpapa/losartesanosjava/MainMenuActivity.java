package com.example.jpapa.losartesanosjava;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        TextView textView = (TextView) findViewById(R.id.emailTextView);
        String email = getIntent().getStringExtra("mEmailView");
        textView.setText("Bienvenido \n"+email);
    }

}
