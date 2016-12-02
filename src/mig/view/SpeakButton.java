package mig.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import mig.core.Game;
import mig.core.Room;
import mig.core.Enigma;
import mig.view.EnigmaView;

public class SpeakButton extends JButton {
	private Game game;
	private Window window;
	

	public SpeakButton(Window window, Game game){
		this.window=window;
		this.game=game;
		this.setText("Speak");
		update();
		

			this.addActionListener(
					ae->{
						
		    	  EnigmaView ev = new EnigmaView(null, "Enigma", true);
		    	  Enigma answ = ev.EnigmaViewDialog(); 
		    	  ev.dispose();
					}
					);
	}

	
	public void update(){
		if (game.myPlayer.getCurrentRoom().noOneHere()) this.setEnabled(false);
		else this.setEnabled(true);
	}


}
