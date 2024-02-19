public class BankAccount {
	private String name;
	private int balance;
	private String pin;
	private int number;

	public Account(String name,  int balance, String pin, int number){
	this.name = name;
	this.balance = balance;
	this.pin = pin;
 	this.number = number;
	}

	public void withdraw(int amount, String  enterPin){
		if(!enterPin.equals(pin)) {
			throw new InvalidPinException("Invalid pin");
		}
		if (amount > balance) {
			throw new InsufficientFundsException("Insufficient funds");
		}

		balance - = amount;
	}
	
	public void deposit(int amount) {
		balance += amount;
	}

	public void checkBalance() {
		return balance;
	}



	

	}

	



}