public class DateTest {
    public static void main(String[] args) {
        // Create a Date object
        Date myDate = new Date(7, 17, 2025);

        // Display the original date
        System.out.print("Initial date: ");
        myDate.displayDate();

        // Update the date using setters
        myDate.setMonth(12);
        myDate.setDay(25);
        myDate.setYear(2025);

        // Display the updated date
        System.out.print("Updated date: ");
        myDate.displayDate();
    }
}
