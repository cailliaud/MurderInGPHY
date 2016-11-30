package mig.view;

import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.concurrent.ArrayBlockingQueue;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.TransferHandler;

import mig.core.Owned;
import mig.core.PhysicalObject;

public class BackPack extends JPanel {
	private JLabel item1, item2 , item 3, item 4;
	private ArrayBlockingQueue<PhysicalObject> inventory;
	
	public BackPack(Owned owned){
		this.inventory= owned.getInventory();
		this.setLayout(new GridLayout(1,0));
		item1 = new JLabel(inventory..getImage());
		item1.setTransferHandler(new TransferHandler("my button"));

		item1.addMouseListener(new MouseAdapter() {
	      public void mousePressed(MouseEvent evt) {
	        JComponent comp = (JComponent) evt.getSource();
	        TransferHandler th = comp.getTransferHandler();

	        th.exportAsDrag(comp, evt, TransferHandler.COPY);
	      }
	    });
		this.add(item1);
//		for (PhysicalObject physicalObject : inventory) {
//			item = new JLabel(physicalObject.getImage());
//			item.setTransferHandler(new TransferHandler("my button"));
//
//			item.addMouseListener(new MouseAdapter() {
//		      public void mousePressed(MouseEvent evt) {
//		        JComponent comp = (JComponent) evt.getSource();
//		        TransferHandler th = comp.getTransferHandler();
//
//		        th.exportAsDrag(comp, evt, TransferHandler.COPY);
//		      }
//		    });
//			this.add(item);
//		}
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
