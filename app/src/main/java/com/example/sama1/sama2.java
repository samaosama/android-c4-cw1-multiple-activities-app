package com.example.sama1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class sama2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sama2);

        TextView nameinfo= findViewById(R.id.nameinfo);
        TextView ageinfo= findViewById(R.id.ageinfo);

        Bundle bundle= getIntent().getExtras();
        String name2= bundle.getString("name");
        String age2= bundle.getString("age");
        nameinfo.setText(name2);
        ageinfo.setText(age2);
    }
}