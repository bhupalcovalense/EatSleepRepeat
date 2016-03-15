package com.hCueLite.Kiosk.DOA;

import com.google.gson.annotations.SerializedName;

/**
 * Created by User on 3/15/2016.
 */
public class DoctorPhone {

    @SerializedName("PhAreaCD")
    private int PhAreaCD ;

    @SerializedName("PhCntryCD")
    private int PhCntryCD ;

    @SerializedName("PhNumber")
    private Number PhNumber ;

    @SerializedName("PhStateCD")
    private int PhStateCD ;

    @SerializedName("PhType")
    private char PhType ;

    @SerializedName("PrimaryIND")
    private char PrimaryIND ;

    public int getPhAreaCD() {
        return PhAreaCD;
    }

    public void setPhAreaCD(int phAreaCD) {
        PhAreaCD = phAreaCD;
    }

    public int getPhCntryCD() {
        return PhCntryCD;
    }

    public void setPhCntryCD(int phCntryCD) {
        PhCntryCD = phCntryCD;
    }

    public Number getPhNumber() {
        return PhNumber;
    }

    public void setPhNumber(Number phNumber) {
        PhNumber = phNumber;
    }

    public int getPhStateCD() {
        return PhStateCD;
    }

    public void setPhStateCD(int phStateCD) {
        PhStateCD = phStateCD;
    }

    public char getPhType() {
        return PhType;
    }

    public void setPhType(char phType) {
        PhType = phType;
    }

    public char getPrimaryIND() {
        return PrimaryIND;
    }

    public void setPrimaryIND(char primaryIND) {
        PrimaryIND = primaryIND;
    }
}
