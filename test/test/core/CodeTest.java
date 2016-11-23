package test.core;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.matchers.JUnitMatchers;
import org.junit.rules.ExpectedException;

import mig.core.Code;
import mig.core.Information;


/**
 * <b>JUnit test for the class Code</b>
 * @see Code
 * @author group8
 *
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
		// the parameter "gphy" (see setUp) must be set as the code attribute
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
	
	 
	 @Rule 
	 public ExpectedException thrown = ExpectedException.none();
	 
	 @Test
	 public void testWrongCode()
	 {
		 thrown.expect(PasswordFailedException.class);
		 thrown.expectMessage("wrong password given");
		 myCode.opened("wrongpswd");
	 }
	 
	 
	 
	 /**
	  * get the actual code
	  */
	@Test
	public void testGetPass() 
	{
		
	}

	
	
	@Test
	public void testOpened() 
	{
		
	}

}
