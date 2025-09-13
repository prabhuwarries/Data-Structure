package OOPsRelatedQnA;

public class EncapsulationGettersSetters {
    private String accountHolderName;
    private double balance;

    public EncapsulationGettersSetters (String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Getter for accountHolderName
    public String getAccountHolderName() {
        return accountHolderName;
    }
    // Setter for accountHolderName
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
    // Getter for balance
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
    public static void main(String[] args) {
        EncapsulationGettersSetters account = new EncapsulationGettersSetters("Prabhat Ranjan", 1500.0);

        // Accessing account details using getters
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Initial Balance: $" + account.getBalance());

        // Performing transactions
        account.deposit(500.0);
        System.out.println("Balance after deposit: $" + account.getBalance());

        account.withdraw(200.0);
        System.out.println("Balance after withdrawal: $" + account.getBalance());

        // Attempting invalid transactions
        account.withdraw(2000.0); // Invalid withdrawal
        account.deposit(-100.0);  // Invalid deposit

        // Updating account holder name using setter
        account.setAccountHolderName("Mr. Prabhat Ranjan. ");
        System.out.println("Updated Account Holder: " + account.getAccountHolderName());
    }
}

// Output:
// Account Holder: Prabhat Ranjan
// Initial Balance: $1500.0
// Balance after deposit: $2000.0
// Balance after withdrawal: $1800.0
// Invalid withdrawal amount.
// Deposit amount must be positive.
// Updated Account Holder: Mr. Prabhat Ranjan.
// In this example, the EncapsulationGettersSetters class encapsulates the accountHolderName and balance fields.
// The fields are private, meaning they cannot be accessed directly from outside the class.
// Instead, public getter and setter methods are provided to access and modify these fields.
// The deposit and withdraw methods include validation to ensure that only valid transactions are processed.
// This demonstrates the principles of encapsulation, where the internal state of an object is protected from
// direct external access, and controlled access is provided through methods.
// The main method demonstrates how to use the EncapsulationGettersSetters class to create an account,
// perform transactions, and access account details using the provided getters and setters.



