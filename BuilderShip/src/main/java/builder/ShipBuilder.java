package builder;

import ship.Ship;

public interface ShipBuilder {
	void createShip();
	void createShield(int val);
	void createDamage(int val);
	void createName(String name);
	Ship getShip();
}
