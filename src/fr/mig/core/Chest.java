package fr.mig.core;
import java.util.ArrayList;

/**
 * The Class Chest
 * The class Chest creates a Chest with a Bolt.
 * The Class Bolt is abstract so it will be a class Lock or a class Code.
 * @author Group 8
 *
 */
public class Chest {
	/**
	 * ArrayList of all items contained in this Chest
	 */
	private ArrayList<Item> containt;
	
	/**
	 * Bolt of the Chest
	 */
	private Bolt bolt;
	
	/**
	 * Default Constructor
	 */
	public Chest (){
	}
	
	/**
	 * Method to add an item in the Chest
	 * @param item
	 * Item to add in the Chest
	 */
	public void addItem(Item item){
		
	}
	
	/** 
	 * Method to get the reward contained in the Chest
	 * @return containt
	 * The list of Items in the Chest
	 */
	public ArrayList<Item> getContaintChest(){
		return containt;
	}

}
