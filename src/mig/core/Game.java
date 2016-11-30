package mig.core;
import java.util.ArrayList;

import mig.exceptions.ErrorObjectClosed;
import mig.exceptions.GameOver;

/**
 * This class will be more detailed and implemented at the end
 */
public class Game {

	public Player myPlayer;
	private PNJ killer ;
	private ArrayList<PNJ> listPNJ;
	private ArrayList<Item> listItems;
	private ArrayList<Enigma> listEnigma;
	private boolean gameWin = false;
	public Room hall,lab;

	public Game(String name) 
	{
		lab = new Room("lab","le lab du B2","resources/lab.jpg","resources/plan_Lab.png");
		hall = new Room("hall","le hall du B2","resources/mlp_puzzle.jpg","resources/plan_Hall.png");
		if ((name==null)||(name.isEmpty())) {
			this.myPlayer = new Player("Sherlock", hall);
		}
		else
		{
			this.myPlayer= new Player(name, hall);
			this.myPlayer.addItem(
					new PhysicalObject("café", "un café chaud", "resources/coffee-cup.png")
					);
			this.myPlayer.addItem(
					new PhysicalObject("grenade", "une grenade qui pète fort", "resources/grenade.png")
					);
			this.myPlayer.addItem(
					new PhysicalObject("gun", "a real gun", "resources/gun.png")
					);
			this.myPlayer.addItem(
					new PhysicalObject("martini", "a cocktail", "resources/martini.png")
					);
		}
		listPNJ=new ArrayList<PNJ>();
		listItems= new ArrayList<Item>();
		listEnigma =  new ArrayList<Enigma>();

	}

	public void setKiller(PNJ thekiller){
		if (this.killer==null){
			this.killer=thekiller;
		}
	}

	public void speakPNJ(PNJ pnj){

	}

	public void resolveEnigma(PNJ pnj){

	}

	//	/**
	//	 * Method to move in a direction
	//	 * @param direction the direction taken
	//	 * @return the statement of the action
	//	 */
	//	public String move(String direction){
	//		Room currentRoom =myPlayer.getCurrentRoom();
	//		if (currentRoom.exitsPossible(direction))
	//		{
	//			Door door =currentRoom.goInDirection(direction);
	//			try {
	//				myPlayer.move(door.getNextRoom(currentRoom));
	//				return ("You are know in the "+myPlayer.getCurrentRoom().getName());
	//			} catch (ErrorObjectClosed e) {
	//				
	//			}
	//					
	//		}else {
	//			return ("There is no door in this direction");
	//		}
	//		
	//	}

	public void search(){

	}




	public PNJ getKiller(){
		return killer;
	}

	public boolean isWin(){
		return gameWin;
	}
	/**
	 * Method to give the name of the killer and to try to win the game
	 * @param name Name of the PNJ who is the killer
	 */
	public void giveKiller(PNJ pnj) throws GameOver{
		if (pnj.equals(killer)){
			gameWin=true;
		}else{
			throw new GameOver();			
		}

	}




}
