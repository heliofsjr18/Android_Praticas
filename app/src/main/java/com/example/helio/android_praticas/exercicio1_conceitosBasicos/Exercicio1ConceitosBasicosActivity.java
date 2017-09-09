package com.example.helio.android_praticas.exercicio1_conceitosBasicos;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.helio.android_praticas.R;

/**
 * Created by helio on 09/09/2017.
 */

public class Exercicio1ConceitosBasicosActivity extends AppCompatActivity{

    EditText editText1;
    Button button1;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio1_conceitosbasicos);
        editText1 = (EditText) findViewById(R.id.editText1);
        button1 = (Button) findViewById(R.id.button_1);
        button2 = (Button) findViewById(R.id.button_2);
    }


    public void button1SetClick(View view){

        Toast.makeText(this, "You have been click on the Button 1", Toast.LENGTH_SHORT).show();

    }


    public void button2SetClick(View view){

        Intent intent = new Intent(this, Exercicio1ConceitosBasicosActivity2.class);
        intent.putExtra("nome", "Aluno");
        intent.putExtra("idade", "10");
        intent.putExtra("any", "thing");
        startActivity(intent);


    }




}
