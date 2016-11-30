package mig.view;

import javax.swing.JButton;

import mig.core.Room;

public class SpeakButton extends JButton {
	private Room currentRoom;
	
	public SpeakButton(Room room){
		this.currentRoom=room;
		this.setText("Speak");
		if (currentRoom.noOneHere()) this.setEnabled(false);
		
	}
	
	public void update(){
		if (currentRoom.noOneHere()) this.setEnabled(false);
		else this.setEnabled(true);
	}


}
