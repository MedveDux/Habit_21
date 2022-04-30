package com.mima.habit21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegistrationActivity_Name extends AppCompatActivity {
    private Button button;
    public EditText result_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registation_name);

        button = findViewById(R.id.button);
        result_name = findViewById(R.id.user_field);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result_name.getText().toString().trim().equals(""))
                    Toast.makeText(RegistrationActivity_Name.this, R.string.nowuserinput, Toast.LENGTH_LONG).show();
                else
                    startActivity(new Intent(RegistrationActivity_Name.this, RegistrationActivity_Age.class));
            }
        });
    }
}