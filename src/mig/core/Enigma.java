package mig.core;

import mig.exceptions.ErrorTypeAnswer;
import mig.exceptions.FailedResolvEnigma;


/**
 * <b> Class Enigme </b>
 * <p> This Class creates an Enigma.
 * This enigma gives a question 
 * The question can asks an Item or a String 
 * If the question is well answered there will be a reward 
 * The reward i an Item </p>
 * <p>This Class contain :</p>
 * <ul> 
 * <li> Item : EnigmaItem </li>
 * <li> Answer : String </li> 
 * <li> Question : String </li>
 * <li> Reward : Item </li>
 * <li> isResolved :boolean </li>
 * <li> itemWaited : boolean </li>
 * </ul>
 * 
 * @author Group 8
 * @version 22/11/16
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
	 * The text told by the npc when the enigma is resolved
	 */
	private String npcText;

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
	 * Default Constructor
	 * This Enigma is just a simple sentence
	 * There is no answer waited , and the isResolved is set True
	 * 
	 * Example: the PNJ will only tell a default sentence : Hello, i can not talk to you. I'm really busy ! "
	 */
	public Enigma (){
		this.question="Hello, i can not talk to you. I'm really busy !";
		this.isResolved = true;
	}

	/**
	 * Default Constructor
	 * This Enigma is just a simple sentence
	 * There is no answer waited , and the isResolved is set True
	 * @param text It is the text that you want the enigma told
	 * 
	 */
	public Enigma (String text) {
		if ((text==null) || (text.isEmpty())){
			this.question="Hello, i can not talk to you. I'm really busy !";
		}
		else
		{
			this.question=text;
		}
		this.isResolved = true;

	}

	/**
	 * Constructor for an Enigma with an Item as answer
	 * @param quest the question asked by the Enigma
	 * @param item the item waited to answer the enigme
	 * @param reward The item won if the enigma is resolved
	 * @throws NullPointerException if the item or the reward are null.
	 * 
	 * The boolean itemWaited will be true because it is an item waited as answer
	 * the enigma is set as not resolved.
	 */
	public Enigma(String quest,EnigmaItem item,String npctext, Item reward) throws NullPointerException {
		// Security if the quest String is not correct

		this.question = quest;

		// Security if the item given is null
		if (item==null) throw new NullPointerException();

		// Security if the reward item given is null
		if (reward==null) throw new NullPointerException();

		this.itemWaited = true;
		this.item= item;
		this.npcText=npctext;
		this.reward=reward;
		this.isResolved = false;


	}

	/**
	 * Constructor for an Enigma with a String as answer
	 * @param quest the question asked by the Enigma
	 * @param answer the String waited to answer the Enigma
	 * @param reward The item won if the Enigma is resolved
	 * @throws NullQuestionException if the question String is empty
	 * @throws NullPointerException if the item or the reward are null.
	 * 
	 * The boolean itemWaited will be false because it is a String waited as answer
	 * the enigma is set as not resolved.
	 */
	public Enigma (String quest,String answer,String npctext, Item reward) throws NullPointerException{
		// Security if the quest String is not correct
		this.question = quest;

		// Security if the item given is null
		if (answer==null) throw new NullPointerException();

		// Security if the reward item given is null
		if (reward==null) throw new NullPointerException();
		this.answer= answer;
		this.reward=reward;
		this.npcText=npctext;
		this.itemWaited = false;
		this.isResolved = false;

	}


	/**
	 * Getter for the question given by the Enigma
	 * @return The String of the question
	 */
	public String getQuest(){
		return question;
	}


	/**
	 * 
	 */
	public String getNpcText() throws FailedResolvEnigma{
		if (isResolved) return this.npcText;
		else
			throw new FailedResolvEnigma();
	}

	/**
	 * resolve the Enigma if it is a String 
	 * @param answer
	 * String answer given by the player
	 */
	public void resolveEnigma (String answer) throws FailedResolvEnigma,ErrorTypeAnswer{
		if (!itemWaited){
			if (answer==this.answer)
			{
				isResolved=true;

			}else {
				throw new FailedResolvEnigma(); 
			}
		} else {
			throw new ErrorTypeAnswer(); 
		}



	}

	/**
	 * resolve the Enigma if it is a EnigmaItem 
	 * @param item
	 * EnigmaItem  given by the player
	 */
	public void resolveEnigma (EnigmaItem item) throws FailedResolvEnigma,ErrorTypeAnswer{
		if (itemWaited){
			if (item.equals(this.item)){
				isResolved=true;

			}else {
				throw new FailedResolvEnigma(); 
			}
		} else {
			throw new ErrorTypeAnswer(); 
		}

	}

	/**
	 * Method to get the Reward when the Enigma is resolved
	 * @return Item
	 * The Item won
	 */
	public Item rewarded() throws FailedResolvEnigma{
		if (isResolved)
		{
			this.question="You had your reward, now let me alone , i'm too busy.";
		return this.reward;
		}
		else throw new FailedResolvEnigma();


	}

	/**
	 * Method to know if this Enigma is already Resolved
	 * @return boolean
	 * True if it is already resolved
	 */
	public boolean alreadyResolved(){
		return isResolved;
	}


}


