package com.hCueLite.Kiosk.DOA;

import com.google.gson.annotations.SerializedName;

import java.util.LinkedHashMap;

/**
 * Created by User on 3/15/2016.
 */
public class Doctor {

    @SerializedName("FirstName")
    private String FirstName ;

    @SerializedName("LastName")
    private String LastName ;

    @SerializedName("FullName")
    private String FullName ;

    @SerializedName("DoctorID")
    private int DoctorID ;

    @SerializedName("Gender")
    private String Gender ;

    @SerializedName("DOB")
    private long DOB ;

    @SerializedName("Exp")
    private int Exp ;

    @SerializedName("DoctorLoginID")
    private String DoctorLoginID ;

    @SerializedName("TermsAccepted")
    private String TermsAccepted ;

    @SerializedName("ProfileImage")
    private String ProfileImage ;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public int getDoctorID() {
        return DoctorID;
    }

    public void setDoctorID(int doctorID) {
        DoctorID = doctorID;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public long getDOB() {
        return DOB;
    }

    public void setDOB(long DOB) {
        this.DOB = DOB;
    }

    public int getExp() {
        return Exp;
    }

    public void setExp(int exp) {
        Exp = exp;
    }

    public String getDoctorLoginID() {
        return DoctorLoginID;
    }

    public void setDoctorLoginID(String doctorLoginID) {
        DoctorLoginID = doctorLoginID;
    }

    public String getTermsAccepted() {
        return TermsAccepted;
    }

    public void setTermsAccepted(String termsAccepted) {
        TermsAccepted = termsAccepted;
    }

    public String getProfileImage() {
        return ProfileImage;
    }

    public void setProfileImage(String profileImage) {
        ProfileImage = profileImage;
    }


    @SerializedName("SpecialityCD")
    public LinkedHashMap<String,String> SpecialityCD;
    @SerializedName("MemberID")
    public LinkedHashMap<String,String> MemberID;
    @SerializedName("Qualification")
    public LinkedHashMap<String,String> Qualification;
    @SerializedName("About")
    public LinkedHashMap<String,String> About;
    @SerializedName("Awards")
    public LinkedHashMap<String,String> Awards;
    @SerializedName("Membership")
    public LinkedHashMap<String,String> Membership;
    @SerializedName("Services")
    public LinkedHashMap<String,String> Services;
}
