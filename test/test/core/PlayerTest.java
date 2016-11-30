package test.core;

import static org.junit.Assert.*;

import org.junit.Test;
import mig.core.Room;
import mig.exceptions.ErrorNameGiven;
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
		myPlayer.addItem(item);
		assertEquals(1,myPlayer.getOwned().getSize());
	}

	@Test
	public void testRemovePhysicalObject(){
		PhysicalObject item2 = new PhysicalObject("livre","blablabla");
		myPlayer.addItem(item2);
		try {
			myPlayer.removePhysicalObject("livre");
		} catch (ErrorNameGiven e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(0,myPlayer.getOwned().getSize());
	}
	
	@Test
	public void testTooMuchItem(){
		PhysicalObject item = new PhysicalObject("batte","blablabla");
		myPlayer.addItem(item);
		PhysicalObject item2 = new PhysicalObject("livre","blablabla");
		myPlayer.addItem(item2);
		PhysicalObject item3 = new PhysicalObject("ballon","blablabla");
		myPlayer.addItem(item3);
		PhysicalObject item4 = new PhysicalObject("bouteille","blablabla");
		myPlayer.addItem(item4);
		PhysicalObject item5 = new PhysicalObject("ordi","blablabla");
		myPlayer.addItem(item5);
		assertNotEquals(5,myPlayer.getOwned().getSize());
	}
	
	
}