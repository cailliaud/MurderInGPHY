package mig.core;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

import mig.exceptions.ErrorNameGiven;

/**
 * <b>Owned is the class that contains the bunch, the inventory and the notebook </b>
 * <p>
 * Owned contains these elements:
 * </p>
 * <ul>
 * 		<li>A bunch of keys</li>
 * 		<li>A notebook which contains information</li>
 * 		<li>An inventory which contains Physical Object.</li>
 * </ul>
 * <p>
 * This class refuse object(key, information, PhysicalObject) in double in its ArrayList
 * </p>
 * 
 * @see Key
 * @see Information
 * @see PhysicalObject
 * 
 * @author Group8
 * @version 20/11/2016
 */
public class Owned {


	/**
	 * Bunch of the player
	 * Contains all the keys get by the personage
	 */
	private ArrayList<Key> bunch;

	/**
	 * Notebook of the player
	 * Contains all the information get by the personage
	 */
	private ArrayList<Information> notebook;

	/**
	 * inventory of the player
	 * Contains all the PhysicalObject get by the personage
	 * Its size is defined.
	 */
	private ArrayBlockingQueue<PhysicalObject> inventory;

	/**
	 * Constructor
	 * @param slots It represents the maximum items contained in the inventory (integer)
	 * 
	 * @see Owned#inventory
	 * @see Owned#notebook
	 * @see Owned#bunch
	 */
	public Owned (int slots){
		this.inventory=new ArrayBlockingQueue<PhysicalObject>(slots);
		this.notebook = new ArrayList<Information>();
		this.bunch= new ArrayList<Key>();
	}

	/**
	 * Method to get the size of the inventory
	 * @return the size of the inventory
	 * 
	 * @see Owned#inventory
	 * @see ArrayBlockingQueue
	 */
	public int getSize(){
		return inventory.size();
	}

	/**
	 * Add an Information into the notebook
	 * @param info Information object added into the notebook
	 * There is a test if the information is already present in the notebook
	 * 
	 * @see Owned#exist(Information)
	 * @see Owned#notebook
	 * @see Information
	 */
	public void addInformation (Information info){
		if (!notebook.contains(info)) notebook.add(info);
		info.existNow();
	}

	/**
	 * Add a Key into the bunch
	 * @param key Key object added into the bunch
	 * There is a test if the key is already present in the bunch
	 * 
	 * @see Owned#exist(Key)
	 * @see Owned#bunch
	 * @see Key
	 */
	public void addKey (Key key){
		if (!bunch.contains(key)) bunch.add(key);
		key.existNow();
	}

	/**
	 * Add a PhysicalObject into the inventory
	 * @param object PhysicalObject given 
	 * There is a test if the PhysicalObject is not already in the inventory
	 * 
	 * @see Owned#exist(PhysicalObject)
	 * @see Owned#inventory
	 * @see PhysicalObject
	 */
	public void addObject (PhysicalObject object){
		if(!inventory.contains(object)) inventory.add(object);
		object.existNow();

	}

	/**
	 * Remove a object from the inventory
	 * @param name Name of the Object that you want to remove
	 * There is a test to check if an object in the inventory exist with this name
	 * @throws ErrorNameGiven 
	 * 
	 * @see Owned#exist(PhysicalObject)
	 * @see Owned#inventory
	 * @see PhysicalObject
	 */
	public PhysicalObject removeObject (String name) throws ErrorNameGiven{
		for (PhysicalObject obj : inventory) {
			if (obj.getName()==name) 
			{
				inventory.remove(obj);
				return(obj);
			}

		}
		throw new ErrorNameGiven();

	}


	/**
	 * Method to test if a key exists in the bunch
	 * @param key Key tested
	 * @return True if it exists in the bunch 
	 * false if it is not
	 * 
	 * @see Owned#bunch
	 * @see Key
	 */
	public boolean exist(Key key){
		return bunch.contains(key);
	}

	/**
	 * Method to test if an information exists in the notebook
	 * @param info Information tested
	 * @return True if it exists in the bunch 
	 * false if it is not
	 * 
	 * @see Owned#notebook
	 * @see Information
	 */
	public boolean exist(Information info){
		return notebook.contains(info);
	}

	/**
	 * Method to test if an object exists in the inventory
	 * @param object PhysicalObject tested
	 * @return True if it exists in the bunch 
	 * false if it is not
	 * 
	 * @see Owned#inventory
	 * @see PhysicalObject
	 */
	public boolean exist(PhysicalObject object){
		return inventory.contains(object);
	}

	/**
	 * Method to get an Object from the inventory
	 * @param name Name of the object
	 * @return The object 
	 * throws an error if the object asked does not exist in the inventory
	 * The PhysicalObject is removed from the inventory.
	 * @see Owned#inventory
	 * @see PhysicalObject
	 * @throws ErrorNameGiven
	 */
	public PhysicalObject getObject(String name)
			throws ErrorNameGiven
	{
		for (PhysicalObject item : inventory) {
			if (item.getName()==name) 
			{
				inventory.remove(item);
				return item;
			}

		}

		throw new ErrorNameGiven();

	}

	
	/**
	 * Method to get an Information from the inventory
	 * @param name Name of the info
	 * @return The information asked 
	 * throws an error if the object asked does not exist in the notebook
	 *
	 * @see Owned#notebook
	 * @see Information
	 * @throws ErrorNameGiven
	 */
	public Information getInfo(String name)
			throws ErrorNameGiven
	{
		for (Information info : notebook) {
			if (info.getName()==name) 
			{
				return info;
			}

		}

		throw new ErrorNameGiven();

	}
	

	
	public String displayNotebook(){
		String str ="This all the information that i have currently in my notebook :\n";
		for (Information info : notebook) {
			str+=info+"\n";
		}
		
		return str;
	}
	
	public String displayInventory(){
		String str ="This all the Object that i have in my bag :\n";
		for (PhysicalObject obj : inventory) {
			str+=obj+"\n";
		}
		
		return str;
	}
	
	public String displayBunch(){
		String str ="This all the keys that i have currently in my bunch :\n";
		for (Key key : bunch) {
			str+=key+"\n";
		}
		
		return str;
	}

	public ArrayBlockingQueue<PhysicalObject> getInventory(){
		return inventory;
	}





}