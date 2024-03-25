import java.util.Date;

public class HealthVitals {
    private int vitalID;
    private Date dateOfMeasurement;
    private float height;
    private float weight;
    private String bloodPressure;
    private int pulseRate;

    // Constructor
    public HealthVitals(int vitalID, Date dateOfMeasurement, float height, float weight, String bloodPressure, int pulseRate) {
        this.vitalID = vitalID;
        this.dateOfMeasurement = dateOfMeasurement;
        this.height = height;
        this.weight = weight;
        this.bloodPressure = bloodPressure;
        this.pulseRate = pulseRate;
    }

    // Getters and Setters
    public int getVitalID() {
        return vitalID;
    }
    public void setVitalID(int vitalID) {
        this.vitalID = vitalID;
    }
    public Date getDateOfMeasurement() {
        return dateOfMeasurement;
    }
    public void setDateOfMeasurement(Date dateOfMeasurement) {
        this.dateOfMeasurement = dateOfMeasurement;
    }
    public float getHeight() {
        return height;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public String getBloodPressure() {
        return bloodPressure;
    }
    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }
    @Override
}
