import java.util.Scanner;

public class Ex234 {
   public static void main(String[] args) {
       try (Scanner input = new Scanner(System.in)) {

           System.out.print("Current world population: ");
           double currentPop = input.nextDouble();

           System.out.print("Anual growth rate: ");
           double growthRate = input.nextDouble();

           System.out.println("\nEstimated world population after each year: ");
           for (int year = 1; year <= 5; year++) {
             currentPop = currentPop * (1 + growthRate / 100);
             System.out.printf("After %d year%s: %.2f billion%n", year, year > 1 ? "s" : "", currentPop);
           }

       }
   }
}