package edu.westga.cs6312.model;

import java.util.ArrayList;

/**
 * Defines Tamarind -- extends Wood
 * @author justinmaxwell
 * @version 2/6/23
 */
public class Tamarind extends Wood {
	
	/**
	 * Tamarind constructor
	 */
	public Tamarind() {
		super.setScientificName("Tamarindus indica");
		this.setCommonNames();
		super.setTreeHeight(24.0);
		super.setTreeDiameter(1.0);
		super.setJankaHardness(2690);
		this.setCommonUses();
		super.setPricePerFoot(32.50);
	}
	
	/**
	 * Overload Common Names
	 */
	public void setCommonNames() {
		ArrayList<String> commonName = new ArrayList<>();
		commonName.add("Tamarind");
		commonName.add("Spalted Tamarind");

		super.setCommonNames(commonName);
	}
	
	/**
	 * Overload Common Uses
	 */
	public void setCommonUses() {
		ArrayList<String> commonUse = new ArrayList<>();
		commonUse.add("furniture");
		commonUse.add("carvings");
		commonUse.add("turned objects");
				
		super.setCommonUses(commonUse);
	}

}
