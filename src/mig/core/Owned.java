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
	private ArrayList<PhysicalObject> inventory;

	/**
	 * The size of the inventory
	 */
	private final int slots;
	
	/**
	 * Constructor
	 * @param slots It represents the maximum items contained in the inventory (integer)
	 * 
	 * @see Owned#inventory
	 * @see Owned#notebook
	 * @see Owned#bunch
	 */
	public Owned (int slots){
		this.slots=slots;
		this.inventory=new ArrayList<PhysicalObject>();
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
		if((!inventory.contains(object))&&(inventory.size()<slots)) inventory.add(object);
		object.existNow();

	}

	/**
	 * Remove a object from the inventory
	 * @param obj the PhysicalObject that you want to remove from inventory
	 * There is a test to check if an object in the inventory exist with this name
	 * @return the PhysicalObject removed from the inventory
	 * @see Owned#exist(PhysicalObject)
	 * @see Owned#inventory
	 * @see PhysicalObject
	 */
	public PhysicalObject removeObject (PhysicalObject obj) {
		inventory.remove(obj);
		return(obj);
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
	 * @throws ErrorNameGiven if there is no items with this name
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
	 * @throws ErrorNameGiven if there are no items with the name given
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


	/**
	 * Method to display the notebook in one string
	 * @return the notebook
	 */
	public String displayNotebook(){
		String str ="This all the information that i have currently in my notebook :\n";
		for (Information info : notebook) {
			str+=info+"\n";
		}

		return str;
	}

	/**
	 * Method to display the inventory in one string
	 * @return the inventory
	 */
	public String displayInventory(){
		String str ="This all the Object that i have in my bag :\n";
		for (PhysicalObject obj : inventory) {
			str+=obj+"\n";
		}

		return str;
	}

	/**
	 * Method to display the bunch in one string
	 * @return the bunch
	 */
	public String displayBunch(){
		String str ="This all the keys that i have currently in my bunch :\n";
		for (Key key : bunch) {
			str+=key+"\n";
		}

		return str;
	}

	/**
	 * Getter for a PhysicalObject in the  inventory
	 * @param index the index of the object in the inventory
	 * @return the PhysicalObject
	 * It is considered that the index exists 
	 */
	public PhysicalObject getObject(int index){
		return inventory.get(index);
	}
	

	/**
	 * Getter for an Information in the  notebook
	 * @param index the index of the info in the notebook
	 * @return the Information
	 * It is considered that the index exists 
	 */
	public Information getInfo(int index){
		return notebook.get(index);
	}


	/**
	 * Getter for a Key in the  bunch
	 * @param idx the index of the key in the bunch
	 * @return the Key
	 * It is considered that the index exists 
	 */
	public Key getKey(int  idx){
		return bunch.get(idx);
	}

	/**
	 * Accessor for the Notebook
	 * @return ArrayList of the notebook
	 */
	public ArrayList<Information> getNotebook(){
		return this.notebook;
	}

	/**
	 * Accessor for the bunch
	 * @return ArrayList of the bunch
	 */
	public ArrayList<Key> getBunch(){
		return this.bunch;
	}

	/**
	 * Accessor for the inventory
	 * @return ArrayList of the inventory
	 */
	public ArrayList<PhysicalObject> getInventory(){
		return this.inventory;
	}

	/**
	 * Method to get the inventory to a table that contains name of object in the inventory
	 * @return the table of objet's names
	 */
	public String[] getInventoryToString(){
		String[] str = new String[getSize()];
		int i =0;
		for (PhysicalObject object : inventory) {
			str[i]=object.getName();
			i++;
		}
		return str;
	}

	/**
	 * Method to get the bunch to a table that contains name of key in the inventory
	 * @return the table of key names
	 */
	public String[] getBunchToString(){
		String[] str = new String[bunch.size()];
		int i =0;
		for (Key key : bunch) {
			str[i]=key.getName();
			i++;
		}
		return str;
	}
	
	/**
	 * Method to get the notebook to a table that contains description of info in the inventory
	 * @return the table of info's descriptions
	 */
	public String[] getNotebookToString(){
		String[] str = new String[notebook.size()];
		int i =0;
		for (Information info : notebook) {
			str[i]=info.getName();
			i++;
		}
		return str;
	}
}