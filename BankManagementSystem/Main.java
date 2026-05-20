package BankManagementSystem;

public class Main {

    public static void main(String[] args) {

        SavingsAccount s1 =
                new SavingsAccount("Achal", 101, 5000, 5);

        s1.displaydetails();

        System.out.println();

        s1.deposite(2000);

        s1.withdraw(1000);

        s1.addInterest();

        System.out.println();

        s1.displaydetails();
    }
}
