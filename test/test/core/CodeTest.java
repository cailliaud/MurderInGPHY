package test.core;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import mig.core.Code;


/**
 * <b>JUnit test for the class Code</b>
 * 
 * @see Code
 * @author group8
 * @version 6/12/16
 *
 */
public class CodeTest 
{
	/**
	 * myCode is a Code 
	 */
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
	 * Method testCodeDefaultValue
	 * <p> check that the default code is "42", if the given code is empty
	 */
	 @Test
	 public void testCodeDefaultValue()
	 {
		 Code x = new Code("");
		 // Assuming that an empty code result in giving "42" as a default code
		 x.givePassword("42");
		 x.unlockIt();
		 assertFalse(x.isLocked());
	 }
	
	 
	 
	 /**
	  *  Method ExpectedException
	  *  <p> Ckeck if we can unlocked the code with a good password </p> 
	  */
	 @Rule 
	 public ExpectedException thrown = ExpectedException.none();
	 
	 @Test
	 public void testWrongCode() 
	 {
		 myCode.givePassword("wrongpswd");
		 myCode.unlockIt();
		 assertTrue(myCode.isLocked());
	}
	 	 

}
