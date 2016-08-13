package builder;


public class WarShipBuilder implements ShipBuilder{
	
	private Ship ship;


	@Override
	public ShipBuilder createShip() {
		ship = new Ship();
		return this;
	}

	@Override
	public ShipBuilder createShield(int lv) {
		ship.shield = lv*10;
		return this;
	}

	@Override
	public ShipBuilder createDamage(int lv) {
		ship.damage = lv*15;
		return this;
	}

	@Override
	public ShipBuilder createName() {
		ship.name = "War-Ship";
		return this;
	}

	@Override
	public ShipBuilder createSpy(int lv) {
		ship.spy = 0;
		return this;
	}

	@Override
	public Ship getShip() {
		return ship;
	}
	
}
