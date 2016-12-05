package mig.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import mig.core.Game;


public class ConsoleArea extends JPanel {
	private JLabel welcome,sentence,logoGPHY,logoSFA,info;
	private Game game;
	private final URL urlSFA = BackPack.class.getResource("resources/Logo-final-SFA.png");
	private final ImageIcon iconSFA = new ImageIcon(urlSFA);
	private final URL urlGPHY = BackPack.class.getResource("resources/logoAcceuil.png");
	private final ImageIcon iconGPHY = new ImageIcon(urlGPHY);
	
	public ConsoleArea(Game game){
		this.game = game;
		this.setLayout( new BorderLayout());


		welcome =new JLabel("Welcome in the Game : Murder in GPHY " + game.myPlayer.getName(),JLabel.CENTER);
		sentence = new JLabel(" Are you smart enought to find the killer ? ",JLabel.CENTER);
		logoGPHY = new JLabel (iconGPHY);
		logoSFA= new JLabel(iconSFA);
		info = new JLabel ("You need more information about the killer to denounce him !",JLabel.CENTER);

		this.add(welcome, BorderLayout.NORTH);
		this.add(logoGPHY, BorderLayout.EAST);
		this.add(info, BorderLayout.SOUTH);
		this.add(logoSFA, BorderLayout.WEST);
		this.add(sentence, BorderLayout.CENTER);
	}

	public void update (){
		if (game.myPlayer.getOwned().getNotebook().size()>=5){
			info.setText("You can denounce the Killer now ! Be care to not make mistake when you write his/her name !");
		}

	}

}
