package com.hCueLite.Kiosk.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by User on 3/15/2016.
 */
public class DoctorLoginRequest {

    @SerializedName("DoctorPassword")
    private String DoctorPassword = "123456";

    @SerializedName("DoctorLoginID")
    private String DoctorLoginID = "sita@hcue.co";

    public String getDoctorPassword() {
        return DoctorPassword;
    }

    public void setDoctorPassword(String doctorPassword) {
        DoctorPassword = doctorPassword;
    }

    public String getDoctorLoginID() {
        return DoctorLoginID;
    }

    public void setDoctorLoginID(String doctorLoginID) {
        DoctorLoginID = doctorLoginID;
    }
}
