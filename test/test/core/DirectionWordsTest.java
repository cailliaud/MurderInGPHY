package test.core;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import mig.core.DirectionWords;

public class DirectionWordsTest {
	String test = "middle";
	DirectionWords tester = new DirectionWords();


	/**
	 * Method to test a Wrong Direction
	 */
	@Test
	public void testUnknownDirection() {
		assertEquals("This Word is not a good direction", false, tester.isDirection(test));
	}

}
