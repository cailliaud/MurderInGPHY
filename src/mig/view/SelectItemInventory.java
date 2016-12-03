package mig.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import mig.core.Game;
import mig.core.Item;
import mig.core.PhysicalObject;
import mig.exceptions.InventoryFull;

public class SelectItemInventory extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton select, cancel;
	private JPanel panItem;
	private Item itemgot;
	private JOptionPane jop ;
	private Game game;
	private JComboBox<String> items;
	private Window window;
	private String message;
	private JLabel objectLabel = new JLabel(new ImageIcon ("resources/default_item.png"),JLabel.CENTER);


	public SelectItemInventory(JFrame parent, String title, String message , Game game, Window window){
		super(parent,title);
		this.window= window;
		this.game=game;
		this.message =message;
		Point p = new Point (400,400);
		this.setLocation(p);
		construct();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
		pack();
	}

	private void construct(){
		panItem = new JPanel();
		panItem.setBackground(Color.white);
		panItem.setPreferredSize(new Dimension(400, 120));
		panItem.setBorder(BorderFactory.createTitledBorder(message));
		items = new JComboBox<String>();
		for (String itemName : game.myPlayer.getOwned().getInventoryToString()) {
			items.addItem(itemName);
		}
		
		items.setSelectedIndex(0);

		setObjectImage();
		
		items.addItemListener(
				ae->{
					setObjectImage();
				});

		select =new JButton("Let down this item");

		select.addActionListener(
				ae ->{
					int itemIdx = (int)items.getSelectedIndex();
					jop= new JOptionPane();
					PhysicalObject object= game.myPlayer.getOwned().getObject(itemIdx);
					game.myPlayer.removePhysicalObject(object);
					window.update();
					this.dispose();

				}
				);

		cancel = new JButton ("cancel");
		cancel.addActionListener(
				ae->
				{
					this.dispose();

				}
				);


		JLabel itemLabel = new JLabel("Items");
		panItem.add(itemLabel);
		panItem.add(items);

		this.setLayout(new BorderLayout());
		this.add(panItem,BorderLayout.NORTH);
		this.add(objectLabel, BorderLayout.CENTER);
		this.add(select, BorderLayout.WEST);
		this.add(cancel, BorderLayout.EAST);
	}

	private void setObjectImage(){
		int itemSelected = (int)items.getSelectedIndex();
		ImageIcon imageObject = game.myPlayer.getOwned().getObject(itemSelected).getImage();
		objectLabel.setIcon(imageObject);
	}

}
