package com.example.myadminrassoiya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    TextView txtUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txtUsername = (TextView) findViewById(R.id.textView1);

        Bundle extras = getIntent().getExtras();
        String username1;

        if (extras != null) {
            username1 = extras.getString("username");
            txtUsername.setText("Welcome " + username1);
        }
    }
}