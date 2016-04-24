package com.ship;

/**
 * Abstract Factory pattern - AbstractFactory
 * @author lou
 *
 */
public abstract class AbstractFactoryShip {

	abstract public Ship createNormal();
	abstract public Ship createSpecial();
}
