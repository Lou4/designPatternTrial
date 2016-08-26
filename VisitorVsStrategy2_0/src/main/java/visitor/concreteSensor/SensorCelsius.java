package visitor.concreteSensor;

import visitor.conversionAlgoritm.VisitorSensor;

public class SensorCelsius extends ISensor{

	public SensorCelsius(float initTemp) {
		super(initTemp);
	}

	@Override
	public float accepet(VisitorSensor visitor) {
		return visitor.visit(this);
	}

}
