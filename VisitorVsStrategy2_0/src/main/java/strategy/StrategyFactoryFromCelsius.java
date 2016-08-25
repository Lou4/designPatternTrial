package strategy;

import strategy.fromCelsius.ToFarheneit;
import strategy.fromCelsius.ToKelvin;

public class StrategyFactoryFromCelsius extends AbstractStrategyFactory {

	@Override
	public StrategySensor create2KelvinStrategy() {
		return new ToKelvin();
	}

	@Override
	public StrategySensor create2FarhenheitStrategy() {
		return new ToFarheneit();
	}

}
