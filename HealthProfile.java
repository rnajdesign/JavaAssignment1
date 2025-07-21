import java.time.LocalDate;
import java.time.Period;

public class HealthProfile {
    // Attributes
    private String firstName;
    private String lastName;
    private String gender;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private double heightInInches;
    private double weightInPounds;

    // Constructor
    public HealthProfile(String firstName, String lastName, String gender,
                         int birthMonth, int birthDay, int birthYear,
                         double heightInInches, double weightInPounds) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
        this.heightInInches = heightInInches;
        this.weightInPounds = weightInPounds;
    }

    // Getters and Setters
    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public int getBirthDay() { return birthDay; }
    public void setBirthDay(int birthDay) { this.birthDay = birthDay; }

    public int getBirthMonth() { return birthMonth; }
    public void setBirthMonth(int birthMonth) { this.birthMonth = birthMonth; }

    public int getBirthYear() { return birthYear; }
    public void setBirthYear(int birthYear) { this.birthYear = birthYear; }

    public double getHeightInInches() { return heightInInches; }
    public void setHeightInInches(double heightInInches) { this.heightInInches = heightInInches; }

    public double getWeightInPounds() { return weightInPounds; }
    public void setWeightInPounds(double weightInPounds) { this.weightInPounds = weightInPounds; }

    // Age calculation
    public int getAge() {
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    // BMI calculation
    public double getBMI() {
        return (weightInPounds * 703) / (heightInInches * heightInInches);
    }

    // Max heart rate
    public int getMaxHeartRate() {
        return 220 - getAge();
    }

    // Target heart rate range (50-85% of max heart rate)
    public String getTargetHeartRateRange() {
        int max = getMaxHeartRate();
        double lower = max * 0.50;
        double upper = max * 0.85;
        return String.format("%.1f - %.1f", lower, upper);
    }

    // BMI Categories chart
    public static String getBMIChart() {
        return """
            BMI VALUES
            Underweight: less than 18.5
            Normal:      between 18.5 and 24.9
            Overweight:  between 25 and 29.9
            Obese:       30 or greater
        """;
    }
}
