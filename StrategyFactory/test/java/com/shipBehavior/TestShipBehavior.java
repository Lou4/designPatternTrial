package com.shipBehavior;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.ship.Ship;
import com.ship.WarShipFactory;

public class TestShipBehavior {

	Ship normalWar;
	
	@Before
	public void setup(){
		normalWar = WarShipFactory.getInstance().createNormal();
	}
	
	@Test
	public void testShipBehavior_normalWar(){
		assertEquals(normalWar.shoot(), 100);
		assertEquals(normalWar.getPower(), 1);
		
		normalWar.setPower(new Lv2Power());
		assertEquals(normalWar.shoot(), 200);
		assertEquals(normalWar.getPower(), 2);
		
		normalWar.setPower(new Lv1Power());
		assertEquals(normalWar.shoot(), 100);
		assertEquals(normalWar.getPower(), 1);
	}

}
