package net.mechanixlab.das.challagetrakingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserloginActivity extends AppCompatActivity {

    Button buttonlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userlogin);

        buttonlogin = findViewById(R.id.buttonloging);

        buttonlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserloginActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
