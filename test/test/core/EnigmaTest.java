package test.core;

import static org.junit.Assert.*;

import org.junit.*;

import mig.core.Enigma;
import mig.core.EnigmaItem;
import mig.core.Information;
import mig.core.Item;
import mig.core.Key;
import mig.core.PhysicalObject;
import mig.exceptions.ErrorTypeAnswer;
import mig.exceptions.FailedResolvEnigma;


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
			throws NullPointerException{
		thrown.expect(NullPointerException.class);
		enigma = new Enigma("la quête ?",item,"coucou", key);
	
	}
	
	/**
	 * This test create a good enigma
	 * @throws NullQuestionException return a message if the question is null
	 */
	@Test
	public void createGoodEnigma(){
		enigma = new Enigma("la quête ?",info,"coucou", key);
	
	}
	

	

	/**
	 * This test looked if the enigma is solved or not
	 * @throws NullQuestionException return a message if the question is null
	 * @throws FailedResolvEnigma return a message if the enigma is not resolved
	 */
	@Test
	public void solveEnigma() 
			throws FailedResolvEnigma{
		enigma = new Enigma ("Quelle salle est incroyable ?", info ,"coucou", key);
		try {
			enigma.resolveEnigma(info);
		} catch (Exception e) {
			e.printStackTrace();
		}
		assertTrue(enigma.alreadyResolved());
	}
	
	/**
	 * This test looked if it is possible to resolved an enigma with a bad answer
	 * @throws NullQuestionException return a message if the question is null
	 * @throws FailedResolvEnigma return a message if the enigma is not resolved
	 * @throws ErrorTypeAnswer 
	 */
	@Test
	public void badAnswerToResolveEnigma() 
			throws FailedResolvEnigma, ErrorTypeAnswer{
		enigma = new Enigma ("Quelle salle est incroyable ?", info ,"coucou", key);
		thrown.expect(FailedResolvEnigma.class);
		enigma.resolveEnigma(object);

	}
	
	/**
	 * This test looked if it is possible to resolved an enigma with an Item and a given  String
	 * @throws ErrorTypeAnswer return a message if the enigma is not resolved
	 * @throws FailedResolvEnigma 
	 */
	@Test
	public void solveEnigmawithItem_GivingString()
			throws ErrorTypeAnswer, FailedResolvEnigma {
		Item reward;
		enigma = new Enigma ("Quelle salle est incroyable ?", info ,"coucou", key);
		thrown.expect(ErrorTypeAnswer.class);
		enigma.resolveEnigma("Elle contient un mystère.");
	}
	
	/**
	 * This test looked if it is possible to resolved an enigma with a String and a given Item
	 * @throws NullQuestionException return a message if the question is null
	 * @throws FailedResolvEnigma return a message if the enigma is not resolved
	 */
	@Test
	public void solveEnigmawithString_GivingItem()
			throws  ErrorTypeAnswer,FailedResolvEnigma{
		enigma = new Enigma ("Quelle salle est incroyable ?", "Elle contient un mystère." ,"coucou", key);
		thrown.expect(ErrorTypeAnswer.class);
		enigma.resolveEnigma(info);
	}
	
}
