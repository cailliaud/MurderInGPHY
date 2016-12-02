package mig.view;

import java.awt.BorderLayout;
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


public class Notebook extends JButton {
	private Game game;
	private JFrame window;
	private JPanel infodisplayed;
	private ImageIcon icon = new ImageIcon("resources/notebook.png");
	
	
	public Notebook(Game game){
		this.game = game;
		this.setIcon(icon);
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
