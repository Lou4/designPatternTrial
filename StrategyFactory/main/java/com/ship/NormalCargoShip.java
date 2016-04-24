package com.ship;

import com.shipBehavior.Lv1Power;
import com.shipBehavior.PowerLv;

/**
 * Factory pattern - ConcreteProduct
 * @author lou
 *
 */
public class NormalCargoShip extends Ship{
	
	public NormalCargoShip() {
		powerLv = new Lv1Power();
		damage = 10;
	}

}
