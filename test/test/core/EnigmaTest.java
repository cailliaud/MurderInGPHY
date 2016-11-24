package test.core;

import static org.junit.Assert.*;
import mig.core.Enigma;

import org.junit.Test;

/**
 * JUnit test for the class Enigma
 * @see Enigma
 * @author group8
 * @version 23/11/16
 *
 */

public class EnigmaTest {
	private Enigma enigma ;
//	private PhysicalObject object;
//	private Information info;
//	private Item item;
//	private Item item2; 
//	private boolean isResolved = false;

	/** 
	 * Default constructor for test class Enigma
	 */
	@Test
	public void testEnigmaNull() {	
		enigma= new Enigma(null);
		assertEquals("Hello, i can not talk to you. I'm really busy !", enigma.getQuest());
	}
}
//
//	/**
//	 * Method testSetAnswerString
//	 * <p>Checks if the response given as parameter in a String </p>
//	 */
//	@Test
//	public void testSetAnswerString() {
//		info= new Information("Answer","My response is blabla");
//		assertEquals("Answers", info.getName()); 
//	}
//
//	/**
//	 * Method testSetAnswerEnigmaItem
//	 * <p> Checks if the response given as parameter is an EnigmaItem </p>
//	 */
//	@Test
//	public void testSetAnswerEnigmaItem() {
//		object= new PhysicalObject ("Book", "For ADA code");
//		assertEquals("Book", object.getName()); 
//	}
//
//	/**
//	 * Method testResolveEnigmaString
//	 * <p> Return false if the Enigma is not resolved if the response is a String </p>
//	 */
//	@Test
//	public void testResolveEnigmaString() {
//		info= new Information ("Answer", "My response is toto");
//		assertEquals (false, info.getExist());
//	}
//
//	/**
//	 * Method testResolveEnigmaItem
//	 * <p> Return false if the Enigma is not resolved if the response is an PhysicalObject </p> 
//	 */
//	@Test
//	public void testResolveEnigmaEnigmaItem() {
//		object = new PhysicalObject("Book", "For Java code");
//		assertEquals (false, object.getExist());
//	}
//
//	/**
//	 * Method testRewarded
//	 * <p> Return null when the Enigma is not resolved </p>
//	 */
//	@Test
//	public void testRewarded() {
//		item = new Information("Next room", "To find murder");
//		item2 = new PhysicalObject ("Key", "For open door");
//		assertEquals (null, item.getName());
//		assertEquals (null, item2.getName());
//	}
//
//	/**
//	 * Method testAlreadyResolved
//	 * <p> Return false if the Enigma is not resolved </p> 
//	 */
//	@Test
//	public void testAlreadyResolved() {
//		assertEquals (false, isResolved.getExist());
//	}
//
//}
