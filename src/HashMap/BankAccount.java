package HashMap;//package HashMap;
//
//public class LinkedHashMapExample  {
//    public static void main( String[] args) {
//        LinkedHashMapExample <Integer, String> map = new LinkedHashMapExample<>();
//        map.put( 1, "Cricket");
//        map.put( 2, "Football");
//        map.put( 3, "Hockey");
//        map.put( 4, "Tennis");
//        map.put( 5, "Badminton");
//        System.out.println(map);
//
//    }
//}

public class BankAccount {
    private double balance;  // Encapsulated data

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be greater than 0");
        }
    }

    public void withdraw( double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(400);
        account.withdraw(300);
        System.out.println("Current Balance: " + account.getBalance());

    }
}
