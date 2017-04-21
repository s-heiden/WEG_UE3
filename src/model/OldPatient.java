package model;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "oldPatient")
public class OldPatient {
    private String firstName = "Susanne";
    private String lastName = "Muster";
    private String email = "meinPostfach@mail.com";
    private int svn = 1234;
    private String birthdate = "01.01.1990";
    private String gender = "w";
    private int diastolicPressure = 75;
    private int minimumDiastolicPressure = 60;
    private int maximumDiastolicPressure = 85;
    private int systolicPressure = 115;
    private int minimumSystolicPressure = 100;
    private int maximumSystolicPressure = 130;
    private int heartRate = 75;
    private String note = "Ihr Kommentar";

    public String submit() {
        return "patientdata.xhtml";
    }

    public int getMinimumDiastolicPressure() {
        return minimumDiastolicPressure;
    }

    public void setMinimumDiastolicPressure(int minimumDiastolicPressure) {
        this.minimumDiastolicPressure = minimumDiastolicPressure;
    }

    public int getMaximumDiastolicPressure() {
        return maximumDiastolicPressure;
    }

    public void setMaximumDiastolicPressure(int maximumDiastolicPressure) {
        this.maximumDiastolicPressure = maximumDiastolicPressure;
    }

    public int getMinimumSystolicPressure() {
        return minimumSystolicPressure;
    }

    public void setMinimumSystolicPressure(int minimumSystolicPressure) {
        this.minimumSystolicPressure = minimumSystolicPressure;
    }

    public int getMaximumSystolicPressure() {
        return maximumSystolicPressure;
    }

    public void setMaximumSystolicPressure(int maximumSystolicPressure) {
        this.maximumSystolicPressure = maximumSystolicPressure;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSvn() {
        return svn;
    }

    public void setSvn(int svn) {
        this.svn = svn;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getDiastolicPressure() {
        return diastolicPressure;
    }

    public void setDiastolicPressure(int diastolicPressure) {
        this.diastolicPressure = diastolicPressure;
    }

    public int getSystolicPressure() {
        return systolicPressure;
    }

    public void setSystolicPressure(int systolicPressure) {
        this.systolicPressure = systolicPressure;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
