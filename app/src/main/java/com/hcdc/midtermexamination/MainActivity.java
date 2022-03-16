package com.hcdc.midtermexamination;

// Author: John Henly A. Montera
// HolyCross of Davao College
// BSIT-3rd-Year-Student
// MIDTERM EXAM

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView rviewmain;
    String names[] = new String[] {"Liz B. Yawn","Jada H. Bonquashia","Lily A. Collins","Alexander D. Greath","Ruby S. Misfit", "Tupac K. Shakur", "Karen D. Avila", "Park Bo Young", "Chad D. Nosimp"};
    String jobposition[] = new String[] {"Support Specialist","Computer Programmer","Quality Assurance Tester","Web Developer","IT Technician","System Analyst","Network Engineer","User Experience Designer","Database Administrator"};
    int imageid[] = new int[] {R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i};
    String age[] = new String[] {"25","31","28","27","34","35","25","27","28"};
    String address[] = new String[] {"Alabama,USA","Indiana,USA","Iowa,USA","South Dakota,USA","Tennessee,USA","Texas,USA","New Mexico,USA","New York,USA","Maryland,USA"};
    String phoneno[] = new String[] {"202-555-0196","202-555-0135","202-555-0143","202-555-0147","202-555-0138","202-555-0110","+1-202-555-0196","+1-202-555-0135","+1-202-555-0143"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Montera Midterm Exam Profiles");


       rviewmain = findViewById(R.id.rview);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getBaseContext());

        rviewmain.setLayoutManager(layoutManager);

        rviewmain.setAdapter(new ItemAdapter(this, names, jobposition, imageid, age, address, phoneno));

    }
}