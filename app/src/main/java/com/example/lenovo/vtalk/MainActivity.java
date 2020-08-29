package com.example.lenovo.vtalk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

import static android.Manifest.permission.READ_CONTACTS;
public class MainActivity extends AppCompatActivity {
    public EditText edt;
    public Button button;
    private static final int REQUEST_READ_CONTACTS = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt = findViewById(R.id.editTextMobile);
        button = findViewById(R.id.buttonContinue);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mobile = edt.getText().toString().trim();
                if (mobile.isEmpty() || mobile.length() < 10) {
                    edt.setError("Enter a valid mobile");
                    edt.requestFocus();
                    return;

                }


                Intent intent = new Intent(MainActivity.this, VerifyPhoneActivity.class);
                intent.putExtra("mobile", mobile);
                startActivity(intent);
            }
        });


    }
}

