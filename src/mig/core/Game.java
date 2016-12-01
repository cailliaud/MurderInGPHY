package mig.core;
import java.util.ArrayList;

import mig.exceptions.ErrorObjectClosed;
import mig.exceptions.GameOver;
import mig.view.Window;

/**
 * This class will be more detailed and implemented at the end
 */
public class Game {

	public Player myPlayer;
	private NPC killer ;
	private ArrayList<NPC> listPNJ;
	private ArrayList<Item> listItems;
	private ArrayList<Enigma> listEnigma;
	private boolean gameWin = false;
	public Room hall,couloirHautHall,lab;
	private OpenedBolt openbolt = new OpenedBolt();
	private Code code = new Code("");
	private Door hall_haut, haut_lab;

	public Game(String name) 
	{
		
		hall = new Room("hall","le hall du B2",
				"resources/rooms/Hall.JPG",
				"resources/plan.png"
				);
		if ((name==null)||(name.isEmpty())) {
			this.myPlayer = new Player("Sherlock", hall);
		}
		else
		{
			this.myPlayer= new Player(name, hall);
			
		}
		listPNJ=new ArrayList<NPC>();
		listItems= new ArrayList<Item>();
		listEnigma =  new ArrayList<Enigma>();

	}
	
	public void testGame(){
		Key key = new Key("Hall_Key");
		Lock lock = new Lock(key);
		lab = new Room("lab","le lab du B2","resources/lab.jpg","resources/plan_Lab.png");
		couloirHautHall = new Room( "Haut de l'escalier" ,
				"couloir en montant l'escalier à partir du hall",
				"resources/rooms/Haut_escalier_entreeB2.JPG",
				"resources/plan_Lab.png");
		hall_haut= new Door (code, hall,couloirHautHall );
		haut_lab = new Door (lock, couloirHautHall, lab);
		hall.addDoor("up", hall_haut);
		couloirHautHall.addDoor("down", hall_haut);
		couloirHautHall.addDoor("north", haut_lab);
		lab.addDoor("south", haut_lab);
		this.myPlayer.addItem(
				new PhysicalObject("café", "un café chaud", "resources/coffee-cup.png")
				);
//		this.myPlayer.addItem(
//				new PhysicalObject("grenade", "une grenade qui pète fort", "resources/grenade.png")
//				);
//		this.myPlayer.addItem(
//				new PhysicalObject("gun", "a real gun", "resources/gun.png")
//				);
//		this.myPlayer.addItem(
//				new PhysicalObject("martini", "a cocktail", "resources/martini.png")
//				);
		

	}

	public void setKiller(NPC thekiller){
		if (this.killer==null){
			this.killer=thekiller;
		}
	}

	public void speakPNJ(NPC npc){

	}

	public void resolveEnigma(NPC npc){

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




	public NPC getKiller(){
		return killer;
	}

	public boolean isWin(){
		return gameWin;
	}
	/**
	 * Method to give the name of the killer and to try to win the game
	 * @param name Name of the PNJ who is the killer
	 */
	public void giveKiller(String name) throws GameOver{
		if (name.equals(killer.getName())){
			gameWin=true;
		}else{
			throw new GameOver();			
		}

	}




}
