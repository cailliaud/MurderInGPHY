package mig.core;

/**
 * <b>Personage is the class representing the personages in the game. It is a inheritress class for PNJ and Player class.</b>
 * <p>
 * These class is an abstract class because the user is forbidden to create a player or a PNJ. 
 * There is no function setName because it can't be modify. 
 * </p>
 * <p>
 * Personage contains these elements :
 * </p>
 * <ul>
 * <li>A name, fixed when the game is created</li>
 * <li>Is the personage is the killer</li>
 * </li>
 * </ul>
 * 
 * @author Group8
 * @version 22/11/2016
 */

public abstract class Personage {

	/**
	 * It is the name of the personage.
	 * It is set in the constructor and cannot be changed after. 
	 */
	protected String name;
	
	/**
	 * It says if the personage is the killer.
	 * It is set in the constructor and cannot be changed after 
	 */
	protected boolean isKiller;
	

	//return the name of the personage
	/**
	 * 
	 * @param name is the name of the personage
	 * @return the name of the personage
	 */
	public   String getName(String name){
		return null;
	}

	
	//return the boolean if the character is the killer
	/**
	 * 
	 * @param isKiller is a boolean fixed in the beginning if the personage is the killer.
	 * @return  false if the personage is not the killer.
	 */
	public Boolean getIsKiller(Boolean isKiller){
		return false;
	}

	

}
