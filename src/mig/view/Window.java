package mig.view;


import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import mig.core.Game;

/**
 * Window is the displaying of the game 
 * It is this window which contains all action buttons 
 * @author group8
 *
 */
@SuppressWarnings("serial")
public class Window extends JPanel {

	// Displays the main window of the game, with all elements (buttons, pictures, icons, messages) in the right order. 
	private final URL urlLogoGame = BackPack.class.getResource("resources/murder_120.png");
	private final ImageIcon logoGame = new ImageIcon(urlLogoGame);
	private JPanel screen = new JPanel();
	private JLabel roomView ;
	private JLabel planView;
	private ConsoleArea consoleArea;
	private Bunch bunch ;
	private Notebook notebook;
	public BackPack backPack ;
	private DirectionPanel directionPanel ;

	private CheckButton check ;
	private SpeakButton speak ;
	private LetDownButton letDown ;
	private DenounceButton denounce ;
	private PrincipalWindow prinwindow;

	private Game game ;

	/**
	 * Default Constructor
	 * @param principal_window the JFrame that contains this JPanel
	 * @param game the current game played
	 */
	public Window(PrincipalWindow principal_window, Game game){

		this.game = game; 
		this.bunch = new Bunch(game);
		this.check = new CheckButton(this,game);
		this.speak =new SpeakButton(this,game);
		this.letDown= new LetDownButton(this,game);
		this.denounce= new DenounceButton(game);
		this.notebook=   new Notebook(game);
		this.directionPanel =  new DirectionPanel(this,game);
		this.planView= new  JLabel(game.myPlayer.getCurrentRoom().getImagePlan());
		this.backPack = new BackPack(game);
		this.consoleArea = new ConsoleArea(game);
		this.prinwindow=principal_window;



		screen.setLayout(new GridBagLayout());
		screen.setBackground(new Color(107, 106, 104));

		GridBagConstraints gbc = new GridBagConstraints();

		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 2;
		gbc.insets = new Insets(10, 10, 10, 10);
		screen.add(new JLabel(logoGame ),gbc);

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
		roomView = new JLabel(game.myPlayer.getCurrentRoom().getImage());
		screen.add(roomView,gbc);

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
		gbc.gridwidth = 6;
		gbc.gridheight = 2;
		gbc.fill = GridBagConstraints.BOTH;
		screen.add(consoleArea,gbc);

		this.add(screen);
		

	}

	/**
	 * Method that updates the the visual renders (main picture and side plan) of the room where the player currently is  
	 */
	private void updateRoomImage(){
		roomView.setIcon(game.myPlayer.getCurrentRoom().getImage());
		planView.setIcon(game.myPlayer.getCurrentRoom().getImagePlan()); 
		prinwindow.updateTitle();
	}


	/**
	 * Method that updates the window of the game after each action made by the player.
	 */
	public void update (){
		backPack.update();
		check.update();
		letDown.update();
		speak.update();
		updateRoomImage();
		directionPanel.updateAccess();
		denounce.update();
		consoleArea.update();

	}
}
