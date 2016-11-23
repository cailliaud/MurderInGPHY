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
	 * The name cannot be null , if it is the name will be "unknown name"
	 * The information cannot be null , as default it will be : "unknown information"
	 * @param name The name of the information
	 * @param info Information learned thanks to this object
	 */
	public Information (String name, String info){
		super(name,info);
		
	}
	/**
	 * Method to display the text contained in this information 
	 * @return Information displayed with a String
	 */
	public String displayInformation(){
		return null;
		// TODO Approfondir la méthode 
	}
	
}
