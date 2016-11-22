package test.core;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import mig.core.Information;
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
	
	@Test
	public void testDescription()
	{
		Room R1 = new Room("Desk");
		assertEquals("Test description", "R1", R1.getDescription());
	}
	

	
	
	
	

}
