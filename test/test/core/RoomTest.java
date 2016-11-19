package test.core;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import mig.core.Room;

public class RoomTest {

	@Test
	public void testName() {
        Room tester = new Room("test"); // MyClass is tested

        // assert statements
        assertEquals("test is the good name", "test", tester.getName());
 
	}
	

}
