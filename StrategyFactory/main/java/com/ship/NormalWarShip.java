package com.ship;

import com.shipBehavior.Lv1Power;
import com.shipBehavior.PowerLv;

/**
 * Factory pattern - ConcreteProduct
 * @author lou
 *
 */
public class NormalWarShip extends Ship {
	public NormalWarShip() {
		powerLv = new Lv1Power();
		damage = 100;
	}
}
