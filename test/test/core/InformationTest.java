package test.core;

import static org.junit.Assert.*;

import org.junit.Test;

import mig.core.Information;
import mig.core.Item;

public class InformationTest {
	private Information info ;
	private Item name; 
	
	/**
	 * Default constructor for test class InformationTest
	 */
	public InformationTest()
	{
	}
	
	/**
	 * Method testNameInfor
	 * <p>Checks if the name given as parameter in the constructor is correctly set to the attribute
	 */
	@Test
	public void testNameInfor()

	{
		info = new Information("Infor", "blabla");
		//The parameter "Infor" must be set as the name attribute
		assertEquals("Infor", info.getName());
	}
	
	/**
	 * Method testInformation
	 * <p>Checks if the information given as parameter in the constructor is correctly set to the attribute
	 */
	@Test
	public void testInformation()

	{
		info = new Information("Infor", "blabla");
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
}
