package edu.westga.cs6312.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import edu.westga.cs6312.model.Wood;

public class WoodClassValidation {
	
	// We are NOT testing subclasses here - only the superclass Wood
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
		fail("Not yet implemented");
	}

	@Test
	void testSetCommonNamesNullThrowsException() {
		fail("Not yet implemented");
	}

	@Test
	void testSetTreeHeightLessThanZeroThrowsException() {
		fail("Not yet implemented");
	}

	@Test
	void testSetTreeDiameterLessThanZeroThrowsException() {
		fail("Not yet implemented");
	}

	@Test
	void testSetJankaHardnessLessThanZeroThrowsException() {
		fail("Not yet implemented");
	}

	@Test
	void testSetCommonUsesNullThrowsException() {
		fail("Not yet implemented");
	}

	
	@Test
	void testSetPricePerFootLessThanZeroThrowsException() {
		fail("Not yet implemented");
	}

}
