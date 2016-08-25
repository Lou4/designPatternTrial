package strategy;

import static org.junit.Assert.*;

import org.junit.Test;

import context.Sensor;

public class TestStrategy {

	@Test
	public void test() {
		ISensorStrategy sensor = new SensorStrategy(20);
		sensor.setStrategy(new StrategyCelsius2Fahrenheit());
		assertEquals(68.0, sensor.getTemperatureConverted(), 0.0);
		
		sensor.setStrategy(new StrategyCelsius2Kelvin());
		assertEquals(293.15, sensor.getTemperatureConverted(), 0.1);
	}

}
