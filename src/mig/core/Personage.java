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
 * 		<li>A name, fixed when the game is created</li>
 * 		<li>Is the personage is the killer</li>
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
	private final String name;
	

	
	/**
	 * Constructor
	 * If the name is null, it returns an exception
	 * @param name of the personage
	 * @param isKiller if he is the killer of the game 
	 */
	public Personage (String name){
		if ((name!=null)&&(!name.isEmpty()))this.name=name;
		else throw new NullPointerException();
	}
	/**
	 * 
	 * Getter for the parameter name
	 * @return the name of the personage
	 */
	public  String getName(){
		return name;
	}

	


	

}
