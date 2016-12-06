package mig.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


import mig.core.Game;
import mig.core.Item;
import mig.core.NPC;
/**
 * <b>SelectNPC is class that create a JDialog to allow the player to select the NPC that the player wants to speak</b>
 * <p>
 * <b>The PNCs are in the different rooms</b>  
 * </p>
 * 
 * @see Game
 * @see Item 
 * @see NPC
 * 
 * @author Group8
 * @version 03/12/2016
 */

@SuppressWarnings("serial")
public class SelectNPC extends JDialog {
	
	/**
	 * JButton for the actions :
	 * - Select an item to let down
	 * - Cancel the action
	 */
	
	private JButton select, cancel;
	
	/**
	 * Panel that contains the JComboBox with the different NPCs presents in a room
	 */
	private JPanel panNPC;
	
	/**
	 * npxSelected represents the NPC selected by the Player
	 */
	private NPC npcSelected;
	
	/**
	 * game represents the game currently played
	 */
	private Game game;
	
	/**
	 * The JCombobox displaying the NPC present in the room where the player is 
	 */
	private JComboBox<String> npcs;
	
	/**
	 * The Window (extends JPanel) is the global window of the game
	 */
	private Window window;
	
	/**
	 * message represents the message displayed in the JDialog component
	 */
	private String message;
	@SuppressWarnings("unused")
	
	/**
	 * ev represents the Enigma given by the NPC for the player
	 */
	private EnigmaView ev;
	
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
	public SelectNPC(JFrame parent, String title, String message , Game game, Window window){
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
		panNPC = new JPanel();
		panNPC.setBackground(Color.white);
		panNPC.setPreferredSize(new Dimension(400, 120));
		panNPC.setBorder(BorderFactory.createTitledBorder(message));
		npcs = new JComboBox<String>();
		for (String npcName : game.myPlayer.getCurrentRoom().getNameofOccupants()) {
			npcs.addItem(npcName);
		}
		
		// As default its the NPC with the index 0 which is selected
		npcs.setSelectedIndex(0);

		// select is the button to speak to the NPC
		select =new JButton("Speak to this person");

		// Listener that will call all methods necessary to speak to a NPC
		select.addActionListener(
				ae ->{
					int itemIdx = (int)npcs.getSelectedIndex();
					npcSelected = game.myPlayer.getCurrentRoom().getNPC(itemIdx);
					if (!npcSelected.getEgnime().alreadyResolved()){
						ev = new EnigmaView(null,
								"Speak to "+npcSelected.getName(),
								game,
								npcSelected,
								window);
					}
					else {
						JOptionPane.showMessageDialog(null,
								npcSelected.getEgnime().getQuest(),
								"You tried to speak with "+npcSelected.getName(),
								JOptionPane.INFORMATION_MESSAGE);
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


		JLabel itemLabel = new JLabel("NPCs");
		panNPC.add(itemLabel);
		panNPC.add(npcs);

		this.setLayout(new BorderLayout());
		this.add(panNPC,BorderLayout.NORTH);

		this.add(select, BorderLayout.WEST);
		this.add(cancel, BorderLayout.EAST);
	}
	

}
