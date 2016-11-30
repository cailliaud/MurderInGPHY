package mig.view;

import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Inventory extends JPanel {
	private Bunch bunch = new Bunch();
	private Notebook notebook = new Notebook();
	private JPanel inventory;
	private JLabel item1, item2 , item3, item4;
	private BackPack backPack ;
	
	public Inventory(){
		this.setLayout(new GridLayout(1,0));
	    
	   
	    inventory = new JPanel();
	    inventory.setLayout(new GridLayout(0,1));
	    inventory.add(notebook);
	    inventory.add(bunch);
	    this.add(inventory);
	    this.add(new JLabel(new ImageIcon("resources/murder_120.png")));
//	    this.add(new JLabel("Vos items =>", SwingConstants.RIGHT));
	    this.add(backPack);
	    this.setVisible(true);
		
	}
}
