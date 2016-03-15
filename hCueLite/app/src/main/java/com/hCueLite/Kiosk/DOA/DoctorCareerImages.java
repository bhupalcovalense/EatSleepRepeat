package com.hCueLite.Kiosk.DOA;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by User on 3/15/2016.
 */
public class DoctorCareerImages {

    @SerializedName("Images")
    public LinkedHashMap<String,String> Images;


    @SerializedName("URL")
    public LinkedHashMap<String,String> URLs;

    public LinkedHashMap<String, String> getImages() {
        return Images;
    }

    public void setImages(LinkedHashMap<String, String> images) {
        Images = images;
    }

    public LinkedHashMap<String, String> getURLs() {
        return URLs;
    }

    public void setURLs(LinkedHashMap<String, String> URLs) {
        this.URLs = URLs;
    }
}
