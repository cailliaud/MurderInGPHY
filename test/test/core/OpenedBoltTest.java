package test.core;

import static org.junit.Assert.*;

import org.junit.Test;
import mig.core.OpenedBolt;


/**
 * <b>JUnit test for the class OpenedBolt</b>
 * @author group8
 *
 */
public class OpenedBoltTest {

	/**
	 * Default constructor for test class OpenedBoltTest
	 */
	public OpenedBoltTest()
	{
	}
	
	
	/**
	 * Method testBoltOpen
	 * <p>Checks if the new bolt created is well open
	 */ 
	@Test
	public void testBoltOpen()

	{
		OpenedBolt boltopen = new OpenedBolt();
		//The state of the bolt must be "false"
		assertEquals(false, boltopen.isLocked());
	}
	
}
