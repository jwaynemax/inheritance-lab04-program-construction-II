package edu.westga.cs6312.main;

import edu.westga.cs6312.model.Abura;
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
		
		YellowBirch myWood = new YellowBirch();
		
		System.out.println(myWood.getCommonUses());
	}

}
