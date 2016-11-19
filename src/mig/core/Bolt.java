package mig.core;

/**
 * The class bolt allows an object to be locked in the game
 * For example a chest or a door
 * @author Group 8
 *
 */
public abstract class Bolt {
	/*
	 * Locked represent if the bolt is locked or not
	 */
	protected boolean locked;

	/**
	 * Default Constructor 
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
