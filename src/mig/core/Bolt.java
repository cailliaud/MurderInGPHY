package mig.core;

/**
 * <b>Bolt is the class representing a bolt, for a chest for example.</b>
 * <b>This class is abstract, it will be impossible to instantiate it</b>
 * <b>The class Bolt allows an object to be locked in the game.</b>
 * <b>For example a chest or a door.</b>
 * <p>
 * A Bolt contains these elements
 * </p>
 * <ul>
 * <li>A state locked or not, it is a boolean fixed when the bolt is created.</li>
 * <li>A Bolt can be unlocked but cannot be locked after being unlocked.</li>
 * </ul>
 * 
 * 
 * @author Group 8
 * @version 22/11/2016
 */
public abstract class Bolt {
	 /**
	  * Boolean that will be true if the lock is locked and false if it is not
	  */
	private boolean locked;

	/**
	 * Default Constructor 
	 * It is the state of the Bolt
	 * Locked represent if the bolt is locked or not
	 * 
	 * @param b True if you want to lock the Bolt, False if you want to let it unlocked
	 */
	public Bolt(boolean b){
		this.locked = b; 
	}

	/**
	 * Method to check if the bolt is locked or not
	 * @return locked 
	 * Parameter of the class Bolt
	 */
	public boolean isLocked () {
		return locked;
	}
	


	/**
	 * Method to unlock the Bolt
	 * It will set the private parameter locked to false
	 */
	public void unlockIt(){
		if (this.locked){
		this.locked=false;}
	}
	
	


}
