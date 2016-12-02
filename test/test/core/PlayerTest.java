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


public class PlayerTest {
	
	private String name ;
	private Room currentRoom;
	private Player myPlayer;
	
	public PlayerTest (){
		currentRoom = new Room ("TP1");
		myPlayer = new Player("toto", currentRoom);
	}
	

	@Test
	public void testCurrentroom() {
		Room room1 = new Room ("hall");
		myPlayer.move(room1);
		assertEquals(room1, myPlayer.getCurrentRoom());
	}

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