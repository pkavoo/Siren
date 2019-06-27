package com.example.siren.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.siren.R;


public class Formactivity extends AppCompatActivity {
    EditText name, phone;
    ConstraintLayout layout2;
    Button btnrequest;
    String name1, phone1;
    private Spinner spinnermrg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formactivity);
        this.getSupportActionBar().hide();


      //  layout2 = findViewById(R.id.layout2);
        btnrequest = findViewById(R.id.buttonrequest);
        name = findViewById(R.id.txtname);
        phone = findViewById(R.id.txtphone);




        Animation animation = AnimationUtils.loadAnimation(this,
                R.anim.push_out_in);
        animation.setDuration(1000);
       // layout2.startAnimation(animation);


        btnrequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name1 = name.getText().toString();
                phone1 = phone.getText().toString();

                if (TextUtils.isEmpty(name1)) {
                    Toast.makeText(getApplicationContext(), "Enter names!", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(phone1)) {
                    Toast.makeText(getApplicationContext(), "Enter phone number!", Toast.LENGTH_SHORT).show();
                    return;
                }

                Toast.makeText(getApplicationContext(), "Hello " + name1 + " phone"
                        + phone1 + "Lets get you an ambulance", Toast.LENGTH_LONG).show();
                name.setText("");
                phone.setText("");
                Intent myintent = new Intent(Formactivity.this, MapsActivity.class);
                startActivity(myintent);
            }
        });


    }
    public void addListenerOnSpinnerItemSelection() {
        spinnermrg = findViewById(R.id.spinner_emergtype);
        spinnermrg.setOnItemSelectedListener(new CustomOnItemSelectedListener());
    }

    public void addListenerOnButton() {

        spinnermrg = findViewById(R.id.spinner_emergtype);
        btnrequest = findViewById(R.id.buttonrequest);

        btnrequest.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),
                        "OnClickListener : " +
                                "\nSpinner 1 : "+ spinnermrg.getSelectedItem(),
                            Toast.LENGTH_SHORT).show();
            }

        });
    }
}
