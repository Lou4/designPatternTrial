package strategy;

public interface ISensorStrategy {
	void setStrategy(IStrategy nStrategy);
	float getTemperatureConverted();
	float getTemperature();
}
