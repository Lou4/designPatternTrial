package product;

public class Computer {
	private int ram;
	private int cpu;
	private int hardDisk;
	private int led;
	private int resolution;
	private int cost;
	
	/* Pass builder as an argumento to force programmer to use a builder to create Computer instance*/
	public Computer(BuilderComputer builder) {
		ram = builder.ram;
		cpu = builder.cpu;
		hardDisk = builder.hardDisk;
		led = builder.led;
		resolution = builder.resolution;
		cost = builder.cost;
	}
	
	@Override
	public String toString() {
		return " - Ram: " + ram + "MB, Cpu: " + cpu + "GHz, Hard disk: " + hardDisk + "GB, Led: " + led + ", Resolution: " + resolution + "K, Price: " + cost + "€  - ";
	}
}
