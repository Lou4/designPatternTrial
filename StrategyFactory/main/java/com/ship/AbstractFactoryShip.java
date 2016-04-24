package com.ship;

import java.util.List;

/**
 * Abstract Factory pattern - AbstractFactory
 * @author lou
 *
 */
public abstract class AbstractFactoryShip {

	protected static List<String> shipsCreated;
	
	abstract public Ship createNormal();
	abstract public Ship createSpecial();
	
	public static List<String> getListShipCreated() {
		// TODO Auto-generated method stub
		return shipsCreated;
	}
}
