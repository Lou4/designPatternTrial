package builder;


public interface ShipBuilder {
	ShipBuilder createShip();
	ShipBuilder createShield(int lv);
	ShipBuilder createDamage(int lv);
	ShipBuilder createSpy(int lv);
	ShipBuilder createName();
	Ship getShip();
}
