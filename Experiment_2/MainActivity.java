package com.example.Experiment2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        com.example.Experiment2.MyClass view = new com.example.Experiment2.MyClass(this);
        setContentView(view);
    }
}