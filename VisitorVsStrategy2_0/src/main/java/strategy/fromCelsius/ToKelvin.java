package strategy.fromCelsius;

public class ToKelvin implements StrategyFromCelsius{

	public float convert(float temp) {
		return (float) (temp + 273.15);
	}

}
