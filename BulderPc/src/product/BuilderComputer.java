package product;

public abstract class BuilderComputer {
	int ram;
	int cpu;
	int hardDisk;
	int led;
	int resolution;
	int cost;
	
	//No default value, my choice.
	abstract BuilderComputer setRam(int ram);
	abstract BuilderComputer setCpu(int cpu);
	abstract BuilderComputer setHardDisk(int hardDisk);
	abstract BuilderComputer setLed(int led);
	abstract BuilderComputer setResolution(int resolution);
	abstract Computer build();
}
