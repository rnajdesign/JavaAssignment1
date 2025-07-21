import java.util.Scanner;

public class HealthProfileTest {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
         // Prompt user input
           System.out.print("Enter first name: ");
           String firstName = input.nextLine();

           System.out.print("Enter last name: ");
           String lastName = input.nextLine();

           System.out.print("Enter gender: ");
           String gender = input.nextLine();

           System.out.print("Enter birth month (1-12): ");
           int month = input.nextInt();

           System.out.print("Enter birth day: ");
           int day = input.nextInt();

           System.out.print("Enter birth year: ");
           int year = input.nextInt();

           System.out.print("Enter height in inches: ");
           double height = input.nextDouble();

           System.out.print("Enter weight in pounds: ");
           double weight = input.nextDouble();

           // Create HealthProfile object
           HealthProfile person = new HealthProfile(firstName, lastName, gender, month, day, year, height, weight);

           // Output
           System.out.println("\n--- Health Profile Summary ---");
           System.out.printf("Name: %s %s\n", person.getFirstName(), person.getLastName());
           System.out.printf("Gender: %s\n", person.getGender());
           System.out.printf("Date of Birth: %02d/%02d/%d\n", person.getBirthMonth(), person.getBirthDay(), person.getBirthYear());
           System.out.printf("Height: %.1f inches\n", person.getHeightInInches());
           System.out.printf("Weight: %.1f pounds\n", person.getWeightInPounds());

           System.out.printf("Age: %d years\n", person.getAge());
           System.out.printf("BMI: %.2f\n", person.getBMI());
           System.out.printf("Max Heart Rate: %d bpm\n", person.getMaxHeartRate());
           System.out.printf("Target Heart Rate Range: %s bpm\n", person.getTargetHeartRateRange());
        }

        System.out.println("\n" + HealthProfile.getBMIChart());
    }
}
