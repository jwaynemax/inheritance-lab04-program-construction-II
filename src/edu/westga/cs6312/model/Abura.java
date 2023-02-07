package edu.westga.cs6312.model;

import java.util.ArrayList;

/**
 * Define Abura object -- extends wood
 * @author justinmaxwell
 * @version 2/6/23
 *
 */
public class Abura extends Wood {
	
	/**
	 * Abura constructor
	 */
	public Abura() {
		super.setScientificName("Mitragyna ledermannii");
		this.setCommonNames();
		super.setTreeHeight(35.0);
		super.setTreeDiameter(1.5);
		super.setJankaHardness(820);
		this.setCommonUses();
		super.setPricePerFoot(15.0);
		
	}

	/**
	 * Overload Common Names
	 */
	public void setCommonNames() {
		ArrayList<String> commonName = new ArrayList<>();
		commonName.add("Abura");
		commonName.add("bahia");
		super.setCommonNames(commonName);
	}
	
	/**
	 * Overload Common Uses
	 */
	public void setCommonUses() {
		ArrayList<String> commonUse = new ArrayList<>();
		commonUse.add("furniture");
		commonUse.add("interio millwork");
		commonUse.add("plywood");
		commonUse.add("flooring");
		
		super.setCommonUses(commonUse);
	}
	
	/**
	 * Check if the Wood passed in could be a substitute for this current Wood
	 * @param woodToCompare Wood to compare
	 * @return true if it is a valid substitute
	 */
	@Override
	public boolean isWoodInterchangeable(Wood woodToCompare) {
		if (woodToCompare == null) {
			throw new IllegalArgumentException("woodToCompare cannot be null");
		}
		
		boolean output = false;
		
		if (woodToCompare.pricePerFoot <= this.pricePerFoot + 5.0 
				&& woodToCompare.pricePerFoot >= this.pricePerFoot - 5.0 
				&& woodToCompare.getJankaHardness() >= this.getJankaHardness()) {
			output = true;
		} 
		
		return output;
	}

}
