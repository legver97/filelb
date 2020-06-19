package com.example.filelab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    ImageView image;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        image = findViewById(R.id.img);
        intent = getIntent();

        if (intent.getAction().equals(Intent.ACTION_VIEW )) {
            image.setImageURI(intent.getData());
        }

    }
}
