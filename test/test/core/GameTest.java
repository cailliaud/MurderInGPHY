package test.core;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import mig.core.Code;
import mig.core.PNJ;


/**
 * <b>JUnit test for the class Code</b>
 * @see Code
 * @author group8
 * @version 23/11/2016
 */

public class GameTest 
{
	private PNJ killer;
	
	/**
	 * default constructor for the test class Game
	 */
	
	public void Gametest()
	{
	}
	
	/**
	 * Sets up the test fixture
	 * <p> called before every test case method. </p>
	 * <p> initialize one code for each test, which is "42" </p>
	 */
	@Before
	public void setUp()
	{
		killer = new PNJ ("Fantomas");
	}

	/**
	 * Tears down the test fixture.
	 *<p> Called after every test case method. Nothing to do in this case </p>
	 */
	@After
	public void tearDown()
	{
	}
	
	/**
	 * <p> check if the killer given as parameter in the constructor is correctly set to the attribute </p> 
	 */
	@Test
	public void testGiveKiller() 
	{
		// parameter "Fantomas" (see setUp) must be set as the killer
		assertEquals("Fantomas", killer.getName();
	}

}
