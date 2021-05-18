package SoftwareDesign;

public class Savings extends Account
{
	private double interestrate;
	public Savings(int acctNum, double interest)
	{
		super(acctNum);
		setInterestRate(interest);
	}
	public void setInterestRate(double interest)
	{
		interestrate = interest;
	}
	public double getInterestRate()
	{
		return interestrate;
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
		return("Savings account information\nAccount Number: " + getAccountNumber() + "\nBalance: " + getBalance() + "\nInterest Rate: " + getInterestRate() + "%");
	}
}