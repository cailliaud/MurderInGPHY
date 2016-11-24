package test.core;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import mig.core.Key;

/**
 * The test class KeyTest.
 * Unit tests of the Key Class.
 * 
 * @author FP Légeron
 * @version 24/11/2016
 */

public class KeyTest
{
	private Key myKey;
	
/**
 * Default constructor for test class KeyTest.
 */
	public KeyTest()
	{
	}
		
/**
 * Sets up the test fixture.
 * Called before every test case method.
 * Initialize one key for each test, whose name is CléForgée.
 */
@Before
public void setUp()
{
	myKey = new Key("CléForgée");
}

/**
 * Tears down the test fixture.
 * Called after every test case method. Nothing to do in this case.
 */
@After
public void tearDown()
{
}

/**
 * The method assertEquals asserts that the name of the object is correctly considered as an attribute.
 */
@Test
public void testNameCléForgée() {
	assertEquals("CléForgée", myKey.getName());
}

/**
 * The method assertNotNull asserts an object isn't null.
 */
@Test
public void Assert() {
	assertNotNull("CléForgée", myKey);
}

}


