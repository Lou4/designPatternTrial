package visitor.conversionAlgoritm;

import visitor.concreteSensor.SensorCelsius;
import visitor.concreteSensor.SensorFarheneit;
import visitor.concreteSensor.SensorKelvin;
import visitor.concreteSensor.SensorNewton;
import visitor.concreteSensor.SensorRankine;
import visitor.concreteSensor.SensorReaumur;
import visitor.concreteSensor.SensorRomer;

public class VisitorToKelvin implements VisitorSensor{

	public float visit(SensorCelsius sensor) {
		return (float) (sensor.getTemp() + 273.15);
	}

	public float visit(SensorFarheneit sensor) {
		return (float) ((sensor.getTemp() + 459.67)/1.8);
	}

	public float visit(SensorKelvin sensor) {
		return sensor.getTemp();
	}

	public float visit(SensorNewton sensor) {
		return (float) (sensor.getTemp() * (100.0/33.0) + 273.15);
	}

	public float visit(SensorRankine sensor) {
		return (float) (sensor.getTemp() * (5.0/9.0));
	}

	public float visit(SensorReaumur sensor) {
		return (float) (sensor.getTemp() * (5.0/4.0) + 273.15);
	}

	public float visit(SensorRomer sensor) {
		return (float) ((sensor.getTemp() - 7.5) * (40.0/21.0) + 273.15);
	}

}
