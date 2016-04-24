package com.ship;

/**
 * Abstract Factory pattern - ConcreteFactory
 * @author lou
 *
 */
public class CargoShipFactory extends AbstractFactoryShip {

	private static CargoShipFactory instance;
	
	public static AbstractFactoryShip getInstance() {
		return (instance == null) ? new CargoShipFactory() : instance;
	}
	
	@Override
	public Ship createNormal() {
		return new NormalCargoShip();
	}

	@Override
	public Ship createSpecial() {
		return new SpecialCargoShip();
	}

}
