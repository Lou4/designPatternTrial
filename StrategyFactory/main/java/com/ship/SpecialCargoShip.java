package com.ship;

import com.shipBehavior.Lv1Power;
import com.shipBehavior.PowerLv;

/**
 * Factory pattern - ConcreteProduct
 * @author lou
 *
 */
public class SpecialCargoShip extends Ship{

	public SpecialCargoShip() {
		powerLv = new Lv1Power();
		damage = 15;
	}
}
