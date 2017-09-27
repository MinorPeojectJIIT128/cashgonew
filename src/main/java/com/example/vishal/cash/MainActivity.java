package com.example.vishal.cash;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewAnimationUtils;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = (Button) findViewById(R.id.button8);
        b.setOnClickListener(this);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.button8){

            Toast.makeText(this, "skip worked properly", Toast.LENGTH_SHORT).show();
            Intent i = new Intent();
            i.setClass(this,Main2Activity.class);
            startActivity(i);
        }

    }

}
