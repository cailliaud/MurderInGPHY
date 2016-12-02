package mig.view;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import mig.core.Game;

public class PrincipalWindow extends JFrame {
	private JPanel selectNom = new JPanel();
	private JTextField xField = new JTextField(5);
	private Game myGame ;
	private Window window;
	
	public PrincipalWindow(){
		this.setTitle("Murder in GPHY V0.2");
		this.setSize(600, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		
		selectNom.add(new JLabel("Nom du Joueur :"));
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
	}
	
	public void updateTitle(){
		this.setTitle("Murder in GPHY V0.2      Player : " 
				+ myGame.myPlayer.getName() + 
				"               Current Room:" 
				+ myGame.myPlayer.getCurrentRoom().getName());
	}
}
