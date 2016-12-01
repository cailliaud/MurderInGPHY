package mig.view;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import mig.core.Door;
import mig.core.Game;
import mig.core.Player;
import mig.core.Room;
import mig.exceptions.ErrorObjectClosed;

public class DirectionPanel extends JPanel {
	private JButton north , south, east , west , up_down;
	private Game game;
	private Window window;
	private Door door;

	public DirectionPanel(Window window, Game game){
		this.game =game;
		this.window = window;
		
		// Button north
		north = new JButton(new ImageIcon("resources/north_arrow.png"));
		north.addActionListener(
				ae -> {
					door = game.myPlayer.getCurrentRoom().goInDirection("north");
					try {
						Room nextRoom= door.getNextRoom(game.myPlayer.getCurrentRoom());
						game.myPlayer.move(nextRoom);
						this.window.updateRoomImage();
						this.updateAccess();
					} catch (ErrorObjectClosed e) {
						openDoor(door);
					}
				}
				);
		
		// button South
		south = new JButton(new ImageIcon("resources/south_arrow.png"));
		south.addActionListener(
				ae -> {
					door = game.myPlayer.getCurrentRoom().goInDirection("south");
					try {
						
						Room nextRoom= door.getNextRoom(game.myPlayer.getCurrentRoom());
						game.myPlayer.move(nextRoom);
						this.window.updateRoomImage();
						this.updateAccess();
					} catch (ErrorObjectClosed e) {
						openDoor(door);
					}
				}
				);
		
		// Button East
		east = new JButton(new ImageIcon("resources/east_arrow.png"));
		east.addActionListener(
				ae -> {
					door = game.myPlayer.getCurrentRoom().goInDirection("east");
					try {
						
						Room nextRoom= door.getNextRoom(game.myPlayer.getCurrentRoom());
						game.myPlayer.move(nextRoom);
						this.window.updateRoomImage();
						this.updateAccess();
					} catch (ErrorObjectClosed e) {
						openDoor(door);
					}
				}
				);
		
		// Button West
		west = new JButton(new ImageIcon("resources/west_arrow.png"));
		west.addActionListener(
				ae -> {
					door = game.myPlayer.getCurrentRoom().goInDirection("west");
					try {
						
						Room nextRoom= door.getNextRoom(game.myPlayer.getCurrentRoom());
						game.myPlayer.move(nextRoom);
						this.window.updateRoomImage();
						this.updateAccess();
					} catch (ErrorObjectClosed e) {
						openDoor(door);
					}
				}
				);
		
		//Button Up Or Down
		up_down = new JButton(new ImageIcon("resources/up_arrow.png"));
		up_down.addActionListener(
				ae -> {
					if (game.myPlayer.getCurrentRoom().exitsPossible("up"))
						door = game.myPlayer.getCurrentRoom().goInDirection("up");
					else
						door = game.myPlayer.getCurrentRoom().goInDirection("down");

					try {
						Room nextRoom= door.getNextRoom(game.myPlayer.getCurrentRoom());
						game.myPlayer.move(nextRoom);
						this.window.updateRoomImage();
						this.updateAccess();
					} catch (ErrorObjectClosed e) {
						openDoor(door);
					}
				}
				);


		if (!game.myPlayer.getCurrentRoom().exitsPossible("north")) north.setEnabled(false);
		if (!game.myPlayer.getCurrentRoom().exitsPossible("south")) south.setEnabled(false);
		if (!game.myPlayer.getCurrentRoom().exitsPossible("east")) east.setEnabled(false);
		if (!game.myPlayer.getCurrentRoom().exitsPossible("west")) west.setEnabled(false);
		if ((!game.myPlayer.getCurrentRoom().exitsPossible("up"))&&(!game.myPlayer.getCurrentRoom().exitsPossible("down"))) 
			up_down.setEnabled(false);




		this.setLayout( new BorderLayout());

		this.add(north, BorderLayout.NORTH);
		this.add(south, BorderLayout.SOUTH);
		this.add(east, BorderLayout.EAST);
		this.add(west, BorderLayout.WEST);
		this.add(up_down, BorderLayout.CENTER);
	}

	public void openDoor(Door door){
		switch (door.getTypeLock()) {
		case "Code":
			JOptionPane jop = new JOptionPane(), jop2 = new JOptionPane();
			String pass = jop.showInputDialog(null, "Give the password to go forward : ", "A password is needed", JOptionPane.QUESTION_MESSAGE);
			door.openDoor(pass);
			try {
				game.myPlayer.move(door.getNextRoom(game.myPlayer.getCurrentRoom()));
				jop2.showMessageDialog(null, "Well Done you can go forward", "Good Password", JOptionPane.INFORMATION_MESSAGE);
				
			} catch (Exception e1) {
				jop2.showMessageDialog(null, "An Error Occured, Try again", "Wrong Password", JOptionPane.INFORMATION_MESSAGE);
			}
			break;
		case "Lock" :
//			JOptionPane jop = new JOptionPane(), jop2 = new JOptionPane();
//			String pass = jop.showInputDialog(null, "Give the password to go forward : ", "A password is needed", JOptionPane.QUESTION_MESSAGE);
//			door.openDoor(pass);
//			try {
//				game.myPlayer.move(door.getNextRoom(game.myPlayer.getCurrentRoom()));
//				jop2.showMessageDialog(null, "Well Done you can go forward", "Good Password", JOptionPane.INFORMATION_MESSAGE);
//				
//			} catch (Exception e1) {
//				jop2.showMessageDialog(null, "An Error Occured, Try again", "Wrong Password", JOptionPane.INFORMATION_MESSAGE);
//			}
			break;
		default:
			break;
		}
		
		updateAccess();
		this.window.updateRoomImage();
	}
	
	public void updateAccess(){
		Room  currentRoom= game.myPlayer.getCurrentRoom();
		if (!currentRoom.exitsPossible("north")) north.setEnabled(false);
		else north.setEnabled(true);
		if (!currentRoom.exitsPossible("south")) south.setEnabled(false);
		else south.setEnabled(true);
		if (!currentRoom.exitsPossible("east")) east.setEnabled(false);
		else east.setEnabled(true);
		if (!currentRoom.exitsPossible("west")) west.setEnabled(false);
		else west.setEnabled(true);
		if ((!currentRoom.exitsPossible("up"))&&(!currentRoom.exitsPossible("down"))) 
			up_down.setEnabled(false);
		else
			up_down.setEnabled(true);

	}

}
