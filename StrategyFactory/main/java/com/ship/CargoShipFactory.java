package com.ship;

import java.util.ArrayList;

/**
 * Abstract Factory pattern - ConcreteFactory
 * @author lou
 *
 */
public class CargoShipFactory extends AbstractFactoryShip {

	private static CargoShipFactory instance;
	
	private CargoShipFactory(){
		shipsCreated = new ArrayList<String>();
	}
	
	public static AbstractFactoryShip getInstance() {
		return (instance == null) ? new CargoShipFactory() : instance;
	}
	
	@Override
	public Ship createNormal() {
		Ship tmp = new NormalCargoShip();
		shipsCreated.add(tmp.getClass().getSimpleName());
		return tmp;
	}

	@Override
	public Ship createSpecial() {
		Ship tmp = new SpecialCargoShip();
		shipsCreated.add(tmp.getClass().getSimpleName());
		return tmp;
	}

}
