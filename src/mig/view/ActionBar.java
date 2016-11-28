package mig.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ActionBar extends JPanel {
	private JPanel direction_action;
	private JButton north , south, east , west , up , down;
	private JButton check, speak , letDown, denounce;
	public ActionBar(){
		this.setLayout(new GridLayout(0,1));
		direction_action = new JPanel();
		direction_action.setLayout( new BorderLayout());
		north = new JButton(new ImageIcon("resources/north_arrow.png"));
		south = new JButton(new ImageIcon("resources/south_arrow.png"));
		east = new JButton(new ImageIcon("resources/east_arrow.png"));
		west = new JButton(new ImageIcon("resources/west_arrow.png"));
		up = new JButton(new ImageIcon("resources/up_arrow.png"));
		down = new JButton(new ImageIcon("resources/down_arrow.png"));
		direction_action.add(north, BorderLayout.NORTH);
		direction_action.add(south, BorderLayout.SOUTH);
		direction_action.add(east, BorderLayout.EAST);
		direction_action.add(west, BorderLayout.WEST);
		direction_action.add(up, BorderLayout.CENTER);
		this.add(direction_action);
		
		check = new JButton("Check The Room");
		speak = new JButton("Speak");
		letDown = new JButton("Let Down");
		denounce = new JButton("Denounce");
		this.add(check);
		this.add(speak);
		this.add(letDown);
		this.add(denounce);
	}

}
