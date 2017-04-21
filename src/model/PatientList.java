package model;

import javax.faces.bean.ManagedBean;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "patientList")
public class PatientList {
    private List<Patient> patients = new ArrayList<>();

    public PatientList() {
        generateDummyData();
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
                            LocalDateTime.now(),
                            randomDistributedIntAround(80),
                            randomDistributedIntAround(120),
                            randomDistributedIntAround(60),
                            pressureUnit,
                            heartRateUnit
                    )
            );

        }
    }

    private int randomDistributedIntAround(int input) {
        return (int) ((double) input + ((double) input * (0.1 * (Math.random() - 0.5))));
    }

}
