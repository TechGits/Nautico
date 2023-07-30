import java.util.Random;

public class StudRecClass {
    // First, we'll add our attributes - the student record's individual components:

    private String fName;
    private String lName;
    private int age;
    private String eMail;
    private int studID;
    private char fNameInit;
    private char lNameInit;


    private static final int MIN_NUMBER = 200000; // Minimum student number
    private static final int MAX_NUMBER = 299999; // Maximum student number
    public static final Random random = new Random();

    // This is our constructor (function)
    public StudRecClass(String fName, String lName, int age, String eMail) {
    
   // Remember, parameters are individual ingredients. Here, we pass the required ingredients (parameters) to provide data or information to the code (chef) within the function so that the function can cooked.
    
   // The "this" keyword is used to refer to the current instance of the class,and it helps differentiate between the instance variable and the parameter with the same name.

        this.fName = fName;
        this.lName = lName;
        this.eMail = eMail;
        this.age = age;

        this.fNameInit = fName.charAt(0); //These last two form part 
        this.lNameInit = lName.charAt(0);// of the student number

        // Method - Randomizes and makes a student number out of the info
        this.studID = random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
    }
   


    // New Thing I've learned. Override the toString() method to provide a custom representation.
    @Override
    public String toString() {
        return "\nStudent Number: " + studID + Character.toUpperCase(fNameInit) + Character.toUpperCase(lNameInit) +
               "\nFirst Name: " + fName + 
               "\nLast Name: " + lName + 
               "\nAge: " + age +
               "\nEmail: " + eMail;
            
               
    }
}

