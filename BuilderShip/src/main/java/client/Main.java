package client;

import builder.WarShipBuilder;
import director.Director;

public class Main {
	public static void main(String[] args) {
		Director director = new Director();
		director.createShip(new WarShipBuilder());
	}
}
