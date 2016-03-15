package com.hCueLite.Kiosk;

import android.graphics.Color;
import android.view.View;
import android.widget.Button;

/**
 * Created by User on 3/14/2016.
 */
public class SettingsActivity extends BaseActivity implements View.OnClickListener{

    private View llSettings ;
    private Button btn_my_calendar , btn_my_appointment , btn_change_password;
    @Override
    public void initialize() {

        llSettings = getLayoutInflater().inflate(R.layout.settings, null, false);
        llBody.addView(llSettings);

        btn_my_calendar = (Button) findViewById(R.id.btn_my_calendar);
        btn_my_appointment = (Button) findViewById(R.id.btn_my_appointment);
        btn_change_password = (Button) findViewById(R.id.btn_change_password);


        btn_my_calendar.setOnClickListener(this);
        btn_my_appointment.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btn_my_appointment :
                                            btn_my_calendar.setBackgroundDrawable(null);
                                            btn_my_calendar.setTextColor(Color.BLACK);
                                            btn_my_appointment.setBackgroundResource(R.drawable.right_active_toggle);
                                            btn_my_appointment.setTextColor(Color.WHITE);
                                            break;

            case R.id.btn_my_calendar :
                                            btn_my_appointment.setBackgroundDrawable(null);
                                            btn_my_appointment.setTextColor(Color.BLACK);
                                            btn_my_calendar.setBackgroundResource(R.drawable.right_active_toggle);
                                            btn_my_calendar.setTextColor(Color.WHITE);
                                            break;

            case R.id.btn_change_password :
                                            break;
        }
    }
}
