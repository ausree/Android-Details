package com.example.realmrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Person;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import io.realm.Realm;

public class MainActivity extends AppCompatActivity {

    public static final String REGEX_STORE="RegexStore";
    SharedPreferences sharedPreferences;
    private Context mContext;
    EditText name,dept,phone,roll;
    Switch gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext=this;
        gender=findViewById(R.id.switch2);
        name=findViewById(R.id.main_name_et);
        dept=findViewById(R.id.dept_et);
        phone=findViewById(R.id.phone_et);
        roll=findViewById(R.id.roll_et);

    }

    public void onSubmitPressed(View v) {
        Realm realm=Realm.getDefaultInstance();
        realm.beginTransaction();
        try {
            MyPerson person = realm.createObject(MyPerson.class,System.currentTimeMillis()/1000);
            person.setName(name.getText().toString());
            person.setDept(dept.getText().toString());
            person.setPhone(phone.getText().toString());
            person.setRoll(Integer.parseInt(roll.getText().toString()));
            if(gender.isChecked()) person.setGender("Female");
            else person.setGender("Male");
            realm.commitTransaction();
            Toast.makeText(mContext, "Success", Toast.LENGTH_SHORT).show();
        }
        catch(Exception e) {
            realm.cancelTransaction();
            Toast.makeText(mContext, "Failure", Toast.LENGTH_SHORT).show();
        }
        realm.close();
    }

    public void onDisplayButtonPressed(View v) {
        Intent i=new Intent(this,DisplayActivity.class);
        startActivity(i);
    }

}
