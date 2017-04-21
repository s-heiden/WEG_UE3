package rest;

import helpers.DateHelper;
import model.Patient;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.json.Json;
import javax.json.JsonReader;
import javax.json.JsonArray;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

public class ApiCaller {
    private static String url;
    private static ApiCaller instance = new ApiCaller();

    private ApiCaller() {
    }

    public static ApiCaller getInstance() {
        return instance;
    }

    public void setURL(String url) {
        this.url = url;
    }


    public List<Patient> getPatients() {
        return patients;
    }

    private List<Patient> patients = new ArrayList<>();


    public String createLog() {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(url);
        String jsonResponse = target.request(MediaType.APPLICATION_JSON).get(String.class);
        JsonReader reader = Json.createReader(new StringReader(jsonResponse));
        JsonArray jsonArray = reader.readArray();
        String output = "";
        for (int i = 0; i < jsonArray.size(); i++) {
            output += (
                    "# ID: " + jsonArray.getJsonObject(i).getString("id") + ", " +
                            "Name: " + jsonArray.getJsonObject(i).getString("name") + ", " +
                            "Timestamp: " + jsonArray.getJsonObject(i).getString("timestamp") + ", " +
                            "DIA: " + jsonArray.getJsonObject(i).getString("diastolic_pressure") + ", " +
                            "SYS: " + jsonArray.getJsonObject(i).getString("systolic_pressure") + ", " +
                            "HR: " + jsonArray.getJsonObject(i).getString("heart_rate") + ", " +
                            "PU: " + jsonArray.getJsonObject(i).getString("pressure_unit") + ", " +
                            "HRU: " + jsonArray.getJsonObject(i).getString("heart_rate_unit") + "\n"
            );
        }
        return output;
    }

    public void initPatients() {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target(url);
        String jsonResponse = target.request(MediaType.APPLICATION_JSON).get(String.class);
        JsonReader reader = Json.createReader(new StringReader(jsonResponse));
        JsonArray jsonArray = reader.readArray();

        for (int i = 0; i < jsonArray.size(); i++) {
            Patient patient = new Patient(
                    jsonArray.getJsonObject(i).getString("id"),
                    jsonArray.getJsonObject(i).getString("name"),
                    jsonArray.getJsonObject(i).getString("timestamp"),
                    Integer.parseInt(jsonArray.getJsonObject(i).getString("diastolic_pressure")),
                    Integer.parseInt(jsonArray.getJsonObject(i).getString("systolic_pressure")),
                    Integer.parseInt(jsonArray.getJsonObject(i).getString("heart_rate")),
                    jsonArray.getJsonObject(i).getString("pressure_unit"),
                    jsonArray.getJsonObject(i).getString("heart_rate_unit")
            );
            this.patients.add(patient);
        }
    }


}
