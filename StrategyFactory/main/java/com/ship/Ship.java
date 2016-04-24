package com.ship;

import com.shipBehavior.PowerLv;

/**
 * Factory pattren - product
 * @author lou
 *
 */
public abstract class Ship implements PowerLv {
	
	protected PowerLv powerLv;
	protected Integer damage;
	
	public int getPower() {
		return powerLv.getPower();
	}
	
	public int shoot() {
		return damage * powerLv.getPower();
	}
	
	public void setPower(PowerLv powerLv) {
		this.powerLv = powerLv;
	}
}
