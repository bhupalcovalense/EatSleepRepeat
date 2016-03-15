package com.hCueLite.Kiosk.DOA;

import com.google.gson.annotations.SerializedName;

/**
 * Created by User on 3/15/2016.
 */
public class DoctorSetting {

    @SerializedName("prescriptionHDRHeigth")
    private String prescriptionHDRHeigth ;

    @SerializedName("printerPageSize")
    private String printerPageSize ;

    @SerializedName("sendPrescriptionMsg")
    private String sendPrescriptionMsg ;

    public String getPrescriptionHDRHeigth() {
        return prescriptionHDRHeigth;
    }

    public void setPrescriptionHDRHeigth(String prescriptionHDRHeigth) {
        this.prescriptionHDRHeigth = prescriptionHDRHeigth;
    }

    public String getPrinterPageSize() {
        return printerPageSize;
    }

    public void setPrinterPageSize(String printerPageSize) {
        this.printerPageSize = printerPageSize;
    }

    public String getSendPrescriptionMsg() {
        return sendPrescriptionMsg;
    }

    public void setSendPrescriptionMsg(String sendPrescriptionMsg) {
        this.sendPrescriptionMsg = sendPrescriptionMsg;
    }
}
