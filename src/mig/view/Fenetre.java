package mig.view;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import mig.core.Enigma;

public class Fenetre extends JFrame {
	  private JButton bouton = new JButton("CECI EST UN TEST !");

	  public Fenetre(){      
	    this.setTitle("Ma JFrame");
	    this.setSize(300, 200);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);      
	    this.getContentPane().setLayout(new FlowLayout());
	    this.getContentPane().add(bouton);
	    bouton.addActionListener(new ActionListener(){
	      public void actionPerformed(ActionEvent arg0) {
	    	  EnigmaView ev = new EnigmaView(null, "Enigma", true);
	    	  Enigma answ = ev.EnigmaViewDialog(); 
	    	  ev.dispose();
	      }         
	    });      
	    this.setVisible(true);      
	  }

	  public static void main(String[] main){
	    Fenetre fen = new Fenetre();
	  }   
}