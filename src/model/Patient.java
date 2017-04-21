package model;

import java.time.LocalDateTime;

public class Patient {
    private String id = "vital_data";
    private String name = "Vital Data";
    private String timestamp = "";
    private int diastolicPressure = 80;
    private int systolicPressure = 120;
    private int heartRate = 60;
    private String pressureUnit = "mm Hg";
    private String heartRateUnit = "BPM";

    public Patient(String id, String name, String timestamp, int diastolicPressure, int systolicPressure,
                   int heartRate, String pressureUnit, String heartRateUnit) {
        this.id = id;
        this.name = name;
        this.timestamp = timestamp;
        this.diastolicPressure = diastolicPressure;
        this.systolicPressure = systolicPressure;
        this.heartRate = heartRate;
        this.pressureUnit = pressureUnit;
        this.heartRateUnit = heartRateUnit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
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

    public String getPressureUnit() {
        return pressureUnit;
    }

    public void setPressureUnit(String pressureUnit) {
        this.pressureUnit = pressureUnit;
    }

    public String getHeartRateUnit() {
        return heartRateUnit;
    }

    public void setHeartRateUnit(String heartRateUnit) {
        this.heartRateUnit = heartRateUnit;
    }

    public String submit() {
        return "patientdata.xhtml";
    }

}
