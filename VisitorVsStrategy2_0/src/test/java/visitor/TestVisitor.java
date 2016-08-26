package visitor;

import static org.junit.Assert.*;

import org.junit.Test;

import visitor.concreteSensor.ISensor;
import visitor.concreteSensor.SensorCelsius;
import visitor.concreteSensor.SensorFarheneit;
import visitor.concreteSensor.SensorKelvin;
import visitor.concreteSensor.SensorNewton;
import visitor.concreteSensor.SensorRankine;
import visitor.concreteSensor.SensorReaumur;
import visitor.concreteSensor.SensorRomer;
import visitor.conversionAlgoritm.VisitorToFarheneit;
import visitor.conversionAlgoritm.VisitorToKelvin;

public class TestVisitor {

	@Test
	public void test() {
		ISensor sensor = new SensorCelsius(20);
		assertEquals(68.0, sensor.accepet(new VisitorToFarheneit()), 0.0);
		assertEquals(293.15, sensor.accepet(new VisitorToKelvin()), 0.1);
		
		sensor = new SensorFarheneit(32);
		assertEquals(32.0, sensor.accepet(new VisitorToFarheneit()), 0.0);
		assertEquals(273.15, sensor.accepet(new VisitorToKelvin()), 0.1);
		
		sensor = new SensorKelvin(20);
		assertEquals(-423.67, sensor.accepet(new VisitorToFarheneit()), 0.1);
		assertEquals(20.0, sensor.accepet(new VisitorToKelvin()), 0.1);
		
		sensor = new SensorNewton(20);
		assertEquals(141.09, sensor.accepet(new VisitorToFarheneit()), 0.1);
		assertEquals(333.75, sensor.accepet(new VisitorToKelvin()), 0.1);
		
		sensor = new SensorRankine(20);
		assertEquals(-439.67, sensor.accepet(new VisitorToFarheneit()), 0.1);
		assertEquals(11.11, sensor.accepet(new VisitorToKelvin()), 0.1);
		
		sensor = new SensorReaumur(20);
		assertEquals(77, sensor.accepet(new VisitorToFarheneit()), 0.1);
		assertEquals(298.15, sensor.accepet(new VisitorToKelvin()), 0.1);
		
		sensor = new SensorRomer(20);
		assertEquals(74.85, sensor.accepet(new VisitorToFarheneit()), 0.1);
		assertEquals(296.95, sensor.accepet(new VisitorToKelvin()), 0.1);
	}

}
