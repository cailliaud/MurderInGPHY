package test.core;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fr.mig.core.DirectionWords;

public class DirectionWordsTest {
	String test = "middle";
	DirectionWords tester = new DirectionWords();



	@Test
	public void testIsDirection() {
		assertEquals("This Word is not a good direction", false, tester.isDirection(test));
	}

}
