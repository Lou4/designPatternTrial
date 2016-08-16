package subject;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestATMProxy {

	
	private UserAccount atm;
	
	@Before
	public void setup(){
		atm = new ATMProxy(2000, "Luca", "1234");
	}
	
	@Test
	public void testATMoperation(){
		assertEquals(2000, atm.getBalance());
		
		atm.withdraw(1000);
		assertEquals(atm.getBalance(), 1000);
		
		atm.deposit(500);
		assertEquals(atm.getBalance(), 1500);
	}
}
