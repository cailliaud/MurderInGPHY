package mig.core;

import mig.exceptions.KeyForgottenException;

/**
 * <b>Lock is the class that represents a key can unlocked a lock </b>
 * <p>
 * A Lock contains these elements :
 * </p>
 * <ul>
 * <li>A key, can fit into the lock</li>
 * </ul>
 * 
 * <p>
 * If the key is compatible with the lock, the lock is unlocked
 * </p>
 * 
 * <p>
 * If the key isn't compatible with the lock, the lock is locked
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

	private Key key;
	private boolean good_key =false ;
	
	/**
	 * Constructor of the Lock Class
	 * The lock is locked when it is created
	 * private locked parameter set to true
	 * @param key The key associated to unlock the Lock
	 * This parameter cannot be null
	 */
	public Lock ( Key key)
	throws KeyForgottenException
	{
		super(true);
		if (key==null) throw new KeyForgottenException();
		//TODO prévoir Exception si clé null !
		this.key = key;
	}
	
	/**
	 * Method for verifying that the key corresponds to the key compatible with the lock
	 * @param key_given The key given to check if it is the good to unlock the Lock
	 * @return true if the key fits into the lock
	 * False if the key does not match the key opening the lock
	 *
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
	 * @param key_given The key given to check if it is the good to unlock the Lock
	 * @return true if the key can into the lock, the lock is unlocked
	 * false if the key don't open the lock.
	 *
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
