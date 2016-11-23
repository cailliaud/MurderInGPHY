package test.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
import mig.core.EnigmaItem;
import mig.core.Information;
import mig.core.PhysicalObject;


/**
 * JUnit test for the class EnigmeItem
 * @see EnigmaItem
 * @author group8
 *
 */

public class EnigmaItemTest {
	private PhysicalObject object ;
	private Information info ; 
	
	/**
	 * Default constructor for test class EnigmaItemTest
	 */
	public EnigmaItemTest()
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
	/**
	 * Method testNameInfor
	 * <p>Checks if the name given as parameter in the constructor is correctly set to the attribute
	 */
	@Test
	public void testNameInfor()

	{
		info = new Information("Information", "blabla");
		//The parameter "Information" must be set as the name attribute
		assertEquals("Information", info.getName());
	}
	
	/**
	 * Method testInformation
	 * <p>Checks if the information given as parameter in the constructor is correctly set to the attribute
	 */
	@Test
	public void testInformation()

	{
		info = new Information("Information", "blabla");
		//The parameter "blabla" must be set as the information attribute
		assertEquals("blabla", info.getInformation());
	}
	/**
	 * Method testNotSetNoInfo
	 * <p> Checks that do not set a name of the information is not possible </p>
	 */

	@Test
	public void testNotSetNoInfo() {
		info = new Information("info urgente",null);
		//The information must be "unknown information".
		assertEquals("unknown information", info.getInformation());	
	}
	
	/**
	 * Method testNotSetNoName
	 * <p> Checks that do not set a name of the information is not possible </p>
	 */
	@Test
	public void testNotSetNoName() {
		info = new Information(null,"rien");
		//The name of the information must be "unknown name".
		assertEquals("unknown name", info.getName());	
	}
	
	/**
	 * Method testNotSetNoNameAndNoInfo
	 * <p> Checks that not set a name and an information of the information is not possible </p>
	 */
	@Test
	public void testNotSetNoNameAndNoInfo() {
		info = new Information(null,null);
		//The name of the information must be "unknown name" and "unknown information".
		assertEquals("unknown name", info.getName());	
		assertEquals("unknown information", info.getInformation());
	}
	
	/**
	 * Method informationAndObjectNameNotEqual
	 * <p> Checks that an information and an object have not the same name </p>
	 */
	@Test
	public void informationAndObjectNameNotEqual() {
		info = new Information("Information", "blabla");
		object = new PhysicalObject("Batterie", "Pour un ordinateur");
		//The name of the information and the object must not be the same.
		assertNotEquals(object.getName(), info.getName());	
	}

	/**
	 * Method informationAndObjectNameNotEqual
	 * <p> Checks that an information and an object have not the same name </p>
	 */
	@Test
	public void informationAndObjectInfoNotEqual() {
		info = new Information("Information", "blabla");
		object = new PhysicalObject("Batterie", "Pour un ordinateur");
		//The information of the information and the object must not be the same.
		assertNotEquals(object.getInformation(), info.getInformation());	
}
}