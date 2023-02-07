package edu.westga.cs6312.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.westga.cs6312.controller.GoWestLumber;
import edu.westga.cs6312.model.Abura;
import edu.westga.cs6312.model.OrientedStrandBoard;
import edu.westga.cs6312.model.Tamarind;
import edu.westga.cs6312.model.Wood;
import edu.westga.cs6312.model.YellowBirch;

class GoWestLumberClassValidation {
	private GoWestLumber lumberInventory;
	private Abura myWood1;
	private Tamarind myWood2;
	private YellowBirch myWood3;
	private OrientedStrandBoard myWood4;

	@BeforeEach
	void setUp() throws Exception {
		this.lumberInventory = new GoWestLumber();
		this.myWood1 = new Abura();
		this.myWood2 = new Tamarind();
		this.myWood3 = new YellowBirch();
		this.myWood4 = new OrientedStrandBoard();
	}

	@AfterEach
	void tearDown() throws Exception {
		this.lumberInventory = null;
		this.myWood1 = null;
		this.myWood2 = null;
		this.myWood3 = null;
		this.myWood4 = null;
	}

	@Test
	void testSetLumberInventoryNullThrowsException() {
		assertThrows(IllegalArgumentException.class, () -> {
			this.lumberInventory.setLumberInventory(null);
		});
	}
	
	@Test
	void testGetMostExpensiveWoodValue() {
		
		ArrayList<Wood> lumberInventoryValues = new ArrayList<Wood>();
		lumberInventoryValues.add(this.myWood1);
		lumberInventoryValues.add(this.myWood2);
		lumberInventoryValues.add(this.myWood3);
		lumberInventoryValues.add(this.myWood4);
		
		this.lumberInventory.setLumberInventory(lumberInventoryValues);
		
		assertEquals("Tamarindus indica", this.lumberInventory.getMostExpensiveWood().getScientificName(), "Testing getMostExpensiveWood");
	
	}
	
	@Test
	void testGetHighestJankaWoodValue() {
		
		ArrayList<Wood> lumberInventoryValues = new ArrayList<Wood>();
		lumberInventoryValues.add(this.myWood1);
		lumberInventoryValues.add(this.myWood2);
		lumberInventoryValues.add(this.myWood3);
		lumberInventoryValues.add(this.myWood4);
		
		this.lumberInventory.setLumberInventory(lumberInventoryValues);
		
		assertEquals("Tamarindus indica", this.lumberInventory.getHighestJankaWood().getScientificName(), "Testing getHighestJankaWood");
	
	}
	
	@Test
	void testGetWoodByNamesValue() {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add(this.myWood1.getScientificName());
		names.add("Sample");
		names.add(this.myWood3.getScientificName());
		
		ArrayList<Wood> lumberInventoryValues = new ArrayList<Wood>();
		lumberInventoryValues.add(this.myWood1);
		lumberInventoryValues.add(this.myWood2);
		lumberInventoryValues.add(this.myWood3);
		
		this.lumberInventory.setLumberInventory(lumberInventoryValues);
		
		assertEquals(2, this.lumberInventory.getWoodByNames(names).size(), "Testing getWoodByNames");
	
	}

}