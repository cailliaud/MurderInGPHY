package mig.core;

/**
 * Class Enigme
 * This Class creates an Enigma.
 * This enigma gives a question 
 * The question can asks an Item or a String
 * If the question is well answered there will be a reward
 * The reward i an Item.
 * @author Group 8
 *
 */
public class Enigma {

	/**
	 * Item is an EnigmaItem : Information or Object
	 * It is the object asked by the Enigma
	 */
	private EnigmaItem item;
	
	/**
	 * It will contains the answer of the Question 
	 * If a String is expected
	 */
	private String answer;
	
	/**
	 * This String contains the question asked by the PNJ
	 */
	private String question;
	
	/**
	 * Reward is the Item gifted if the player has the test.
	 */
	private Item reward;
	
	/**
	 * This Boolean represents if the Enigma is solved or not
	 * It will avoid to win the Enigma more than 1 time
	 */
	private boolean isResolved;
	
	/**
	 * ItemWaited represents if the Enigma wants an Item or a String to solve it
	 */
	private boolean itemWaited;  

	/**
	 * Default Construcot
	 * @param quest
	 * String pronounced by the PNJ when the player will engage the Enigma
	 */
	public Enigma (String quest) {

	}

	/**
	 * set the Answer if it is a String 
	 * ItemWaited will be false
	 * @param reponse
	 * Answer Waited : String version
	 */
	public void setAnswer (String reponse){
		
	}

	/**
	 * set the Answer if it is an EnigmaItem 
	 * ItemWaited will be false
	 * @param item
	 * Answer Waited : EnigmaItem version
	 */
	public void setAnswer (EnigmaItem item){

	}
	


	/**
	 * resolve the Enigma if it is a String 
	 * @param answer
	 * String answer given by the player
	 * @return boolean
	 * True if it is the good String or else false
	 */
	public boolean resolveEnigma (String answer){
		return false; 
	}

	/**
	 * resolve the Enigma if it is a EnigmaItem 
	 * @param item
	 * EnigmaItem  given by the player
	 * @return boolean
	 * True if it is the good EnigmaItem or else false
	 */
	public boolean resolveEnigma (EnigmaItem item){
		return false;
	}

	/**
	 * Method to get the Reward when the Enigma is resolved
	 * @return Item
	 * The Item won
	 */
	public Item rewarded(){
		return null;
	}

	/**
	 * Method to know if this Enigma is already Resolved
	 * @return boolean
	 * True if it is already resolved
	 */
	//Return true if enigma is already resolved and false if not
	public boolean alreadyResolved(){
		return false;
	}


}
