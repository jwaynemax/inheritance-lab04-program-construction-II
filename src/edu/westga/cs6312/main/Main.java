package edu.westga.cs6312.main;

import java.util.ArrayList;

import edu.westga.cs6312.controller.GoWestLumber;
import edu.westga.cs6312.model.Abura;
import edu.westga.cs6312.model.OrientedStrandBoard;
import edu.westga.cs6312.model.Tamarind;
import edu.westga.cs6312.model.Wood;
import edu.westga.cs6312.model.YellowBirch;

/**
 * define objects
 * @author justinmaxwell
 * @version 2/6/23
 *
 */
public class Main {

	/**
	 * Entry point to the application 
	 * @param args not used
	 */
	public static void main(String[] args) {
		Abura myWood1 = new Abura();
		Tamarind myWood2 = new Tamarind();
		YellowBirch myWood3 = new YellowBirch();
		
		ArrayList<String> names = new ArrayList<String>();
		names.add(myWood1.getScientificName());
		names.add("Sample");
		names.add(myWood3.getScientificName());
		
		ArrayList<Wood> lumberInventory = new ArrayList<Wood>();
		lumberInventory.add(myWood1);
		lumberInventory.add(myWood2);
		lumberInventory.add(myWood3);
		
		GoWestLumber myStore = new GoWestLumber();
		
		myStore.setLumberInventory(lumberInventory);
				
		System.out.println(myStore.getWoodByNames(names));

				
	}

}
