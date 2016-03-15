package com.hCueLite.Kiosk.DOA;

import com.google.gson.annotations.SerializedName;

/**
 * Created by User on 3/15/2016.
 */
public class DoctorPublishing {

    @SerializedName("Indicator")
    private String Indicator ;

    @SerializedName("Name")
    private String Name ;

    @SerializedName("Year")
    private String Year ;

    @SerializedName("RowID")
    private int RowID ;

    public String getIndicator() {
        return Indicator;
    }

    public void setIndicator(String indicator) {
        Indicator = indicator;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public int getRowID() {
        return RowID;
    }

    public void setRowID(int rowID) {
        RowID = rowID;
    }
}
