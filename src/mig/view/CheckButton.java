package mig.view;

import javax.swing.JButton;
import mig.core.Game;


public class CheckButton extends JButton {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Game game;
	@SuppressWarnings("unused")
	private SelectItemRoom selectItem;
	private Window window;
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

	private void getItem(){
		selectItem = new SelectItemRoom(null, "Get an item", "Item present currently in the room!", game, window);
		window.update();
	}

	public void update(){
		if (game.myPlayer.getCurrentRoom().noItemHere()) this.setEnabled(false);
		else this.setEnabled(true);
	}

}
