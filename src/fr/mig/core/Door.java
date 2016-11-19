package fr.mig.core;


/**
 * The Class Door
 * This class creates a Door that links 2 Rooms
 * This door has a boolean that shows if it is opened or not.
 * @author Group8
 *
 */
public class Door {

	/**
	 * Open represents if the door is opened or not
	 */
	private boolean open;
	
	/**
	 * room1 is the first Room linked to this door
	 */
	private Room room1;
	
	/**
	 * room2 is the second Room linked to this door
	 */
	private Room room2;
	
	/**
	 * Default Constructor
	 * @param openDoor
	 * Boolean to indicate if the door is already opened or not
	 * @param roomDoor1
	 * The First Door linked
	 * @param roomDoor2
	 * The Second Door linked
	 */
	public Door (boolean openDoor, Room roomDoor1, Room roomDoor2){
		
	}
	
	/**
	 * Method to know if the door is opened
	 * @return boolean
	 * True = opened , False = closed
	 */
	public boolean getOpen(){
		return false;
	}
	
	/**
	 * Method to put open to the value true
	 * The door will stay opened.
	 */
	public void openDoor(){
		
	}

	/** Method to close the Door
	 * open takes the value false
	 */
	public void closeDoor(){
		
	}
}
