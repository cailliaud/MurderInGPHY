package mig.view;

import javax.swing.JButton;
import javax.swing.JLabel;

import mig.core.Game;
import mig.exceptions.GameOver;

import java.awt.Font;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



/**
* <b>DenounceButton is a class representing the functionality of the button to denounce the killer.</b>
* <b>The player can denounced the murderer</b>
* <p>
* A DenounceButton contains these elements
* </p>
* <ul>
* <li>A message to ask who is the killer</li>
* <li>A message to indicate if the player has won or lost the game.</li>
* </ul>
* 
* 
* @author Group 8
* @version 22/11/2016
*/

@SuppressWarnings("serial")
public class DenounceButton extends JButton {
	private Game game;
	private final URL urlGameOver = DenounceButton.class.getResource("resources/killerEscape.jpg");
	private final URL urlGameWin = DenounceButton.class.getResource("resources/underArrest.jpg");
	private final ImageIcon game_over = new ImageIcon(urlGameOver);
	private final ImageIcon good_job = new ImageIcon(urlGameWin);
	
	/**
	 * Method to denounce the killer.
	 * This method indicate if the player won the game.
	 * If the player does not give the correct answer he loses the game
	 * 
	 * @param game The game currently played.
	 */
	
	public DenounceButton(Game game){
		this.game= game;
		JLabel message = new JLabel("<html>Who is the killer ?? <p>BE PRECISE in writing the name to win!</p></html> ");
		JLabel message1 = new JLabel("<html><h1>Good job, you found the murderer!! </h1></html>"  + game.getKiller().getName()+" is in prison !!!</p>"); 
		JLabel message2 = new JLabel("<html><h1>GAME OVER !!</h1></html>");
		message.setFont(new Font("Calibri",Font.BOLD+Font.ITALIC,20));
		message1.setFont(new Font("Calibri",Font.BOLD,18));
		message2.setFont(new Font("Calibri",Font.BOLD,18));
		this.setText("Denounce");
		this.game=game;
		update();
		this.addActionListener(
				ae -> {

					String rep = JOptionPane.showInputDialog(null, message, "Denounce",JOptionPane.QUESTION_MESSAGE);
					try {
						game.giveKiller(rep);
						JOptionPane.showMessageDialog(null, message1 , "You Won !" , JOptionPane.INFORMATION_MESSAGE, good_job);
						
					} catch (GameOver e) {
						JOptionPane.showMessageDialog(null, message2, "You Failed !" , JOptionPane.INFORMATION_MESSAGE, game_over);
					
					}		
					System.exit(0);
				}
				);

	}
	
	
	/**
	 * Method to activate the button for to denounce the murderer.
	 * The player can denounced someone when he has discovered 9 information.
	 */	
	public void update(){

		if (game.myPlayer.getOwned().getNotebook().size()>=9){
			this.setEnabled(true);
		}
		else this.setEnabled(false);
		this.repaint();
	}
}