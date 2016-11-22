package mig.core;
public class Player extends Personage{

	private Owned inventory;
	private Room currentRoom;
	private final int inventorySize = 4;
	

	public Player(String name, Room currentRoom){
		super(name, false);
		this.currentRoom=currentRoom;
		inventory = new Owned(inventorySize);
		

	}

	//allows player to move
	public void move(){
	}
	
	//player can see his inventary
	public void seeInventaire(){
	}

	
	public void addItem(Item item)
	{
		
	}
	
	public void removeItem(Item item)
	{
		
	}
	
}
