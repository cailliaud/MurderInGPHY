package mig.view;

import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.TransferHandler;

import mig.core.Owned;
import mig.core.PhysicalObject;

public class BackPack extends JPanel {
	private JLabel item1, item2 , item3, item4;
	
	public BackPack(Owned owned){
		this.setLayout(new GridLayout(1,0));
		if(owned.getObject(0)!=null)item1 = new JLabel(owned.getObject(0).getImage());
		if(owned.getObject(1)!=null)item2 = new JLabel(owned.getObject(1).getImage());
		if(owned.getObject(2)!=null)item3 = new JLabel(owned.getObject(2).getImage());
		if(owned.getObject(3)!=null)item4 = new JLabel(owned.getObject(3).getImage());
		
 
		this.add(item1);
		this.add(item2);
		this.add(item3);
		this.add(item4);
//		
	}

}
