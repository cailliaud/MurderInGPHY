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
				"Welcome, Give us the name of your two teams !", JOptionPane.OK_CANCEL_OPTION);
		if (begin == JOptionPane.OK_OPTION) {
			myGame=new Game(xField.getText());
		}
		else {
			myGame = new Game("Nicolas");
		}
		
	
		window = new Window(myGame);
		
		this.add(window);
		this.pack();

		this.setVisible(true);	
	}
}
