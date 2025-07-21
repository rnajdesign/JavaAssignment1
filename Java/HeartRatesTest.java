import java.util.Scanner;

public class HeartRatesTest {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            // Prompt user for personal info
            System.out.print("Enter first name: ");
            String firstName = input.nextLine();

            System.out.print("Enter last name: ");
            String lastName = input.nextLine();

            System.out.print("Enter birth day (1-31): ");
            int day = input.nextInt();

            System.out.print("Enter birth month (1-12): ");
            int month = input.nextInt();

            System.out.print("Enter birth year (e.g., 1990): ");
            int year = input.nextInt();

            // Create HeartRates object
            HeartRates person = new HeartRates(firstName, lastName, day, month, year);

            // Output all information
            System.out.println("\n--- Heart Rate Report ---");
            System.out.printf("Name: %s %s%n", person.getFirstName(), person.getLastName());
            System.out.printf("Date of Birth: %02d/%02d/%d%n", person.getBirthDay(), person.getBirthMonth(), person.getBirthYear());
            System.out.printf("Age: %d years%n", person.getAge());
            System.out.printf("Max Heart Rate: %d bpm%n", person.getMaxHeartRate());
            System.out.printf("Target Heart Rate Range: %s%n", person.getTargetHeartRateRange());
        }
    }
}
