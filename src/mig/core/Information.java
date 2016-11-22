package mig.core;
/**
 * <b>The class Information represents the informations given by the characters during the game.</b>
 * <p>
		it uses inheritance from the class EnigmaItem
 * </p>
 * 
 * @see EnigmaItem
 * 
 * @author Group 8
 * @version 22/11/2016
 */
public class Information extends EnigmaItem{

	/**
	 * Constructor of the class Information
	 * The name cannot be null , if it is the name will be "unknown information"
	 * The information cannot be null , as default it will be : "no information about this"
	 * @param name The name of the information
	 * @param information Information learned thanks to this object
	 */
	public Information (String name, String information){
		//TODO valeurs défauts si les parametres donnés sont null
		super(name,information);
	}

	/**
	 * Method to display the text contained in this information 
	 */
	public void displayInformation(){
		// TODO Approfondir la méthode 
	}
	
}
