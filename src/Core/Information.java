package Core;

public class Information extends EnigmaItem{

	//Attributes
	private String description;
	
	//Methods
	
	//Constructor
	public Information (String name, String descriptionInfo){
		super(name);
		description=descriptionInfo;
	}
	
	
	//Return the description about the item
	public String getDescription(){
		return ("Essai");
	}
	
	
	//Diplay the information
	public void displayInformation(){
		
	}
	
}