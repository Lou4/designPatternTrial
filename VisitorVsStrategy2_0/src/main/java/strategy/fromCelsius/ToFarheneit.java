package strategy.fromCelsius;

public class ToFarheneit implements StrategyFromCelsius{

	public float convert(float temp) {
		return (float) ((temp * 1.8) + 32);
	}

}
