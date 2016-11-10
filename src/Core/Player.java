package Core;
public class Player extends Personage{

	private Owned inventory;
	
	public Player(String name, Room currentRoom, Boolean isKiller, Owned inventory){
		super( name,  currentRoom,  isKiller);

	}

	//allows player to move
	public void move(){
	}
	
	
	//player can see his inventaire
	public void seeInventaire(){
	}
	
	//gives the name of the killer
	public void giveKiller( String name){
	}
	


	
}
