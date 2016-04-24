package com.ship;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.shipBehavior.Lv2Power;

public class TestAbstractFactoryShip {

	AbstractFactoryShip warShipFactory;
	AbstractFactoryShip cargoShipFactory;
	
	@Before
	public void setUp(){
		warShipFactory = WarShipFactory.getInstance();
		cargoShipFactory = CargoShipFactory.getInstance();
	}
	
	@Test
	public void testCreateShipFromAbstractFactory_cargoAndWar(){
		Ship normalWar = warShipFactory.createNormal();
		Ship specialWar = warShipFactory.createSpecial();
		
		Ship normalCargo = cargoShipFactory.createNormal(); 
		Ship specialCargo = cargoShipFactory.createSpecial();
		
		assertEquals(normalWar.getClass().getSimpleName(), NormalWarShip.class);
		assertEquals(specialWar.getClass().getSimpleName(), SpecialWarShip.class);
		
		assertEquals(normalCargo.getClass().getSimpleName(), NormalCargoShip.class);
		assertEquals(specialCargo.getClass().getSimpleName(), SpecialCargoShip.class);
		
		assertEquals(normalWar.shoot(), 100);
		assertEquals(specialWar.shoot(), 150);
		
		assertEquals(normalCargo.shoot(), 10);
		assertEquals(specialCargo.shoot(), 15);
		
		normalWar.setPower(new Lv2Power());
		specialWar.setPower(new Lv2Power());
		
		normalCargo.setPower(new Lv2Power());
		specialCargo.setPower(new Lv2Power());
		
		assertEquals(normalWar.shoot(), 200);
		assertEquals(specialWar.shoot(), 300);
		
		assertEquals(normalCargo.shoot(), 20);
		assertEquals(specialCargo.shoot(), 30);
		
	}
	

}
