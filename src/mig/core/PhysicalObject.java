package mig.core;
/**
 * <b>The class PhysicalObject represents the physical items given or found by the player.</b>
 * <p>
 * it uses inheritance from the class EnigmaItem
 * </p>
 * 
 * @see EnigmaItem
 * 
 * @author Group 8
 * @version 22/11/2016
 */
public class PhysicalObject extends EnigmaItem {
	/**
	 * Constructor of the class PhysicalObject
	 * 
	 * @param name Name of the Physical Object
	 * @param information Information about the Physical Object
	 * 
	 * If name of information are null , there will be default value for them
	 */
	public PhysicalObject(String name, String information ) {
		super(name,information);
	}
	
	/**
	 * Method that allows the user to use a physical object
	 */
	public void useObject(){
		// TODO Approfondir la méthode 
	}
}
