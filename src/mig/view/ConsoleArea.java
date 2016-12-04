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
	private Game game;
	public ConsoleArea(Game game){
		this.game = game;
		this.setLayout( new BorderLayout());


		JLabel welcome =new JLabel("Bienvenue dans Murder in GPHY " + game.myPlayer.getName(),JLabel.CENTER);
		JLabel sentence = new JLabel(" Are you enought smart to find the killer ? ",JLabel.CENTER);
		JLabel logoGPHY = new JLabel (new ImageIcon ("resources/logoAcceuil.png"));
		JLabel logoSFA= new JLabel(new ImageIcon ("resources/Logo-final-SFA.png"));
		
		this.add(welcome, BorderLayout.NORTH);
		this.add(logoGPHY, BorderLayout.EAST);
		this.add(logoSFA, BorderLayout.WEST);
		this.add(sentence, BorderLayout.CENTER);
	}

}
