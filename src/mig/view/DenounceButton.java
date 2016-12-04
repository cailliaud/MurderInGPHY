package mig.view;

import javax.swing.JButton;
import javax.swing.JLabel;

import mig.core.Game;
import mig.exceptions.GameOver;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



public class DenounceButton extends JButton {
	private Game game;
	public DenounceButton(Game game){
		this.game= game;
		JLabel message = new JLabel("<html>Who is the killer ?? <p>BE PRECISE in writing the name to win!</p> ");
		JLabel message1 = new JLabel("<html>Good job, you found the murderer!! <p>"  + game.getKiller().getName()+" is in prison !!!</p>"); 
		JLabel message2 = new JLabel("GAME OVER !!");
		message.setFont(new Font("Calibri",Font.BOLD+Font.ITALIC,25));
		message1.setFont(new Font("Calibri",Font.BOLD,25));
		message2.setFont(new Font("Calibri",Font.BOLD,25));
		this.setText("Denounce");
		this.game=game;
		this.addActionListener(
				ae -> {
					JOptionPane den = new JOptionPane(), den2 = new JOptionPane();
					ImageIcon img2 = new ImageIcon("resources/game_over.png");
					ImageIcon img1 = new ImageIcon("resources/good_job.png");
					String rep = den.showInputDialog(null, message, "Denounce",JOptionPane.QUESTION_MESSAGE);
					try {
						game.giveKiller(rep);
						den2.showMessageDialog(null, message1 , "You won" , JOptionPane.INFORMATION_MESSAGE, img1);
						
					} catch (GameOver e) {
						// TODO Auto-generated catch block
						den2.showMessageDialog(null, message2, "Sorry" , JOptionPane.INFORMATION_MESSAGE, img2);
					
					}		
					System.exit(0);
				}
				);

	}
}