package mig.view;
import javax.swing.JButton;
import mig.core.Game;


public class SpeakButton extends JButton {
	private Game game;
	private Window window;
	private SelectNPC selectNPC;
	

	public SpeakButton(Window window, Game game){
		this.window=window;
		this.game=game;
		this.setText("Speak");
		update();
			this.addActionListener(
					ae->{
						selectNPC = new SelectNPC(null, "Who do you want to speak with ?", "Select the person", game, window);
//		    	 
					}
					);
	}

	
	public void update(){
		if (game.myPlayer.getCurrentRoom().noOneHere()) this.setEnabled(false);
		else this.setEnabled(true);
	}


}
