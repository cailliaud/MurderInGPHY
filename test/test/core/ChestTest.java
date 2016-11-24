package test.core;

import static org.junit.Assert.*;

import org.junit.Test;

import mig.core.Bolt;
import mig.core.Chest;
import mig.core.Code;
import mig.core.Information;
import mig.core.Key;

/**
 * <b>JUnit test for the class Chest</b>
 * @see Information
 * @author group8
 *
 */
public class ChestTest {
	private Key key1 = new Key("toto"); 
	private Key key2 = new Key("tata"); 
	private Key key3  = new Key("t"); 
	private Key key4  = new Key("roro"); 
	private Information info5  = new Information("Nicolas","is the killer"); 
	private Chest chest1;
	private Bolt bolt_code = new Code("vendee");
	
	/**
	 * Default constructor for test class ChestTest
	 */
	public ChestTest()
	{
		chest1 = new Chest (bolt_code); 
		chest1.addItem(key1); 
		chest1.addItem(key2); 
		chest1.addItem(key3); 
		chest1.addItem(key4); 
		chest1.addItem(info5);
	}

	/**
	 * Method addItemTest
	 * <p> Checks if a item is well added to a chest </p>
	 */
	@Test 
	public void addItemTest(){
		Chest chest2 = new Chest (bolt_code); 
		chest2.addItem(key1); 
		//The method "getContaintChest()" must return test1
		assertTrue( chest2.getContaintChest().contains(key1));	
	}
	
	/**
	 * Method numberOfItemsTest
	 * <p> Checks if the number of items in the array is correct </p>
	 */
	@Test 
	public void numberOfItemTest(){ 
		//The method "numberOfItem()" must return 5
		assertEquals(5, chest1.numberOfItems());	
	}
	
	/**
	 * Method removeItemTest
	 * <p> Checks if a item is well removed from the chest </p>
	 */
	@Test 
	public void removeItemTest(){
		int total = chest1.numberOfItems();
		chest1.removeItem(key1); 
		//The method "removeItemTest()" must return a number of items equals to the total
		assertEquals(total-1,chest1.numberOfItems());	
	}
	
	/**
	 * Method removeTheGoodItem
	 * <p> Checks if the good item is well removed from the chest </p>
	 */
	@Test 
	public void removeTheGoodItem(){
		chest1.removeItem(key1); 
		//The method "removeTheGoodItem()" must return the name of the item deleted 
		assertNotEquals(key1, chest1.getContaintChest());	
	}
	/**
	 * Method addItemAlreadyPresent
	 * <p> Checks if we can add an item already present in the Chest </p>
	 */
	@Test
	public void addItemAlreadyPresent(){
		int total = chest1.numberOfItems();
		chest1.addItem(info5);
		assertEquals(total,chest1.numberOfItems());	
	}
	
	@Test
	public void openWithGoodPassChest(){
		String pass = "vendee";
		chest1.OpenChest(pass);
		assertFalse(chest1.isLocked());
	}
	
	@Test
	public void openWithBadPassChest(){
		String pass = "toto";
		chest1.OpenChest(pass);
		assertTrue(chest1.isLocked());
	}
}