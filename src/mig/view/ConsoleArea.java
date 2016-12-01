package mig.view;

import javax.swing.JTextArea;

import mig.core.Game;

public class ConsoleArea extends JTextArea {
	private Game game;
	public ConsoleArea(Game game){
		this.game = game;
		this.setText("Bienvenue dans Murder in GPHY " + game.myPlayer.getName() );
		
	}

}
