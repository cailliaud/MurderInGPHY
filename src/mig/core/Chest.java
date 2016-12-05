package mig.core;
import java.util.ArrayList;
import java.util.Iterator;

import mig.core.Code;
import mig.exceptions.ErrorNameGiven;
import mig.exceptions.ErrorObjectClosed;

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
	 * @param bolt the Bolt of the chest (Code,Lock,OpenedBolt)
	 * @see Bolt
	 * @see Code
	 * @see Lock
	 * @see OpenedBolt
	 */
	public Chest (Bolt bolt){
		this.bolt=bolt;
	}

	/**
	 * Accesors for the parameter isLocked
	 * @return true if the chest is locked and false if it is not
	 */
	public boolean isLocked(){
		return bolt.isLocked();
	}

	/**
	 * Method to add an item in the Chest
	 * @param item Item to add in the Chest
	 */
	public void addItem(Item item){
		if (!containt.contains(item)) containt.add(item); 
		item.existNow();;
	}


	/**
	 * Method to remove an item in the Chest
	 * @param item Item to remove from the chest
	 */
	public void removeItem(Item item){
		if (containt.contains(item)) containt.remove(item);
		item.notExist();;
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
	 * @throws ErrorObjectClosed if the chest is not unlocked
	 */
	public ArrayList<Item> getContaintChest() throws ErrorObjectClosed
	{
		if (isLocked()){
			return containt;}
		else {throw new ErrorObjectClosed();}

	}

	/**
	 * Method to open the Chest with a Password
	 * @param pass The password given to open the chest
	 * @see Code
	 */
	public void OpenChest(String pass){
		if ((bolt instanceof Code)&&(bolt.isLocked())) {
			((Code) bolt).givePassword(pass);
			bolt.unlockIt();

		}
	}

	/**
	 * Method to open the Chest with a Key
	 * @param key The key given to open the chest
	 * @see Lock
	 */
	public void OpenChest(Key key){
		if ((bolt instanceof Lock)&&(bolt.isLocked())) {
			((Lock) bolt).giveKey(key);
			bolt.unlockIt();

		}
	}

	/**
	 * Method to know if an item is present or not in the chest
	 * @param item The item tested
	 * @return True if the item is present, false if it is not
	 */
	public boolean isPresent (Item item){
		return containt.contains(item);
	}

	/**
	 * Method to get an item from the Chest
	 * @param name The name of the item needed
	 * @return the Item from the chest
	 * @throws ErrorNameGiven if the object asked does not exist in the chest
	 * The item is removed from the chest 
	 */
	public Item getItem(String name)
	throws ErrorNameGiven
	{
		for (Item item : containt) {
			if (item.getName()==name) 
			{
				containt.remove(item);
				return item;
			}

		}

		throw new ErrorNameGiven();
	}



}
