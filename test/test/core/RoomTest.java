package test.core;
import static org.junit.Assert.*;

import org.junit.Test;

import mig.core.Bolt;
import mig.core.Door;
import mig.core.Item;
import mig.core.Key;
import mig.core.OpenedBolt;
import mig.core.NPC;
import mig.core.Room;


/**
 * The test class RoomTest
 * <b>JUnit test for the class Room</b>
 * 
 * @see Room
 * @author group8
 */
public class RoomTest {

	private Item item1= new Key("porte d'en bas");
	private Door door1;
	
	
	/**
	 * Default constructor for test class RoomTest
	 */
	public RoomTest(){
		
	}
	
	/**
	 * Method testName
	 * <p>test for verify the name of the room</p>
	 * <p>The name of the room is test</p>
	 */
	@Test
	public void testName() {
        Room tester = new Room("test"); 
        assertEquals("test is the good name", "test", tester.getName());
	}
	
	
	/**
	 * method testDescription
	 * <p>test for verify the description of the room</p>
	 * <p>The description of the room is "the new laboratory area</p>
	 */
	@Test
	public void testDescription()
	{
		Room r1 = new Room("desk");
		r1.setDescription("The new laboratory area");
		assertEquals("The new laboratory area", r1.getDescription());
	}
	
	/**
	 * Method testListRoom
	 * <p>test for verify if exist the door in the direction</p>
	 */
	@Test
	public void testListRoom()
	{
		Room r1 = new Room("Desk");
		Room r2 = new Room("Informatique");
		Bolt bolt1 = new OpenedBolt();
		Door door1 = new Door(bolt1, r1, r2);
		r1.addDoor("north", door1);
		assertTrue(r1.exitsPossible("north"));
	}
	
	/**
	 * Method testPresentPNG
	 * <p>test for verify if the PNG is present in the room</p>
	 */
	@Test
	public void testPresentPNG()
	{
		NPC npc = new NPC("djjf", null);
		Room r1 = new Room("desk");
		r1.addPNJ(npc);
		assertTrue(r1.isPresent(npc));
	}
	
	/**
	 * Method testremovePNG
	 * <p>test for verify if the PNG can be remove of the room</p>
	 */
	@Test
	public void testRemovePNG()
	
	{
		NPC npc = new NPC("djjf", null);
		Room r1 = new Room("desk");
		r1.addPNJ(npc);
		r1.removePNJ(npc);
		assertFalse(r1.isPresent(npc));
	}
	
	/**
	 * Method testAddItems
	 * <p>test for verify if the item can be add in the room</p>
	 */
	@Test
	public void testAddItems()
	{
		Room r1 = new Room("desk");
		r1.addItem(item1);
		assertTrue(r1.isPresent(item1));
	}
	
	
	/**
	 * Method testRemoveItems
	 * <p>test for verify if the item can be remove of the room</p>
	 */
	@Test
	public void testRemoveItems()
	{
		Room r1 = new Room("desk");
		r1.addItem(item1);
		r1.removeItem(item1);
		assertFalse(r1.isPresent(item1));
	}
	
	
	
	
}
