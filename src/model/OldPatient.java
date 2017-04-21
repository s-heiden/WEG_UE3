package model;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "oldPatient")
public class OldPatient {
    private String oldFirstName = "Susanne";
    private String oldLastName = "Muster";
    private String oldEmail = "meinPostfach@mail.com";
    private int oldSVN = 1234;
    private String oldBirthdate = "01.01.1990";
    private String oldGender = "w";
    private int oldDiastolicPressure = 75;
    private int oldMinimumDiastolicPressure = 60;
    private int oldMaximumDiastolicPressure = 85;
    private int oldSystolicPressure = 115;
    private int oldMinimumSystolicPressure = 100;
    private int oldMaximumSystolicPressure = 130;
    private int oldHeartRate = 75;
    private String oldNote = "Ihr Kommentar";

    public String submit() {
        return "patientdata.xhtml";
    }

    public int getOldMinimumDiastolicPressure() {
        return oldMinimumDiastolicPressure;
    }

    public void setOldMinimumDiastolicPressure(int oldMinimumDiastolicPressure) {
        this.oldMinimumDiastolicPressure = oldMinimumDiastolicPressure;
    }

    public int getOldMaximumDiastolicPressure() {
        return oldMaximumDiastolicPressure;
    }

    public void setOldMaximumDiastolicPressure(int oldMaximumDiastolicPressure) {
        this.oldMaximumDiastolicPressure = oldMaximumDiastolicPressure;
    }

    public int getOldMinimumSystolicPressure() {
        return oldMinimumSystolicPressure;
    }

    public void setOldMinimumSystolicPressure(int oldMinimumSystolicPressure) {
        this.oldMinimumSystolicPressure = oldMinimumSystolicPressure;
    }

    public int getOldMaximumSystolicPressure() {
        return oldMaximumSystolicPressure;
    }

    public void setOldMaximumSystolicPressure(int oldMaximumSystolicPressure) {
        this.oldMaximumSystolicPressure = oldMaximumSystolicPressure;
    }

//    public int getOldMinimumHeartRate() {
//        return oldMinimumHeartRate;
//    }
//
//    public void setOldMinimumHeartRate(int oldMinimumHeartRate) {
//        this.oldMinimumHeartRate = oldMinimumHeartRate;
//    }
//
//    public int getOldMaximumHeartRate() {
//        return oldMaximumHeartRate;
//    }
//
//    public void setOldMaximumHeartRate(int oldMaximumHeartRate) {
//        this.oldMaximumHeartRate = oldMaximumHeartRate;
//    }

    public String getOldFirstName() {
        return oldFirstName;
    }

    public void setOldFirstName(String oldFirstName) {
        this.oldFirstName = oldFirstName;
    }

    public String getOldLastName() {
        return oldLastName;
    }

    public void setOldLastName(String oldLastName) {
        this.oldLastName = oldLastName;
    }

    public String getOldEmail() {
        return oldEmail;
    }

    public void setOldEmail(String oldEmail) {
        this.oldEmail = oldEmail;
    }

    public int getOldSVN() {
        return oldSVN;
    }

    public void setOldSVN(int oldSVN) {
        this.oldSVN = oldSVN;
    }

    public String getOldBirthdate() {
        return oldBirthdate;
    }

    public void setOldBirthdate(String oldBirthdate) {
        this.oldBirthdate = oldBirthdate;
    }

    public String getOldGender() {
        return oldGender;
    }

    public void setOldGender(String oldGender) {
        this.oldGender = oldGender;
    }

    public int getOldDiastolicPressure() {
        return oldDiastolicPressure;
    }

    public void setOldDiastolicPressure(int oldDiastolicPressure) {
        this.oldDiastolicPressure = oldDiastolicPressure;
    }

    public int getOldSystolicPressure() {
        return oldSystolicPressure;
    }

    public void setOldSystolicPressure(int oldSystolicPressure) {
        this.oldSystolicPressure = oldSystolicPressure;
    }

    public int getOldHeartRate() {
        return oldHeartRate;
    }

    public void setOldHeartRate(int oldHeartRate) {
        this.oldHeartRate = oldHeartRate;
    }

    public String getOldNote() {
        return oldNote;
    }

    public void setOldNote(String oldNote) {
        this.oldNote = oldNote;
    }
}
