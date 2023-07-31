package constructorAssignment;

public class BankAccount {
	private String accountNumber ;
	private double balance;
	public BankAccount(String accountNumber, double balance) {
		
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double deposit(double d) {
		double newBalance ;
		newBalance = getBalance() + d;
		return newBalance;
	}
 
	public double withdraw(double d) {
		
		double newBalance1 ;
		newBalance1 = getBalance() - d;
		return newBalance1;
		
	}
	
}
