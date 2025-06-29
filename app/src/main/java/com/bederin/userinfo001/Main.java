package com.bederin.userinfo001;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class Main extends AppCompatActivity {
    TextView tvName, tvYear;;
    EditText etName, etYear;
    Button btnGoMsg;
    String stName, stYear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        tvName = (TextView) findViewById(R.id.tvName);
        tvYear = (TextView) findViewById(R . id. tvYear);
        etName = (EditText) findViewById(R.id.etName);
        etYear = (EditText) findViewById(R.id.etYear);
        btnGoMsg = (Button) findViewById(R.id.btnGoMsg);
    }

    public void goDoit(View view) {
        int year, myYear, myAge;
        stName = etName.getText().toString();
        stYear = etYear.getText().toString();
        if (stName.equals("")) return;
        year= Calendar.getInstance().get(Calendar. YEAR);
        myYear=Integer.parseInt(stYear);
        if (myYear>year) return;
        myAge=year-myYear;
        Toast.makeText(this, stName + ", Ваш возраст " +myAge+ " лет", Toast.LENGTH_LONG).show();

    }
}