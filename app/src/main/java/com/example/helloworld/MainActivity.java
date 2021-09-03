package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button botao;
    TextView text;
    Switch slider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = (Button) findViewById(R.id.btn_Start);
        text = (TextView) findViewById(R.id.txtMensagem);
        slider = (Switch) findViewById(R.id.swtNightMode);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setVisibility(View.VISIBLE);
                botao.setVisibility(View.INVISIBLE);
            }
        });

        slider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                botao.setVisibility(View.INVISIBLE);
                botao.setVisibility(View.VISIBLE);
            }
        });


    }
}