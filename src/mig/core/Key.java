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
	 * @param name Name of the Key
	 * The name as default, if name = null will be "unknown key"
	 */
	public Key (String name){
		//TODO sécurité si name =null 
		super(name);
	}

}
