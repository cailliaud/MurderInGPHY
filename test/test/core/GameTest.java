package test.core;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import mig.core.Code;
import mig.core.Enigma;
import mig.core.Game;
import mig.core.NPC;
import mig.exceptions.GameOver;

/**
 * <b>JUnit test for the class Game</b>
 * 
 * @see Code
 * @see Enigma
 * @see NPC
 * 
 * @author group8
 *@version 24/11/2016
 */

public class GameTest 
{
	/**
	 * Create a new enigma to test the class.
	 */
	private Enigma nothing = new Enigma();
	
	/**
	 * Create a new NPC name fantomas with the enigma create "nothing".
	 */
	private NPC fantomas = new NPC ("fantomas", nothing);
	/**
	 * Create a new NPC name bobby with the enigma create "nothing"
	 */
	private NPC bobby = new NPC ("bobby", nothing);
	/**
	 * Use the game currently run.
	 */
	private Game game ;
	
	
	/**
	 * default constructor for the test class CodeTest
	 */
	
	public GameTest()
	{
		/**
		 * create new game with a player named "dr watson".
		 */
		game =  new Game ("Dr Watson");
		game.setKiller(fantomas);
	}
	
	@Rule public ExpectedException thrown = ExpectedException.none();

	
	@Test
	/**
	 * test if the name given is the good name.
	 */
	public void testGame_PlayerNameGiven(){
		assertEquals("Dr Watson", game.myPlayer.getName());
	}
	
	@Test
	/**
	 * test if the player doesn't enter a name, the game automaticly give the name "Sherlock" to the player.
	 */
	public void testGame_PlayerNameEmpty(){
		Game game2 = new Game("");
		assertEquals("Sherlock", game2.myPlayer.getName());
	}
	

	
	@Test
	/**
	 * test if the killer is well "fantomas".
	 */
	public void testNameKiller() 
	{
		assertEquals(fantomas, game.getKiller());
	}
	
	@Test
	/**
	 * test if the player gives the good killer, he win. 
	 * @throws GameOver use the method game over.
	 */
	public void testGiveGoodKiller() throws GameOver
	{
		game.giveKiller("fantomas");
		assertEquals(true, game.isWin());
	}
	
	@Test
	/**
	 * test if the player gives the bad killer, he loses. 
	 * @throws GameOver use the method game over.
	 */
	public void testGiveWrongKiller() throws GameOver {
		thrown.expect(GameOver.class);
		game.giveKiller("bobby");

	}
	
	

}
