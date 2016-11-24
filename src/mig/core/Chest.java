package mig.core;
import java.util.ArrayList;
import mig.core.Code;

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
	private ArrayList<Item> containt = new ArrayList<Item>();
	
	/**
	 * Bolt of the Chest
	 * It can be a key or a password
	 */
	private Bolt bolt;

	
	/**
	 * Default Constructor
	 */
	public Chest (Bolt bolt){
		this.bolt=bolt;
	}
	
	public boolean isLocked(){
		return bolt.isLocked();
	}
	
	/**
	 * Method to add an item in the Chest
	 * @param item Item to add in the Chest
	 */
	public void addItem(Item item){
		if (!containt.contains(item)) containt.add(item); 
	}
	
	
	/**
	 * Method to remove an item in the Chest
	 * @param item Item to remove from the chest
	 */
	public void removeItem(Item item){
		if (containt.contains(item)) containt.remove(item);
	}
	
	/**
	 * Method to calculate and get the number of items in the Chest
	 * @return number of items in the Chest
	 */
	public int numberOfItems(){
		return containt.size();
	}
	
	/** 
	 * Method to get the reward contained in the Chest
	 * @return containt The list of Items in the Chest
	 */
	public ArrayList<Item> getContaintChest(){
		return containt;
	}
	
	/** 
	 * Method to get the reward contained in the Chest
	 * @return containt The list of Items in the Chest
	 */
	public void OpenChest(String pass){
		if (bolt instanceof Code) {
		((Code) bolt).givePassword(pass);
		bolt.unlockIt();
			
		}

		
	}
}
