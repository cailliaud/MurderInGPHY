package mig.view;

import javax.swing.JButton;
import mig.core.Game;

/**
 * <b>LetDownButton is the class that allows the player to let down an object on the floor whenever he please.</b> 
 * @author Group 8
 * @version 06/12/2016
 */

public class LetDownButton extends JButton {

	private static final long serialVersionUID = 1L;
	private Window myWindow;
	private Game game;
	@SuppressWarnings("unused")
	private SelectItemInventory letDownItem ;



	public LetDownButton(Window myWindow, Game g){
		this.myWindow =myWindow;
		this.game=g;
		this.setText("Let Down");
		update();


		this.addActionListener(
				ae ->{leaveItem();
				myWindow.update();
				}
				);
	}


	//Display to the player the list of item he has in his inventory. He can select the one he wants to let down
	private void leaveItem(){
		letDownItem = new SelectItemInventory(null, "Let Down an item", "Item present currently in your inventory!", game, myWindow);
		myWindow.update();
	

	}
	
	public void update(){
		if (game.myPlayer.getOwned().getSize()<=0) this.setEnabled(false);
		else this.setEnabled(true);
	}

}




