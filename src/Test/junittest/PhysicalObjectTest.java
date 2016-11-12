package Test.junittest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Core.EnigmaItem;
import Core.Information;
import Core.PhysicalObject;

public class PhysicalObjectTest {
	protected EnigmaItem test,test2;
	
	@Before
	public void setUp() throws Exception {
		test = new PhysicalObject("pioche", 5, "Attention ça peut faire mal");
		test2= new Information("toto", "Toto a dit avoir vu un meutre");
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test for the ToString() method from the class PhysicalObject
	 */
	@Test
	public void testToString() {
		String str = "This Item is a/an " +
				"PhysicalObject, called pioche\n" 
				+ "Information given is the following:\n" 
				+ "Attention ça peut faire mal" ;
		assertEquals(str, test.toString());
	}
	
	/**
	 * Test to verify that PhysicalObject and Information are differents
	 */
	@Test
	public void testValidClass() {
		assertNotEquals(test.getClass(), test2.getClass());
	}
	


}
