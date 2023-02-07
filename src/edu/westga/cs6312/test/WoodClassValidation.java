package edu.westga.cs6312.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.westga.cs6312.model.Wood;

/**
 * Test Wood class
 * @author justinmaxwell
 * @version 2/6/23
 */
public class WoodClassValidation {
	
	private Wood woodTestObject; 

	@BeforeEach
	void setUp() throws Exception {
		this.woodTestObject = new Wood();
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
		assertThrows(IllegalArgumentException.class, () -> {
			this.woodTestObject.setJankaHardness(-1);
		});
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
		this.woodTestObject.setScientificName("Maple");
		Wood woodToCompare = new Wood();
		woodToCompare.setScientificName("Maple");
		
		assertEquals(true, this.woodTestObject.isWoodInterchangeable(woodToCompare), "Testing isWoodInterchangeable");
	}
	
	@Test
	void testTotalAveragePricePerTreeDiameterThrowsException() {
		this.woodTestObject.setTreeDiameter(0);
		this.woodTestObject.setTreeHeight(10.0);
		
		assertThrows(IllegalArgumentException.class, () -> {
			this.woodTestObject.totalAveragePricePerTree();
		});
	}
	
	@Test
	void testTotalAveragePricePerTreeHeightThrowsException() {
		this.woodTestObject.setTreeDiameter(10.0);
		this.woodTestObject.setTreeHeight(0);
		
		assertThrows(IllegalArgumentException.class, () -> {
			this.woodTestObject.totalAveragePricePerTree();
		});
	}
	
	@Test
	void testTotalAveragePricePerTreeValue() {
		this.woodTestObject.setTreeDiameter(28.0);
		this.woodTestObject.setTreeHeight(10.0);
		this.woodTestObject.setPricePerFoot(1.0);

		assertEquals(15830.05, this.woodTestObject.totalAveragePricePerTree(), "Testing totalAveragePricePerTree");
	}

}
