package com.example.helio.android_praticas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class CadastrarAlunoActivity extends AppCompatActivity {


    EditText editText_disciplina;
    Spinner spinner_curso;
    EditText editText_nome;
    private View.OnClickListener onClickListenerButtonSalvar = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            String disciplina = editText_disciplina.getText().toString();
            String nome = editText_nome.getText().toString();
            String curso = spinner_curso.getSelectedItem().toString();
            String telefone = "6666-6666";

            Estudante estudante = new Estudante(nome, telefone, curso, disciplina);
            Intent intent = new Intent();
            intent.putExtra("estudante", estudante);
            setResult(RESULT_OK, intent);
            finish();
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastrar_aluno);

        editText_disciplina = (EditText) findViewById(R.id.editText_disciplina);
        editText_nome = (EditText) findViewById(R.id.editText_nome);
        spinner_curso = (Spinner) findViewById(R.id.spinner_curso);

        findViewById(R.id.imageButton_salvar).setOnClickListener(onClickListenerButtonSalvar);

    }
}
