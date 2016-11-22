package test.core;

import static org.junit.Assert.*;

import org.junit.Test;

import mig.core.Information;
import mig.core.Item;

public class InformationTest {
	private Information info ;
	private Item name; 

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
}
