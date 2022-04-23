package com.example.canvastutorial;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class DrawActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final DrawView drawView = new DrawView(this);
        setContentView(R.layout.canvas_draw);
        LinearLayout frm_layout= findViewById(R.id.main_frame);
        frm_layout.addView(drawView);
        MaterialButton btn_undo= (MaterialButton) findViewById(R.id.button1);
        btn_undo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                drawView.onClickUndo();
            }
        });

        MaterialButton btn_redo= (MaterialButton) findViewById(R.id.button2);
        btn_redo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                drawView.onClickRedo();
            }
        });
    }
}
