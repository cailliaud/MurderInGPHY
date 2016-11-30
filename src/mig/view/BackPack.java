package mig.view;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BackPack extends JPanel {
	private JLabel item1, item2 , item3, item4;
	private ImageIcon slot = new ImageIcon ("resources/wooden-crate.png");
	public BackPack(){
		this.setLayout(new GridLayout(1,0));
		item1 = new JLabel(slot);
	    item2 = new JLabel(slot);
	    item3 = new JLabel(slot);
	    item4 = new JLabel(slot);
	    this.add(item1);
	    this.add(item2);
	    this.add(item3);
	    this.add(item4);
	}

}
