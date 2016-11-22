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
	 * @param name
	 * @param information
	 */
	public PhysicalObject(String name, String information ) {
		setName(name);
		setInformation(information);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Method that allows the user to use a physical object
	 */
	public void useObject(){
		// TODO Approfondir la méthode 
	}
}
