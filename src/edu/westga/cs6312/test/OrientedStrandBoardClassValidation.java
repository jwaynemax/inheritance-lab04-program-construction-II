package edu.westga.cs6312.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.westga.cs6312.model.OrientedStrandBoard;
import edu.westga.cs6312.model.Wood;

/**
 * Test Wood class
 * @author justinmaxwell
 * @version 2/6/23
 */
class OrientedStrandBoardClassValidation {

	private OrientedStrandBoard woodTestObject; 

	@BeforeEach
	void setUp() throws Exception {
		this.woodTestObject = new OrientedStrandBoard();
	}

	@AfterEach
	void tearDown() throws Exception {
		this.woodTestObject = null;
	}

	@Test
	void testSetScientificNameNullThrowsException() {
		assertThrows(IllegalArgumentException.class, () -> {
			this.woodTestObject.setScientificName(null);
		});
	}

	@Test
	void testSetCommonNamesNullThrowsException() {
		assertThrows(IllegalArgumentException.class, () -> {
			this.woodTestObject.setCommonNames(null);
		});
	}

	@Test
	void testSetTreeHeightLessThanZeroThrowsException() {
		assertThrows(IllegalArgumentException.class, () -> {
			this.woodTestObject.setTreeHeight(-1.0);
		});
	}

	@Test
	void testSetTreeDiameterLessThanZeroThrowsException() {
		assertThrows(IllegalArgumentException.class, () -> {
			this.woodTestObject.setTreeDiameter(-1.0);
		});
	}

	@Test
	void testSetJankaHardnessLessThanZeroThrowsException() {
		assertEquals(0, this.woodTestObject.getJankaHardness(), "Testing getJankaHardness");
	}

	@Test
	void testSetCommonUsesNullThrowsException() {
		assertThrows(IllegalArgumentException.class, () -> {
			this.woodTestObject.setCommonUses(null);
		});
	}

	@Test
	void testSetPricePerFootLessThanZeroThrowsException() {
		assertThrows(IllegalArgumentException.class, () -> {
			this.woodTestObject.setPricePerFoot(-1.0);
		});
	}
	
	@Test
	void testIsWoodInterchangeableNullThrowsException() {
		assertThrows(IllegalArgumentException.class, () -> {
			this.woodTestObject.isWoodInterchangeable(null);
		});
	}
	
	@Test
	void testIsWoodInterchangeableTrueValue() {
		Wood interchangeableWood = new Wood();
		interchangeableWood.setPricePerFoot(12.0);
		interchangeableWood.setJankaHardness(3);
		
		assertEquals(true, this.woodTestObject.isWoodInterchangeable(interchangeableWood), "Testing isWoodInterchangeable");
	}
	
	@Test
	void testTotalAveragePricePerTreeValue() {
		
		assertEquals(81.18, this.woodTestObject.totalAveragePricePerTree(4), "Testing totalAveragePricePerTree");
	}
	
	@Test
	void testTotalAveragePricePerTreeZero() {
		
		assertThrows(IllegalArgumentException.class, () -> {
			this.woodTestObject.totalAveragePricePerTree(0);
		});
	}
}
