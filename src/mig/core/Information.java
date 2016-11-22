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
	 * 
	 * @param name
	 * @param information
	 */
	public Information (String name, String information){
		setName(name);
		setInformation(information);
	}

	/**
	 * Method to display the text contained in this information 
	 */
	public void displayInformation(){
		// TODO Approfondir la méthode 
	}
	
}
