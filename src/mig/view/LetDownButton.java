package mig.view;



import java.util.Arrays;

import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;


import mig.core.Game;
import mig.core.PhysicalObject;



public class LetDownButton extends JButton {
	private Window myWindow;
	private Game game;



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



	public void leaveItem(){
		//game.myPlayer.getOwned().getSize()
		//game.myPlayer.getOwned().getInventory()


		String[] listObject = new String[game.myPlayer.getOwned().getSize()];
		int i =0;
		for (PhysicalObject object : game.myPlayer.getOwned().getInventory()) {
			listObject[i]=object.getName();
		}

		JList list = new JList(listObject);
		JOptionPane.showMessageDialog(
				null, list, "Item that you want to remove !", JOptionPane.YES_NO_OPTION);

		PhysicalObject object= game.myPlayer.getOwned().getObject(list.getSelectedIndex());
		game.myPlayer.removePhysicalObject(object);
		update();
		myWindow.update();
	

	}
	
	public void update(){
		if (game.myPlayer.getOwned().getSize()<=0) this.setEnabled(false);
		else this.setEnabled(true);
	}

}




