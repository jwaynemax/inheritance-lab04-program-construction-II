package edu.westga.cs6312.controller;

import java.util.ArrayList;

import edu.westga.cs6312.model.Wood;

/**
 * Defines GoWestLumber object
 * @author justinmaxwell
 * @version 2/6/23
 *
 */
public class GoWestLumber {
	private ArrayList<Wood> lumberInventory;
	
	/**
	 * GoWestLumber constructor
	 */
	public GoWestLumber() {
		this.setLumberInventory(new ArrayList<Wood>());
	}
	
	/**
	 * Getter
	 * @return lumberInventory
	 */
	public ArrayList<Wood> getLumberInventory() {
		return this.lumberInventory;
	}
	
	/**
	 * Setter
	 * @param lumberInventory set lumberInventory
	 */
	public void setLumberInventory(ArrayList<Wood> lumberInventory) {
		if (lumberInventory == null) {
			throw new IllegalArgumentException("lumberInventory cannot be null");
		}
		this.lumberInventory = lumberInventory;
	}
	
	/**
	 * Returns the most expensive Wood in inventory
	 * @return the most expensive Wood or null if no Wood
	 */
	public Wood getMostExpensiveWood() {
		
		double max = 0;
		Wood mostExpensive = this.lumberInventory.get(0);
		
		for (Wood lumberInventory: this.getLumberInventory()) {
			if (lumberInventory.getPricePerFoot() > max) {
				max = lumberInventory.getPricePerFoot();
				mostExpensive = lumberInventory;
			}
		}
		
		return mostExpensive;
	}
	
	/**
	 * Returns the Wood with the highest Janka rating
	 * @return the highest Janka rated wood or null if no wood
	 */
	public Wood getHighestJankaWood() {
		double max = 0;
		Wood highest = this.lumberInventory.get(0);
		
		for (Wood lumberInventory: this.getLumberInventory()) {
			if (lumberInventory.getJankaHardness() > max) {
				max = lumberInventory.getJankaHardness();
				highest = lumberInventory;
			}
		}
		
		return highest;
	}
	
	/**
	 * Get a list of Woods with names that match
	 * @param woodNames the names to compare to
	 * @return a list of Wood(s) -case agnostic - or empty list if none match
	 */
	public ArrayList<Wood> getWoodByNames(ArrayList<String> woodNames) {
		
		ArrayList<Wood> matchingName = new ArrayList<Wood>();
		
		for (Wood lumberInventory: this.getLumberInventory()) {
			for (String name: woodNames) {
				if (lumberInventory.getScientificName() == name) {
					matchingName.add(lumberInventory);
				}
			}
		}
		
		return matchingName;
	}
	
}
