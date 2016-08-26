package visitor.conversionAlgoritm;

import visitor.concreteSensor.SensorCelsius;
import visitor.concreteSensor.SensorFarheneit;
import visitor.concreteSensor.SensorKelvin;
import visitor.concreteSensor.SensorNewton;
import visitor.concreteSensor.SensorRankine;
import visitor.concreteSensor.SensorReaumur;
import visitor.concreteSensor.SensorRomer;

public class VisitorToFarheneit implements VisitorSensor{

	public float visit(SensorCelsius sensor) {
		return (float) ((sensor.getTemp() * 1.8) + 32);
	}

	public float visit(SensorFarheneit sensor) {
		return sensor.getTemp();
	}

	public float visit(SensorKelvin sensor) {
		return (float) ((sensor.getTemp() * (9.0/5.0)) - 459.67);
	}

	public float visit(SensorNewton sensor) {
		return (float) ((sensor.getTemp() * 60.0/11.0) + 32);
	}

	public float visit(SensorRankine sensor) {
		return (float) (sensor.getTemp() - 459.67);
	}

	public float visit(SensorReaumur sensor) {
		return (float) ((sensor.getTemp() * (9.0/4.0)) + 32);
	}

	public float visit(SensorRomer sensor) {
		return (float) ((sensor.getTemp() - 7.5) * 24.0/7.0 + 32) ;
	}
	
}
