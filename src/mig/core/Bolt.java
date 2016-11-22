package mig.core;

/**
 * <b>Bolt is the class representing a bolt, for a chest for example.</b>
 * <b>The class Bolt allows an object to be locked in the game.</b>
 * <b>For example a chest or a door.</b>
 * <p>
 * A Bolt contains these elements
 * </p>
 * <ul>
 * <li>A state locked or not, it is a boolean fixed when the bolt is created.</li>
 * </ul>
 * 
 * 
 * @author Group 8
 * @version 22/11/2016
 */
public abstract class Bolt {
	 /**
	  */
	protected boolean locked;

	/**
	 * Default Constructor 
	 * It is the state of the Bolt
	 * Locked represent if the bolt is locked or not
	 */
	public Bolt(){
		locked = false; 
	}

	/**
	 * Method to check if the bolt is locked or not
	 * @return locked 
	 * Parameter of the class Bolt
	 */
	public boolean checkState () {
		return locked;
	}
}
