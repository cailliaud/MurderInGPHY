package test.core;

import static org.junit.Assert.*;

import org.junit.Test;
import mig.core.Personage;
import mig.core.PNJ;

public class PNJTest {

	PNJ p1= new PNJ ("Toto", false, null);
	
	
	@Test
	public void testGetName() {
		assertEquals("Toto",p1.getName() );
	}
	
	public void testGetKiller() {
		assertEquals(false,p1.getIsKiller());
	}
	
	public void testLower() {
		assertNotEquals("toto",p1.getName());
	}
	

}
