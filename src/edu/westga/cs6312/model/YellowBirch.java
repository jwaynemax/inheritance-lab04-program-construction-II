package edu.westga.cs6312.model;

import java.util.ArrayList;

/**
 * Defines YellowBirch -- extends Wood
 * @author justinmaxwell
 * @version 2/6/23
 */
public class YellowBirch extends Wood{

	/**
	 * YellowBirch constructor
	 */
	public YellowBirch() {
		super.setScientificName("Betula alleghaniensis");
		this.setCommonNames();
		super.setTreeHeight(30.0);
		super.setTreeDiameter(1.0);
		super.setJankaHardness(1260);
		this.setCommonUses();
		super.setPricePerFoot(7.50);
	}
	
	/**
	 * Overload Common Names
	 */
	public void setCommonNames() {
		ArrayList<String> commonName = new ArrayList<>();
		commonName.add("Yellow Birch");
		super.setCommonNames(commonName);
	}
	
	/**
	 * Overload Common Uses
	 */
	public void setCommonUses() {
		ArrayList<String> commonUse = new ArrayList<>();
		commonUse.add("Plywood");
		commonUse.add("boxes");
		commonUse.add("crates");
		commonUse.add("turned objects");
		commonUse.add("interior trim");
				
		super.setCommonUses(commonUse);
	}

}
