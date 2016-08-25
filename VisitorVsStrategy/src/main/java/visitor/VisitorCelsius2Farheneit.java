package visitor;

public class VisitorCelsius2Farheneit implements VisitorSensor<Float>{

	public Float visit(SensorVisitor<Float> sensor) {
		return (float) ((sensor.getTemp() * 1.8) + 32);
	}

}
