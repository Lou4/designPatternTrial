package visitor.concreteSensor;

import visitor.conversionAlgoritm.VisitorSensor;

public class SensorRomer extends ISensor{

	public SensorRomer(float initTemp) {
		super(initTemp);
	}

	@Override
	public float accepet(VisitorSensor visitor) {
		return visitor.visit(this);
	}

}
