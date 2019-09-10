package com.example.myfirsttextjorge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View setText = findViewById(R.id.sisellama);
    }

    {
        Toast toast = Toast.makeText( this, "Este es mi Toast simple", Toast.LENGTH_LONG );
        toast.show();
    }
}
