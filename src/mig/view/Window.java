package mig.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import mig.core.Game;

public class Window extends JFrame {

	private JPanel screen = new JPanel();
	private ConsoleArea consoleArea = new ConsoleArea();
	private Bunch bunch = new Bunch();
	private Notebook notebook = new Notebook();
	private PlanView planView ;
	private BackPack backPack ;
	private DirectionPanel directionPanel = new DirectionPanel();
	
	private CheckButton check ;
	private SpeakButton speak ;
	private LetDownButton letDown = new LetDownButton();
	private DenounceButton denounce = new DenounceButton();
	
	private Game game ;

	public Window(Game game){
		this.game = game; 
		check = new CheckButton(game.myPlayer.getCurrentRoom());
		speak =new SpeakButton(game.myPlayer.getCurrentRoom());
		this.planView= new PlanView(game.myPlayer.getCurrentRoom().getImagePlan());
		this.backPack = new BackPack(game.myPlayer.getOwned());
		this.setTitle("Murder in GPHY V0.2");
		this.setSize(600, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(true);
	


		screen.setLayout(new GridBagLayout());
		//screen.setBorder();
		screen.setBackground(new Color(107, 106, 104));

		//L'objet servant à positionner les composants
		GridBagConstraints gbc = new GridBagConstraints();

		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 2;
		gbc.insets = new Insets(10, 10, 10, 10);
		screen.add(new JLabel(new ImageIcon ("resources/murder_120.png")),gbc);
		
		gbc = new GridBagConstraints();
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 2;
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.CENTER;
		screen.add(backPack, gbc);
		
		
		gbc = new GridBagConstraints();
		gbc.gridx = 2;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.anchor = GridBagConstraints.SOUTH;
		screen.add(bunch,gbc);
		
		gbc = new GridBagConstraints();
		gbc.gridx = 2;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.anchor = GridBagConstraints.NORTH;
		screen.add(notebook,gbc);
		
	    gbc = new GridBagConstraints();
	    gbc.gridx = 0;
	    gbc.gridy = 2;
	    gbc.gridheight = 7;
	    screen.add(planView,gbc);
	    
	    gbc = new GridBagConstraints();
	    gbc.gridx = 1;
	    gbc.gridy = 2;
	    gbc.gridheight = 7;
	    screen.add(new JLabel(game.myPlayer.getCurrentRoom().getImage()),gbc);
	    
	   
		
		gbc = new GridBagConstraints();
		gbc.gridx = 2;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.ipady = 20;
		gbc.insets = new Insets(10, 10, 10, 10);
		screen.add(speak,gbc);
		
		gbc = new GridBagConstraints();
		gbc.gridx = 2;
		gbc.gridy = 4;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.ipady = 20;
		gbc.insets = new Insets(10, 10, 10, 10);
		screen.add(check,gbc);
		
		gbc = new GridBagConstraints();
		gbc.gridx = 2;
		gbc.gridy = 5;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.ipady = 20;
		gbc.insets = new Insets(10, 10, 10, 10);
		screen.add(letDown,gbc);
		
		gbc = new GridBagConstraints();
		gbc.gridx = 2;
		gbc.gridy = 6;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.ipady = 20;
		gbc.insets = new Insets(10, 10, 10, 10);
		screen.add(denounce,gbc);
		
		gbc = new GridBagConstraints();
		gbc.gridx = 2;
		gbc.gridy = 7;
		gbc.gridwidth = 1;
		gbc.gridheight = 2;
		gbc.ipady = 20;
		gbc.insets = new Insets(10, 10, 10, 10);
		screen.add(directionPanel,gbc);
		
		gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 9;
		gbc.gridwidth = 4;
		gbc.gridheight = 2;
		screen.add(consoleArea,gbc);
	    
		
	    this.add(screen);
	    this.pack();

		this.setVisible(true);		


	}

}
