public class Date {
    // Instance variables
    private int month;
    private int day;
    private int year;

    // Constructor (assumes input is valid)
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Setters
    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Getters
    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getYear() {
        return year;
    }

    // Method to display date in MM/DD/YYYY format
    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }
}
