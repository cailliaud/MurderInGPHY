package mig.view;

import javax.swing.JButton;
import mig.core.Game;
import mig.exceptions.GameOver;

import javax.swing.JOptionPane;

public class DenounceButton extends JButton {
	private Game game;
	public DenounceButton(Game game){
		this.setText("Denounce");
		this.game=game;
		this.addActionListener(
				ae -> {
					JOptionPane den = new JOptionPane(), den2 = new JOptionPane();
					String rep = den.showInputDialog(null, "Who is the killer ?? ", "Denounce", JOptionPane.QUESTION_MESSAGE);
					try {
						game.giveKiller(rep);
						den2.showMessageDialog(null, "GOOD JOB !!", "You win" , JOptionPane.INFORMATION_MESSAGE);
					} catch (GameOver e) {
						// TODO Auto-generated catch block
						den2.showMessageDialog(null, "GAME OVER !!! ", "Sorry" , JOptionPane.INFORMATION_MESSAGE);
						
					}
					
				}
				);

	}
}