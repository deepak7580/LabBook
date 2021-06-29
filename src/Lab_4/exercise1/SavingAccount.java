package Lab_4.exercise1;

public class SavingAccount extends Account {

	final private double miniBal=500;
	public SavingAccount(long accNum, double balance, Person person) {
	super(accNum, balance, person);
	
		// TODO Auto-generated constructor stub
	}
	public void withdraw(double amount)
	{
		if(this.balance>=miniBal )
			this.balance-=amount;
		else
			System.out.println("Insufficient balance");
		
	}
	@Override
	public String toString() {
		return "SavingAccount [miniBal=" + miniBal + ", getAccNum()=" + getAccNum() + ", getBalance()=" + getBalance()
				+ ", getPerson()=" + getPerson() + "]";
	}
	
	

}
