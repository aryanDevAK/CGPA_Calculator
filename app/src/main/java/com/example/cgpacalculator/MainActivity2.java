package com.example.cgpacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity2 extends AppCompatActivity {
Spinner courseList;
Button signUpBtn;
EditText inputName;
EditText inputUid;
EditText inputCuMail;

    private String name, uid, cuMail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        signUpBtn = findViewById(R.id.signUpBtn2);
        inputName = findViewById(R.id.name);
        inputUid = findViewById(R.id.uid);
        inputCuMail = findViewById(R.id.cuMail);
        courseList = findViewById(R.id.course);
        String[] courses = {"Choose your Course","BE-CSE","BCA"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_dropdown_item,
                courses
        );
        courseList.setAdapter(adapter);

        //Creating SignUp Button and storing the data
        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = inputName.getText().toString();
                uid = inputUid.getText().toString();
                cuMail = inputCuMail.getText().toString();
            }
        });
    }
}