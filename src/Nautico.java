import java.util.Scanner;

public class Nautico {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String fName = scanner.next();

        System.out.print("Enter your last name: ");
        String lName = scanner.next();
               

        // VALIDATES AGE - FORCES TO INPUT INTEGER
        int age;
        while (true) {
            try {
                System.out.print("Enter your Age: ");
                age = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid age as a number (integer).");
                scanner.next(); // Consume the invalid input to prevent an infinite loop
            }
        }

        System.out.print("Enter your email address: ");
        String eMail = scanner.next();

   

        // Create the 'IndividualStudRec' object from the 'StudRecClass' class
        StudRecClass individualStudRec = new StudRecClass(fName, lName, age, eMail);

        System.out.println("Here is your Student Record:");
        System.out.println("----------------------------");
        System.out.println();
        System.out.println(individualStudRec);
        scanner.close();
    }
}

