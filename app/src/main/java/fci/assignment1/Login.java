package fci.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import cn.pedant.SweetAlert.SweetAlertDialog;

public class Login extends AppCompatActivity implements View.OnClickListener {


    protected EditText email;
    protected EditText password;
    protected Button login;
    protected TextView newaccout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_login);
        initView();


    }


    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.login) {
            String emailtext = email.getText().toString();
            String pass = password.getText().toString();

            if (emailtext.equals("student@fci.com") && pass.equals("123")) {

                Intent i = new Intent(this, HomeActivity.class);
                startActivity(i);
                finish();
            } else {
                // email.setError("error");
                //email.requestFocus();
              /*  AlertDialog.Builder builder=new AlertDialog.Builder(this,R.style.AppTheme);
                builder.setMessage("wrong Email or password");
                builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                     dialog.dismiss();
                    }
                });

                builder.setCancelable(true);
                builder.create().show();*/
                new SweetAlertDialog(this, SweetAlertDialog.WARNING_TYPE)
                        .setContentText("Wrong user name or password")
                        .setConfirmText("ok")
                        .show();

            }

        } else if (view.getId() == R.id.newaccout) {

        }
    }

    private void initView() {
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        login = (Button) findViewById(R.id.login);
        login.setOnClickListener(Login.this);
        newaccout = (TextView) findViewById(R.id.newaccout);
        newaccout.setOnClickListener(Login.this);
    }
}

