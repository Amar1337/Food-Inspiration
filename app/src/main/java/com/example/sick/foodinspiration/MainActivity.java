package com.example.sick.foodinspiration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button)findViewById(R.id.button3);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, CookbookActivity.class));
            }
        });
    }

    public void DislikeMethod(View view){
        Toast.makeText(MainActivity.this, "Dislike :(", Toast.LENGTH_SHORT).show();
    }

    public void LikeMethod (View view){
        Toast.makeText(MainActivity.this, "Like :)", Toast.LENGTH_SHORT).show();
    }
}
