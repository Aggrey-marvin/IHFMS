public class GeneralInformation {
    private int infoID;
    private String medicalHistory;
    private String allergies;
    private String medications;

    // Constructor
    public GeneralInformation(int infoID, String medicalHistory, String allergies, String medications) {
        this.infoID = infoID;
        this.medicalHistory = medicalHistory;
        this.allergies = allergies;
        this.medications = medications;
    }

    // Getters and Setters
    public int getInfoID() {
        return infoID;
    }

    public void setInfoID(int infoID) {
        this.infoID = infoID;
    }

    public String getMedicalHistory() {
        return medicalHistory;
    }
    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public String getAllergies() {
        return allergies;
    }
    public void setAllergies(String allergies) {
        this.allergies = allergies;
    }
    
    @Override
    
}
