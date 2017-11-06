package com.example.helio.android_praticas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListarAlunosActivity extends AppCompatActivity {


    ListView listViewAlunos;

    List<Estudante> listaEstudantes;

    ArrayAdapter adapterListaEstudantes;

    private static final int REQUEST_CADASTRAR = 0;

    private View.OnClickListener clickListenerAddEstudante = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(ListarAlunosActivity.this, CadastrarAlunoActivity.class);
            startActivityForResult(intent, REQUEST_CADASTRAR);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_alunos);

        listViewAlunos = (ListView) findViewById(R.id.listView_estudantes);

        listaEstudantes = new ArrayList<>();

        adapterListaEstudantes = new ArrayAdapter<Estudante>(this, android.R.layout.simple_list_item_1, listaEstudantes);

        listViewAlunos.setAdapter(adapterListaEstudantes);


        findViewById(R.id.imageButton_AddEstudante).setOnClickListener(clickListenerAddEstudante);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CADASTRAR && resultCode == RESULT_OK){

            Estudante estudante = (Estudante) data.getSerializableExtra("estudante");
            listaEstudantes.add(estudante);
            adapterListaEstudantes.notifyDataSetChanged();
        }
    }
}