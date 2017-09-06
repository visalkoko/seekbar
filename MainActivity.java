package com.vsharefree.seekbar;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.SeekBar;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private RelativeLayout lly;
    private SeekBar sb;
    Random r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r = new Random();
        lly = (RelativeLayout)findViewById(R.id.layout);
        sb = (SeekBar)findViewById(R.id.seekBar);

        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                int color = Color.argb(225, r.nextInt(256), r.nextInt(256), r.nextInt(256));
                lly.setBackgroundColor(color);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }
}
