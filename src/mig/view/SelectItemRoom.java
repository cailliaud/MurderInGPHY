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
/**
 * <b>SelectItemInventory is class that create a JDialog to add the inventory an item which which was found in a Room</b>
 * <p>
 * <b>These items are found by the user in the differents rooms</b>  
 * </p>
 * 
 * @see Game
 * @see Item 
 * 
 * @author Group8
 * @version 03/12/2016
 */

@SuppressWarnings("serial")

public class SelectItemRoom extends JDialog {
	
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
	 * itemgot represents the item selected by the Player
	 */
	private Item itemgot;
	
	/**
	 * game represents the game currently played
	 */
	private Game game;
	
	/**
	 * The JCombobox displaying items present in the inventory of the player
	 */
	private JComboBox<String> items;
	
	/**
	 * The Window (extends JPanel) is the global window of the game
	 */
	private Window window;
	
	/**
	 * message represents the message displayed in the JDialog component
	 */
	private String message;
	
	/**
	 * objectLabel represents the JLabel with the icon of the item selected with a default image
	 */
	private JLabel objectLabel = new JLabel(new ImageIcon ("resources/default_item.png"),JLabel.CENTER);
	
	/**
	 * urlKey represents the file path of the icon Key
	 */
	private final URL urlKey = BackPack.class.getResource("resources/three-keys_60x60.png");
	
	/**
	 * Instantiation of the icon for the keys
	 */
	private final ImageIcon iconKey = new ImageIcon(urlKey);
	
	/**
	 * urlKey represents the file path of the icon Note
	 */
	private final URL urlNote = BackPack.class.getResource("resources/notebook.png");
	
	/**
	 * Instantiation of the icon for the notes
	 */
	private final ImageIcon iconNote = new ImageIcon(urlNote);
	
	
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
	
	/**
	 * Method to build the JDialog
	 * Adding component
	 * Manage the different Listener for the JButtons
	 */
	private void construct(){
		panItem = new JPanel();
		panItem.setBackground(Color.white);
		panItem.setPreferredSize(new Dimension(400, 120));
		panItem.setBorder(BorderFactory.createTitledBorder(message));
		items = new JComboBox<String>();
		for (String itemName : game.myPlayer.getCurrentRoom().getlistOfItem()) {
			items.addItem(itemName);
		}
		// As default its the item with the index 0 which is selected
		items.setSelectedIndex(0);

		// Set the picture of the item selected 
		setObjectImage();
		
		// When the player select another item
		// This Listener will change the label with the image
		items.addItemListener(
				ae->{
					setObjectImage();
				});
		// Instantiation of the JButton select
		select =new JButton("Get this item");
		
		// Listener that will call all methods necessary to add the item selected
		// If the number of items present in the inventory is up to 4, the inventory is full. So he cannot add a new item
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
		// Instantiation of the button cancel
		cancel = new JButton ("cancel");
		
		// Listener to close the JDialog without exiting the main program
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
