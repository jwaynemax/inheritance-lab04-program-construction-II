package edu.westga.cs6312.model;

import java.util.ArrayList;

/**
 * OSB Constructor -- extends Wood
 * @author justinmaxwell
 * @version 2/6/23
 */
public class OrientedStrandBoard extends Wood {
	
	/**
	 * OrientedStrandBoard constructor
	 */
	public OrientedStrandBoard() {
		super.setScientificName("");
		this.setCommonNames();
		super.setTreeHeight(8.0);
		super.setTreeDiameter(4.1);
		super.setJankaHardness(0);
		this.setCommonUses();
		super.setPricePerFoot(9.90);
	}
	
	/**
	 * Overload Common Names
	 */
	public void setCommonNames() {
		ArrayList<String> commonName = new ArrayList<>();
		commonName.add("Plywood");
		commonName.add("OSB");
		commonName.add("Oriented Strand Board");

		super.setCommonNames(commonName);
	}
	
	/**
	 * Overload Common Uses
	 */
	public void setCommonUses() {
		ArrayList<String> commonUse = new ArrayList<>();
		commonUse.add("construction");
		commonUse.add("flooring");
				
		super.setCommonUses(commonUse);
	}
	
	/**
	 * Override jankaHardness from Wood
	 * Setter
	 * @param jankaHardness the jankaHardness to set
	 */
	@Override
	public void setJankaHardness(int jankaHardness) {
		this.jankaHardness = jankaHardness;
	}
	
	/**
	 * Override totalAveragePricePerTree from Wood
	 * Get the total price to purchase the whole tree
	 * 
	 * @return price for whole tree (estimated)
	 */
	@Override
	public double totalAveragePricePerTree() {
		
		double boardFeet = Math.pow((this.treeDiameter - 4), 2) * (this.treeHeight / 16);

		double avgPrice = this.pricePerFoot * boardFeet;
		
		return Math.round(avgPrice * 100.0) / 100.0;
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
