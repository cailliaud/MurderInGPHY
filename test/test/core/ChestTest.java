package test.core;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import mig.core.Bolt;
import mig.core.Chest;
import mig.core.Lock;
import mig.core.Code;
import mig.core.Item;


/**
 * <b>JUnit test for the class Chest</b>
 * @see Information
 * @author group8
 *
 */
public class ChestTest {
	private Item test1; 
	private Item test2;
	private Item test3;
	private Item test4;
	private Item test5; 
	
	/**
	 * Default constructor for test class ChestTest
	 */
	public ChestTest()
	{
	}
	/**
	 * Sets up the text fixture. 
	 * <p> Called before every test case method. </p>
	 * <p> Initialize the chest with 4 items, test1, test2, test3 and test4 </p>
	 */
	
	@Before 
	public void setUp(){
		Chest chest1 = new Chest (); 
		chest1.addItem(test1); 
		chest1.addItem(test2); 
		chest1.addItem(test3); 
		chest1.addItem(test4); 
	}
	
	/**
	 * Tears down the test fixture
	 * <p> Called after every test case method. Nothing to do in this case </p>
	 */
	@After
	public void tearDown()
	{
	}
	
	/**
	 * Method addItemTest
	 * <p> Checks if a item is well added to a chest </p>
	 */
	@Test 
	public void addItemTest(){
		Chest chest2 = new Chest (); 
		chest2.addItem(test1); 
		//The method "getContaintChest()" must return test1
		assertEquals(test1, chest2.getContaintChest());	
	}
}