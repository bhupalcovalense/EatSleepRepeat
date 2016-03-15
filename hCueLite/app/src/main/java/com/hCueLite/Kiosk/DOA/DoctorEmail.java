package com.hCueLite.Kiosk.DOA;

import com.google.gson.annotations.SerializedName;

/**
 * Created by User on 3/15/2016.
 */
public class DoctorEmail {

    @SerializedName("CrtUSR")
    private int CrtUSR ;

    @SerializedName("CrtUSRType")
    private String CrtUSRType ;

    @SerializedName("EmailID")
    private String EmailID ;

    @SerializedName("EmailIDType")
    private String EmailIDType ;

    @SerializedName("PrimaryIND")
    private String PrimaryIND ;

    @SerializedName("UpdtUSR")
    private int UpdtUSR ;

    @SerializedName("UpdtUSRType")
    private String UpdtUSRType ;

    public int getCrtUSR() {
        return CrtUSR;
    }

    public void setCrtUSR(int crtUSR) {
        CrtUSR = crtUSR;
    }

    public String getCrtUSRType() {
        return CrtUSRType;
    }

    public void setCrtUSRType(String crtUSRType) {
        CrtUSRType = crtUSRType;
    }

    public String getEmailID() {
        return EmailID;
    }

    public void setEmailID(String emailID) {
        EmailID = emailID;
    }

    public String getEmailIDType() {
        return EmailIDType;
    }

    public void setEmailIDType(String emailIDType) {
        EmailIDType = emailIDType;
    }

    public String getPrimaryIND() {
        return PrimaryIND;
    }

    public void setPrimaryIND(String primaryIND) {
        PrimaryIND = primaryIND;
    }

    public int getUpdtUSR() {
        return UpdtUSR;
    }

    public void setUpdtUSR(int updtUSR) {
        UpdtUSR = updtUSR;
    }

    public String getUpdtUSRType() {
        return UpdtUSRType;
    }

    public void setUpdtUSRType(String updtUSRType) {
        UpdtUSRType = updtUSRType;
    }
}
