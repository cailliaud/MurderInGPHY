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
import mig.core.NPC;


@SuppressWarnings("serial")
public class SelectNPC extends JDialog {
	private JButton select, cancel;
	private JPanel panNPC;
	private NPC npcSelected;
	private Game game;
	private JComboBox<String> npcs;
	private Window window;
	private String message;
	@SuppressWarnings("unused")
	private EnigmaView ev;
	

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
	
	private void construct(){
		panNPC = new JPanel();
		panNPC.setBackground(Color.white);
		panNPC.setPreferredSize(new Dimension(400, 120));
		panNPC.setBorder(BorderFactory.createTitledBorder(message));
		npcs = new JComboBox<String>();
		for (String npcName : game.myPlayer.getCurrentRoom().getNameofOccupants()) {
			npcs.addItem(npcName);
		}

		npcs.setSelectedIndex(0);

		
		select =new JButton("Speak to this person");

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

		cancel = new JButton ("cancel");
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
