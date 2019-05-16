package com.example.school.cougarcalendar.TeacherClasses;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.school.cougarcalendar.AddClassActivityActivity;
import com.example.school.cougarcalendar.R;

public class CreateClassTeacher extends AppCompatActivity {
    private String selectedItemText;
    Spinner spinnerCourses;
    ArrayAdapter<String> coursesAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String id = "";
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_class_teacher);

        final Spinner mySpinner = (Spinner) findViewById(R.id.subjects);
        spinnerCourses = (Spinner) findViewById(R.id.courses);
        final Spinner spinnerPeriods = (Spinner)findViewById(R.id.periods);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(CreateClassTeacher.this ,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.subjects));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);


        ArrayAdapter<String> adapterPeriods = new ArrayAdapter<String>(CreateClassTeacher.this ,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.periods));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerPeriods.setAdapter(adapterPeriods);

        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedItemText = (String) parent.getItemAtPosition(position);
                // Notify the selected item text
//                Toast.makeText
//                        (getApplicationContext(), "Selected : " + selectedItemText, Toast.LENGTH_SHORT)
//                        .show();
                changeCoursesSpinner();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }

    private void changeCoursesSpinner(){

        if(selectedItemText.equals("Social Science")){
             coursesAdapter = new ArrayAdapter<String>(CreateClassTeacher.this ,
                    android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.socialscience));

        }
        else if(selectedItemText.equals("English")){
            coursesAdapter = new ArrayAdapter<String>(CreateClassTeacher.this ,
                    android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.english));
        }
        else if(selectedItemText.equals("Math")){
             coursesAdapter = new ArrayAdapter<String>(CreateClassTeacher.this ,
                    android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.math));
        }
        else if(selectedItemText.equals("Science")){
             coursesAdapter = new ArrayAdapter<String>(CreateClassTeacher.this ,
                    android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.science));
        }
        else if(selectedItemText.equals("Language")){
             coursesAdapter = new ArrayAdapter<String>(CreateClassTeacher.this ,
                    android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.language));
        }
        else if(selectedItemText.equals("Electives")){
             coursesAdapter = new ArrayAdapter<String>(CreateClassTeacher.this ,
                    android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.electives));
        }else{
             coursesAdapter = new ArrayAdapter<String>(CreateClassTeacher.this ,
                    android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.socialscience));
        }

        coursesAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCourses.setAdapter(coursesAdapter);
    }
}
