package mig.view;


import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import mig.core.Game;


/**
 * Class PrincipalWindow
 * This class create the first window of the game who asked the name of the player
 * Then, it opened the window of the game with the name of the player and the current room
 * 
 * @author Group 8
 * @version 6/12/16
 * 
 */

@SuppressWarnings("serial")
public class PrincipalWindow extends JFrame {
	
	private final URL urlDetective = DenounceButton.class.getResource("resources/detective.png");
	private final ImageIcon detective = new ImageIcon(urlDetective);
	/**
	 * selectNom is a JPanel : create the first window who asked the name of the player
	 */
	private JPanel selectNom = new JPanel();
	
	/**
	 * xField is a JTextField : recover the name of the player
	 */
	private JTextField xField = new JTextField(5);
	
	/**
	 * myGame is a Game : create the game
	 */
	private Game myGame ;
	
	/**
	 * window is a Window : create the window of the game
	 */
	private Window window;
	
	
/**
 * Default Constructor
 * Create a window who contain the title of the game
 * Defined the size of the window
 * Asked the name of the player
 * After, it opened a new window who contain the game 
 * Place the player in the current room 
 */
	
	public PrincipalWindow(){
		this.setTitle("Murder in GPHY V0.2");
		this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		
		selectNom.add(new JLabel("Your name :"));
		selectNom.add(xField);


		int begin = JOptionPane.showConfirmDialog(null, selectNom, 
				"Welcome, What's your name ?", JOptionPane.OK_CANCEL_OPTION);
		if (begin == JOptionPane.OK_OPTION) {
			myGame=new Game(xField.getText());
		}
		else {
			System.exit(0);
		}
		
	
		window = new Window(this,myGame);
		this.setTitle("Murder in GPHY V0.2      Player : " 
		+ myGame.myPlayer.getName() + 
		"               Current Room:" 
		+ myGame.myPlayer.getCurrentRoom().getName());
		this.add(window);
		
		this.pack();

		this.setVisible(true);	
		JOptionPane.showMessageDialog(this,
				"The President of the AEGP Alexandre has been killed\n"
				+ "You have to find the killer ! \n "
				+ "You will have to play the detective !\n"
				+ "Speak and help everyone, maybe they will reward you with an important information.\n ",
				"A murder was committed in the AEGP !" ,
				JOptionPane.INFORMATION_MESSAGE,detective );
	}
	
	
/**
 * Method updateTitle
 * Update the name of the game with the name of the player and the current room 
 * 
 */
	
	public void updateTitle(){
		this.setTitle("Murder in GPHY V0.2      Player : " 
				+ myGame.myPlayer.getName() + 
				"               Current Room:" 
				+ myGame.myPlayer.getCurrentRoom().getName());
	}
	

}
