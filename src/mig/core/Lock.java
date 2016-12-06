package mig.core;



/**
 * <b>Lock is the class that represents a key can unlocked a lock </b>
 * <p>
 * A Lock contains these elements :
 * </p>
 * <ul>
 * <li> Good_Gey the boolean that indicates if the key inserted is good or not</li>
 * <li>A key, can fit into the lock</li>
 * </ul>
 * 
 * <p>
 * If the key is compatible with the lock, the lock is unlocked
 * </p>
 * 
 * <p>
 * If the key isn't compatible with the lock, the lock stays locked
 * </p>
 * 
 * @see Bolt
 * @see Key
 * @see Code
 * 
 * @author Group8
 * @version 22/11/2016
 */

public class Lock extends Bolt {

	/**
	 * The key to unlock the Lock
	 */
	private Key key;
	
	/**
	 * The boolean to know if the key given is  the good one or not
	 */
	private boolean good_key =false ;
	
	/**
	 * Constructor of the Lock Class
	 * The lock is locked when it is created
	 * private locked parameter set to true
	 * @param key The key associated to unlock the Lock
	 * We consider that the user won't forget to give a key
	 */
	public Lock ( Key key)
	{
		super(true);
		this.key = key;
	}
	
	/**
	 * Method for verifying that the key corresponds to the key compatible with the lock
	 * @param key_given The key given to check if it is the good to unlock the Lock
	 * It will set the parameter good_key to true if the key is the good one
	 * @see Key
	 */
	public void giveKey(Key key_given)
	{
		if (key_given.equals(this.key)){
			good_key= true;
			}
		else {
			good_key= false;
			}
	}

	/**
	 * Method for opening the lock if the key is compatible with the lock
	 * It only works if the parameter good_key is true
	 * @see Key
	 * @see Bolt
	 */
	public void unlockIt() 
	{
		if (good_key){
			super.unlockIt();
		}
	}
	

	

	
	
}
