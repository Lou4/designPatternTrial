package visitor.concreteSensor;

import visitor.conversionAlgoritm.VisitorSensor;

public abstract class ISensor {
	private float temp;
	public ISensor(float initTemp) {
		temp = initTemp;
	}
	
	public abstract float accepet(VisitorSensor visitor);
	
	
	public float getTemp() {
		return temp;
	}
}
