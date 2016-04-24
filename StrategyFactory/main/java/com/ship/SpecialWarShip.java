package com.ship;

import com.shipBehavior.Lv1Power;
import com.shipBehavior.PowerLv;

public class SpecialWarShip implements Ship{

	private final int damage = 150;
	private PowerLv powerLv;
	
	public SpecialWarShip() {
		powerLv = new Lv1Power();
	}
	
	@Override
	public int getPower() {
		return powerLv.getPower();
	}

	@Override
	public int shoot() {
		return damage * powerLv.getPower();
	}

	public void setPower(PowerLv powerLv) {
		this.powerLv = powerLv;
	}

}
