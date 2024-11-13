import java.util.Date;

public class Patient {
    private String name;
    private String condition;
    private String department;
    private String lastMoved;

    // Constructor for Patient
    public Patient(String name, String condition, String department) {
        this.name = name;
        this.condition = condition;
        this.department = department;
        this.lastMoved = new Date().toString(); // Set the initial timestamp
    }

      public Patient() {
        this.name = "";
        this.condition = "";
        this.department = "";
        this.lastMoved = ""; 
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCondition() {
        return condition;
    }

    public String getDepartment() {
        return department;
    }

    public String getLastMoved() {
        return lastMoved;
    }

    // Setter for department, updates the lastMoved time
    public void setDepartment(String department) {
        this.department = department;
        this.lastMoved = new Date().toString(); // Update the timestamp whenever the department changes
    }

    // toString() to display patient details
    public String toString() {
        return "Patient: " + name +
               ", Condition: " + condition +
               ", Department: " + department +
               ", Last Moved: " + lastMoved;
    }
}
