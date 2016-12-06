package test.core;

import static org.junit.Assert.*;

import org.junit.Test;
import mig.core.Room;
import mig.exceptions.ErrorNameGiven;
import mig.exceptions.InventoryFull;
import mig.core.Item;
import mig.core.Owned;
import mig.core.PhysicalObject;
import mig.core.Player;

/**
 * Class PlayerTest
 * 
 * 
 * @author Group8
 * @version 6/12/16
 *
 */

public class PlayerTest {
	
	/**
	 * name is a String : represented the name of the player
	 */
	private String name ;
	
	/**
	 * currentRoom is a Room : Represented the room where the player is
	 */
	private Room currentRoom;
	
	/**
	 * myPlayer is a Player : create a new player
	 */
	private Player myPlayer;
	
	
/**
 * Default PlayerTest
 * Initialized the currentRoom and create a player with his name and his room
 */
	public PlayerTest (){
		currentRoom = new Room ("TP1");
		myPlayer = new Player("toto", currentRoom);
	}
	
/**
 * Method testCurrentroom
 * <p> Check if my player is really in the currentRoom </p> 
 */
	@Test
	public void testCurrentroom() {
		Room room1 = new Room ("hall");
		myPlayer.move(room1);
		assertEquals(room1, myPlayer.getCurrentRoom());
	}

/**
 * Method testAddItem
 * <p> Check if it is possible to add an item in the inventory of the player </p> 
 */
	@Test
	public void testAddItem(){
		PhysicalObject item = new PhysicalObject("batte","blablabla");
		try {
			myPlayer.addItem(item);
		} catch (InventoryFull e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(1,myPlayer.getOwned().getSize());
	}

/**
 * Method testRemocePhysicalObject
 * <p> Check if it is possible to remove an object in the inventory of the player </p> 
 */
	@Test
	public void testRemovePhysicalObject(){
		PhysicalObject item2 = new PhysicalObject("livre","blablabla");
		try {
			myPlayer.addItem(item2);
		} catch (InventoryFull e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			myPlayer.removePhysicalObject(item2);
		
		assertEquals(0,myPlayer.getOwned().getSize());
	}
	
/**
 * Method testTooMuchItem
 * <p> Check if it is possible to added a lot of item in the inventory of the player </p> 
 */
	@Test
	public void testTooMuchItem(){
		PhysicalObject item = new PhysicalObject("batte","blablabla");
		try {
			myPlayer.addItem(item);
		} catch (InventoryFull e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PhysicalObject item2 = new PhysicalObject("livre","blablabla");
		try {
			myPlayer.addItem(item2);
		} catch (InventoryFull e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PhysicalObject item3 = new PhysicalObject("ballon","blablabla");
		try {
			myPlayer.addItem(item3);
		} catch (InventoryFull e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PhysicalObject item4 = new PhysicalObject("bouteille","blablabla");
		try {
			myPlayer.addItem(item4);
		} catch (InventoryFull e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PhysicalObject item5 = new PhysicalObject("ordi","blablabla");
		try {
			myPlayer.addItem(item5);
		} catch (InventoryFull e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertNotEquals(5,myPlayer.getOwned().getSize());
	}
	
	
}