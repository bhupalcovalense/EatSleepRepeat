package com.hCueLite.Kiosk.DOA;

import com.google.gson.annotations.SerializedName;

/**
 * Created by User on 3/15/2016.
 */
public class DoctorAddress {

    @SerializedName("Active")
    private String Active ;

    @SerializedName("Address1")
    private String Address1 ;

    @SerializedName("Address2")
    private String Address2 ;

    @SerializedName("AddressID")
    private int AddressID ;

    @SerializedName("AddressType")
    private String AddressType ;

    @SerializedName("CityTown")
    private String CityTown ;

    @SerializedName("ClinicName")
    private String ClinicName ;

    @SerializedName("Country")
    private String Country ;

    @SerializedName("DistrictRegion")
    private String DistrictRegion ;

    @SerializedName("Location")
    private String Location ;

    @SerializedName("PinCode")
    private int PinCode ;

    @SerializedName("State")
    private String State ;

    @SerializedName("Street")
    private String Street ;

    @SerializedName("ExtDetails")
    private ExtDetails extDetails;

    public String getActive() {
        return Active;
    }

    public void setActive(String active) {
        Active = active;
    }

    public String getAddress1() {
        return Address1;
    }

    public void setAddress1(String address1) {
        Address1 = address1;
    }

    public String getAddress2() {
        return Address2;
    }

    public void setAddress2(String address2) {
        Address2 = address2;
    }

    public int getAddressID() {
        return AddressID;
    }

    public void setAddressID(int addressID) {
        AddressID = addressID;
    }

    public String getAddressType() {
        return AddressType;
    }

    public void setAddressType(String addressType) {
        AddressType = addressType;
    }

    public String getCityTown() {
        return CityTown;
    }

    public void setCityTown(String cityTown) {
        CityTown = cityTown;
    }

    public String getClinicName() {
        return ClinicName;
    }

    public void setClinicName(String clinicName) {
        ClinicName = clinicName;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getDistrictRegion() {
        return DistrictRegion;
    }

    public void setDistrictRegion(String districtRegion) {
        DistrictRegion = districtRegion;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public int getPinCode() {
        return PinCode;
    }

    public void setPinCode(int pinCode) {
        PinCode = pinCode;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public ExtDetails getExtDetails() {
        return extDetails;
    }

    public void setExtDetails(ExtDetails extDetails) {
        this.extDetails = extDetails;
    }

    public class ExtDetails
    {
        @SerializedName("Latitude")
        private String Latitude ;

        @SerializedName("Longitude")
        private String Longitude ;

        @SerializedName("PrimaryIND")
        private String PrimaryIND ;

        public String getLatitude() {
            return Latitude;
        }

        public void setLatitude(String latitude) {
            Latitude = latitude;
        }

        public String getLongitude() {
            return Longitude;
        }

        public void setLongitude(String longitude) {
            Longitude = longitude;
        }

        public String getPrimaryIND() {
            return PrimaryIND;
        }

        public void setPrimaryIND(String primaryIND) {
            PrimaryIND = primaryIND;
        }
    }
}

