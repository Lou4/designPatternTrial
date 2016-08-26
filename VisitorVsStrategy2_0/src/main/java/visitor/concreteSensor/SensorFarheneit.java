package visitor.concreteSensor;

import visitor.conversionAlgoritm.VisitorSensor;

public class SensorFarheneit extends ISensor{

	public SensorFarheneit(float initTemp) {
		super(initTemp);
	}
	
	@Override
	public float accepet(VisitorSensor visitor) {
		return visitor.visit(this);
	}

}
