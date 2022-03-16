package com.hcdc.midtermexamination;

// Author: John Henly A. Montera
// HolyCross of Davao College
// BSIT-3rd-Year-Student
// MIDTERM EXAM

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class secpage extends AppCompatActivity {

    TextView namemain, positionmain, agemain, addressmain, phonemain;
    ImageView imageviewmain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secpage);

        namemain = findViewById(R.id.namesec);
        positionmain = findViewById(R.id.positionsec);
        agemain = findViewById(R.id.agesec);
        addressmain = findViewById(R.id.addresssec);
        phonemain = findViewById(R.id.phonesec);
        imageviewmain = findViewById(R.id.imageidsec);
        Intent intent = getIntent();
        namemain.setText(intent.getStringExtra("name"));
        positionmain.setText(intent.getStringExtra("jobposition"));
        agemain.setText(intent.getStringExtra("age"));
        addressmain.setText(intent.getStringExtra("address"));
        phonemain.setText(intent.getStringExtra("phoneno"));
        imageviewmain.setImageResource(intent.getIntExtra("image", 0));

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(intent.getStringExtra("name") + " Profile:");

    }
}