package com.hCueLite.Kiosk.DOA;

import com.google.gson.annotations.SerializedName;

/**
 * Created by User on 3/15/2016.
 */
public class DoctorConsultation {

    @SerializedName("Active")
    private String Active ;

    @SerializedName("AddressConsultID")
    private int AddressConsultID ;

    @SerializedName("AddressID")
    private int AddressID ;

    @SerializedName("DayCD")
    private String DayCD ;

    @SerializedName("DoctorID")
    private int DoctorID ;

    @SerializedName("EndTime")
    private String EndTime ;

    @SerializedName("Fees")
    private int Fees ;

    @SerializedName("MinPerCase")
    private int MinPerCase ;

    @SerializedName("StartTime")
    private String StartTime ;

    public String getActive() {
        return Active;
    }

    public void setActive(String active) {
        Active = active;
    }

    public int getAddressConsultID() {
        return AddressConsultID;
    }

    public void setAddressConsultID(int addressConsultID) {
        AddressConsultID = addressConsultID;
    }

    public int getAddressID() {
        return AddressID;
    }

    public void setAddressID(int addressID) {
        AddressID = addressID;
    }

    public String getDayCD() {
        return DayCD;
    }

    public void setDayCD(String dayCD) {
        DayCD = dayCD;
    }

    public int getDoctorID() {
        return DoctorID;
    }

    public void setDoctorID(int doctorID) {
        DoctorID = doctorID;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String endTime) {
        EndTime = endTime;
    }

    public int getFees() {
        return Fees;
    }

    public void setFees(int fees) {
        Fees = fees;
    }

    public int getMinPerCase() {
        return MinPerCase;
    }

    public void setMinPerCase(int minPerCase) {
        MinPerCase = minPerCase;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String startTime) {
        StartTime = startTime;
    }
}
