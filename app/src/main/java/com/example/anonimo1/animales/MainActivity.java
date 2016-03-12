package com.example.anonimo1.animales;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp = null;
    private ImageButton perro, gato, conejo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        perro=(ImageButton)findViewById(R.id.imageButton);
        perro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp != null) {
                    mp.stop();
                }
                mp = MediaPlayer.create(MainActivity.this, R.raw.perro);
                mp.start();
            }
        });
        gato=(ImageButton)findViewById(R.id.imageButton2);
        gato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp != null) {
                    mp.stop();
                }
                mp = MediaPlayer.create(MainActivity.this, R.raw.gato);
                mp.start();
            }
        });
        conejo=(ImageButton)findViewById(R.id.imageButton3);
        conejo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mp != null) {
                    mp.stop();
                }
                mp = MediaPlayer.create(MainActivity.this, R.raw.conejo);
                mp.start();
            }
        });

    }

}
