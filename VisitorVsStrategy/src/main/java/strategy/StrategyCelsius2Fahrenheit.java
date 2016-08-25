package strategy;

public class StrategyCelsius2Fahrenheit implements IStrategy{

	public float conversion(float temp) {
		return (float) ((temp * 1.8) + 32);
	}

}
