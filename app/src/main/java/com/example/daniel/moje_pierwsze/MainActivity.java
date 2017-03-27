package com.example.daniel.moje_pierwsze;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1 = (Button)findViewById(R.id.button1);
        Button b2 = (Button)findViewById(R.id.button2);
        Button b3 = (Button)findViewById(R.id.button3);

        final Button sub = (Button) findViewById(R.id.Submit);



        b1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText("Użyto : Przycisk 1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText("Użyto : Przycisk 2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText("Użyto : Przycisk 3");
            }
        });

        sub.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                TextView end = (TextView) findViewById(R.id.wynik);
                EditText et1 = (EditText) findViewById(R.id.tekst1);
                EditText et2 = (EditText) findViewById(R.id.tekst2);
                end.setText(et1.getText() + " " + et2.getText());

                Context cont;
                cont = getApplicationContext();
                Intent intent = new Intent(cont,Obrazek.class);
                startActivity(intent);
            }
        });
    }
}

