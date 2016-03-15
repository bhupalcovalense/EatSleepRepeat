package com.hCueLite.Kiosk;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by User on 3/13/2016.
 */
public class Help extends BaseActivity{

    private View llHelp;
    private TextView tv_support_mail , tv_mobile_number , btn_send , btn_call;
    @Override
    public void initialize() {

        llHelp = getLayoutInflater().inflate(R.layout.help, null, false);
        llBody.addView(llHelp);

        tv_support_mail  = (TextView) findViewById(R.id.tv_support_mail);
        tv_mobile_number = (TextView) findViewById(R.id.tv_mobile_number);
        btn_send         = (TextView) findViewById(R.id.btn_send);
        btn_call         = (TextView) findViewById(R.id.btn_call);


        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


        btn_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }
}
