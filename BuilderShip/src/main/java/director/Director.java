package director;

import builder.ShipBuilder;

public class Director {
	private ShipBuilder builder;
	
	public Director(ShipBuilder shipBuilder) {
		builder = shipBuilder;
	}
	
	public void createShip(int lv){
		builder.createShip()
		.createDamage(lv)
		.createShield(lv)
		.createSpy(lv)
		.createName();
	}
}
