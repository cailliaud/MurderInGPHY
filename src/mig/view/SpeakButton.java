package mig.view;
import javax.swing.JButton;
import mig.core.Game;


public class SpeakButton extends JButton {
	private Game game;
	private Window window;
	private SelectNPC selectNPC;
	
// When clicking the Speak button, a window appears and allows the player to choose the NPC the wants to speak with.
// Selecting one of the available NPC will display it dialogue and enigma that goes with it (attribution made in the Game class).  
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

// Make the Speak button impossible to click on if there is no NPC in the current room visited by the player.
	public void update(){
		if (game.myPlayer.getCurrentRoom().noOneHere()) this.setEnabled(false);
		else this.setEnabled(true);
	                    }
}
