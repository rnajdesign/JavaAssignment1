public class Ex227 {
   public static void main(String[] args) {
       int rows = 8;

       for (int i = 0; i < rows; i++) {
         if (i % 2 == 0) {
            System.out.println("* * * * * * * * ");
         } else {
            System.out.println(" * * * * * * * *");
         }
       }
   }
}