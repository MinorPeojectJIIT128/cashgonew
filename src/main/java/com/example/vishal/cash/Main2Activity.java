package com.example.vishal.cash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Vishal on 8/22/2017.
 */

public class Main2Activity extends Activity implements View.OnClickListener
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2activity);
        Button b1 = (Button) findViewById(R.id.button6);
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.button6){

            Toast.makeText(this, "signup worked properly", Toast.LENGTH_SHORT).show();
            Intent i = new Intent();
            i.setClass(this,Main3Activity.class);
            startActivity(i);
        }


    }




}
