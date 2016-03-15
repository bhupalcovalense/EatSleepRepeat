package com.hCueLite.Kiosk.DOA;

import com.google.gson.annotations.SerializedName;

/**
 * Created by User on 3/15/2016.
 */
public class DoctorEducation {


    @SerializedName("EducationName")
    private String EducationName ;

    @SerializedName("FullName")
    private String FullName ;

    @SerializedName("InstituteName")
    private String InstituteName ;

    @SerializedName("RowID")
    private int RowID ;

    public String getEducationName() {
        return EducationName;
    }

    public void setEducationName(String educationName) {
        EducationName = educationName;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getInstituteName() {
        return InstituteName;
    }

    public void setInstituteName(String instituteName) {
        InstituteName = instituteName;
    }

    public int getRowID() {
        return RowID;
    }

    public void setRowID(int rowID) {
        RowID = rowID;
    }


}
