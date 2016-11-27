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
	public Room hall,td1;

	public Game(String name) 
	{
		hall = new Room("hall");
		if ((name==null)||(name.isEmpty())) {
			this.myPlayer = new Player("Sherlock", hall);
		}
		else
		{
			this.myPlayer= new Player(name, hall);
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
