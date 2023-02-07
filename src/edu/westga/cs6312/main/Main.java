package edu.westga.cs6312.main;

import edu.westga.cs6312.model.Abura;
import edu.westga.cs6312.model.OrientedStrandBoard;
import edu.westga.cs6312.model.Wood;

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
		OrientedStrandBoard myWood = new OrientedStrandBoard();
		Wood myWood2 = new Wood();
		myWood2.setPricePerFoot(30);
		myWood2.setJankaHardness(830);
				
		System.out.println(myWood.totalAveragePricePerTree(4));
	}

}
