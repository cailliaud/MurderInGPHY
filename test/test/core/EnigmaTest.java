package test.core;

import static org.junit.Assert.*;

import org.junit.*;

import mig.core.Enigma;
import mig.core.EnigmaItem;
import mig.core.Information;
import mig.core.Item;
import mig.core.Key;
import mig.core.PhysicalObject;
import mig.exceptions.FailedResolvEnigma;
import mig.exceptions.NullQuestionException;

import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * JUnit test for the class Enigma
 * @see Enigma
 * @author group8
 * @version 23/11/16
 *
 */

public class EnigmaTest {
	private Enigma enigma ;
	private EnigmaItem object;
	private EnigmaItem info;
	private Item key;
	private EnigmaItem item;

	public EnigmaTest() {
		key = new Key("porte du fond");
		info= new Information("La salle sombre","Elle contient un mystère.");
		object = new PhysicalObject("pioche", "une pioche des plus commune");
	}
	
	/** 
	 * Default constructor for test class Enigma
	 */
	@Test
	public void testEnigmaNull() {	
		enigma= new Enigma();
		assertEquals("Hello, i can not talk to you. I'm really busy !", enigma.getQuest());
	}
	
	/**
	 * This test create an enigma with a null ItemReward
	 * @throws NullPointerException return a message if the pointer is null
	 * @throws NullQuestionException return a message if the question is null
	 */
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	@Test 
	public void create_Enigma_with_Null_ItemReward() 
			throws NullPointerException,NullQuestionException{
		thrown.expect(NullPointerException.class);
		enigma = new Enigma("la quête ?",item, key);
	
	}
	
	/**
	 * This test create a good enigma
	 * @throws NullQuestionException return a message if the question is null
	 */
	@Test
	public void createGoodEnigma() 
			throws NullQuestionException{
		enigma = new Enigma("la quête ?",info, key);
	
	}
	
	/**
	 * This test create an enigma with an Item and without a question
	 * @throws NullQuestionException return a message if the question is null
	 */
	@Test 
	public void create_Enigma_withItem_withoutQuestion() 
			throws NullQuestionException{
		thrown.expect(NullQuestionException.class);
		enigma = new Enigma("",info,key);
	}
	

	/**
	 * This test looked if the enigma is solved or not
	 * @throws NullQuestionException return a message if the question is null
	 * @throws FailedResolvEnigma return a message if the enigma is not resolved
	 */
	@Test
	public void solveEnigma() 
			throws NullQuestionException, FailedResolvEnigma{
		Item reward;
		enigma = new Enigma ("Quelle salle est incroyable ?", info , key);
		try {
			reward= enigma.resolveEnigma(info);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertTrue(enigma.alreadyResolved());
	}
	
	/**
	 * This test looked if it is possible to resolved an enigma with a bad answer
	 * @throws NullQuestionException return a message if the question is null
	 * @throws FailedResolvEnigma return a message if the enigma is not resolved
	 */
	@Test
	public void badAnswerToResolveEnigma() 
			throws NullQuestionException, FailedResolvEnigma{
		Item reward;
		enigma = new Enigma ("Quelle salle est incroyable ?", info , key);
		thrown.expect(FailedResolvEnigma.class);
		reward= enigma.resolveEnigma(object);

	}
	
	/**
	 * This test looked if it is possible to resolved an enigma with an Item and a given  String
	 * @throws NullQuestionException return a message if the question is null
	 * @throws FailedResolvEnigma return a message if the enigma is not resolved
	 */
	@Test
	public void solveEnigmawithItem_GivingString()
			throws NullQuestionException, FailedResolvEnigma{
		Item reward;
		enigma = new Enigma ("Quelle salle est incroyable ?", info , key);
		thrown.expect(FailedResolvEnigma.class);
		reward= enigma.resolveEnigma("Elle contient un mystère.");
	}
	
	/**
	 * This test looked if it is possible to resolved an enigma with a String and a given Item
	 * @throws NullQuestionException return a message if the question is null
	 * @throws FailedResolvEnigma return a message if the enigma is not resolved
	 */
	@Test
	public void solveEnigmawithString_GivingItem()
			throws NullQuestionException, FailedResolvEnigma{
		Item reward;
		enigma = new Enigma ("Quelle salle est incroyable ?", "Elle contient un mystère." , key);
		thrown.expect(FailedResolvEnigma.class);
		reward= enigma.resolveEnigma(info);
	}
	
}
