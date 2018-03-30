package com.example.android.firebaseexample3_26;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference personRef = database.getReference("person");
    private DatabaseReference peopleRef = database.getReference("Multiple people");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void set(View view) {
        personRef.setValue(new Person("MJ", 68, true));
    }

    public void add(View view){
        peopleRef.push().setValue(new Person("Lebron", 34, true));
    }
}
