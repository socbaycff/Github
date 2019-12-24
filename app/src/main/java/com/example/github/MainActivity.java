package com.example.github;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"Hello before databaseeeeee",Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(), "Hello database2", Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(), "add more", Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(), "add more lan 4", Toast.LENGTH_LONG).show();
    }
}
