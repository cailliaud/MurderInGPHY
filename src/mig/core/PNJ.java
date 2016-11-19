package mig.core;

public class PNJ extends Personage{

	private Enigma enigma;
	/**
	 * It represents if the personage is alive or not.
	 */
	private boolean alive;
	
	
	//constructor
	public PNJ(String name,  Boolean isKiller, Enigma enigma){	
		this.name=name;
		this.isKiller=isKiller;
		this.alive=false;
	}
	
	//is the enigma of this PNJ
	public void addEnigma(Enigma enigma){
	}
	
	//PNJ gives a clue to the player
	public void resolveEnigma(String answer){	
	}
	
	//PNJ gives an item the the player
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
