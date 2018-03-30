package com.example.android.firebaseexample3_26;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference personRef = database.getReference("person");
    private DatabaseReference peopleRef = database.getReference("Multiple people");
    EditText name;
    EditText ageBox;
    CheckBox hasGraduated;
    String nameText = name.getEditableText().toString();
    String ageText = ageBox.getEditableText().toString();
    int age = Integer.parseInt(ageText);
    boolean graduated = hasGraduated.isChecked();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText name = findViewById(R.id.name_field);
        EditText ageBox = findViewById(R.id.age_field);
        CheckBox hasGraduated = findViewById(R.id.graduated_field);

    }


    public void set(View view) {
        personRef.setValue(new Person(nameText, age, graduated));
    }

    public void add(View view) {
        peopleRef.push().setValue(new Person(nameText, age, graduated));
    }
}
