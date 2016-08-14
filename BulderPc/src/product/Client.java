package product;

public class Client {
	public static void main(String[] args) {
		BuilderComputer builder = new BuilderStandardComputer(1000);
		Computer computer = builder.setCpu(2)
								.setHardDisk(49)
								.setRam(2)
								.setResolution(2)
								.build();
		System.out.println(computer);
	}
}
