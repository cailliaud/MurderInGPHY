package mig.view;

import java.awt.BorderLayout;

import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


import mig.core.Game;

/**
 * <b>ConsoleArea is a class representing the interface of the game.</b>
 * <p>
 * A ConsoleArea contains these elements
 * </p>
 * <ul>
 * <li>A welcome message</li>
 * <li>The logo</li>
 * <li>An information message</li>
 * <li>The condition to denounce the murderer</li>
 * </ul>
 * 
 * 
 * @author Group 8
 * @version 22/11/2016
 */

@SuppressWarnings("serial")
public class ConsoleArea extends JPanel {
	private JLabel welcome,sentence,logoGPHY,logoSFA,info;
	private Game game;
	private final URL urlSFA = BackPack.class.getResource("resources/Logo-final-SFA.png");
	private final ImageIcon iconSFA = new ImageIcon(urlSFA);
	private final URL urlGPHY = BackPack.class.getResource("resources/logoAcceuil.png");
	private final ImageIcon iconGPHY = new ImageIcon(urlGPHY);
	
	/**
	 * Method to display the interface.
	 * The position of each elements is defined in this method.
	 * @param game The game currently played.
	 */
	public ConsoleArea(Game game){
		this.game = game;
		this.setLayout( new BorderLayout());


		welcome =new JLabel("Welcome in the Game : Murder in GPHY " + game.myPlayer.getName(),JLabel.CENTER);
		sentence = new JLabel(" Are you smart enought to find the killer ? ",JLabel.CENTER);
		logoGPHY = new JLabel (iconGPHY);
		logoSFA= new JLabel(iconSFA);
		info = new JLabel ("You need more information about the killer to denounce him !",JLabel.CENTER);

		this.add(welcome, BorderLayout.NORTH);
		this.add(logoGPHY, BorderLayout.EAST);
		this.add(info, BorderLayout.SOUTH);
		this.add(logoSFA, BorderLayout.WEST);
		this.add(sentence, BorderLayout.CENTER);
	}

	/**
	 * Method to display the message for denounce a murderer.
	 * When the player can denounced someone after discovered 9 information, the message is update.
	 */	
	public void update (){
		if (game.myPlayer.getOwned().getNotebook().size()>=9){
			info.setText("You can denounce the Killer now ! Be care to not make mistake when you write his/her name !");
		}

	}

}
