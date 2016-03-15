package com.hCueLite.Kiosk;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by CVLHYD-161 on 13-03-2016.
 */
public class LoginActivity extends Activity implements View.OnClickListener{

    private EditText etEmailID, etPwd;
    private TextView tvLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        etEmailID = (EditText)findViewById(R.id.etEmailID);
        etPwd     = (EditText)findViewById(R.id.etPwd);
        tvLogin   = (TextView)findViewById(R.id.tvLogin);
        tvLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.tvLogin){
            Intent in = new Intent(LoginActivity.this, QuickBookActivity.class);
            startActivity(in);
            finish();
        }
    }
}
