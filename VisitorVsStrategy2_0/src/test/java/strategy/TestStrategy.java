package strategy;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestStrategy {

	@Test
	public void test() {
		AbstractStrategyFactory factory = new StrategyFactoryFromCelsius();
		ISensor sensor = new Sensor(20);
		
		sensor.setStrategy(factory.create2FarhenheitStrategy());
		assertEquals(68.0, sensor.getTempConverted(), 0.0);
		
		sensor.setStrategy(factory.create2KelvinStrategy());
		assertEquals(293.15, sensor.getTempConverted(), 0.1);
	}

}
