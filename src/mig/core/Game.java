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
	
	private Room hall1RDC = new Room("Hall RDC");
	private Room deskAnnie = new Room("Annie desk");
	private Room corridor1RDC = new Room("Corridor of the RDC");
	private Room corridor2RDC = new Room("Corridor of the RDC");
	private Room corridor3RDC = new Room("Corridor of the RDC");
	private Room corridor4RDC = new Room("Corridor of the RDC");
	private Room corridor5RDC = new Room("Corridor of the RDC");
	private Room td1 = new Room("TD1");
	private Room meeting = new Room("Meeting room");
	private Room cafet = new Room("Cafeteria room'");
	private Room deskPgDom = new Room("PG and dominique desk");
	private Room deskAllan = new Room("Allan desk");
	private Room td4 = new Room("TD4");
	private Room deskSecretary = new Room("Secretary desk");
	private Room tp1 = new Room("TP1");
	private Room classroom = new Room("Classroom");
	private Room corridor1Floor= new Room("Corridor of the floor");
	private Room corridor2Floor= new Room("Corridor of the floor");
	private Room corridor3Floor= new Room("Corridor of the floor");
	private Room corridor4Floor= new Room("Corridor of the floor");
	private Room corridor5Floor= new Room("Corridor of the floor");
	private Room corridor6Floor= new Room("Corridor of the floor");
	private Room hallFloor = new Room("Hall of the floor");
	private Room tp2 = new Room("TP2");
	private Room td2 = new Room("TD2");
	private Room lp1 = new Room("LP1");
	private Room td3 = new Room("TD3");
	private Room lp2 = new Room("LP2");
	private Room info1 = new Room("Info1");
	private Room ent1 = new Room("ENT1");
	private Room tp3 = new Room("TP3");
	private Room ent3 = new Room("ENT3");
	private Room aegp = new Room("AEGP");
	private Room toilet = new Room("Toilet");
	
	private Key keyTD1 = new Key("Key TD1");
	private Lock lockTD1 = new Lock(keyTD1);
	private Door td1_corridor1RDC= new Door(lockTD1, td1, corridor1RDC);
	
	private Key keyTD4 = new Key("Key TD4");
	private Lock lockTD4 = new Lock(keyTD4);
	private Door td4_corridor4 = new Door(lockTD4, td4, corridor4RDC);
	
	private Key keyTP3 = new Key("Key TP3");
	private Lock lockTP3 = new Lock(keyTP3);
	private Door tp3_corridor5Floor = new Door(lockTP3, tp3, corridor5Floor);
	
	private Key keyEnt1 = new Key("Key ENT1");
	private Lock lockENT1 = new Lock(keyEnt1);
	private Door ent1_corridor4 = new Door(lockENT1, ent1, corridor4Floor);
	
	private Key keyTD3 = new Key("Key TD3");
	private Lock lockTD3 = new Lock(keyTD3);
	private Door td3_corridor3 = new Door(lockTD3, td3, corridor3Floor);
	
	private Key keyTD2 = new Key("Key TD2");
	private Lock lockTD2 = new Lock(keyTD2);
	private Door td2_corridor2 = new Door(lockTD2, td2, corridor2Floor);
	
	private Key keyCours = new Key("Key Cours");
	private Lock lockCours = new Lock(keyCours);
	private Door Cours_corridor1 = new Door(lockCours, classroom, corridor1Floor);
	
	private Key Keyinfo1 = new Key("Key info 1");
	private Lock lockInfo1 = new Lock(Keyinfo1);
	private Door info1_corridor4 = new Door(lockInfo1, info1, corridor4Floor);
	
	
	private OpenedBolt openbolt = new OpenedBolt();
	
	private Door hall1RDC_hallFloor = new Door(openbolt, hall1RDC, hallFloor);
	private Door hall1RDC_corridor1RDC= new Door(openbolt, hall1RDC, corridor1RDC);
	private Door corridor1RDC_corridor2RDC = new Door(openbolt, corridor1RDC, corridor2RDC);
	private Door corridor2RDC_corridor3RDC = new Door(openbolt, corridor2RDC, corridor3RDC);
	private Door corridor3RDC_corridor4RDC = new Door(openbolt, corridor3RDC, corridor4RDC);
	private Door corridor4RDC_corridor5RDC = new Door(openbolt, corridor4RDC, corridor5RDC);
	private Door annieDesk_corridor1RDC = new Door(openbolt, deskAnnie, corridor1RDC);
	private Door meeting_corridor2RDC = new Door(openbolt, meeting, corridor2RDC);
	private Door cafet_corridor2RDC = new Door(openbolt, cafet, corridor2RDC);
	private Door deskPgDom_corridor3RDC = new Door(openbolt, deskPgDom, corridor3RDC);
	private Door deskAllan_corridor3RDC = new Door(openbolt, deskAllan, corridor3RDC);
	private Door corridor5Floor_corridor5RDC = new Door(openbolt, corridor5Floor, corridor5RDC);
	private Door TP1_hallFloor = new Door(openbolt, tp1, hallFloor);
	private Door hallFloor_corridor1Floor= new Door(openbolt, hallFloor, corridor1Floor);
	private Door corridor1Floor_corridor2Floor= new Door(openbolt, corridor1Floor, corridor2Floor);
	private Door corridor2Floor_corridor3Floor= new Door(openbolt, corridor2Floor, corridor3Floor);
	private Door corridor3Floor_corridor4Floor= new Door(openbolt, corridor3Floor, corridor4Floor);
	private Door corridor4Floor_corridor5Floor= new Door(openbolt, corridor4Floor, corridor5Floor);
	private Door corridor5Floor_corridor6Floor= new Door(openbolt, corridor5Floor, corridor6Floor);
	private Door tp2_corridor1Floor = new Door(openbolt, tp2, corridor1Floor);
	private Door ent3_corridor6Floor = new Door(openbolt, ent3, corridor6Floor);
	private Door aegp_corridor6Floor= new Door(openbolt, aegp, corridor6Floor);
	private Door toilet_corridor6Floor= new Door(openbolt, toilet, corridor6Floor);
	

	public Game(String name) 
	{
		
		
		if ((name==null)||(name.isEmpty())) {
			this.myPlayer = new Player("Sherlock", hall1RDC);
		}
		else
		{
			this.myPlayer= new Player(name, hall1RDC);
			
		}
		listPNJ=new ArrayList<NPC>();
		listItems= new ArrayList<Item>();
		listEnigma =  new ArrayList<Enigma>();
		

		hall1RDC.addDoor("north", hall1RDC_corridor1RDC);
		hall1RDC.addDoor("up", hall1RDC_hallFloor);
		corridor1RDC.addDoor("east", annieDesk_corridor1RDC);
		corridor1RDC.addDoor("north", corridor1RDC_corridor2RDC);
		corridor1RDC.addDoor("west", td1_corridor1RDC);
		corridor1RDC.addDoor("south", hall1RDC_corridor1RDC);
		corridor2RDC.addDoor("east", cafet_corridor2RDC);
		corridor2RDC.addDoor("north", corridor2RDC_corridor3RDC);
		corridor2RDC.addDoor("west", meeting_corridor2RDC);
		corridor2RDC.addDoor("south", corridor1RDC_corridor2RDC);
		corridor3RDC.addDoor("north", corridor3RDC_corridor4RDC);
		corridor3RDC.addDoor("west", deskPgDom_corridor3RDC);
		corridor3RDC.addDoor("east", deskAllan_corridor3RDC);
		corridor3RDC.addDoor("south", corridor2RDC_corridor3RDC);
		corridor4RDC.addDoor("north", corridor4RDC_corridor5RDC);
		corridor4RDC.addDoor("west", td4_corridor4);
		corridor4RDC.addDoor("south", corridor3RDC_corridor4RDC);
		corridor5RDC.addDoor("south", corridor4RDC_corridor5RDC);
		corridor5RDC.addDoor("up", corridor5Floor_corridor5RDC);
		deskAnnie.addDoor("west", annieDesk_corridor1RDC);
		td1.addDoor("east", td1_corridor1RDC);
		cafet.addDoor("west", cafet_corridor2RDC);
		meeting.addDoor("east", meeting_corridor2RDC);
		deskAllan.addDoor("west", deskAllan_corridor3RDC);
		deskPgDom.addDoor("east", deskPgDom_corridor3RDC);
		td4.addDoor("east", td4_corridor4);
		hallFloor.addDoor("down", hall1RDC_hallFloor);
		hallFloor.addDoor("east", TP1_hallFloor);
		hallFloor.addDoor("north", hallFloor_corridor1Floor);
		tp1.addDoor("west", TP1_hallFloor);
		corridor1Floor.addDoor("south", hallFloor_corridor1Floor);
		corridor1Floor.addDoor("east", tp2_corridor1Floor);
		corridor1Floor.addDoor("north", corridor1Floor_corridor2Floor);
		corridor1Floor.addDoor("west", Cours_corridor1);
		classroom.addDoor("east", Cours_corridor1);
		tp2.addDoor("west", tp2_corridor1Floor);
		corridor2Floor.addDoor("south", corridor1Floor_corridor2Floor);
		corridor2Floor.addDoor("west", td2_corridor2);
		corridor2Floor.addDoor("north", corridor2Floor_corridor3Floor);
		td2.addDoor("east", td2_corridor2);
		corridor3Floor.addDoor("south", corridor2Floor_corridor3Floor);
		corridor3Floor.addDoor("north", corridor3Floor_corridor4Floor);
		corridor3Floor.addDoor("west", td3_corridor3);
		td3.addDoor("east", td3_corridor3);
		corridor4Floor.addDoor("south", corridor3Floor_corridor4Floor);
		corridor4Floor.addDoor("north", corridor4Floor_corridor5Floor);
		corridor4Floor.addDoor("east", info1_corridor4);
		corridor4Floor.addDoor("west", ent1_corridor4);
		ent1.addDoor("east", ent1_corridor4);
		info1.addDoor("west", info1_corridor4);
		corridor5Floor.addDoor("south", corridor4Floor_corridor5Floor);
		corridor5Floor.addDoor("north", corridor5Floor_corridor6Floor);
		corridor5Floor.addDoor("down", corridor5Floor_corridor5RDC);
		corridor5Floor.addDoor("west", tp3_corridor5Floor);
		tp3.addDoor("east", tp3_corridor5Floor);
		corridor6Floor.addDoor("south", corridor5Floor_corridor6Floor);
		corridor6Floor.addDoor("north", aegp_corridor6Floor);
		corridor6Floor.addDoor("east", toilet_corridor6Floor);
		corridor6Floor.addDoor("west", ent3_corridor6Floor);
		ent3.addDoor("east", ent3_corridor6Floor);
		aegp.addDoor("south", aegp_corridor6Floor);
		toilet.addDoor("west", toilet_corridor6Floor);
		

	}

//	public void testGame(){
//		Key key = new Key("Hall_Key");
//		Lock lock = new Lock(key);
//		lab = new Room("lab","le lab du B2","resources/lab.jpg","resources/plan_Lab.png");
//		couloirHautHall = new Room( "Haut de l'escalier" ,
//				"couloir en montant l'escalier � partir du hall",
//				"resources/rooms/Haut_escalier_entreeB2.JPG",
//				"resources/plan_Lab.png");
//		hall_haut= new Door (code, hall,couloirHautHall );
//		haut_lab = new Door (lock, couloirHautHall, lab);
//		hall.addDoor("up", hall_haut);
//		couloirHautHall.addDoor("down", hall_haut);
//		couloirHautHall.addDoor("north", haut_lab);
//		lab.addDoor("south", haut_lab);
//		this.myPlayer.addItem(
//				new PhysicalObject("caf�", "un caf� chaud", "resources/coffee-cup.png")
//				);


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
