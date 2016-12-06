package mig.view;

import java.awt.BorderLayout;
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
import mig.core.Room;
import mig.exceptions.ErrorObjectClosed;


/**
 * Class Notebook
 * This class represented a notebook
 * The player's information are referenced in this notebook
 * 
 * @author Group8
 * @version 06/12/16
 *
 */


public class Notebook extends JButton {
	
	/**
	 * game is a Game : it represented the notebook in the game 
	 */
	private Game game;
	
	/**
	 * window is a JFrame : it served to create a window who contain the notebook
	 */
	private JFrame window;
	
	/**
	 * infodisplayed is a JPanel : lists all the information received by the NPC
	 */
	private JPanel infodisplayed;
	
	/**
	 * urlNote is an URL : correspond to the image in the window who represented the notebook
	 */
	private final URL urlNote = BackPack.class.getResource("resources/notebook.png");
	
	/**
	 * icon is an ImageIcon : represented the icon who contain the urlNote
	 */
	private final ImageIcon icon = new ImageIcon(urlNote);
	
	/**
	 * Default Constructor
	 * Create a notebook in the game with the icon in the window
	 * And create a Frame who contain the list of the information offer by the NPC
	 * 
	 * @param game Game
	 */
	
	public Notebook(Game game){
		this.game = game;
		this.setIcon(icon);
		this.addActionListener(
				ae -> {
					createFrame();			
			   		}
				);
	}
	
	
	/**
	 * Method createFrame
	 * This method serve to create a new frame of notebook
	 * This frame contain all the information offer by the NPC to the player in an ArrayList
	 * If the notebook is empty, a message will given to explain that the notebook have no information
	 * 
	 */
	
	public void createFrame(){
		window = new JFrame();
		window.setVisible(true);
		window.setTitle("My Notebook");
		window.setSize(500, 500);
		window.setResizable(true);
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		window.setLocationRelativeTo(null);
		infodisplayed = new JPanel();
		String HTMLlabelStr = "<html><center><h1>This is your Notebook.</h1></center></br> "
				+ "<ul>";
		
		ArrayList<Information> notebook = this.game.myPlayer.getOwned().getNotebook();
		for (Information information : notebook) {
			HTMLlabelStr+="<li>"+information.getName() + " : " + information.getInformation()+"</li></br>";
		}
		if (notebook.isEmpty()){
			HTMLlabelStr+="Currently, you have no information.";
		}
		HTMLlabelStr+= "</ul></br> <center>End of your Notebook</center></html>";
		infodisplayed.add(new JLabel(HTMLlabelStr));
		window.add(infodisplayed);
		
	
	}

}
