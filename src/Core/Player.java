package Core;
public class Player extends Personage{

	private Owned inventory;
	

	public Player(String name, Room currentRoom, Boolean isKiller, Owned inventory){
		super( name,  currentRoom,  isKiller);

	}

	//allows player to move
	public void move(){
	}
	
	//allows player to open a door 
	public void openDoor(){
	}
	
	//player can see his inventaire
	public void seeInventaire(){
	}
	
	//gives the name of the killer
	public void giveKiller(){
	}
	
	//gives the solution of the enigma
	public void giveSolutionEnigma(){
	}
	
}
