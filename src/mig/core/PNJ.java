package mig.core;

/**
 * <b>PNJ is the class representing PNJ present in the game. </b>
 * <p>
 * These class is in inheritence with the class Personage. 
 * PNJ is a personage non-player. He is here to help the player, for example to give him clue or item after an enigma, to help to discover the killer. 
 * 
 * </p>
 * <p>
 * PNJ contains these elements :
 * </p>
 * <ul>
 * <li>A name, fixed when the game is created. In inheritence with personage.</li>
 * <li>Is the personage is the killer</li>
 * <li>Is the PNJ is use in a room.</li>
 * <li>Have an enigma for the player.</li>
 * <li>Have clue or item for the player after enigma</li>
 * </li>
 * </ul>
 * 
 * @see Personage
 * @see Enigma 
 * 
 * @author Group8
 * @version 22/11/2016
 */

public class PNJ extends Personage{

	/** 
	 * a PNJ has an enigma to ask to the player.
	 */
	private Enigma enigma;
	/**
	 * It represents if the personage is alive or not. If he is already use in a room. A PNJ can't be used in two different rooms.
	 */
	private boolean alive;
	
	
	//constructor
	/**
	 *Constructor of the PNJ. Allows to create the PNJ.
	 *
	 * @param name The name has to be in lower case for the security. So that there is no matter when we enter a name with upper case.
	 * @param isKiller Is a boolean fixed in the beginning if the personage is the killer.
	 * @param enigma Is the enigma of the PNJ for the player.
	 */
	public PNJ(String name,  Boolean isKiller, Enigma enigma){	
		this.name=name;
		this.isKiller=isKiller;
		this.alive=false;
	}
	
	//is the enigma of this PNJ
	/**
	 * Allows to add an enigma for a PNJ
	 * 
	 * @param enigma Is the enigma of the PNJ
	 */
	public void addEnigma(Enigma enigma){
	}
	
	//PNJ gives a clue to the player
	/**
	 * PNJ gives a clue to the player. If the answer is correct, he gives a clue to the player.
	 * @param answer Is the answer of the enigma
	 */
	public void resolveEnigma(String answer){	
	}
	
	//PNJ gives an item the the player
	/**
	 * PNJ gives an item the the player, after the correct answer.
	 * @param item Is the item given to the player.
	 */
	public void resolveEnigma(EnigmaItem item){	
	}
	
	/**
	 * Method to know if the Personage is alive or not 
	 * @return true if the personage is alive or false if it is not 
	 * 
	 * @see PNJ#alive
	 */
	public boolean isAlive() {
		return alive;
	}

	/**
	 * Method to set if the personage is alive or not 
	 * @param alive true if alive and false if it is not 
	 * 
	 * @see PNJ#alive
	 */
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
}
