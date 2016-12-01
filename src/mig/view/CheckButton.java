package mig.view;

import javax.swing.JButton;

import mig.core.Room;

public class CheckButton extends JButton {
	private Room currentRoom;
	public CheckButton(Room room){
		this.currentRoom=room;
		this.setText("Check The Room");
		if (currentRoom.noItemHere()) this.setEnabled(false);
		
		
	}
	
	public void update(){
		if (currentRoom.noItemHere()) this.setEnabled(false);
		else this.setEnabled(true);
	}

}
