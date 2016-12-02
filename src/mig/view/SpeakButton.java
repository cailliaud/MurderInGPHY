package mig.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import mig.core.Room;
import mig.core.Enigma;
import mig.view.EnigmaView;

public class SpeakButton extends JButton {
	private Room currentRoom;
	
	
	public SpeakButton(Room room){
		this.currentRoom=room;
		this.setText("Speak");
		//if (currentRoom.noOneHere()) this.setEnabled(false);
		//else {
			this.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent arg0) {
		    	  EnigmaView ev = new EnigmaView(null, "Enigma", true);
		    	  Enigma answ = ev.EnigmaViewDialog(); 
		    	  ev.dispose();
		      }          
		});
	}
	//}
	
	public void update(){
		if (currentRoom.noOneHere()) this.setEnabled(false);
		else this.setEnabled(true);
	}


}
