package visitor;

public class VisitorCelsius2Kelvin implements VisitorSensor<Float>{

	public Float visit(SensorVisitor<Float> sensor) {
		return (float) (sensor.getTemp() + 273.15);
	}

}
