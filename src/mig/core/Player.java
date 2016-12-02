package mig.core;

import mig.exceptions.ErrorNameGiven;
import mig.exceptions.InventoryFull;

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
	private Owned owned;
	
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
		super(name);
		this.currentRoom=currentRoom;
		owned = new Owned(inventorySize);	
	}


	/**
	 * Allows player to move between rooms
	 * He can move following 8 orientations
	 * @param nextRoom the room which will replace the currentRoom
	 */
	public void move(Room nextRoom){
		if (currentRoom!= nextRoom)this.currentRoom=nextRoom;
	}
	
	/**
	 * Allows player to see his notebook,
	 * @return The description of all information in the notebook
	 */
	public String seeNotebook(){
		return owned.displayNotebook();
	}
	
	public String seeInventory(){
		return owned.displayInventory();
	}
	
	public String seeBunch(){
		return owned.displayBunch();
	}
	


	/**
	 * Method to add an item in the player inventory
	 * @param item the item added
	 * @return a string explaining what it has be done
	 */
	public String addItem(Item item) throws InventoryFull{	
		if (item instanceof Information) {
			owned.addInformation((Information) item);
			currentRoom.removeItem(item);
			return ("the information called "+item.getName()+" has been added to your notebook.\n");
			
		} else if (item instanceof Key ){
			owned.addKey((Key) item);
			currentRoom.removeItem(item);
			return ("the key called "+item.getName()+" has been added to your bunch.\n");
		}
		else
			if (owned.getSize()<inventorySize)
			{
			owned.addObject((PhysicalObject) item);
			currentRoom.removeItem(item);
			return ("the Object called "+item.getName()+" has been added to your inventory.\n");
			}
			else {
				throw new InventoryFull();
			}
	}
	
	/**
	 * Allows to remove an item from the inventory
	 * It will be let in the current Room
	 * Only PhysicalObject can be removed from the inventory
	 * @param name The name of the Object
	 * @throws ErrorNameGiven Return a mistake if the name given is wrong
	 * @see Owned
	 */
	public void removePhysicalObject(PhysicalObject obj) {
		currentRoom.addItem(owned.removeObject(obj));
		
	}
	
	/**
	 * Method to know which is the current room
	 * @return the current Room
	 */
	public Room getCurrentRoom(){
		return currentRoom;
	}
	
	public Owned getOwned(){
		return this.owned;
	}
	
}
