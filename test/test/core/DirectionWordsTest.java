package test.core;

import org.junit.Test;
import static org.junit.Assert.*;

import mig.core.DirectionWords;


/**
 * <b>JUnit test for the class DirectionWords</b>
 * @see DirectionWords
 * @author group8
 * @version 6/12/16
 *
 */
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
