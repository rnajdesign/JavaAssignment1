import java.util.Scanner;

public class MileageTracker {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int totalMiles = 0;
            int totalGallons = 0;
            
            while (true) {
                System.out.print("Enter miles driven (-1 to quit): ");
                int miles = input.nextInt();
                
                if (miles == -1) {
                    break;
                }
                
                System.out.print("Enter gallons used: ");
                int gallons = input.nextInt();
                
                if (gallons == 0) {
                    System.out.println("Gallons cannot be zero. Try again.");
                    continue;
                }
                
                double tripMPG = (double) miles / gallons;
                System.out.printf("Miles per gallon for this trip: %.2f%n", tripMPG);
                
                totalMiles += miles;
                totalGallons += gallons;
                
                double overallMPG = (double) totalMiles / totalGallons;
                System.out.printf("Total miles per gallon so far: %.2f%n%n", overallMPG);
            }
            
            if (totalGallons > 0) {
                double finalMPG = (double) totalMiles / totalGallons;
                System.out.printf("Overall miles per gallon for all trips: %.2f%n", finalMPG);
            } else {
                System.out.println("No valid data entered.");
            }
        }
    }
}
