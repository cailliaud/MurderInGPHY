package mig.view;

import java.awt.GridLayout;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import mig.core.Game;
import mig.core.Owned;

/**
 * <b>BackPack class represents the items that the player possesses.</b>
 * 
 * The player can have 4 items maximum. 
 * <p> When the player pick up an item in a room or by a NPC, it is directly put in the back pack.</p>
 * <p> A picture is displayed of items he has in the top of the window.</p>
 * 
 *  @see Owned
 *  
 * @author Group 8
 * @version 22/11/2016
 */
@SuppressWarnings("serial")
public class BackPack extends JPanel {
	/**
	 * The JLabel is equal to 4 because the player can have 4 items max.
	 * This JLabel represents the display on the top of the window. 
	 */
	private JLabel labels[] = new JLabel[4];
	/**
	 * This URL allows to assign a basic picture in the JLabel when there is no item. 
	 */
	private final URL url = BackPack.class.getResource("resources/default_item.png");
	/**
	 * Allows to create new icon from the URL.
	 */
	private final ImageIcon default_icon = new ImageIcon(url);

	/**
	 * Allows to use to methods of the game. 
	 */
	private Game game;

	/**
	 * Constructor of the class BackPack.
	 * 
	 * @param game The game currently played.
	 */
	public BackPack(Game game){
		this.game=game;
		this.setLayout(new GridLayout(1,0));
		/**
		 * instantiate 4 items maximum.
		 */
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


/**
 * Display the picture of the item recovered instead of the default icon.
 */
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
