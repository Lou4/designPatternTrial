package strategy;

import context.Sensor;

public class SensorStrategy extends Sensor implements ISensorStrategy{
	private float temp;
	private IStrategy strategy;
	
	public SensorStrategy(float initTemp) {
		temp = initTemp;
	}
	
	public void setStrategy(IStrategy nStrategy) {
		strategy = nStrategy;
		
	}

	public float getTemperatureConverted() {
		return strategy.conversion(temp);
	}

	public float getTemperature() {
		return temp;
	}
	
}
