package mig.core;

/**
 * <b>Player is the class representing the user of the game. It is in inheritence class of Personage.</b>
 * <p>
The player has more functions than Personage and PNJ, because he is the most importance personage in the game.
 * </p>
 * <p>
 * Personage contains these elements :
 * </p>
 * <ul>
 * 		<li>A name, fixed when the game is created</li>
 * 		<li>Is the personage is the killer</li>
 * 		<li>He can move between rooms</li>
 * 		<li>We can know in which room he is</li>
 * 		<li>See which object he has in the inventory</li>
 * 		<li>He can add an item in his inventory</li>
 * 		<li>He also can remove an item of his inventory</li>
 * </ul>
 * 
 * @see Personage
 * 
 * @author Group8
 * @version 22/11/2016
 */

public class Player extends Personage{

	/**
	 * See the inventory of the player
	 */
	private Owned inventory;
	
	/**
	 * Is the current room where is the player
	 */
	private Room currentRoom;
	
	/**
	 * The inventory has maximum 4 items
	 */
	private final int inventorySize = 4;
	
	/**
	 *Constructor, allows to create the player.
	 *
	 * @param name The name has to be in lower case for the security. So that there is no matter when we enter a name with upper case.
	 * @param currentRoom, where is the player at this moment of the game
	 */
	public Player(String name, Room currentRoom){
		super(name, false);
		this.currentRoom=currentRoom;
		inventory = new Owned(inventorySize);	
	}


	/**
	 * Allows player to move between rooms
	 * He can move following 8 orientations
	 * @param direction The direction takes to move
	 */
	public void move(String direction){
	}
	
	/**
	 * Allows player to see his inventory, which items he has
	 */
	public void seeInventaire(){
	}

	/**
	 * Allows to add an item to the inventory
	 * @param item is an object 
	 */
	public void addItem(Item item){	
	}
	
	/**
	 * Allows to remove an item to the inventory
	 * @param item is an object
	 */
	public void removeItem(Item item){
	}
	
}
