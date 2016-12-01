package mig.view;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
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
    this.setSize(450, 400);
    this.setLocationRelativeTo(null);
    //this.setResizable(false);
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
    
    JPanel p2 = new JPanel();
    p2.setLayout(new GridLayout(3,2));
    
    p2.add(panTextAnsw);
    p2.add(okTextBouton);
    p2.add(panItem);
    p2.add(okItemBouton);
    p2.add(panInfo);
    p2.add(okInfoBouton);
    
    content.add(p2);

    JPanel control = new JPanel();

    okTextBouton.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent arg0) {     
    	  JOptionPane eni = new JOptionPane();
    	  if(rep.getText().equals("Vendée")){
	    		eni.showMessageDialog(null, "Bien joué !!", "BIIIEN !!" , JOptionPane.INFORMATION_MESSAGE);
	    		dispose();
    	  }
	    	else{
	    		eni.showMessageDialog(null, "RATE !!! ", "Dommage" , JOptionPane.INFORMATION_MESSAGE);
	    	}
      }
      
    });

    okItemBouton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent arg0) {     
      	  JOptionPane eni = new JOptionPane();
      	  if(items.getSelectedItem().equals("Brioche")){
  	    		eni.showMessageDialog(null, "Bien joué !!", "BIIIEN !!" , JOptionPane.INFORMATION_MESSAGE);
  	    		dispose();
      	  }
  	    	else{
  	    		eni.showMessageDialog(null, "RATE !!! ", "Dommage" , JOptionPane.INFORMATION_MESSAGE);
  	    	}
        }
      });
    
    okInfoBouton.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent arg0) {     
      	  JOptionPane eni = new JOptionPane();
      	  if(infos.getSelectedItem().equals("La Bruffière")){
  	    		eni.showMessageDialog(null, "Bien joué !!", "BIIIEN !!" , JOptionPane.INFORMATION_MESSAGE);
  	    		dispose();
      	  }
  	    	else{
  	    		eni.showMessageDialog(null, "RATE !!! ", "Dommage" , JOptionPane.INFORMATION_MESSAGE);
  	    	}
        }
        
      });
    this.getContentPane().add(content, BorderLayout.CENTER);
    this.getContentPane().add(control, BorderLayout.SOUTH);
  } 
}