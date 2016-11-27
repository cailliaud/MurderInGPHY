package mig.core;

import mig.exceptions.ErrorObjectClosed;

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
	 * @param room1
	 * The First Door linked
	 * @param room2
	 * The Second Door linked
	 * @param b Bolt on the door
	 * If it is null, there will be an exception
	 */
	public Door (Bolt b, Room room1, Room room2){
		this.bolt= b;
		this.room1=room1;
		this.room2=room2;

		//TODO if b is null create an exception
	}

	/**
	 * Method to know if the door is opened
	 * @return boolean
	 * True = opened , False = closed
	 */
	public boolean isLocked(){
		return bolt.isLocked();
	}

	/**
	 * <p>Method to open a door with a lock that needs a key to be opened</p>
	 * There is a test of the bolt, because only an Lock can be opened with a key
	 * If it is not the good class there will be an exception
	 * @param key_given Key tested to open the door
	 * The door will stay opened.
	 * This method will not work if the door is already opened
	 */
	public void openDoor(Key key_given){
		if ((bolt instanceof Lock)&&(bolt.isLocked())) {
			((Lock) bolt).giveKey(key_given);
			bolt.unlockIt();

		}


	}

	/**
	 * <p>Method to open the Door with a password Code </p> 
	 * There is a test of the bolt, because only an Code can be opened with a password
	 * If it is not the good class there will be an exception
	 * @param password Pass tested to unlock the code of the door
	 * The door will stay opened.
	 * This method will not work if the door is already opened
	 */
	public void openDoor (String password){
		if ((bolt instanceof Code)&&(bolt.isLocked())) {
			((Code) bolt).givePassword(password);
			bolt.unlockIt();

		}
	}


	/**
	 * Method to get the nextRoom according to the room where you are
	 * It will only possible if the Door is opened
	 * And if the Room given is one of the two rooms linked to this door
	 * It will return an exception if the door is closed
	 * @param currentRoom the room where you are 
	 * @return The Next room
	 */
	public Room getNextRoom(Room currentRoom)
			throws ErrorObjectClosed
	{
		if (!isLocked()) {
			return (currentRoom==room1 ? room2 : room1);
		}else {
			throw new ErrorObjectClosed();
		}
	}

	/**
	 * Method to test if the Room is linked to this door.
	 * @param room The room tested
	 * @return True if this room is linked to this Door
	 */
	public boolean access(Room room){
		return ((room==room1 || room==room2)? true : false);
	}

}
