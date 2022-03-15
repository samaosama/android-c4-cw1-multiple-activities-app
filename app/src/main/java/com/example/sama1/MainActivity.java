package com.example.sama1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        EditText name=findViewById(R.id.name);
        EditText age=findViewById(R.id.age);
        Button next=findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(name.getText().toString().isEmpty()){
                    name.setError("Enter name");
                }
                else if(age.getText().toString().isEmpty()) {
                    age.setError("Enter your age");
                }
                else{
                    Intent intent1=new Intent(MainActivity.this, sama2.class);
                    String namedata=name.getText().toString();
                    String agedata=age.getText().toString();
                    intent1.putExtra("name", namedata);
                    intent1.putExtra("age", agedata);
                    startActivity(intent1);
                }
            }
        });
    }
}