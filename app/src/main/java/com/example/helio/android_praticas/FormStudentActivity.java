package com.example.helio.android_praticas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class FormStudentActivity extends AppCompatActivity {

    EditText mEditTextName;
    Spinner mSpinnerCourses;
    EditText mEditTextDiscipline;
    private View.OnClickListener clickButton = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String discipline = mEditTextDiscipline.getText().toString();
            String name = mEditTextName.getText().toString();
            String course = mSpinnerCourses.getSelectedItem().toString();
            Student student = new Student(name, course, discipline);

            Intent intent = new Intent();
            intent.putExtra("student", student);
            setResult(RESULT_OK, intent);
            finish();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_student);


        mEditTextName = (EditText) findViewById(R.id.et_nameStudent);
        mSpinnerCourses = (Spinner) findViewById(R.id.spinner_courses);
        mEditTextDiscipline = (EditText) findViewById(R.id.editTextDiscipline);


        findViewById(R.id.button_saveNewStudent).setOnClickListener(clickButton);
    }
}
