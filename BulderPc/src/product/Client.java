package product;

public class Client {
	public static void main(String[] args) {
		BuilderComputer builder = new BuilderStandardComputer(1000);

		//We don't always need a director, client can handle the interaction with the builder
		Computer computer = builder.setCpu(2)
								.setHardDisk(49)
								.setRam(2)
								.setResolution(2)
								.build();
		
		System.out.println(computer);
		computer.turnOn();
	}
}
