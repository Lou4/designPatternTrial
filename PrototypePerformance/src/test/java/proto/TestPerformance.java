package proto;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestPerformance {

	
	private PrototypeManager manager;
	
	@Before
	public void setup(){
		manager = new PrototypeManager();
	}
	
	@Test
	public void test() {
		long start;
		long measureOne, measureTwo, measureThree;
		
		for(int i = 1000000; i>0; i--)
			new Pen();
		
		for(int i = 1000000; i>0; i--)
			new Pen("red", 10);
		
		for(int i = 1000000; i>0; i--)
			manager.generatePen("red");
		
		start = System.nanoTime();
		for(int i = 1000000; i>0; i--)
			new Pen();
		measureOne = System.nanoTime() - start;
		
		start = System.nanoTime();
		for(int i = 1000000; i>0; i--)
			new Pen("red", 10);
		measureTwo = System.nanoTime() - start;
		
		start = System.nanoTime();
		for(int i = 1000000; i>0; i--)
			manager.generatePen("red");
		measureThree= System.nanoTime() - start;
		
		System.out.println("Empty constructor: " + measureOne + ", Non empty constructor: " + measureTwo + ", Clone: " + measureThree);
		System.out.println("Empty constructor: " + printNumWithDot(measureOne) + ", Non empty constructor: " + printNumWithDot(measureTwo) + ", Clone: " + printNumWithDot(measureThree));
		assertTrue(measureTwo > measureOne);
		assertTrue(measureThree < measureOne);
	}
	
	private String printNumWithDot(long num){
		StringBuilder res = new StringBuilder();
		int cont = 0;
		while(num > 0){
			if(cont % 3 == 0 && cont != 0)
				res.append(".");
			res.append(Long.toString((num % 10)));
			cont++;
			num /= 10;
		}
		
		return res.reverse().toString();
	}


}
