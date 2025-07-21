import java.util.Scanner;


public class Ex224 {
   public static void main(String[] args) {
       try (Scanner input = new Scanner(System.in)) {
           System.out.println("Enter five integers:");
           
           int number = input.nextInt();
           int largest = number;
           int smallest = number;
           
           for (int i = 0; i < 4; i++) {
               number = input.nextInt();
               
               if (number > largest) {
                   largest = number;
               }
               if (number < smallest) {
                   smallest = number;
               }
               
           }
           System.out.println("Largest: " + largest);
           System.out.println("Smallest: " + smallest);
       }
   }
}