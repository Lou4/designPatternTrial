package builder;

import ship.Ship;

public class WarShipBuilder implements ShipBuilder{
	
	private Ship ship;


	@Override
	public void createShip() {
		ship = new Ship();
	}

	@Override
	public void createShield(int val) {
		ship.addShield(val*10);
	}

	@Override
	public void createDamage(int val) {
		ship.addDamage(val*15);
	}

	@Override
	public void createName(String name) {
		ship.setName("War-"+name);
	}


	@Override
	public Ship getShip() {
		return ship;
	}
	
}
