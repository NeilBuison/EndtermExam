package SoftwareDesign;

public class Checking extends Account
{
	public Checking(int acctNum)
	{
		super(acctNum);
	}
	public int getAccountNumber()
	{
		return acctnum;
	}
	public double getBalance()
	{
		return balance;
	}
	public String getAccountInfo()
	{
		return("Checking Account Information\nAcct Num: " + getAccountNumber() + "\nBalance: " + getBalance());
	}
}
