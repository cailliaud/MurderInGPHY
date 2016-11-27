package test.core;

import static org.junit.Assert.*;

import org.junit.Test;
import mig.core.PNJ;
/**
 * <b>JUnit test for the class PNJ</b>
 * @see PNJ
 * @author group8
 *
 */
public class PNJTest {

	private PNJ p1= new PNJ ("Toto", false, null);
	private PNJ p2= new PNJ ("Titi", true, null);
	
	@Test
	public void testGetName() {
		assertEquals("Toto",p1.getName() );
	}
	
	@Test
	public void testGetKiller() {
		assertFalse(p1.getIsKiller());
	}
	
	@Test
	public void testKiller() 
	{
		assertTrue(p2.getIsKiller());
	}
	
	

	

}
