package test.core;

import static org.junit.Assert.*;

import org.junit.Rule;

import mig.core.Bolt;
import mig.core.Code;
import mig.core.Information;
import mig.core.Key;
import mig.core.Lock;

import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * <b>JUnit test for the class Lock</b>
 * @see Lock
 * @author group8
 *
 */
public class LockTest {
	Key k1= new Key("toto");
	Lock lock = new Lock(k1);
	Key k2 = new Key ("tata");
	
	/**
	 * Default constructor
	 */
	public LockTest()
	{
	}
	
	@Rule 
	public ExpectedException thrown = ExpectedException.none();
	
	@Test void lockwithoutKey(){
		thrown.expect(KeyForgottenException.class);
		thrown.expectMessage("You have to give  a key to create a Lock");
		Lock lock2 = new Lock(null);
		
	}
	
	
	/**
	 * Method for test if the right key can unlocked the lock
	 */
	@Test
	public void testOpenBadKey() {

		lock.giveKey(k2);
		lock.unlockIt();
		assertTrue(lock.isLocked());
	}
	
	/**
	 * Method for test if the wrong key can unlocked the lock
	 */
	@Test
	public void testOpenGoodKey() {
		lock.giveKey(k1);
		lock.unlockIt();
		assertFalse(lock.isLocked());
	}
	

	

}
