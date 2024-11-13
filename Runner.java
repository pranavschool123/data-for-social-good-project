import java.util.Scanner;

// Main method for user interaction
public class Runner {   
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Initializing Patient Tracker with 50 patients...");
        PatientTracker tracker = new PatientTracker("departments.txt", "patient_names.txt");

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Move Patient");
            System.out.println("2. Show All Patient Data");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice;
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 3.");
                scanner.next(); // Clear invalid input
                continue;
            }

            if(choice == 1){
              System.out.print("Enter patient name to move: ");
              String name = scanner.nextLine();
              System.out.print("Enter new department: ");
              String newDept = scanner.nextLine();
              tracker.movePatient(name, newDept);
            }
            else if (choice == 2){
              System.out.println(tracker.toString());
            }
            else if (choice == 3){
               System.out.println("Exiting...");
              scanner.close();
              break;
            }               
              else{
                System.out.println("Invalid choice. Please try again.");
              }
            }
        }
}