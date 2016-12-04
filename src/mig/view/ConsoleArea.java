package mig.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import mig.core.Game;


public class ConsoleArea extends JPanel {
	private JLabel welcome,sentence,logoGPHY,logoSFA,info;
	private Game game;
	public ConsoleArea(Game game){
		this.game = game;
		this.setLayout( new BorderLayout());


		welcome =new JLabel("Bienvenue dans Murder in GPHY " + game.myPlayer.getName(),JLabel.CENTER);
		sentence = new JLabel(" Are you enought smart to find the killer ? ",JLabel.CENTER);
		logoGPHY = new JLabel (new ImageIcon ("resources/logoAcceuil.png"));
		logoSFA= new JLabel(new ImageIcon ("resources/Logo-final-SFA.png"));
		info = new JLabel ("You need more information about the killer to denounce him !",JLabel.CENTER);

		this.add(welcome, BorderLayout.NORTH);
		this.add(logoGPHY, BorderLayout.EAST);
		this.add(info, BorderLayout.SOUTH);
		this.add(logoSFA, BorderLayout.WEST);
		this.add(sentence, BorderLayout.CENTER);
	}

	public void update (){
		System.out.println("toto");
		if (game.myPlayer.getOwned().getNotebook().size()>=5){
			info.setText("You can denounce the Killer now ! Be care to not make mistake when you write his/her name !");
		}

	}

}
