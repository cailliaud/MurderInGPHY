package mig.view;

import javax.swing.JButton;
import mig.core.Game;

/**
 * <b> CheckButton represents the class that allows the player to check the room to pick up some items or informations.</b>
 * 
 *@author Group 8
 *@version 22/11/2016
 */

public class CheckButton extends JButton {

	private static final long serialVersionUID = 1L;
	/**
	 * The game currently played.
	 */
	private Game game;
	@SuppressWarnings("unused")
	/**
	 * Allows t select the item to pick up.
	 */
	private SelectItemRoom selectItem;
	
	private Window window;
	
	/**
	 * Constructor of the button.
	 * It check the current room of the player.
	 * 
	 * @param window Allows to display the button in the window of the game.
	 * @param game The game currently played.
	 */
	public CheckButton(Window window, Game game){
		this.window=window;
		this.game=game;
		this.setText("Check The Room");
		if (game.myPlayer.getCurrentRoom().noItemHere()) this.setEnabled(false);
		else this.setEnabled(true);
		
		this.addActionListener(
				ae->
				{
					getItem();
					
					}
				);

	}

	/**
	 * This method allows to get the item of the room. 
	 * The player can select the item he want pick up. 
	 */
	private void getItem(){
		selectItem = new SelectItemRoom(null, "Get an item", "Item present currently in the room!", game, window);
		window.update();
	}

	/**
	 * This method check if there is an item in the room or not.
	 */
	public void update(){
		if (game.myPlayer.getCurrentRoom().noItemHere()) this.setEnabled(false);
		else this.setEnabled(true);
	}

}
