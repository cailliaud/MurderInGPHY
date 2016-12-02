package mig.view;

import javax.swing.JButton;

import mig.core.Game;
import mig.core.Room;

public class SpeakButton extends JButton {
	private Game game;
	private Window window;
	
	public SpeakButton(Window window, Game game){
		this.window=window;
		this.game=game;
		this.setText("Speak");
		update();
		
		
	}
	
	public void update(){
		if (game.myPlayer.getCurrentRoom().noOneHere()) this.setEnabled(false);
		else this.setEnabled(true);
	}


}
