package mig.core;

/**
 * <b>Key is the class that represents a key which can open a lock</b>
 * 
 * @author Group8
 * @version 20/11/2016
 * 
 * @see Item
 *
 */
public class Key extends Item {
	
	/**
	 * Constructor of the Key 
	 * The Weight is set at 0.
	 * @param name Name of the Key
	 */
	public Key (String name){
		setName(name);
		setWeight(0);
	}

}
