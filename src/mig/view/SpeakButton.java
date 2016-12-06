package mig.view;
import javax.swing.JButton;
import mig.core.Game;



/**
 * JButton to manage the actions between the view and the core for Enigma
 * @author group8
 *
 */
@SuppressWarnings("serial")
public class SpeakButton extends JButton {
	/**
	 * The current Game
	 */
	private Game game;
	
	@SuppressWarnings("unused")
	/**
	 * The window of the game
	 */
	private Window window;
	
	@SuppressWarnings("unused")
	/**
	 * The JDialog to select the NPC
	 */
	private SelectNPC selectNPC;
	
	/**
	 * Constructor for the speak Button
	 * @param window the current Window
	 * @param game the current Game
	 * When clicking the Speak button, a window appears and allows the player to choose the NPC the wants to speak with.
	 * Selecting one of the available NPC will display it dialogue and enigma that goes with it (attribution made in the Game class).  
	 */
	public SpeakButton(Window window, Game game){
		this.window=window;
		this.game=game;
		this.setText("Speak");
		update();
			this.addActionListener(
					ae->{
						selectNPC = new SelectNPC(null, "Who do you want to speak with ?", "Select the person", game, window);
				    	}
					              );
	                                            }

	/**
	 * Update for the JButton to know if the button is enabled or not 
	 * According to the statement if the room has npcs or not
	 */
	public void update(){
		if (game.myPlayer.getCurrentRoom().noOneHere()) this.setEnabled(false);
		else this.setEnabled(true);
	                    }
}
