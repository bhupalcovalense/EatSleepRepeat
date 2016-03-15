package com.hCueLite.Kiosk.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by User on 3/15/2016.
 */
public class AvailableAppointmentsRequest {

    @SerializedName("DoctorID")
    private int DoctorID = 84;

    @SerializedName("filterByDate")
    private String filterByDate = "2016­03­18";

    @SerializedName("AddressID")
    private int AddressID = 269;

    public int getDoctorID() {
        return DoctorID;
    }

    public void setDoctorID(int doctorID) {
        DoctorID = doctorID;
    }

    public String getFilterByDate() {
        return filterByDate;
    }

    public void setFilterByDate(String filterByDate) {
        this.filterByDate = filterByDate;
    }

    public int getAddressID() {
        return AddressID;
    }

    public void setAddressID(int addressID) {
        AddressID = addressID;
    }
}
