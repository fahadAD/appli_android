package com.application.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
TextView textView,textView1,textView2,textView3,textView4;
SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView=findViewById(R.id.textView);
        textView1=findViewById(R.id.textView1);
        textView2=findViewById(R.id.textView2);
        textView4=findViewById(R.id.textView4);
        textView3=findViewById(R.id.textView3);
        sharedPreferences=getSharedPreferences(""+getString(R.string.app_name),MODE_PRIVATE);



        String my_name=sharedPreferences.getString("name","");
        textView.setText(my_name);
        String my_email=sharedPreferences.getString("email","");
        textView1.setText(my_email);
        int my_voter=sharedPreferences.getInt("voter",0);
        textView2.setText(my_voter);
        int my_passport=sharedPreferences.getInt("passport",0);
        textView3.setText(my_passport);
        int my_s_id=sharedPreferences.getInt("student_id",0);
        textView4.setText(my_s_id);


    }
}