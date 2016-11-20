package mig.core;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

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
		
	}
	
	/**
	 * Remove a object from the inventory
	 * @param name Name of the Object that you want to remove
	 * There is a test to check if an object in the inventory exist with this name
	 * 
	 * @see Owned#exist(PhysicalObject)
	 * @see Owned#inventory
	 * @see PhysicalObject
	 */
	public void removeObject (String name){
		
	}
	
	/**
	 * Remove a key from the bunch
	 * We does not authorize to remove a key from another class
	 * @param key Key that you want to remove
	 * There is a test to check if the key exists in the bunch
	 * 
	 * @see Owned#exist(Key)
	 * @see Owned#bunch
	 * @see Key
	 */
	private void removeKey (Key key){
		
	}
	
	/**
	 * Remove an Information from the notebook
	 * We does not authorize to remove a information from another class
	 * @param info Information that you want to remove
	 * There is a test to check if the information exists in the notebook
	 * 
	 * @see Owned#exist(Information)
	 * @see Owned#notebook
	 * @see Information
	 */
	private void removeInformation (Information info){
		
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
	public boolean exist (Key key){
		return false;
	}
	
	/**
	 * Method to test if an information exists in the notebook
	 * @param info Information tested
	 * @return True if it exists in the bunch 
	 * false if it is not
	 * 
	 * @see Owned#notebook
	 * @see Key
	 */
	public boolean exist(Information info){
		return false;
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
		return false;
	}
	
	/**
	 * Method to get an Object from the inventory
	 * @param name Name of the object
	 * @return The object 
	 * throws an error if the object asked does not exist in the inventory
	 *
	 * @see Owned#inventory
	 * @see PhysicalObject
	 */
	//TODO prévoir une exception si l'object n'existe pas : @throws
	public PhysicalObject getObject(String name){
		return null;
	}
	
	
	
}