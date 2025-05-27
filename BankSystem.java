class BankCustomer {
    String custName;
    int customerId;
    String customerAddress;

    // Constructor
    public BankCustomer(String custName, int customerId, String customerAddress) {
        this.custName = custName;
        this.customerId = customerId;
        this.customerAddress = customerAddress;
    }

    // Display customer details
    public void displayCustomerDetails() {
        System.out.println("Customer Name: " + custName);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Address: " + customerAddress);
    }
}

class BankTransaction {
    String accountName;
    String accountHolderName;
    String accountType;
    long accountNumber;
    double balance;

    // Constructor
    public BankTransaction(String accountName, String accountHolderName, String accountType, long accountNumber, double balance) {
        this.accountName = accountName;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Display account details
    public void displayTransactionDetails() {
        System.out.println("Account Name: " + accountName);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        // Creating a bank customer
        BankCustomer customer = new BankCustomer("Alice", 1001, "123 Main Street");

        // Creating a bank transaction
        BankTransaction transaction = new BankTransaction("SBI", "Alice", "Savings", 1234567890L, 5000.0);

        // Display information
        customer.displayCustomerDetails();
        System.out.println();
        transaction.displayTransactionDetails();
}
}