package visitor.concreteSensor;

import visitor.conversionAlgoritm.VisitorSensor;

public class SensorKelvin extends ISensor{

	public SensorKelvin(float initTemp) {
		super(initTemp);
	}

	@Override
	public float accepet(VisitorSensor visitor) {
		return visitor.visit(this);
	}

}
