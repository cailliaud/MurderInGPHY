package mig.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.net.URL;

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
import mig.core.Information;
import mig.core.Item;
import mig.core.PhysicalObject;
import mig.exceptions.InventoryFull;

@SuppressWarnings("serial")
public class SelectItemRoom extends JDialog {
	private JButton select, cancel;
	private JPanel panItem;
	private Item itemgot;
	private Game game;
	private JComboBox<String> items;
	private Window window;
	private String message;
	private JLabel objectLabel = new JLabel(new ImageIcon ("resources/default_item.png"),JLabel.CENTER);
	private final URL urlKey = BackPack.class.getResource("resources/three-keys_60x60.png");
	private final ImageIcon iconKey = new ImageIcon(urlKey);
	private final URL urlNote = BackPack.class.getResource("resources/notebook.png");
	private final ImageIcon iconNote = new ImageIcon(urlNote);

	public SelectItemRoom(JFrame parent, String title, String message , Game game, Window window){
		super(parent,title);
		this.game=game;
		this.window = window;
		this.message=message;
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
		for (String itemName : game.myPlayer.getCurrentRoom().getlistOfItem()) {
			items.addItem(itemName);
		}

		items.setSelectedIndex(0);

		setObjectImage();
		
		items.addItemListener(
				ae->{
					setObjectImage();
				});
		select =new JButton("Get this item");

		select.addActionListener(
				ae ->{
					int itemIdx = (int)items.getSelectedIndex();
					itemgot = game.myPlayer.getCurrentRoom().getItem(itemIdx);
					try {
						game.myPlayer.addItem(itemgot);
						JOptionPane.showMessageDialog(null, "Item added in your Inventory", "You get : "+itemgot.getName(), JOptionPane.INFORMATION_MESSAGE);
					} catch (InventoryFull e) {
						JOptionPane.showMessageDialog(null, "Inventory Fulled", "You are fulled, let down an item before to get it.", JOptionPane.INFORMATION_MESSAGE);
					}
					
					
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
		int itemIdx = (int)items.getSelectedIndex();
		itemgot = game.myPlayer.getCurrentRoom().getItem(itemIdx);
		ImageIcon imageObject;
		if (itemgot instanceof PhysicalObject) {
			PhysicalObject physicalGot = (PhysicalObject) itemgot;
			imageObject = physicalGot.getImage();
		}
		else if (itemgot instanceof Information){
			imageObject= iconNote;
			}
		else{
			imageObject= iconKey;
			}
		
		objectLabel.setIcon(imageObject);
	}


}
