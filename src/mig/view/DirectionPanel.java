package mig.view;

import java.awt.BorderLayout;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import mig.core.Door;
import mig.core.Game;
import mig.core.Room;
import mig.exceptions.ErrorObjectClosed;

/**
* <b>DirectionPanel is a class representing the direction accessible for the played in the game.</b>
* <b>The player can move in a direction if a door exist in this direction</b>
* <p>
* A DirectionPanel contains these elements
* </p>
* <ul>
* <li>The player can move at the direction north</li>
* <li>The player can move at the direction south</li>
* <li>The player can move at the direction east</li>
* <li>The player can move at the direction west</li>
* <li>The player can go upstairs</li>
* <li>The player can go down to the ground floor</li>
* </ul>
* 
* 
* @author Group 8
* @version 22/11/2016
*/

@SuppressWarnings("serial")
public class DirectionPanel extends JPanel {
	private JButton north , south, east , west , up_down;
	private Game game;
	private Window window;
	private Door door;
	@SuppressWarnings("unused")
	private GiveKey keyGiven;
	private final URL urlNorth = BackPack.class.getResource("resources/north_arrow.png");
	private final ImageIcon iconNorth = new ImageIcon(urlNorth);
	private final URL urlSouth = BackPack.class.getResource("resources/south_arrow.png");
	private final ImageIcon iconSouth = new ImageIcon(urlSouth);
	private final URL urlEast = BackPack.class.getResource("resources/east_arrow.png");
	private final ImageIcon iconEast = new ImageIcon(urlEast);
	private final URL urlWest  = BackPack.class.getResource("resources/west_arrow.png");
	private final ImageIcon iconWest = new ImageIcon(urlWest);
	private final URL urlUpDown = BackPack.class.getResource("resources/up_arrow.png");
	private final ImageIcon iconUpDown = new ImageIcon(urlUpDown);

	/**
	 * Method to display the directions in the interface.
	 * It exist 5 directions possible: north, east, south, west, up/down.
	 * @param game The game currently played.
	 * @param window The window currently played.
	 */

	public DirectionPanel(Window window, Game game){
		this.game =game;
		this.window = window;
		
		// Button north
		north = new JButton(iconNorth);
		north.addActionListener(
				ae -> {
					door = game.myPlayer.getCurrentRoom().goInDirection("north");
					try {
						Room nextRoom= door.getNextRoom(game.myPlayer.getCurrentRoom());
						game.myPlayer.move(nextRoom);
						this.window.update();
						this.updateAccess();
					} catch (ErrorObjectClosed e) {
						openDoor(door);
					}
				}
				);
		
		
		// button South
		south = new JButton(iconSouth);
		south.addActionListener(
				ae -> {
					door = game.myPlayer.getCurrentRoom().goInDirection("south");
					try {
						
						Room nextRoom= door.getNextRoom(game.myPlayer.getCurrentRoom());
						game.myPlayer.move(nextRoom);
						this.window.update();
						this.updateAccess();
					} catch (ErrorObjectClosed e) {
						openDoor(door);
					}
				}
				);
		
		// Button East
		east = new JButton(iconEast);
		east.addActionListener(
				ae -> {
					door = game.myPlayer.getCurrentRoom().goInDirection("east");
					try {
						
						Room nextRoom= door.getNextRoom(game.myPlayer.getCurrentRoom());
						game.myPlayer.move(nextRoom);
						this.window.update();
						this.updateAccess();
					} catch (ErrorObjectClosed e) {
						openDoor(door);
					}
				}
				);
		
		// Button West
		west = new JButton(iconWest);
		west.addActionListener(
				ae -> {
					door = game.myPlayer.getCurrentRoom().goInDirection("west");
					try {
						
						Room nextRoom= door.getNextRoom(game.myPlayer.getCurrentRoom());
						game.myPlayer.move(nextRoom);
						this.window.update();
						this.updateAccess();
					} catch (ErrorObjectClosed e) {
						openDoor(door);
					}
				}
				);
		
		//Button Up Or Down
		up_down = new JButton(iconUpDown);
		up_down.addActionListener(
				ae -> {
					if (game.myPlayer.getCurrentRoom().exitsPossible("up"))
						door = game.myPlayer.getCurrentRoom().goInDirection("up");
					else
						door = game.myPlayer.getCurrentRoom().goInDirection("down");

					try {
						Room nextRoom= door.getNextRoom(game.myPlayer.getCurrentRoom());
						game.myPlayer.move(nextRoom);
						this.window.update();
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

	/**
	 * Method to open the door if it is closed.
	 * It is possible to open the door with a code or a lock.
	 * @param door The door currently played.
	 */
	
	public void openDoor(Door door){
		switch (door.getTypeBolt()) {
		case "Code":
			
			String pass = JOptionPane.showInputDialog(null, "Give the password to go forward : ", "A password is needed", JOptionPane.QUESTION_MESSAGE);
			door.openDoor(pass);
			try {
				game.myPlayer.move(door.getNextRoom(game.myPlayer.getCurrentRoom()));
				JOptionPane.showMessageDialog(null, "Well Done you can go forward", "Good Password", JOptionPane.INFORMATION_MESSAGE);
				
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(null, "An Error Occured, Try again", "Wrong Password", JOptionPane.INFORMATION_MESSAGE);
			}
			break;
		case "Lock" :
			if (game.myPlayer.getOwned().getBunch().size()>0){
			keyGiven = new GiveKey(null, "Give a Key", "Select the Key that you want to give", game, window, door);}
			else {
				JOptionPane.showMessageDialog(null, "You have no key currently.", "Bunch Empty", JOptionPane.INFORMATION_MESSAGE);	
			}
			break;
		}
		
		updateAccess();
		this.window.update();
	}
	
	/**
	 * Method to activated the button of the direction.
	 * The button is activated if the door is present at the direction.
	 */
	
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
