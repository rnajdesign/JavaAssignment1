public class Account {
    private String name;    // instance variable
    private double balance; // instance variable

    // ✅ Constructor with parameters
    public Account(String name, double balance) {
        this.name = name;

        // Validate and set balance
        if (balance > 0.0) {
            this.balance = balance;
        }
    }

    // Method to deposit money
    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) {
            balance += depositAmount;
        }
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }
}
