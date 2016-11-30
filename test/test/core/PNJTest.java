package test.core;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import mig.core.Enigma;
import mig.core.Lock;
import mig.core.NPC;
import mig.core.Room;
import mig.exceptions.KeyForgottenException;
/**
 * <b>JUnit test for the class PNJ</b>
 * @see NPC
 * @author group8
 *
 */
public class PNJTest {

	
	
	/**
	 * Method to test if the name is well added in the ocnstructor
	 */
	@Test
	public void testGetName() {
		NPC p1= new NPC ("Toto",  null);
		assertEquals("Toto",p1.getName() );
	}
	
	/**
	 * Test if a default enigma is created if there is no enigma given 
	 * in the instentiation of the object
	 */
	@Test 
	public void getEnigmaWithNullEnigmaInConstructor()
	{
		NPC npc = new NPC ("nicolas",null);
		assertNotNull(npc.getEgnime());
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
	    NPC npc = new NPC ("",null);
	}
	
	/**
	 * Method to test if the enigma is well added in the contructor.
	 */
	@Test
	public void getEnigmaExisting(){
		Enigma enigma = new Enigma();
		NPC npc = new NPC ("jones",enigma);
		assertEquals(enigma, npc.getEgnime());
	}
	
	/**
	 * Test if the PNJ is alive after be added in a room
	 */
	@Test
	public void testIfPnjisAlive_InRoom(){
		Room room = new Room("laboratoire");
		NPC npc = new NPC("jones",null);
		room.addPNJ(npc);
		assertEquals(true, npc.isAlive());
		
	}
	
	/**
	 * Test if the PNJ becomes not alive after he was removed from a room
	 */
	@Test
	public void TestIfPnjIsAlive_RemovedFromRoom(){
		Room room = new Room("laboratoire");
		NPC npc = new NPC("jones",null);
		room.addPNJ(npc);
		room.removePNJ(npc);
		assertNotEquals(true, npc.isAlive());
	}
	
	

	

	

}
