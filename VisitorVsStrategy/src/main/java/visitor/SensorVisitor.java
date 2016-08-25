package visitor;

import context.Sensor;

public class SensorVisitor<T> extends Sensor implements ISensorVisitor<T>{

	private float temp;
	public SensorVisitor(float initTemp) {
		temp = initTemp;
	}
	public T accept(VisitorSensor<T> visitor) {
		return visitor.visit(this);
	}
	
	public float getTemp() {
		return temp;
	}
}
