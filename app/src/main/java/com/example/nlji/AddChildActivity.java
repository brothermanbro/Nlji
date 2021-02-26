package com.example.nlji;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class AddChildActivity extends AppCompatActivity {

  Button button;
CheckBox male;
CheckBox female;
EditText birth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_child);
   button=(Button)findViewById(R.id.next);
male=(CheckBox)findViewById(R.id.male);
female=(CheckBox)findViewById(R.id.female);
birth=(EditText)findViewById(R.id.birth);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Intent intent = new Intent(AddChildActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        male.setOnClickListener(new CheckBox.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((male).isChecked()) {
                    female.setChecked(false);
                    // TODO : CheckBox is checked.

            }
        } });

        female.setOnClickListener(new CheckBox.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ((female).isChecked()) {
                    male.setChecked(false);
                    // TODO : CheckBox is checked.

                }
            }
        }
        );

        birth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar c = Calendar.getInstance();

                DatePickerDialog datePickerDialog = new DatePickerDialog(AddChildActivity.this, android.R.style.Theme_Holo_Light_Dialog_MinWidth, new DatePickerDialog.OnDateSetListener() {



                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                        // TODO Auto-generated method stub

                        try {

                            Date d = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).parse(year+"-"+(monthOfYear+1)+"-"+dayOfMonth);
birth.setText(year+"-"+(monthOfYear+1)+"-"+dayOfMonth);

                        } catch (Exception e) {

                            // TODO: handle exception

                            e.printStackTrace();
                        }
                    }
                }, c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH));
                datePickerDialog.getDatePicker().setCalendarViewShown(false);
                datePickerDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
                datePickerDialog.show();

            }

        });






    }
}

