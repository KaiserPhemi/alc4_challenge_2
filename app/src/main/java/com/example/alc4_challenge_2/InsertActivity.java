package com.example.alc4_challenge_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class InsertActivity extends AppCompatActivity {
    private FirebaseDatabase mFirebaseDB;
    private DatabaseReference mDbReference;
    EditText textTitle;
    EditText textDescription;
    EditText textPrice;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFirebaseDB = FirebaseDatabase.getInstance();
        mDbReference = mFirebaseDB.getReference().child("traveldeals");

        textTitle = (EditText) findViewById(R.id.textTitle);
        textDescription = (EditText) findViewById(R.id.textDesc);
        textPrice = (EditText) findViewById(R.id.textPrice);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.save_menu, menu);

        return true;
    }
}
