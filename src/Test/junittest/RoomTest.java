package Test.junittest;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Core.Room;

public class RoomTest {

	@Test
	public void testName() {
        Room tester = new Room("test"); // MyClass is tested

        // assert statements
        assertEquals("test is the good name", "test", tester.getClass());
 
	}
	

}
