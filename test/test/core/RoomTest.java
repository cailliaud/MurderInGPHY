package test.core;
import static org.junit.Assert.*;

import org.junit.Test;



import mig.core.PNJ;
import mig.core.Room;


/**
 * <b>JUnit test for the class Room</b>
 * @see Room
 * @author group8
 *
 */
public class RoomTest {


	
	
	@Test
	public void testName() {
        Room tester = new Room("test"); 
        assertEquals("test is the good name", "test", tester.getName());
	}
	
	public void testDescription()
	{
		Room R1 = new Room("Desk");
		assertEquals("Test description", R1.getDescription());
	}

	
//	public void testListRoom()
//	{
//		Room r1 = new Room("Desk");
//		Room r2 = new Room("Informatique");
//		assertEquals("List room", r1.displayExits());
//	}
	
	public void testPresentPNG()
	{
		PNJ pnj = new PNJ("djjf", null, null);
		Room r1 = new Room("desk");
		r1.addPNJ(pnj);
		assertTrue(r1.isPresent(pnj));
		
	}
	
	
	
}
