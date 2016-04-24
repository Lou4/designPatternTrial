package com.ship;

import com.shipBehavior.Lv1Power;
import com.shipBehavior.PowerLv;

/**
 * Factory pattern - ConcreteProduct
 * @author lou
 *
 */
public class SpecialWarShip extends Ship{

	public SpecialWarShip() {
		powerLv = new Lv1Power();
		damage = 150;
	}
}
