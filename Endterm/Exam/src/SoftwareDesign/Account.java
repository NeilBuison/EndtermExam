package SoftwareDesign;

public abstract class Account {
	protected int acctnum;
	protected double balance;
	
	public Account (int an)
	{
		acctnum = an;
		setBalance(0.0);
	}
	public void setBalance(double bal)
	{
		balance = bal;
	}
	public abstract int getAccountNumber();
	public abstract double getBalance();
	public abstract String getAccountInfo();
}

