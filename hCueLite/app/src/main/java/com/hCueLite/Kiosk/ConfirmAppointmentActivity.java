package com.hCueLite.Kiosk;

import android.view.View;

/**
 * Created by CVLHYD-161 on 13-03-2016.
 */
public class ConfirmAppointmentActivity extends  BaseActivity{

    @Override
    public void initialize() {
        super.initialize();

        View inflatedLayout = getLayoutInflater().inflate(R.layout.confirm_appointment, null, false);
        llBody.addView(inflatedLayout);
    }
}