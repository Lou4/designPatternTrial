package com.ship;

import com.shipBehavior.Lv1Power;
import com.shipBehavior.PowerLv;

public class NormalCargoShip implements Ship{

	private final int damage = 10;
	private PowerLv powerLv;
	
	public NormalCargoShip() {
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

	@Override
	public void setPower(PowerLv powerLv) {
		this.powerLv = powerLv;
	}

}
