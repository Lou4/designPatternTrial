package visitor;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestVisitor {


	@SuppressWarnings("rawtypes")
	@Test
	public void test() {
		ISensorVisitor sensor = new SensorVisitor(20);
		float actual = (Float) sensor.accept(new VisitorCelsius2Farheneit());
		assertEquals(68.0, actual, 0.0);
		
		actual = (Float) sensor.accept(new VisitorCelsius2Kelvin());
		assertEquals(293.15, actual, 0.1);
	}

}
