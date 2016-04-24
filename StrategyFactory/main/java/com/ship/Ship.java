package com.ship;

import com.shipBehavior.PowerLv;

public interface Ship extends PowerLv {
	int shoot();
	void setPower(PowerLv powerLv);
}
