package com.example.vishal.cash;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View;

/**
 * Created by Vishal on 8/22/2017.
 */

public class Main3Activity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main3activity);

        EditText pass1=(EditText)findViewById(R.id.editText7);
        EditText pass2=(EditText)findViewById(R.id.editText8);
        String str1=pass1.getText().toString();
        String str2=pass2.getText().toString();
        if(str1.equals(str2))
        {
            Toast pass=Toast.makeText(Main3Activity.this,"Passwords don't match",Toast.LENGTH_SHORT);
            pass.show();
        }
    }
    public void onClick(View v)
    {
        if(v.getId()==R.id.button2)
        {
            Intent i=new Intent();
            i.setClass(this,Main4Activity.class);
            startActivity(i);
        }
    }

}
