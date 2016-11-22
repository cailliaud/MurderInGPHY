package mig.core;
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
 * If 
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
	
	public Lock ( Key key){
		locked=true;
		this.key = key;
	}
	
	/**
	 * Method for verifying that the key corresponds to the key compatible with the lock
	 * @param key_given
	 * @return true if the key fits into the lock
	 * False if the key does not match the key opening the lock
	 *
	 * @see Key
	 */
	private boolean checkKey(Key key_given)
	{
		return false;
	}

	/**
	 * Method for opening the lock if the key is compatible with the lock
	 * @param key_given
	 * @return true if the key can into the lock, the lock is unlocked
	 * false if the key don't open the lock.
	 *
	 * @see Key
	 * @see Bolt
	 */
	public boolean opened(Key key_given) 
	{
		if (checkKey(key_given)){
			locked=false;
			return true;
		}
		else{
			return false;
		}
	}
	
	/**
	 * Method for closing the lock if the key is compatible with the lock
	 * @param key_given
	 * @return true if the key can into the lock, the lock is locked
	 * false if the key can't close the lock.
	 *
	 * @see Key
	 * @see Bolt
	 */
	public boolean closed(Key key_given) 
	{
		if (checkKey(key_given)){
			locked=true;
			return true;
		}
		else{
			return false;
		}
	}
	
}
