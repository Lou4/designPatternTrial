package visitor.concreteSensor;

import visitor.conversionAlgoritm.VisitorSensor;

public class SensorRankine extends ISensor{

	public SensorRankine(float initTemp) {
		super(initTemp);
	}

	@Override
	public float accepet(VisitorSensor visitor) {
		return visitor.visit(this);
	}

}
