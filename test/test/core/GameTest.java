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
 *@version 24/11/2016
 */

public class GameTest 
{
	private PNJ killer = new PNJ ("fantomas", true, null);
	
	/**
	 * default constructor for the test class CodeTest
	 */
	
	public void GameTest()
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
		
	}
	
	/**
	 * Tears down the test fixture.
	 *<p> Called after every test case method. Nothing to do in this case </p>
	 */
	@After
	public void tearDown()
	{
	}
	


	@Test
	public void testStop() 
	{
		
	}

	/**
	 * <p> check if the name given for the killer as parameter is correctly set to the attribute
	 */
	@Test
	public void testNameKiller() 
	{
		assertEquals("fantomas", killer.getName());
	}
	
	@Test
	public void testGiveKiller()
	{
		assertEquals(true, killer.getIsKiller());
	}
	

}
