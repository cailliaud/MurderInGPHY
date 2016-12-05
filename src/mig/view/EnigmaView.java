package mig.view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import mig.core.Enigma;
import mig.core.Game;
import mig.core.Information;
import mig.core.Item;
import mig.core.NPC;
import mig.core.PhysicalObject;
import mig.exceptions.ErrorTypeAnswer;
import mig.exceptions.FailedResolvEnigma;
import mig.exceptions.InventoryFull;

import javax.swing.JOptionPane;


@SuppressWarnings("serial")
public class EnigmaView extends JDialog {
	private Enigma enigma;
	private NPC npc;
	private Game game;
	private Window window;
	private JButton okInfoBouton,okTextBouton, okItemBouton;
	private JPanel panTextAnsw, panItem , panInfo, content;
	private JTextField rep;
	private JLabel enigme,nomLabel,itemLabel, infoLabel;
	private Font font;
	private JComboBox<String> items, infos ;


	public EnigmaView(JFrame parent, String title, Game game, NPC npc, Window window){
		super(parent, title);
		this.window=window;
		this.npc = npc;
		this.enigma=npc.getEgnime();
		this.game=game;
		this.setSize(800, 400);
		this.setLocationRelativeTo(null);
		this.setResizable(false);


		this.createEnigmaQuestion();
		this.addActions();
		this.setVisible(true);
	}

	private void createEnigmaQuestion(){

		this.setLayout( new GridLayout(0, 1));
		// Asked enigma 
		String str = "<html> "+enigma.getQuest()+" </html>";
		enigme = new JLabel(str);
		//		font = new Font ("Arial", Font.BOLD,11);
		//		enigme.setFont(font);

		//text answer
		panTextAnsw = new JPanel();
		panTextAnsw.setBackground(Color.white);
		panTextAnsw.setPreferredSize(new Dimension(220, 80));
		rep = new JTextField();
		rep.setPreferredSize(new Dimension(100, 25));
		panTextAnsw.setBorder(BorderFactory.createTitledBorder("Enter a text answer"));
		nomLabel = new JLabel("Enter a text answer : ");
		panTextAnsw.add(nomLabel);
		panTextAnsw.add(rep);
		okTextBouton = new JButton("OK");

		//For an item
		panItem = new JPanel();
		panItem.setBackground(Color.white);
		panItem.setPreferredSize(new Dimension(220, 80));
		panItem.setBorder(BorderFactory.createTitledBorder("Choose an item to answer: "));
		items = new JComboBox<String>();
		for (String itemName : game.myPlayer.getOwned().getInventoryToString()) {
			items.addItem(itemName);
		}
		itemLabel = new JLabel("Item Choosen: ");
		panItem.add(itemLabel);
		panItem.add(items);
		okItemBouton = new JButton("OK");
		if (game.myPlayer.getOwned().getSize()==0){
			okItemBouton.setEnabled(false);
		}else okItemBouton.setEnabled(true);

		//For informations
		panInfo = new JPanel();
		panInfo.setBackground(Color.white);
		panInfo.setPreferredSize(new Dimension(220, 80));
		panInfo.setBorder(BorderFactory.createTitledBorder("Chose an information"));
		infos = new JComboBox<String>();
		for (String info : game.myPlayer.getOwned().getNotebookToString()) {
			infos.addItem(info);
		}
		infoLabel = new JLabel("Information choosen : ");
		panInfo.add(infoLabel);
		panInfo.add(infos);
		okInfoBouton = new JButton("OK");
		if (game.myPlayer.getOwned().getNotebook().isEmpty()){
			okInfoBouton.setEnabled(false);
		}else okInfoBouton.setEnabled(true);

		//Creation of the panel with the 3 fields for the answer
		content = new JPanel();
		content.setBackground(Color.white);
		content.add(enigme); 

		//Creation of the different panels for the buttons
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		p3.setPreferredSize(new Dimension(60, 40));
		JPanel p4 = new JPanel();    
		p4.setPreferredSize(new Dimension(60, 40));
		JPanel p5 = new JPanel(); 
		p4.setPreferredSize(new Dimension(60, 40));
		JPanel p6 = new JPanel(); 
		JPanel p7 = new JPanel(); 
		p7.setBackground(Color.white);
		JPanel p8 = new JPanel(); 
		p8.setBackground(Color.white);

		//Adding of of the buttons in the panels 
		p3.add(okTextBouton);
		p3.setBackground(Color.white);
		p4.add(okItemBouton);
		p4.setBackground(Color.white);
		p5.add(okInfoBouton);
		p5.setBackground(Color.white);

		//Creation of the GridLayout
		p2.setLayout(new GridLayout(3,1));
		p2.setBackground(Color.white);

		p2.add(panTextAnsw);
		p2.add(panItem);
		p2.add(panInfo);


		p6.setLayout(new GridLayout(5,1));
		p6.setBackground(Color.white);
		p6.add(p3,BorderLayout.NORTH);
		p6.add(p7,BorderLayout.NORTH);
		p6.add(p4,BorderLayout.CENTER);
		p6.add(p8,BorderLayout.NORTH);
		p6.add(p5,BorderLayout.SOUTH);


		content.add(p2, BorderLayout.CENTER);
		content.add(p6, BorderLayout.CENTER);
		this.add(content);



		//this.getContentPane().add(content, BorderLayout.CENTER);
	} 

	private void addActions(){
		okTextBouton.addActionListener(
				ae ->{
					try {
						String answer = (String)rep.getText();
						answer=answer.toLowerCase();
						enigma.resolveEnigma(answer);
						Item reward= enigma.rewarded();
						rewardManagement(reward);

					} catch (FailedResolvEnigma e) {
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(null, "I am sorry, You did not answer well this Enigma, you are close the good answer. ", "Try again !" , JOptionPane.INFORMATION_MESSAGE);
					}
					catch (ErrorTypeAnswer e){
						JOptionPane.showMessageDialog(null, "I am sorry but I did not expect this type of anwser ...", "Try again !" , JOptionPane.INFORMATION_MESSAGE);
					}
					finally {
						window.update();
						this.dispose();

					}
				}

				);

		okItemBouton.addActionListener(
				ae ->{
					try {
						PhysicalObject object = game.myPlayer.getOwned().getObject(items.getSelectedIndex());
						enigma.resolveEnigma((PhysicalObject)object);
						game.myPlayer.getOwned().removeObject(object);
						Item reward= enigma.rewarded();
						rewardManagement(reward);

					} catch (FailedResolvEnigma e) {
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(null, "I am sorry, You did not answer well this Enigma, you are close the good answer. ", "Try again !" , JOptionPane.INFORMATION_MESSAGE);
					}
					catch (ErrorTypeAnswer e){
						JOptionPane.showMessageDialog(null, "I am sorry but I did not expect this type of anwser ...", "Try again !" , JOptionPane.INFORMATION_MESSAGE);
					}finally {
						window.update();
						this.dispose();

					}
				}

				);

		okInfoBouton.addActionListener(
				ae ->{
					try {
						Information object = game.myPlayer.getOwned().getInfo(items.getSelectedIndex());
						enigma.resolveEnigma((Information)object);
						Item reward= enigma.rewarded();
						rewardManagement( reward);

					} catch (FailedResolvEnigma e) {
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(null, "I am sorry, You did not answer well this Enigma, you are close the good answer. ", "Try again !" , JOptionPane.INFORMATION_MESSAGE);
					}
					catch (ErrorTypeAnswer e){
						JOptionPane.showMessageDialog(null, "I am sorry but I did not expect this type of anwser ...", "Try again !" , JOptionPane.INFORMATION_MESSAGE);
					}finally {
						window.update();
						this.dispose();

					}
				}

				);
	}

	private void rewardManagement(Item reward){
		String message;
		String nameObject;
		if (reward instanceof PhysicalObject) {
			PhysicalObject object = (PhysicalObject) reward;
			nameObject = object.getInformation();

		}else{
			nameObject = reward.getName();}

		try {
			message="<html><h1>Well Done !</h1> <p> "+this.enigma.getNpcText()+"</p>";
		} catch (FailedResolvEnigma e1) {
			// TODO Auto-generated catch block
			message="<html><h1>Well Done !</h1>";
		}

		try {
			game.myPlayer.addItem(reward);
			message += "</br> "
					+ "<p>You get : "+nameObject+"</p>"
					+ "</html> ";
			JOptionPane.showMessageDialog(null,message,"Item added in your Inventory" , JOptionPane.INFORMATION_MESSAGE);
		} catch (InventoryFull e) {
			message += "</br> "
					+"<p>You are fulled, the reward is let down !"
					+ "</br> Check to find : "+nameObject+"</p>"
					+ "</html> ";
			JOptionPane.showMessageDialog(null, message,"Inventory Fulled" , JOptionPane.ERROR_MESSAGE);
			game.myPlayer.getCurrentRoom().addItem(reward);
		}finally {
			window.update();
			this.dispose();

		}
	}




}