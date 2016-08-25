package strategy;

public class Sensor extends ISensor{

	public Sensor(float initTemp) {
		super(initTemp);
	}

	@Override
	public float getTemp() {
		return temp;
	}

	@Override
	public float getTempConverted() {
		return strategy.convert(temp);
	}

	@Override
	public void setStrategy(StrategySensor nStrategy) {
		strategy = nStrategy;
	}

}
