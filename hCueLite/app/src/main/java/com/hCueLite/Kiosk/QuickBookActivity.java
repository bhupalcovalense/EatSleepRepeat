package com.hCueLite.Kiosk;

import android.view.View;

/**
 * Created by CVLHYD-161 on 12-03-2016.
 */
public class QuickBookActivity extends  BaseActivity{

    @Override
    public void initialize() {
        super.initialize();

        View inflatedLayout = getLayoutInflater().inflate(R.layout.quick_book, null, false);
        llBody.addView(inflatedLayout);
    }
}
