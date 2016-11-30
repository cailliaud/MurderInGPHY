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
 * @see Code
 * @author group8
 *@version 24/11/2016
 */

public class GameTest 
{
	private Enigma nothing = new Enigma();
	
	private NPC fantomas = new NPC ("fantomas", nothing);
	private NPC bobby = new NPC ("bobby", nothing);
	private Game game ;
	
	/**
	 * default constructor for the test class CodeTest
	 */
	
	public GameTest()
	{
		game =  new Game ("Dr Watson");
		game.setKiller(fantomas);
	}
	
	@Rule public ExpectedException thrown = ExpectedException.none();

	
	@Test
	public void testGame_PlayerNameGiven(){
		assertEquals("Dr Watson", game.myPlayer.getName());
	}
	
	@Test
	public void testGame_PlayerNameEmpty(){
		Game game2 = new Game("");
		assertEquals("Sherlock", game2.myPlayer.getName());
	}
	

	
	@Test
	public void testNameKiller() 
	{
		assertEquals(fantomas, game.getKiller());
	}
	
	@Test
	public void testGiveGoodKiller() throws GameOver
	{
		game.giveKiller(fantomas);
		assertEquals(true, game.isWin());
	}
	
	@Test
	public void testGiveWrongKiller() throws GameOver {
		thrown.expect(GameOver.class);
		game.giveKiller(bobby);

	}
	
	

}
