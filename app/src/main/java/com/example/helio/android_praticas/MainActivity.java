package com.example.helio.android_praticas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    public static final int REQUEST_REGISTER = 0;
    private List<Student> listStudent;
    private ListView mListViewStudent;
    private ArrayAdapter<Student> mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = new Intent(this, ListarAlunosActivity.class);
        startActivity(intent);

        listStudent = new ArrayList<>();
        mListViewStudent = (ListView) findViewById(R.id.listView_students);
        mAdapter = new ArrayAdapter<Student>(this, android.R.layout.simple_list_item_1, listStudent);
        mListViewStudent.setAdapter(mAdapter);


        findViewById(R.id.btn_newStudent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FormStudentActivity.class);
                startActivityForResult(intent, REQUEST_REGISTER);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_REGISTER && resultCode == RESULT_OK) {
            Student student = data.getParcelableExtra("student");
            if (student.name.length() > 2 && student.discipline.length() > 2) {
                listStudent.add(student);
                mAdapter.notifyDataSetChanged();
            }

        }
    }
}