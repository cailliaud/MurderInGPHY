package mig.view;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel; 
 
public class Window extends JFrame{
	private Inventory inventory = new Inventory();
	private ActionBar actionBar= new ActionBar();
	private ConsoleArea consoleArea = new ConsoleArea();
	private PlanView planView = new PlanView();
	
  public Window(){
    this.setTitle("Murder In GPHY");
    this.setSize(600, 600);
    this.setResizable(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    //On définit le layout à utiliser sur le content pane
    this.setLayout(new BorderLayout());
    //On ajoute le bouton au content pane de la JFrame
    //Au centre
    this.getContentPane().add(new JLabel(new ImageIcon ("resources/couloir.jpg")), BorderLayout.CENTER);
    //Au nord
    this.getContentPane().add(inventory, BorderLayout.NORTH);
    //Au sud
    this.getContentPane().add(consoleArea, BorderLayout.SOUTH);
    //À l'ouest
    this.getContentPane().add(actionBar, BorderLayout.EAST);
    //À l'est
    this.getContentPane().add(planView, BorderLayout.WEST);
    this.setVisible(true);
  }      
}