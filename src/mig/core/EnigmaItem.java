package mig.core;
/**
 * <b>The class EnigmaItem represents all the list of items that we can win answering an Enigma.It uses inheritance from the class Item</b>
 * <p>
 * The items which can be won after an Enigma are :
 * </p>
 * <ul>
 * 		<li>An information (from the class Information) </li>
 * 		<li>a physical object (from the class PhysicalObject) </li>
 * </ul>
 * <p>
 * These two items, Information and PhysicalObject uses inheritance from this class EnigmaItem.
 * </p>
 * 
 * @see Item
 * 
 * @author Group 8
 * @version 22/11/2016
 */
public abstract class  EnigmaItem extends Item {

	private String information;

	public EnigmaItem(String name, String information){
		super(name);
		this.information=information;
	}
	/**
	 * getInformation is a method to get the different informations in the EnigmaItem
	 * @return information
	 */
	public String getInformation() {
		return information;
	}

	/**
	 * String that contain the information given by the EnigmaItem
	 * @param information It is the information given by the EnigmaItem
	 * 
	 * @see EnigmaItem#information
	 */
	protected void setInformation(String information) {
		this.information = information;
	}
	
	/**
	 * Method to display information about the object .
	 * Overriding of the method toString of the class Item
	 * 
	 * @see Object#toString()
	 */
	@Override
	public String toString(){
		String str = "This Item is a/an " +
		this.getClass().getSimpleName() + ", called " 
		+ this.getName() + "\nInformation given is the following:\n"
		+ this.information ;
		return str;
	}

}
