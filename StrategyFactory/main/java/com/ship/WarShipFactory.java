package com.ship;

import java.util.ArrayList;

/**
 * Abstract Factory pattern - ConcreteFactory
 * @author lou
 *
 */
public class WarShipFactory extends AbstractFactoryShip {

	private static WarShipFactory instance;
	
	private WarShipFactory(){
		shipsCreated = new ArrayList<String>();
	}
	
	public static AbstractFactoryShip getInstance() {
		return (instance == null) ? new WarShipFactory() : instance;
	}

	public Ship createNormal() {
		Ship tmp = new NormalWarShip();
		shipsCreated.add(tmp.getClass().getSimpleName());
		return tmp;
	}

	public Ship createSpecial() {
		Ship tmp = new SpecialWarShip();
		shipsCreated.add(tmp.getClass().getSimpleName());
		return tmp;
	}

}
