package mig.core;
import java.util.ArrayList;

/**
 * <b>Chest is the class representing a chest with a bolt.</b>
 * <b>The Class Bolt is abstract so it will be a class Lock or a class Code.</b>
 * <p>
 * A Chest contains these elements
 * </p>
 * <ul>
 * <li>A Bolt that allows the chest to be locked or not</li>
 * <li>A list or items that are stored in the chest.</li>
 * </ul>
 * 
 * <p>A chest always has a bolt so a chest can't exist without a bolt.</p>
 * <p>A chest can be unlocked with a key or a code.</p>
 * 
 * @see Bolt
 * @see Lock
 * @see Code
 * 
 * @author Group 8
 * @version 22/11/2016
 */
public class Chest {
	/**
	 * ArrayList of all items contained in this Chest
	 * A chest can contains a maximum of 4 items
	 */
	private ArrayList<Item> containt;
	
	/**
	 * Bolt of the Chest
	 * It can be a key or a password
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
