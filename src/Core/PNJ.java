package Core;

public class PNJ extends Personage{

	private Enigma enigma;
	
	//constructor
	public PNJ(String name, Room currentRoom, Boolean isKiller, Enigma enigma){
		super(name,currentRoom, isKiller);
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
}
