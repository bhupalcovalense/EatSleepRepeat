package com.hCueLite.Kiosk;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by User on 3/15/2016.
 */
public class FindAccountActivity extends BaseActivity{

    private View llfindAccount ;
    private EditText edt_uservalue ;
    private TextView tv_search;

    @Override
    public void initialize() {

        llfindAccount = getLayoutInflater().inflate(R.layout.myaccount_forgotpassword, null, false);
        llBody.addView(llfindAccount);


        tv_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(validatedata())
                {
                    Intent intent = new Intent();
                    startActivity(intent);

                }else
                {
                    Toast.makeText(FindAccountActivity.this,"Please enter email, phone number or username",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private boolean validatedata() {

        return true;
    }
}
