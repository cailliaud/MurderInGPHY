package Core;
public class Player extends Personage{

	private Owned inventory;
	
	public Player(String name, Room currentRoom, Boolean isKiller, Owned inventory){
		super( name,  currentRoom,  isKiller);
	}
	  
	public void move( String direction){
	}
	public void seeInventaire(){
	}
	public void giveKiller( String name){
	}

	
}
