package visitor.concreteSensor;

import visitor.conversionAlgoritm.VisitorSensor;

public class SensorNewton extends ISensor{

	public SensorNewton(float initTemp) {
		super(initTemp);
	}

	@Override
	public float accepet(VisitorSensor visitor) {
		return visitor.visit(this);
	}

}
