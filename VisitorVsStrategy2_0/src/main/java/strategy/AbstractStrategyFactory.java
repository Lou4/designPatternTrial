package strategy;

public abstract class AbstractStrategyFactory {
	public abstract StrategySensor create2KelvinStrategy();
	public abstract StrategySensor create2FarhenheitStrategy();
}
