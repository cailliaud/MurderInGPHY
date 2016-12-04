package mig.view;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JTextArea;

import mig.core.Game;

public class ConsoleArea extends JLabel {
	private Game game;
	public ConsoleArea(Game game){
		this.game = game;
		this.setText("Bienvenue dans Murder in GPHY " + game.myPlayer.getName() );
		this.setForeground (Color.white);
		
	}

}
