package client;

import builder.Ship;
import builder.ShipBuilder;
import builder.WarShipBuilder;
import director.Director;

public class Main {
	public static void main(String[] args) {
		ShipBuilder builder = new WarShipBuilder();
		Director director = new Director(builder);
		director.createShip(2);
		Ship ship = builder.getShip();
		
		System.out.println(ship);
	}
}
