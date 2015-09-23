import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.junit.Test;
import java.util.Date;

public class AccountTest {
	
	Account testAccount;
	
	@Before
	public void setUp() throws Exception {
		testAccount = new Account(1122, 20000);
		
		testAccount.withdraw(2500);
		testAccount.deposit(3000);
		
		String balance = Double.toString(testAccount.getbalance());
		String monthlyInterestRate = Double.toString(testAccount.getMonthlyInterestRate());
		String dateCreated = testAccount.getdateCreated().toString();
		
		System.out.printf("Balance = %s, Monthly Interest Rate = %s, Date Created = %s", 
				balance, monthlyInterestRate, dateCreated);
				
	}
	
	
	@After
	public void tearDown() throws Exception {
		testAccount = null;
	}
	
	@Test(expected=InsufficientFundsException.class)
	public final void testWithdraw() throws  InsufficientFundsException {
		testAccount.withdraw(1000000.00);
		assertEquals("Not enough funds",(long)testAccount.getbalance(),(long)1000000.00);
	}

}
