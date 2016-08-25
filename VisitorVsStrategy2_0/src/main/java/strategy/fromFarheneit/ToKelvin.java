package strategy.fromFarheneit;

import strategy.fromCelsius.StrategyFromCelsius;

public class ToKelvin implements StrategyFromCelsius{

	public float convert(float temp) {
		return (float) ((temp + 459.67)/1.8);
	}

}
