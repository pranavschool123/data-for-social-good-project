import java.util.Scanner;
public class PatientTracker {
    private Patient[] patients;

    // Constructor initializes patient data and department data from .txt files
    public PatientTracker(String departmentsFile, String namesFile) {
        // Load departments from departments.txt
        String[] departments = loadFile(departmentsFile);

        // Load patient names from patient_names.txt and initialize patients
        String[] patientNames = loadFile(namesFile);
        patients = new Patient[patientNames.length];
        
        // Assign conditions and departments to each patient
        for (int i = 0; i < patientNames.length; i++) {
            String condition = getRandomCondition();
            String department = departments[i % departments.length];
            patients[i] = new Patient(patientNames[i], condition, department);
        }
    }

    // Load departments from a file
    public String[] loadFile(String fileName) {
        String[] tempArray = FileReader.toStringArray(fileName);
        return tempArray;
    }


    // Randomly selects a condition
    public String getRandomCondition() {
        String[] conditions = {"stable", "critical", "under observation", "recovery"};
        return conditions[(int) (Math.random() * conditions.length)];
    }

    // Move a patient to a new department based on case-insensitive name matching
    public void movePatient(String partialName, String newDepartment) {
        boolean found = false;
        String lowercasePartialName = partialName.toLowerCase();

        for (Patient patient : patients) {
            // Check each patient name for a case-insensitive match
            if (patient.getName().toLowerCase().contains(lowercasePartialName)) {
                patient.setDepartment(newDepartment);
                System.out.println(patient.getName() + " moved to " + newDepartment + " at " + patient.getLastMoved());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Patient not found.");
        }
    }

    // Display all patients' information
    public String toString() {
        String info = "Patient Tracker Summary:\n";
        for (Patient patient : patients) {
            info += patient.toString() + "\n";
        }
        return info;
    }

}
