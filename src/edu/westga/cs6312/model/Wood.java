package edu.westga.cs6312.model;

import java.util.ArrayList;

/**
 * Define wood object
 * @author justinmaxwell
 * @version 2/6/23
 *
 */
public class Wood {
	protected String scientificName;
	protected ArrayList<String> commonNames; 
	protected double treeHeight;
	protected double treeDiameter; 
	protected int jankaHardness;
	protected ArrayList<String> commonUses;
	protected double pricePerFoot;
	
	/**
	 * Default / 0-param Constructor
	 * 
	 */
	public Wood() {
		this.setScientificName("");
		this.setCommonNames(new ArrayList<String>());
		this.setTreeHeight(0.0);
		this.setTreeDiameter(0.0);
		this.setJankaHardness(0);
		this.setCommonUses(new ArrayList<String>());
		this.setPricePerFoot(0.0);
	}
	
	/**
	 * Check if the Wood passed in could be a substitute for this current Wood
	 * @param woodToCompare Wood to compare
	 * @return true if it is a valid substitute
	 */
	public boolean isWoodInterchangeable(Wood woodToCompare) {
		if (woodToCompare == null) {
			throw new IllegalArgumentException("woodToCompare cannot be null");
		}
		
		boolean output = false;
		
		if (woodToCompare.getScientificName().equals(this.scientificName)) {
			output = true;
		} 
		
		return output;
	}
	
	/**
	 * Get the total price to purchase the whole tree
	 * 
	 * @return price for whole tree (estimated)
	 */
	public double totalAveragePricePerTree() {
		
		double diameterToFeet = this.treeDiameter * 3.28084;
		double heightToFeet = this.treeHeight * 3.28084;
		
		if (diameterToFeet == 0 || heightToFeet == 0) {
			throw new IllegalArgumentException("treeDiameter & treeHeight cannot be 0");
		}
		
		double boardFeet = Math.pow((diameterToFeet - 4), 2) * (heightToFeet / 16);

		double avgPrice = this.pricePerFoot * boardFeet;
		
		return Math.round(avgPrice * 100.0) / 100.0;
	}
	
	/**
	 * Getter
	 * @return the scientificName
	 */
	public String getScientificName() {
		return this.scientificName;
	}

	/**
	 * Setter
	 * @param scientificName the scientificName to set
	 */
	public void setScientificName(String scientificName) {
		if (scientificName == null) {
			throw new IllegalArgumentException("scientificName cannot be null");
		}
		this.scientificName = scientificName;
	}

	/**
	 * Getter
	 * @return the commonNames
	 */
	public ArrayList<String> getCommonNames() {
		return this.commonNames;
	}

	/**
	 * Setter
	 * @param commonNames the commonNames to set
	 */
	public void setCommonNames(ArrayList<String> commonNames) {
		if (commonNames == null) {
			throw new IllegalArgumentException("commonNames cannot be null");
		}
		this.commonNames = commonNames;
	}

	/**
	 * Getter
	 * @return the treeHeight
	 */
	public double getTreeHeight() {
		return this.treeHeight;
	}

	/**
	 * Setter
	 * @param treeHeight the treeHeight to set
	 */
	public void setTreeHeight(double treeHeight) {
		if (Double.compare(treeHeight, 0.0) < 0) {
			throw new IllegalArgumentException("treeHeight cannot be less than 0");
		}
		this.treeHeight = treeHeight;
	}

	/**
	 * Getter
	 * @return the treeDiameter
	 */
	public double getTreeDiameter() {
		return this.treeDiameter;
	}

	/**
	 * Setter
	 * @param treeDiameter the treeDiameter to set
	 */
	public void setTreeDiameter(double treeDiameter) {
		if (Double.compare(treeDiameter, 0.0) < 0) {
			throw new IllegalArgumentException("treeDiameter cannot be less than 0");
		}
		this.treeDiameter = treeDiameter;
	}

	/**
	 * Getter
	 * @return the jankaHardness
	 */
	public int getJankaHardness() {
		return this.jankaHardness;
	}

	/**
	 * Setter
	 * @param jankaHardness the jankaHardness to set
	 */
	public void setJankaHardness(int jankaHardness) {
		if (jankaHardness < 0) {
			throw new IllegalArgumentException("jankaHardness cannot be less than 0");
		}
		this.jankaHardness = jankaHardness;
	}

	/**
	 * Getter
	 * @return the commonUses
	 */
	public ArrayList<String> getCommonUses() {
		return this.commonUses;
	}

	/**
	 * Setter
	 * @param commonUses the commonUses to set
	 */
	public void setCommonUses(ArrayList<String> commonUses) {
		if (commonUses == null) {
			throw new IllegalArgumentException("commonUses cannot be null");
		}
		this.commonUses = commonUses;
	}

	/**
	 * Getter
	 * @return the pricePerFoot
	 */
	public double getPricePerFoot() {
		return this.pricePerFoot;
	}

	/**
	 * Setter
	 * @param pricePerFoot the pricePerFoot to set
	 */
	public void setPricePerFoot(double pricePerFoot) {
		if (Double.compare(pricePerFoot, 0.0) < 0) {
			throw new IllegalArgumentException("pricePerFoot cannot be less than 0");
		}
		
		this.pricePerFoot = pricePerFoot;
	}
}
