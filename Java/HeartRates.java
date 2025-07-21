import java.time.LocalDate;
import java.time.Period;

public class HeartRates {
    // Instance variables
    private String firstName;
    private String lastName;
    private int birthDay;
    private int birthMonth;
    private int birthYear;

    // Constructor
    public HeartRates(String firstName, String lastName, int birthDay, int birthMonth, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
    }

    // Getters and Setters
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public int getBirthDay() { return birthDay; }
    public void setBirthDay(int birthDay) { this.birthDay = birthDay; }

    public int getBirthMonth() { return birthMonth; }
    public void setBirthMonth(int birthMonth) { this.birthMonth = birthMonth; }

    public int getBirthYear() { return birthYear; }
    public void setBirthYear(int birthYear) { this.birthYear = birthYear; }

    // Method to calculate age
    public int getAge() {
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        return Period.between(birthDate, today).getYears();
    }

    // Method to calculate max heart rate
    public int getMaxHeartRate() {
        return 220 - getAge();
    }

    // Method to calculate target heart rate range (50% to 85% of max)
    public String getTargetHeartRateRange() {
        int max = getMaxHeartRate();
        double lower = max * 0.50;
        double upper = max * 0.85;
        return String.format("%.0f - %.0f bpm", lower, upper);
    }
}
