package com.hCueLite.Kiosk;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hCueLite.Kiosk.BaseActivity;

/**
 * Created by User on 3/13/2016.
 */
public class EnterNewPatient extends BaseActivity{


    private View llNewPatient;
    private Animation slide_up, slide_down;
    private TextView tv_book , tv_male , tv_female;
    private LinearLayout llpatient_details_action ;
    private EditText edt_patient_name , edt_patient_age , edt_email , edt_address, edt_landmark;
    private boolean isMale = true ;
    @Override
    public void initialize() {

        llNewPatient = getLayoutInflater().inflate(R.layout.enter_new_patient, null, false);
        llBody.addView(llNewPatient);

        slide_up 	= AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_up);
        slide_down  = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_down);

        llpatient_details_action = (LinearLayout) findViewById(R.id.llpatient_details_action);
        tv_book                  = (TextView) findViewById(R.id.tv_book);
        tv_male                  = (TextView) findViewById(R.id.tv_male);
        tv_female                  = (TextView) findViewById(R.id.tv_female);

        edt_patient_name         = (EditText) findViewById(R.id.edt_patient_name);
        edt_patient_age          = (EditText) findViewById(R.id.edt_patient_age);
        edt_email                = (EditText) findViewById(R.id.edt_email);
        edt_address              = (EditText) findViewById(R.id.edt_address);
        edt_landmark             = (EditText) findViewById(R.id.edt_landmark);

        tv_male.performClick();

        //llKeyboard.startAnimation(slide_up);
        tv_book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llNewPatient.setEnabled(false);
                llNewPatient.setClickable(false);
                llpatient_details_action.setClickable(true);
                llpatient_details_action.bringToFront();
                llpatient_details_action.setVisibility(View.VISIBLE);
                llpatient_details_action.startAnimation(slide_up);
            }
        });


        tv_male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                isMale = true ;
                tv_male.setCompoundDrawablesWithIntrinsicBounds(R.drawable.check_box_icon, 0, 0, 0);
                tv_female.setCompoundDrawablesWithIntrinsicBounds(R.drawable.un_check_box_icon, 0, 0, 0);

            }
        });

        tv_female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                isMale = false ;
                tv_female.setCompoundDrawablesWithIntrinsicBounds(R.drawable.check_box_icon,0,0,0);
                tv_male.setCompoundDrawablesWithIntrinsicBounds(R.drawable.un_check_box_icon,0,0,0);

            }
        });
    }
}
