package subject;

public class ATMProxy implements UserAccount{
	
	private Account account;
	private int initMoney;
	private String user;
	private String password;
	
	public ATMProxy(int nInitMoney, String nUser, String nPassword) {
		user = nUser;
		password = nPassword;
		initMoney = nInitMoney;
	}

	public void withdraw(int money) {
		initAccountIfNull(user, password);
		if(isCredentialWrong(user, password)){
			throw new IllegalAccessError("Credential user '" + user + "', password '" + password + "' wrong");
		}
		account.withdraw(money);
	}

	public void deposit(int money) {
		initAccountIfNull(user, password);
		if(isCredentialWrong(user, password)){
			throw new IllegalAccessError("Credential user '" + user + "', password '" + password + "' wrong");
		}
		account.deposit(money);
	}

	public int getBalance(){
		initAccountIfNull(user, password);
		if(isCredentialWrong(user, password)){
			throw new IllegalAccessError("Credential user '" + user + "', password '" + password + "' wrong");
		}
		
		return account.getBalance();
	}

	private void initAccountIfNull(String nUser, String nPassword){
		if(account == null){
			user = nUser;
			password = nPassword;
			account = new Account(initMoney);
		}
	}
	
	private boolean isCredentialWrong(String nUser, String nPassword){
		return !user.equals(nUser) || !password.equals(nPassword);
	}

}
