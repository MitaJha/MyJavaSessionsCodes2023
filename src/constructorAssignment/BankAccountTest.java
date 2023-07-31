package constructorAssignment;

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount account = new BankAccount("SBI10000036", 59.75);
		account.getAccountNumber();
		account.getBalance();
		System.out.println(account.getAccountNumber());
	System.out.println(account.getBalance());
	
	account.withdraw(20.0);
	account.deposit(10.0);
	System.out.println(" balance after witdrawal is" + account.withdraw(20.0));
	System.out.println(" balance after deposite is" + account.deposit(10.0));
	System.out.println(account.getBalance());
	}

}
