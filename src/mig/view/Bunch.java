package mig.view;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import mig.core.Game;
import mig.core.Information;
import mig.core.Key;

public class Bunch extends JButton {
	private JFrame window;
	private JPanel keydisplayed;
	private Game game;


	public Bunch(Game game){
		this.game = game;
		this.setIcon(new ImageIcon("resources/three-keys_60x60.png"));
		this.addActionListener(
				ae -> {
					createFrame();
					
						
					
				}
				);
		
	}

	
	public void createFrame(){
		window = new JFrame();
		window.setVisible(true);
		window.setTitle("My Bunch");
		window.setSize(500, 500);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		window.setLocationRelativeTo(null);
		keydisplayed = new JPanel();
		String HTMLlabelStr = "<html><center><h1>This is your bunch of keys.</h1></center></br><ul>";
		ArrayList<Key> bunch = this.game.myPlayer.getOwned().getBunch();
		for (Key key : bunch) {
			HTMLlabelStr+="<li>"+key.getName()+"</li></br>";
		}
		if (bunch.isEmpty()){
			HTMLlabelStr+="<center>Currently, you have no keys.</center>";
		}
		HTMLlabelStr+= "</ul></br><center> End of your Bunch<center></html>";
		keydisplayed.add(new JLabel(HTMLlabelStr));
		window.add(keydisplayed);

		
		

	}

}
