package strategy;

public abstract class ISensor {
	
	protected float temp;
	protected StrategySensor strategy;
	
	public ISensor(float initTemp) {
		temp = initTemp;
	}
	
	public abstract float getTemp();
	public abstract float getTempConverted();
	public abstract void setStrategy(StrategySensor nStrategy);
	
}
