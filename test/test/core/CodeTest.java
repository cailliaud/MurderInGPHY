package test.core;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import mig.core.Code;


/**
 * The test class Code.
 * Unit tests of the C class
 * 
 * @author group8
 * @version 22/11/2016
 */

public class CodeTest 
{
	private Code myCode;
	
	/**
	 * default constructor for the test class CodeTest
	 */
	
	public void Codetest()
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
		myCode = new Code ("gphy");
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
	 * <p> check if the code given as parameter in the constructor is correctly set to the attribute </p>
	 */
	@Test
	public void testCodeGphy() 
	{
		// the parameter "42" (see setUp) must be set as the code attribute
		assertEquals("gphy", myCode.getPass());
	}

	/**
	 * <p> check that the default code is "42", if the given code is empty
	 */
	 @Test
	 public void testCodeDefaultValue()
	 {
		 Code x = new Code("");
		 // Assuming that an empty code result in giving "42" as a default code
		 assertEquals("42", x.getPass());
	 }
	
	@Test
	public void testGetPass() 
	{
		
	}

	
	
	@Test
	public void testOpened() 
	{
		
	}

}
