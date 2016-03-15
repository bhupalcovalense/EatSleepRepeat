package com.hCueLite.Kiosk.Model;

import com.google.gson.annotations.SerializedName;
import com.hCueLite.Kiosk.DOA.Doctor;
import com.hCueLite.Kiosk.DOA.DoctorAchievements;
import com.hCueLite.Kiosk.DOA.DoctorAddress;
import com.hCueLite.Kiosk.DOA.DoctorCareerImages;
import com.hCueLite.Kiosk.DOA.DoctorConsultation;
import com.hCueLite.Kiosk.DOA.DoctorEducation;
import com.hCueLite.Kiosk.DOA.DoctorEmail;
import com.hCueLite.Kiosk.DOA.DoctorPhone;
import com.hCueLite.Kiosk.DOA.DoctorPublishing;
import com.hCueLite.Kiosk.DOA.DoctorSetting;

import java.util.ArrayList;

/**

 * Created by User on 3/15/2016.
 */
public class AvailableAppointmentsResponse {

    @SerializedName("doctor")
    private ArrayList<Doctor> arrdoctors ;
    @SerializedName("doctorPhone")
    private ArrayList<DoctorPhone> arrdoctorPhones ;
    @SerializedName("doctorAddress")
    private ArrayList<DoctorAddress> arrdoctorAddress ;
    @SerializedName("doctorEmail")
    private ArrayList<DoctorEmail> arrdoctorEmail ;
    @SerializedName("doctorConsultation")
    private ArrayList<DoctorConsultation> arrdoctorConsultation;
    @SerializedName("doctorEducation")
    private ArrayList<DoctorEducation> arrdoctorEducation;
    @SerializedName("DoctorPublishing")
    private ArrayList<DoctorPublishing> arrdoctorPublishing;
    @SerializedName("DoctorSetting")
    private DoctorSetting doctorSettings;
    @SerializedName("DoctorAchievements")
    private ArrayList<DoctorAchievements> arrdoctorAchievements;
    @SerializedName("CareerImages")
    private DoctorCareerImages doctorCareerImages;

    public ArrayList<Doctor> getArrdoctors() {
        return arrdoctors;
    }

    public void setArrdoctors(ArrayList<Doctor> arrdoctors) {
        this.arrdoctors = arrdoctors;
    }

    public ArrayList<DoctorPhone> getArrdoctorPhones() {
        return arrdoctorPhones;
    }

    public void setArrdoctorPhones(ArrayList<DoctorPhone> arrdoctorPhones) {
        this.arrdoctorPhones = arrdoctorPhones;
    }

    public ArrayList<DoctorAddress> getArrdoctorAddress() {
        return arrdoctorAddress;
    }

    public void setArrdoctorAddress(ArrayList<DoctorAddress> arrdoctorAddress) {
        this.arrdoctorAddress = arrdoctorAddress;
    }

    public ArrayList<DoctorEmail> getArrdoctorEmail() {
        return arrdoctorEmail;
    }

    public void setArrdoctorEmail(ArrayList<DoctorEmail> arrdoctorEmail) {
        this.arrdoctorEmail = arrdoctorEmail;
    }

    public ArrayList<DoctorConsultation> getArrdoctorConsultation() {
        return arrdoctorConsultation;
    }

    public void setArrdoctorConsultation(ArrayList<DoctorConsultation> arrdoctorConsultation) {
        this.arrdoctorConsultation = arrdoctorConsultation;
    }

    public ArrayList<DoctorEducation> getArrdoctorEducation() {
        return arrdoctorEducation;
    }

    public void setArrdoctorEducation(ArrayList<DoctorEducation> arrdoctorEducation) {
        this.arrdoctorEducation = arrdoctorEducation;
    }

    public ArrayList<DoctorPublishing> getArrdoctorPublishing() {
        return arrdoctorPublishing;
    }

    public void setArrdoctorPublishing(ArrayList<DoctorPublishing> arrdoctorPublishing) {
        this.arrdoctorPublishing = arrdoctorPublishing;
    }

    public ArrayList<DoctorAchievements> getArrdoctorAchievements() {
        return arrdoctorAchievements;
    }

    public void setArrdoctorAchievements(ArrayList<DoctorAchievements> arrdoctorAchievements) {
        this.arrdoctorAchievements = arrdoctorAchievements;
    }


    public DoctorCareerImages getDoctorCareerImages() {
        return doctorCareerImages;
    }

    public void setDoctorCareerImages(DoctorCareerImages doctorCareerImages) {
        this.doctorCareerImages = doctorCareerImages;
    }

    public DoctorSetting getDoctorSettings() {
        return doctorSettings;
    }

    public void setDoctorSettings(DoctorSetting doctorSettings) {
        this.doctorSettings = doctorSettings;
    }
}
