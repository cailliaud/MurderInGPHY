package Core;

public class PNJ extends Personage{

	private Enigma enigma;
	
	public PNJ(String name, Room currentRoom, Boolean isKiller, Enigma enigma){
		super(name,currentRoom, isKiller);
	}
	public void addEnigma(Enigma enigma){
		
	}
	public void resolveEnigma(String answer){
		
	}
	public void resolveEnigma(EnigmaItem item){
		
	}
}
