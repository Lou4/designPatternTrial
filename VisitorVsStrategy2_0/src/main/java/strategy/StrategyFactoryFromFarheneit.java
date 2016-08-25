package strategy;

import strategy.fromFarheneit.ToFarheneit;
import strategy.fromFarheneit.ToKelvin;

public class StrategyFactoryFromFarheneit extends AbstractStrategyFactory{

	@Override
	public StrategySensor create2KelvinStrategy() {
		return new ToKelvin();
	}

	@Override
	public StrategySensor create2FarhenheitStrategy() {
		return new ToFarheneit();
	}

}
