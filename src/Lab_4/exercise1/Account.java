package Lab_4.exercise1;

public class Account {
	private long accNum;
	protected double balance;
	private Person person;
	
	
	
	public Account() {
		super();
		
	}

	public void deposit(double amount)
	{
		this.balance+=amount;
	}
	
	public void withdraw(double amount)
	{
		if(this.balance>=amount)
		this.balance-=amount;
	}
	
	
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", balance=" + balance + ", person=" + person + "]";
	}

	public Account(long accNum, double balance, Person person) {
		super();
		this.accNum = accNum;
		this.balance = balance;
		this.person = person;
	}

	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	

}
