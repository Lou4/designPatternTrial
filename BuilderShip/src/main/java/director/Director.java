package director;

import ship.Ship;
import builder.ShipBuilder;

public class Director {
	public void createShip(ShipBuilder builder){
		Ship ship;
		builder.createShip();
		builder.createDamage(5);
		builder.createShield(5);
		builder.createName("Thunder");
		ship = builder.getShip();
		
		System.out.println("Report: " + ship.getName() + " " + ship.getDamage() + " " + ship.getShield());
	}
}
