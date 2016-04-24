package com.ship;

public class FactoryShip {

	private static FactoryShip instance;
	
	public static FactoryShip getInstance() {
		return (instance == null) ? new FactoryShip() : instance;
	}

	public Ship createNormalWarShip() {
		return new NormalWarShip();
	}

	public Ship createSpecialWarShip() {
		return new SpecialWarShip();
	}

}
