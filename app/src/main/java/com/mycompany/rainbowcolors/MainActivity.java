package com.mycompany.rainbowcolors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private  Button button1, button2, button3,button4, button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void click(View view) {

        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        button5=(Button)findViewById(R.id.button5);
        Toast.makeText(getApplicationContext(),"red", Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(),"orange", Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(),"yellow", Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(),"green", Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(),"blue", Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(),"indigo", Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(),"violet", Toast.LENGTH_SHORT).show();
    }
}
