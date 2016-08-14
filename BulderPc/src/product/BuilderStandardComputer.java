package product;

public class BuilderStandardComputer extends BuilderComputer{
	private int budget;
	
	public BuilderStandardComputer(int cBudget) {
		cost = 0;
		budget = cBudget;
	}
	
	@Override
	BuilderComputer setRam(int ram) {
		cost += ram * 200;
		checkBudget();
		
		this.ram = ram;
		return this;
	}

	@Override
	BuilderComputer setCpu(int cpu) {
		cost += cpu * 150;
		checkBudget();
		
		this.cpu = cpu;
		return this;
	}

	@Override
	BuilderComputer setHardDisk(int hardDisk) {
		cost += hardDisk * 2;
		checkBudget();
		
		this.hardDisk = hardDisk;
		return this;
	}

	@Override
	BuilderComputer setLed(int led) {
		cost += led * 10;
		checkBudget();
		
		this.led = led;
		return this;
	}

	@Override
	BuilderComputer setResolution(int resolution) {
		cost += resolution * 100;
		checkBudget();
		
		this.resolution = resolution;
		return this;
	}

	@Override
	Computer build() throws IllegalArgumentException{
		//Check mandatory field
		if(ram == 0){
			throw new IllegalArgumentException("Missing ram info");
		}
		if(cpu == 0){
			throw new IllegalArgumentException("Missing cpu info");			
		}
		if(hardDisk == 0){
			throw new IllegalArgumentException("Missing hardDisk info");
		}
		if(resolution == 0){
			throw new IllegalArgumentException("Missing resolution info");
		}
		
		return new Computer(this);
	}
	
	private void checkBudget(){
		if(cost > budget){
			throw new IllegalArgumentException("Buget out: " + budget + ", cost: " + cost);
		}
	}
}
