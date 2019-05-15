package com.example.school.cougarcalendar.TeacherClasses;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.school.cougarcalendar.AddClassActivityActivity;
import com.example.school.cougarcalendar.R;

public class CreateClassTeacher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_class_teacher);

        Spinner mySpinner = (Spinner) findViewById(R.id.spinner);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(CreateClassTeacher.this ,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.subjects));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);

        String subject = mySpinner.getSelectedItem().toString();
        EditText e = (EditText) findViewById (R.id.subjectText);
        e.setText(subject);

    }
}
