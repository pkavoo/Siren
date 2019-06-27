package com.example.siren.Activities;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.siren.R;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {
    Button btnLogin;
    EditText edEmail, edPassword;
    private FirebaseAuth auth;
    private ProgressDialog dialog;

    // String inputEmail, inputPassword;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_login);

        //Get Firebase auth instance


        btnLogin = findViewById(R.id.btnLogin);
        edEmail = findViewById(R.id.edEmail);
        edPassword = findViewById(R.id.edPassword);
        dialog = new ProgressDialog(this, R.style.AppTheme_PopupOverlay);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = edEmail.getText().toString();
                final String password = edPassword.getText().toString();

                if (TextUtils.isEmpty(email)) {
                    Toast.makeText(getApplicationContext(), "Enter email address!", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(password)) {
                    Toast.makeText(getApplicationContext(), "Enter password!", Toast.LENGTH_SHORT).show();
                    return;
                }
                else if(email.equalsIgnoreCase("demo@gmail.com")&& password.equalsIgnoreCase("12345678"))
                {
                    Intent intent= new Intent(getApplicationContext(), Formactivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
