package fci.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Splash extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        SplashHandler handler = new SplashHandler();
        handler.start();

    }


    class SplashHandler extends Thread {

        public void run() {
            try {
                sleep(2000);
                Intent i = new Intent(Splash.this, Login.class);
                startActivity(i);
                finish();

            } catch (Exception e) {

            }
        }

    }

}
