package test.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import mig.core.Information;
import mig.core.PhysicalObject;

/**
 * <b>JUnit test for the class PhysicalObject</b>
 * @see PhysicalObject
 * @author group8
 *
 */
public class PhysicalObjectTest {
	private PhysicalObject object ;
	
	/**
	 * Default constructor for test class PhysicalObjectTest
	 */
	public PhysicalObjectTest()
	{
	}
	
	/**
	 * Method testNameObject
	 * <p>Checks if the name given as parameter in the constructor is correctly set to the attribute
	 */
	@Test
	public void testNameObject()

	{
		object = new PhysicalObject("Batterie", "Pour un ordinateur");
		//The parameter "Batterie" must be set as the name attribute
		assertEquals("Batterie", object.getName());
	}
	
	/**
	 * Method testInformationObject
	 * <p>Checks if the information given as parameter in the constructor is correctly set to the attribute
	 */
	@Test
	public void testInformationObject()

	{
		object = new PhysicalObject("Batterie", "Pour un ordinateur");
		//The parameter "Pour un ordinateur" must be set as the information attribute
		assertEquals("Pour un ordinateur", object.getInformation());
	}
	/**
	 * Method testNotSetNoInfoObject
	 * <p> Checks that do not set a name of the object is not possible </p>
	 */

	@Test
	public void testNotSetNoInfoObject() {
		object = new PhysicalObject("Objet",null);
		//The information must be "unknown information".
		assertEquals("unknown information", object.getInformation());	
	}
	
	/**
	 * Method testNotSetNoNameObject
	 * <p> Checks that do not set a name of the Object is not possible </p>
	 */
	@Test
	public void testNotSetNoNameObject() {
		  object = new PhysicalObject(null,"rien");
		//The name of the information must be "unknown name".
		assertEquals("unknown name", object.getName());	
	}
	/**
	 * Method testNotSetNoNameAndNoInfoObject
	 * <p> Checks that not set a name and an information of the Object is not possible </p>
	 */
	@Test
	public void testNotSetNoNameAndNoInfoObject() {
		object = new PhysicalObject(null,null);
		//The name of the information must be "unknown name" and "unknown information".
		assertEquals("unknown name", object.getName());	
		assertEquals("unknown information", object.getInformation());
	}
}