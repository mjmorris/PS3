import java.util.Date;

/**
 * The Account class creates an account with an ID and a balance.
 * It has methods to get the monthly interest rate and to withdraw
 * and deposit funds.
 * 
 * @author Mandy
 *
 */

public class Account {
	
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	
	public int getid() {
		return id;
	}
	
	public void setid(int id) {
		this.id = id;
		
	}
	
	public double getbalance() {
		return balance;
	}
	
	public void setbalance(double balance) {
		this.balance = balance;
	}
	
	public double getannualInterestRate() {
		return annualInterestRate;
	}
	
	public void setannualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	/*
	 * Stores the date when the account was created
	 */
	
	public Date getdateCreated() {
		return dateCreated;
	}
	
	public void setdateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	
	/*
	 * No Arg Constructor
	 * Creates a default account
	 */
	
	public Account() {
		
	}
	
	/*
	 * A constructor that creates an Account with arguments
	 * id and balance
	 */
	
	public Account(int id, double balance){
		this.id = id;
		this.balance = balance;
	}
	
	/*
	 * Returns the monthly interest rate
	 * (the annual interest rate divided by 12)
	 */
	
	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	/**
	 * Withdraw funds from an account If more funds are withdrawn than
	 * are available in the account, an insufficient funds exception
	 * is raised.
	 *
	 * @param amount
	 * @throws InsufficientFundsException
	 */
	
	public void withdraw(double amount) throws InsufficientFundsException{
		if(amount <= balance)
		{
			balance-= amount;
		}
		else {
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
		}
	}
	
	/*
	 * Deposits a specified amount into the account
	 */
	
	public void deposit(double amount) {
		balance += amount;
	}

}
