package BankManagementSystem;

class SavingsAccount extends BankAccount {

    private double interestRate;

    SavingsAccount(String accountHolder, int accountNumber,
                   double balance, double interestRate) {

        super(accountHolder, accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Method Overriding
    @Override
    void displaydetails() {

        super.displaydetails();
        System.out.println("Interest Rate : " + interestRate + "%");
    }

    void addInterest() {

        double interest = balance * interestRate / 100;
        balance += interest;

        System.out.println("Interest Added : " + interest);
    }
}
