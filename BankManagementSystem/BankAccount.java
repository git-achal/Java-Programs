package BankManagementSystem;

public class BankAccount {
  private String accountHolder;
  private int accountNumber;
  protected double balance;
  public BankAccount(String accoundHolder, int accountNumber, double balance) {
	
	this.accountHolder = accoundHolder;
	this.accountNumber = accountNumber;
	this.balance = balance;
  }
  
  void deposite (double amount) {
	  balance+=amount;
	  System.out.println(amount+"deposited succesufully");
  }
  
  void withdraw(double amount) {
	  if(amount<=balance) {
		  balance-=amount;
		  System.out.println(amount+"withdraw successfully");
		  
	  }else {
		  System.out.println("insufficient balance");
	  }
  }
  void displaydetails() {
	  System.out.println("Account Holder :"+ accountHolder);
	  System.out.println("Account Number :"+ accountNumber);
	  System.out.println("Account Balance :"+ balance);
	  
  }
}
