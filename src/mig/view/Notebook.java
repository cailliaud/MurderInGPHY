package mig.view;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import mig.core.Game;
import mig.core.Information;
import mig.core.Room;
import mig.exceptions.ErrorObjectClosed;


public class Notebook extends JButton {
	private Game game;
	private JFrame window;
	private JPanel infodisplayed;
	
	
	public Notebook(Game game){
		this.game = game;
		this.setIcon(new ImageIcon("resources/notebook.png"));
		this.addActionListener(
				ae -> {
					createFrame();
					
						
					
				}
				);
	}
	
	public void createFrame(){
		window = new JFrame();
		window.setVisible(true);
		window.setTitle("My Notebook");
		window.setSize(300, 300);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		window.setLocationRelativeTo(null);
		infodisplayed = new JPanel();
		ArrayList<Information> notebook = this.game.myPlayer.getOwned().getNotebook();
		for (Information information : notebook) {
			infodisplayed.add(new JLabel(information.getName() + " : " + information.getInformation()));
		}
		if (notebook.isEmpty()){
			infodisplayed.add(new JLabel("Currently, you have no information.",CENTER));
		}
		window.add(infodisplayed);
		
		

	}

}
