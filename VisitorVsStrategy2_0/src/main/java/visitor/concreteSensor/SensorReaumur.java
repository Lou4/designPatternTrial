package visitor.concreteSensor;

import visitor.conversionAlgoritm.VisitorSensor;

public class SensorReaumur extends ISensor{

	public SensorReaumur(float initTemp) {
		super(initTemp);
	}

	@Override
	public float accepet(VisitorSensor visitor) {
		return visitor.visit(this);
	}

}
