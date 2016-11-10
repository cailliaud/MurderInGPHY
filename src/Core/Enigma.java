package Core;

public class Enigma {

	//Attributes
	
	private EnigmaItem item;
	private String answer;
	private String question;
	private Items reward;
	private boolean isResolved;
	private boolean itemWaited;  //Return true if an item is waited for the answer

	//Methods
		
	//Constructor
	public Enigma (String quest) {
		
	}
	
	//Set the answer when it is just a text 
	public void setAnswer (String reponse){
		
	}
	
	//Set the answer when it is an object
	public void setAnswer (Objet item){
		
	}
	
	//Set the answer when it is an information
	public void setAnswer (Information item){
		
	}
	
	//Return true if enigma is resolved
	public boolean resolveEnigma (String answer){
		return false; 
	}
	
	//Return true if enigma is resolved
	public boolean resolveEnigma (EnigmaItem item){
		return false;
	}
	
	//Give a reward if the enigma is resolved
	public Items rewarded(){
		return item;
	}
	
	//Return true if enigma is already resolved and false if not
	public boolean alreadyResolved(){
		return false;
	}
	
	
}
