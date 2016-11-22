package mig.core;


/**
 * <b>Door is the class representing a door between 2 rooms.</b>
 * 
 * <p>
 * This door has a boolean that shows if it is opened or not.
 * </p>
 * 
 * <p>
 * If the door exits we can close or open this door.
 * </p>
 * 
 * @see Room
 * 
 * @author Group8
 * @version 22/11/2016
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
	 * Bolt of the Door
	 */
	
	private Bolt bolt;
	
	/**
	 * Default Constructor
	 * @param openDoor
	 * Boolean to indicate if the door is already opened or not
	 * @param roomDoor1
	 * The First Door linked
	 * @param roomDoor2
	 * The Second Door linked
	 * @param b Bolt on the door
	 * If it is null, there will be as default an OpenedBolt
	 */
	public Door (Bolt b, Room room1, Room room2){
		this.bolt= b;
		this.room1=room1;
		this.room2=room2;
		
		//TODO if b is null : create an OpenedBolt as default
	}
	
	/**
	 * Method to know if the door is opened
	 * @return boolean
	 * True = opened , False = closed
	 */
	public boolean getOpen(){
		return open;
	}
	
	/**
	 * Method to put open to the value true
	 * The door will stay opened.
	 */
	public void openDoor(Key key_given){
		
		
	}


	/** Method to close the Door
	 * open takes the value false
	 */
	public void closeDoor(Key key_given){
		
	}
}
