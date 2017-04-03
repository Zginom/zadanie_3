package com.example.daniel.moje_pierwsze;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Obrazek extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obrazek);
    }

    public void nastepny( View v )
    {
        ImageView imageView = (ImageView)findViewById(R.id.android2);
        imageView.setImageResource(R.mipmap.android);
    }

    public void poprzedni( View v )
    {
        ImageView imageView = (ImageView)findViewById(R.id.android2);
        imageView.setImageResource(R.mipmap.android2);
    }

    public void powrot( View v)
    {
        Context cont;
        cont = getApplicationContext();
        Intent intent = new Intent(cont,MainActivity.class);
        startActivity(intent);
    }
}
