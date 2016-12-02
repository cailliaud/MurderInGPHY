package mig.view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;

import mig.core.Enigma;
import mig.view.Fenetre;

import javax.swing.JOptionPane;


public class EnigmaView extends JDialog {
  private Enigma answ = new Enigma();
  private boolean sendData;
  private JComboBox items, infos;
  private JTextField rep;

  public EnigmaView(JFrame parent, String title, boolean modal){
    super(parent, title, modal);
    this.setSize(600, 400);
    this.setLocationRelativeTo(null);
    this.setResizable(false);
    this.initComponent();
  }

  public Enigma EnigmaViewDialog(){
    this.sendData = false;
    this.setVisible(true);      
    return this.answ;      
  }

  private void initComponent(){

	// Asked enigma 
	    JLabel enigme = new JLabel("Quel est le meilleur département du monde ? ");
	    Font font = new Font ("Arial", Font.BOLD, 25);
	    enigme.setFont(font);
	    
    //text answer
    JPanel panTextAnsw = new JPanel();
    panTextAnsw.setBackground(Color.white);
    panTextAnsw.setPreferredSize(new Dimension(220, 80));
    rep = new JTextField();
    rep.setPreferredSize(new Dimension(100, 25));
    panTextAnsw.setBorder(BorderFactory.createTitledBorder("Enter a text answer"));
    JLabel nomLabel = new JLabel("Enter a text answer : ");
    panTextAnsw.add(nomLabel);
    panTextAnsw.add(rep);
    JButton okTextBouton = new JButton("OK");

    //For an item
    JPanel panItem = new JPanel();
    panItem.setBackground(Color.white);
    panItem.setPreferredSize(new Dimension(220, 80));
    panItem.setBorder(BorderFactory.createTitledBorder("Choose an item to answer: "));
    items = new JComboBox();
    items.addItem("Brioche");
    items.addItem("Tartiflette");
    items.addItem("Chouquettes");
    items.addItem("Cassoulet");
    JLabel itemLabel = new JLabel("Item Choosen: ");
    panItem.add(itemLabel);
    panItem.add(items);
    JButton okItemBouton = new JButton("OK");
    
    //For informations
    JPanel panInfo = new JPanel();
    panInfo.setBackground(Color.white);
    panInfo.setPreferredSize(new Dimension(220, 80));
    panInfo.setBorder(BorderFactory.createTitledBorder("Choisir une Information"));
    infos = new JComboBox();
    infos.addItem("La Bruffière");
    infos.addItem("Tiffauges");
    infos.addItem("Montaigu");
    infos.addItem("Treize-Septiers");
    JLabel infoLabel = new JLabel("Information choosen : ");
    panInfo.add(infoLabel);
    panInfo.add(infos);
    JButton okInfoBouton = new JButton("OK");

    //Creation of the panel with the 3 fields for the answer
    JPanel content = new JPanel();
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


    okTextBouton.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent arg0) {     
    	  JOptionPane eni = new JOptionPane();
    	  if(rep.getText().equals("Vendée")){
	    		eni.showMessageDialog(null, "Good Job ! Take it, it is for you : " , "Well done" , JOptionPane.INFORMATION_MESSAGE);
	    		dispose();
    	  }
	    	else{
	    		eni.showMessageDialog(null, "I am sorry, You did not answer well this Enigma, try again ! ", "Sorry" , JOptionPane.INFORMATION_MESSAGE);
	    	}
      }
      
    });

    okItemBouton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent arg0) {     
      	  JOptionPane eni = new JOptionPane();
      	  if(items.getSelectedItem().equals("Brioche")){
  	    		eni.showMessageDialog(null, "Good Job ! Take it, it is for you : ", "Well done" , JOptionPane.INFORMATION_MESSAGE);
  	    		dispose();
      	  }
  	    	else{
  	    		eni.showMessageDialog(null, "I am sorry, You did not answer well this Enigma, try again ! ", "Sorry" , JOptionPane.INFORMATION_MESSAGE);
  	    	}
        }
      });
    
    okInfoBouton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent arg0) {     
      	  JOptionPane eni = new JOptionPane();
      	  if(infos.getSelectedItem().equals("La Bruffière")){
  	    		eni.showMessageDialog(null, "Good Job ! Take it, it is for you : ", "Well done" , JOptionPane.INFORMATION_MESSAGE);
  	    		dispose();
      	  }
  	    	else{
  	    		eni.showMessageDialog(null, "I am sorry, You did not answer well this Enigma, try again ! ", "Sorry" , JOptionPane.INFORMATION_MESSAGE);
  	    	}
        }
        
      });

    this.getContentPane().add(content, BorderLayout.CENTER);
  } 
}