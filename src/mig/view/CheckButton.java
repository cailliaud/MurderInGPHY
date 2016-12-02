package mig.view;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;

import mig.core.Game;
import mig.core.Information;
import mig.core.Item;
import mig.core.Key;
import mig.core.PhysicalObject;
import mig.core.Room;
import mig.exceptions.InventoryFull;

public class CheckButton extends JButton {
	private Game game;
	private Window window;
	public CheckButton(Window window, Game game){
		this.window=window;
		this.game=game;
		this.setText("Check The Room");
		this.addActionListener(
				ae->{getItem();
				update();
				window.update();
				}
				);
		update();



	}

	public void getItem(){
		JList list = new JList(game.myPlayer.getCurrentRoom().getlistOfItem());
		JOptionPane.showMessageDialog(
				null, list, "Item present currently in the room:!", JOptionPane.YES_NO_OPTION);
		Item itemgot = game.myPlayer.getCurrentRoom().getItem(list.getSelectedIndex());
		JOptionPane jop = new JOptionPane();
		try {
			game.myPlayer.addItem(itemgot);
			jop.showMessageDialog(null, "Item added in your Inventory", "You get : "+itemgot.getName(), JOptionPane.INFORMATION_MESSAGE);
		} catch (InventoryFull e) {
			jop.showMessageDialog(null, "Inventory Fulled", "You are fulled, let down an item before to get it.", JOptionPane.INFORMATION_MESSAGE);
		}
		update();
		
		
	}

	public void update(){
		if (game.myPlayer.getCurrentRoom().noItemHere()) this.setEnabled(false);
		else this.setEnabled(true);
	}

}
