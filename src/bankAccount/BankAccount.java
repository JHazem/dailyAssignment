package bankAccount;

public class BankAccount {

	private long accountNumber;
	private String holderName;
	private float balance;
	private String holdID;
	private int accountType;
	private boolean isBlocked;
	
	public boolean draw(float amount) {
		if(isBlocked == false && balance >= amount) {
			balance -=amount;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean deposit(float amount) {
		if(isBlocked == false) {
			balance +=amount;
			return true;
		}
		return false;
	}
	
	public String getAccountDetail() {
		
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public String getHoldID() {
		return holdID;
	}

	public void setHoldID(String holdID) {
		this.holdID = holdID;
	}

	public int getAccountType() {
		return accountType;
	}

	public void setAccountType(int accountType) {
		this.accountType = accountType;
	}

	public boolean isBlocked() {
		return isBlocked;
	}

	public void setBlocked(boolean isBlocked) {
		this.isBlocked = isBlocked;
	}
	
	
	
	
}
