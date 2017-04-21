package model;

import rest.ApiCaller;

import javax.faces.bean.ManagedBean;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "patientList")
public class PatientList {
    private List<Patient> patients = new ArrayList<>();

    public PatientList() {
        // generateDummyData();
        switchToRestApi("http://localhost:7777/rest/items/vital_data/history");
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    private void generateDummyData() {
        final String pressureUnit = "mm Hg";
        final String heartRateUnit = "BPM";
        for (int i = 1; i <= 10; i++) {
            this.patients.add(
                    new Patient(
                            "vital_data_" + i,
                            "Patient " + i,
                            "2010-01-01_12:00",
                            randomDistributedIntAround(80),
                            randomDistributedIntAround(120),
                            randomDistributedIntAround(60),
                            pressureUnit,
                            heartRateUnit
                    )
            );

        }
    }

    public void switchToRestApi(String url){
        ApiCaller.getInstance().setURL(url);
        ApiCaller.getInstance().initPatients();
        this.patients = ApiCaller.getInstance().getPatients();
    }

    private int randomDistributedIntAround(int input) {
        return (int) ((double) input + ((double) input * (0.2 * (Math.random() - 0.5))));
    }

}
