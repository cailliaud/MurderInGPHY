package mig.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ActionBar extends JPanel {
	private DirectionPanel direction_action;

	private CheckButton check = new CheckButton();
	private SpeakButton speak =new SpeakButton();
	private LetDownButton letDown = new LetDownButton();
	private DenounceButton denounce = new DenounceButton();
	public ActionBar(){
		this.setLayout(new GridLayout(0,1));
		
		this.add(direction_action);
		this.add(check);
		this.add(speak);
		this.add(letDown);
		this.add(denounce);
	}

}
