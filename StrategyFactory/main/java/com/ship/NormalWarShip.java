package com.ship;

import com.shipBehavior.Lv1Power;
import com.shipBehavior.PowerLv;

public class NormalWarShip implements Ship {
	
	private PowerLv powerLv;
	private final int damage = 100;
	
	public NormalWarShip() {
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
