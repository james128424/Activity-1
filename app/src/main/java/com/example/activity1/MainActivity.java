package com.example.activity1;

import androidx.annotation.MainThread;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

     Button button_red,button_blue,button_green,button_black,button_violet,button_reset;
     View background_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_red = (Button)findViewById(R.id.btn_red);
        button_blue = (Button)findViewById(R.id.btn_blue);
        button_green = (Button)findViewById(R.id.btn_green);
        button_black = (Button)findViewById(R.id.btn_black);
        button_violet = (Button)findViewById(R.id.btn_violet);
        button_reset = (Button)findViewById(R.id.btn_reset);
        background_view = this.getWindow().getDecorView();

        button_red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_red.getText().equals("Red"))
                {
                    background_view.setBackgroundResource(R.color.red);
                    Toast.makeText(MainActivity.this, "You have succesfully changed the color to red",Toast.LENGTH_LONG).show();
                }
            }
        });

        button_blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_blue.getText().equals("Blue"))
                {
                    background_view.setBackgroundResource(R.color.blue);
                    Toast.makeText(MainActivity.this, "You have succesfully changed the color to blue",Toast.LENGTH_LONG).show();
                }
            }
        });

        button_green.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_green.getText().equals("Green"))
                {
                    background_view.setBackgroundResource(R.color.green);
                    Toast.makeText(MainActivity.this, "You have succesfully changed the color to green",Toast.LENGTH_LONG).show();
                }
            }
        });

        button_black.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_black.getText().equals("Black"))
                {
                    background_view.setBackgroundResource(R.color.black);
                    Toast.makeText(MainActivity.this, "You have succesfully changed the color to black",Toast.LENGTH_LONG).show();
                }
            }
        });

        button_violet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_violet.getText().equals("Violet"))
                {
                    background_view.setBackgroundResource(R.color.violet);
                    Toast.makeText(MainActivity.this, "You have succesfully changed the color to violet",Toast.LENGTH_LONG).show();
                }
            }
        });

        button_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button_reset.getText().equals("Reset"))
                {
                    background_view.setBackgroundResource(R.color.white);
                    Toast.makeText(MainActivity.this, "You have succesfully changed the color to default",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}