package com.example.szinvaltoztatos;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.view.View;
import com.google.android.material.slider.Slider;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout relativeLayout;
    private TextView textViewColor;

    private SeekBar redslider,greenslider, blueslider;

    private TextView red,green,blue, szin;

    private  int r,g,b;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        redslider.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean x) {
                red.setText("Red: "+i);
                r=i;
                szin.setText("("+r+","+g+","+b+")");
                szin.setBackgroundColor(Color.rgb(r,g,b));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        blueslider.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean x) {
                blue.setText("Blue: "+i);
                b=i;
                szin.setText("("+r+","+g+","+b+")");
                szin.setBackgroundColor(Color.rgb(r,g,b));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        greenslider.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean x) {
                green.setText("Green: "+i);
                g=i;
                szin.setText("("+r+","+g+","+b+")");
                szin.setBackgroundColor(Color.rgb(r,g,b));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

        private void init(){
            redslider = findViewById(R.id.redslider);
            greenslider = findViewById(R.id.greenslider);
            blueslider = findViewById(R.id.blueslider);
            red=findViewById(R.id.red);
            green=findViewById(R.id.green);
            blue=findViewById(R.id.blue);
            szin=findViewById(R.id.szin);
            r=0;
            g=0;
            b=0;
        }

    }




