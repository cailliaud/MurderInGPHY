package test.core;

import static org.junit.Assert.*;
import org.junit.Test;

import mig.core.Bolt;
import mig.core.Door;
import mig.core.Key;
import mig.core.Lock;
import mig.core.OpenedBolt;
import mig.core.Room;


/**
 * JUnit test for the class Door
 * @see Door
 * @author group8
 *
 */

public class DoorTest 
{
	
	private Room r1 ;
	private Room r2 ;
	private OpenedBolt b ;
	private Door door;

	
	public DoorTest () {
		b= new OpenedBolt();
		r1 = new Room("ok");
		r2 = new Room("ko");
		
		door = new Door(b, r1, r2);
	}
	
	
	/**
	 * Method testRelationBetweenTwoDoors
	 * <p> Check if the room 1 is in relation with the room 2 </p>
	 * 
	 */
	@Test
	public void testRelationBetweenTwoDoors() 
	{
			assertTrue(door.access(r1));
	}

	/**
	 * Method isLockedBolt
	 * <p> Check if the bolt is locked </p>
	 * 
	 */
	@Test
	public void isLockedBolt()
	{
		assertTrue(b.isLocked());
	}

	/**
	 * Method openWithGoodPassDoor
	 * <p> Opened the door if the password is good </p>
	 */
	@Test
	public void openWithGoodPassDoor(){
		String pass = "gphy";
		door.openDoor(pass);
		assertFalse(door.isLocked());
	}
	
	/**
	 * Method openWithBadPassDoor
	 * <p> Opened the door if the password is bad </p>
	 */
	@Test
	public void openWithBadPassDoor(){
		String pass = "toto";
		door.openDoor(pass);
		assertTrue(door.isLocked());
	}
	
	/**
	 * Method openWithGoodKeyDoor
	 * <p> Opened the door if the key is good </p>
	 */
	@Test
	public void openWithGoodKeyDoor(){
		Key key = new Key ("cleforgee");
		door.openDoor(key);
		assertFalse(door.isLocked());
	}
	
	/**
	 * Method openWithGoodKeyDoor
	 * <p> Opened the door if the key is bad </p>
	 */
	@Test
	public void openWithBadKeyDoor(){
		Key key = new Key ("cleforgee");
		door.openDoor(key);
		assertFalse(door.isLocked());
	}
}
