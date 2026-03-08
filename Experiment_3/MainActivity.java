package com.example.example3;

import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.example3.R;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    int[] images = {
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4
    };

    int index = 0;
    Handler handler = new Handler();

    Runnable runnable = new Runnable() {
        @Override
        public void run() {

            imageView.setImageResource(images[index]);

            index++;

            if(index >= images.length){
                index = 0;
            }

            handler.postDelayed(this,3000);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);

        handler.post(runnable);
    }
}