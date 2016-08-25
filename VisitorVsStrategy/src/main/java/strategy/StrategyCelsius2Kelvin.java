package strategy;

public class StrategyCelsius2Kelvin implements IStrategy{

	public float conversion(float temp) {
		return (float) (temp + 273.15);
	}

}
