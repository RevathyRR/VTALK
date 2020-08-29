package com.example.lenovo.vtalk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class VerifyPhoneActivity extends AppCompatActivity {
    public EditText otp;
    public Button buttonsignin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_phone);
        otp = findViewById(R.id.editTextOTP);
        buttonsignin = findViewById(R.id.buttonSignIn);
        buttonsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String code = otp.getText().toString().trim();
                if (code.isEmpty() || code.length() < 6) {
                    otp.setError("Enter valid code");
                    otp.requestFocus();
                    return;
                }
                Intent intent = new Intent(VerifyPhoneActivity.this, VerifyPhoneActivity.class);
                startActivity(intent);
            }
        });

    }
}
