package mig.core;

/**
 * The OpenedBolt is a bolt which stays opened forever
 * 
 * @author group8
 * @version 22/11/2016
 * 
 * @see Bolt
 */
public class OpenedBolt extends Bolt {

	/**
	 * Constructor of the OpenedBolt
	 * The Opened Door is unlocked forever 
	 * It is defined in the constructor 
	 */
	public OpenedBolt() {
		super(false);
	}

}
