package com.example.socialnetwork;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Category extends AppCompatActivity {

    private Button engineeringCheckBox;
    private Button artCheckBox;
    private Button spaceCheckbox;
    private Button historyCheckBox;
    private Button finish;
    private TextView occupation;

    private int stemCount = 0;
    private int artsyCount = 0;
    private int humanitiesCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

    }




    public boolean isClickedItem(View v){
        CheckBox checkBox = (CheckBox)v;
        return checkBox.isChecked();
    }
}