package mig.view;

import java.net.URL;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import mig.core.Game;
import mig.core.Information;
import mig.core.Key;

/**
 * <b>Bunch is the class allows to display keys that player possessed</b>
 * <p> Keys are add to the JFrame when he recovered one.</p>
 * 
 * @see Information
 * @see Key
 * 
 * @author Group 8
 * @version 22/11/2016
 */
public class Bunch extends JButton {
	private JFrame window;
	private JPanel keydisplayed;
	private Game game;
	/**
	 * This URL allows to display the picture with three keys.
	 */
	private final URL url = BackPack.class.getResource("resources/three-keys_60x60.png");
	/**
	 * Allows to create new icon from the URL.
	 */
	private final ImageIcon default_icon = new ImageIcon(url);

	/**
	 * Constructor
	 * This method create a button with the picture of keys, that will display the keys the player possess.
	 * @param game The game currently played.
	 */

	public Bunch(Game game){
		this.game = game;
		this.setIcon(default_icon);
		this.addActionListener(
				ae -> {
					createFrame();
					
						
					
				}
				);
		
	}

	
	/**
	 * This method allows to create the frame display when we click in the button of keys.
	 * It displays the keys of the player.
	 */
	public void createFrame(){
		window = new JFrame();
		window.setVisible(true);
		window.setTitle("My Bunch");
		window.setSize(500, 500);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		window.setLocationRelativeTo(null);
		keydisplayed = new JPanel();
		String HTMLlabelStr = "<html><center><h1>This is your bunch of keys.</h1></center></br><ul>";
		ArrayList<Key> bunch = this.game.myPlayer.getOwned().getBunch();
		for (Key key : bunch) {
			/**
			 * Display the name of keys in a list.
			 */
			HTMLlabelStr+="<li>"+key.getName()+"</li></br>";
		}
		/**
		 * If the player has no key, this message is display.
		 */
		if (bunch.isEmpty()){
			HTMLlabelStr+="<center>Currently, you have no keys.</center>";
		}
		/**
		 * Else, the list with all keys is display.
		 */
		HTMLlabelStr+= "</ul></br><center> End of your Bunch<center></html>";
		keydisplayed.add(new JLabel(HTMLlabelStr));
		window.add(keydisplayed);

		
		

	}

}
