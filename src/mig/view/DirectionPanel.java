package mig.view;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class DirectionPanel extends JPanel {
	private JButton north , south, east , west , up , down;
	public DirectionPanel(){
		
		north = new JButton(new ImageIcon("resources/north_arrow.png"));
		south = new JButton(new ImageIcon("resources/south_arrow.png"));
		east = new JButton(new ImageIcon("resources/east_arrow.png"));
		west = new JButton(new ImageIcon("resources/west_arrow.png"));
		up = new JButton(new ImageIcon("resources/up_arrow.png"));
		down = new JButton(new ImageIcon("resources/down_arrow.png"));
		
		this.setLayout( new BorderLayout());
		
		this.add(north, BorderLayout.NORTH);
		this.add(south, BorderLayout.SOUTH);
		this.add(east, BorderLayout.EAST);
		this.add(west, BorderLayout.WEST);
		this.add(up, BorderLayout.CENTER);
	}

}
