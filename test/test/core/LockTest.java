package test.core;

import static org.junit.Assert.*;
import mig.core.Bolt;
import mig.core.Code;
import mig.core.Key;
import mig.core.Lock;

import org.junit.Test;

/**
 * The test class LockTest
 * Unit tests of the Lock class
 * 
 * @author Group8
 * @version 22/11/2016
 */
public class LockTest {
	Key k1= new Key("toto");
	Lock lock = new Lock(k1);
	
	/**
	 * Default constructor
	 */
	public LockTest()
	{
	}
	
	
	/**
	 * Method for test if the right key can unlocked the lock
	 */
	@Test
	public void testOpenBadKey() {
		Key k2 = new Key ("tata");
		assertFalse(lock.opened(k2));
	}
	
	/**
	 * Method for test if the wrong key can unlocked the lock
	 */
	@Test
	public void testOpenGoodKey() {
		assertTrue(lock.checkState());
		assertTrue(lock.opened(k1));
	}
	
	/**
	 * Method for test if the right key can locked the lock
	 */
	@Test
	public void testCloseBadKey() {
		Key k2 = new Key ("tata");
		assertFalse(lock.closed(k2));
	}
	
	/**
	 * Method for test if the wrong key can locked the lock
	 */
	@Test
	public void testCloseGoodKey() {
		assertTrue(lock.checkState());
		assertTrue(lock.opened(k1));
	}
	

}