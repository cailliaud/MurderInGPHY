package mig.view;

import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.TransferHandler;

import mig.core.Game;
import mig.core.Owned;
import mig.core.PhysicalObject;

public class BackPack extends JPanel {
	private JLabel labels[] = new JLabel[4];
	private final URL url = BackPack.class.getResource("resources/default_item.png");
	private final ImageIcon default_icon = new ImageIcon(url);

	private Game game;

	public BackPack(Game game){
		this.game=game;
		this.setLayout(new GridLayout(1,0));
		for (int i =  0; i < 4 ; i++) {

			try {
				labels[i] = new JLabel(game.myPlayer.getOwned().getObject(i).getImage());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				labels[i] = new JLabel(default_icon);
			}
			this.add(labels[i]);
		}
	}



	public void update(){
		for (int i =  0; i < 4 ; i++) {

			try {
				labels[i].setIcon(game.myPlayer.getOwned().getObject(i).getImage());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				labels[i].setIcon(default_icon);
			}
		}

	}
}
