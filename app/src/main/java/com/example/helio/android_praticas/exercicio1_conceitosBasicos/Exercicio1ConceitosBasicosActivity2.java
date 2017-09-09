package com.example.helio.android_praticas.exercicio1_conceitosBasicos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.helio.android_praticas.R;

/**
 * Created by helio on 09/09/2017.
 */

public class Exercicio1ConceitosBasicosActivity2 extends AppCompatActivity {

    TextView textView1;
    TextView textView2;
    TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2_exercicio1_conceitosbasicos);
        textView1.setText(savedInstanceState.getCharSequence("nome"));
        textView2.setText(savedInstanceState.getCharSequence("idade"));
        textView3.setText(savedInstanceState.getCharSequence("any"));
    }
}
