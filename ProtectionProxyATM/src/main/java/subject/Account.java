package subject;

public class Account implements UserAccount{
	int balance;
	
	Account(int initialMoney) {
		balance = initialMoney;
	}
	
	public int getBalance() {
		return balance;
	}

	public void withdraw(int money) {
		balance -= money;
	}

	public void deposit(int money) {
		balance += money;
	}

}
