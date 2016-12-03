package mig.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import mig.core.Game;
import mig.core.Item;
import mig.core.PhysicalObject;


@SuppressWarnings("serial")
/**
 * Create a JDialog to let the player chose from its inventory
 * Which item he wants to remove
 * @author Group8
 * @version 03/12/2016
 */
public class SelectItemInventory extends JDialog {
	/**
	 * JButton for the actions :
	 * - Select an item to let down
	 * - Cancel the action
	 */
	private JButton select, cancel;
	
	/**
	 * Panel that contains the JComboBox with items in the Owned of the Player
	 */
	private JPanel panItem;
	
	/**
	 * The item selected by the Player
	 */
	@SuppressWarnings("unused")
	private Item itemgot;
	
	/**
	 * The game currently played
	 */
	private Game game;
	
	/**
	 * The JCombobox displaying items in the inventory
	 */
	private JComboBox<String> items;
	
	/**
	 * The Window (extends JPanel) of the game
	 */
	private Window window;
	
	/**
	 * The message displayed in the JDialog component
	 */
	private String message;
	
	/**
	 * The JLabel with the icon of the item selected with a default image
	 */
	private JLabel objectLabel = new JLabel(new ImageIcon ("resources/default_item.png"),JLabel.CENTER);


	/**
	 * Constructor for the Dialog component
	 * This component can be closed without close the principal Window
	 * 
	 * @param parent The JFrame parent, here nullPointeur is waited
	 * @param title The title of the JDialog 
	 * @param message The message displayed to the player
	 * @param game The game currently played
	 * @param window The principal screen of the game (extends JPanel)
	 */
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

	/**
	 * Method to construct the JDialog
	 * Adding component
	 * Manage Listener for JButtons
	 */
	private void construct(){
		panItem = new JPanel();
		panItem.setBackground(Color.white);
		panItem.setPreferredSize(new Dimension(400, 120));
		panItem.setBorder(BorderFactory.createTitledBorder(message));
		
		// JComboboc instentiation from the inventory Player
		items = new JComboBox<String>();
		for (String itemName : game.myPlayer.getOwned().getInventoryToString()) {
			items.addItem(itemName);
		}
		
		// As default its the item with the index 0 which is selected
		items.setSelectedIndex(0);

		// Set the image of the item selected 
		setObjectImage();
		
		// Listener for when the player select another item
		// It will change the label with the image
		items.addItemListener(
				ae->{
					setObjectImage();
				});

		// Instentiation of the JButton select
		select =new JButton("Let down this item");

		// Listener that will call all methods necessary to remove the item selected
		select.addActionListener(
				ae ->{
					int itemIdx = (int)items.getSelectedIndex();
					PhysicalObject object= game.myPlayer.getOwned().getObject(itemIdx);
					game.myPlayer.removePhysicalObject(object);
					window.update();
					this.dispose();

				}
				);

		// Instentiation of the button cancel
		cancel = new JButton ("cancel");
		
		// Listener to close the JDialog without exiting the program
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

	/**
	 * Method to set the image of the item in the Label 
	 */
	private void setObjectImage(){
		int itemSelected = (int)items.getSelectedIndex();
		ImageIcon imageObject = game.myPlayer.getOwned().getObject(itemSelected).getImage();
		objectLabel.setIcon(imageObject);
	}

}
