package com.ship;

public class WarShipFactory extends AbstractFactoryShip {

	private static WarShipFactory instance;
	
	public static AbstractFactoryShip getInstance() {
		return (instance == null) ? new WarShipFactory() : instance;
	}

	public Ship createNormal() {
		return new NormalWarShip();
	}

	public Ship createSpecial() {
		return new SpecialWarShip();
	}

}
