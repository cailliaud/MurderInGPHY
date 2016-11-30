package test.core;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import mig.core.Enigma;
import mig.core.Lock;
import mig.core.PNJ;
import mig.core.Room;
import mig.exceptions.KeyForgottenException;
/**
 * <b>JUnit test for the class PNJ</b>
 * @see PNJ
 * @author group8
 *
 */
public class PNJTest {

	
	
	/**
	 * Method to test if the name is well added in the ocnstructor
	 */
	@Test
	public void testGetName() {
		PNJ p1= new PNJ ("Toto",  null);
		assertEquals("Toto",p1.getName() );
	}
	
	/**
	 * Test if a default enigma is created if there is no enigma given 
	 * in the instentiation of the object
	 */
	@Test 
	public void getEnigmaWithNullEnigmaInConstructor()
	{
		PNJ pnj = new PNJ ("nicolas",null);
		assertNotNull(pnj.getEgnime());
	}
	
	/**
	 * Exception expected
	 */
	@Rule
	public ExpectedException thrown = ExpectedException.none();

	/**
	 * Test if there is correctly a nullPointerException when you want to create a PNJ without name
	 * @throws NullPointerException If the name of the PNJ is null or empty
	 */
	@Test
	public void testNullName() throws NullPointerException {
		
		
	    thrown.expect(NullPointerException.class);
	    PNJ pnj = new PNJ ("",null);
	}
	
	/**
	 * Method to test if the enigma is well added in the contructor.
	 */
	@Test
	public void getEnigmaExisting(){
		Enigma enigma = new Enigma();
		PNJ pnj = new PNJ ("jones",enigma);
		assertEquals(enigma, pnj.getEgnime());
	}
	
	/**
	 * Test if the PNJ is alive after be added in a room
	 */
	@Test
	public void testIfPnjisAlive_InRoom(){
		Room room = new Room("laboratoire");
		PNJ pnj = new PNJ("jones",null);
		room.addPNJ(pnj);
		assertEquals(true, pnj.isAlive());
		
	}
	
	/**
	 * Test if the PNJ becomes not alive after he was removed from a room
	 */
	@Test
	public void TestIfPnjIsAlive_RemovedFromRoom(){
		Room room = new Room("laboratoire");
		PNJ pnj = new PNJ("jones",null);
		room.addPNJ(pnj);
		room.removePNJ(pnj);
		assertNotEquals(true, pnj.isAlive());
	}
	
	

	

	

}
