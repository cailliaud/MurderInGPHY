package mig.view;

import java.awt.GridLayout;
import java.util.concurrent.ArrayBlockingQueue;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import mig.core.Owned;
import mig.core.PhysicalObject;

public class BackPack extends JPanel {
	private JLabel item;
	private ArrayBlockingQueue<PhysicalObject> inventory;
	
	public BackPack(Owned owned){
		this.inventory= owned.getInventory();
		this.setLayout(new GridLayout(1,0));
		for (PhysicalObject physicalObject : inventory) {
			item = new JLabel(physicalObject.getImage());
			this.add(item);
		}
//		
//	    item2 = new JLabel(slot);
//	    item3 = new JLabel(slot);
//	    item4 = new JLabel(slot);
//	    this.add(item1);
//	    this.add(item2);
//	    this.add(item3);
//	    this.add(item4);
	}

}
