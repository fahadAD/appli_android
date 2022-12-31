package com.application.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText search,search1,search2,search3,search4;
    Button button1,button2;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        sharedPreferences=getSharedPreferences(""+getString(R.string.app_name),MODE_PRIVATE);
        editor=sharedPreferences.edit();
        search=findViewById(R.id.search);
        search1=findViewById(R.id.search1);
        search2=findViewById(R.id.search2);
        search3=findViewById(R.id.search3);
        search4=findViewById(R.id.search4);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
int voter1,passport1,student_id_1;
              String Name=search.getText().toString();
              String Email=search1.getText().toString();
              String Voter=search2.getText().toString();
              String Passport=search3.getText().toString();
              String Student_id=search4.getText().toString();
if (Name.length()>0 && Email.length()>0 && Voter.length()>0&&Passport.length()>0&&Student_id.length()>0) {


    voter1 = Integer.parseInt(Voter);
    passport1 = Integer.parseInt(Passport);
    student_id_1 = Integer.parseInt(Student_id);

    editor.putString("name", "" + Name);
    editor.putString("email", "" + Email);
    editor.putInt("voter", Integer.parseInt("" + voter1));
    editor.putInt("passport", Integer.parseInt("" + passport1));
    editor.putInt("student_id", Integer.parseInt("" + student_id_1));
    editor.apply();






}else {
    search.setError("warning");
    search1.setError("warning");
    search2.setError("warning");
    search3.setError("warning");
    search4.setError("warning");
}


0            }
        });

       button2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(MainActivity.this,MainActivity2.class));
           }
       });
    }
}