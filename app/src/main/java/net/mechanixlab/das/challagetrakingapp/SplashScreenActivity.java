package net.mechanixlab.das.challagetrakingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreenActivity extends AppCompatActivity {

    private TextView textView;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        textView = findViewById(R.id.splashtext);
        imageView = findViewById(R.id.splashlogo);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.mysplashscreen);
        textView.startAnimation(animation);
        imageView.startAnimation(animation);

        final Intent intent = new Intent(this,UserRegistationActivity.class);

        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(5000);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivity(intent);
                    finish();

                }
            }
        };
        timer.start();
    }

}

