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
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import mig.core.Door;
import mig.core.Game;
import mig.core.Item;
import mig.core.Key;
import mig.core.PhysicalObject;


@SuppressWarnings("serial")

public class GiveKey extends JDialog {
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

	private Door door;

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
	public GiveKey(JFrame parent, String title, String message , Game game, Window window , Door door){
		super(parent,title);
		this.window= window;
		this.game=game;
		this.message =message;
		this.door = door;
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
		for (String itemName : game.myPlayer.getOwned().getBunchToString()) {
			items.addItem(itemName);
		}

		// As default its the item with the index 0 which is selected
		items.setSelectedIndex(0);


		// Instentiation of the JButton select
		select =new JButton("Select this key");

		// Listener that will call all methods necessary to remove the item selected
		select.addActionListener(
				ae ->{
					int keyIdx = (int)items.getSelectedIndex();
					Key key= game.myPlayer.getOwned().getKey(keyIdx);
					door.openDoor(key);
					try {
						game.myPlayer.move(door.getNextRoom(game.myPlayer.getCurrentRoom()));
						JOptionPane.showMessageDialog(null, "The door is know opened", "Good Key", JOptionPane.INFORMATION_MESSAGE);
						window.update();

					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "The key refuses to turn in the bolt", "Wrong Key", JOptionPane.INFORMATION_MESSAGE);
					}

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
		JLabel itemLabel = new JLabel("Key");
		panItem.add(itemLabel);
		panItem.add(items);

		this.setLayout(new BorderLayout());
		this.add(panItem,BorderLayout.NORTH);
		this.add(select, BorderLayout.WEST);
		this.add(cancel, BorderLayout.EAST);
	}



}
