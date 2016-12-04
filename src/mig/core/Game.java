package mig.core;


import mig.exceptions.GameOver;



/**
 * This class will be more detailed and implemented at the end
 */
public class Game {

	public Player myPlayer;
	private NPC killer ;
	private boolean gameWin = false;
	
	
	/**
	 * Creation of all the room of the game
	 */
	
	private Room hall1RDC = new Room("Hall",
			"Hall of B2",
			"resources/rooms/Hall.JPG",
			"resources/plans/RDC_hall.JPG");
	private Room deskAnnie = new Room("Annie desk",
			"This is the desk of Annie",
			"resources/rooms/BureauAnnie.JPG",
			"resources/plans/RDC_BureauAnnie.JPG" );
	private Room corridor1RDC = new Room("Corridor of the RDC", 
			"This is the corridor of the RDC",
			"resources/rooms/Couloir_vue_hall_salleAnnieTD1.JPG",
			"resources/plans/RDC_Couloir_vue_TD1_Annie.JPG");
	private Room corridor2RDC = new Room("Corridor of the RDC", 
			"This is the corridor of the RDC",
			"resources/rooms/Couloir_vue_salleCafet.JPG",
			"resources/plans/RDC_Couloir_vue_Cafet_Reunion.JPG");
	private Room corridor3RDC = new Room("Corridor of the RDC",
			"This is the corridor of the RDC",
			"resources/rooms/Couloir_BureauxPG_Allan.JPG",
			"resources/plans/RDC_Couloir_BureauxPG_Allan.JPG");
	private Room corridor4RDC = new Room("Corridor of the RDC",
			"This is the corridor of the RDC",
			"resources/rooms/Couloir_vue_TD4.JPG",
			"resources/plans/RDC_Couloir_TD4.JPG");
	private Room corridor5RDC = new Room("Corridor of the RDC",
			"This is the corridor of the RDC",
			"resources/rooms/Escalier_du_Font.JPG",
			"resources/plans/RDC_Escalier.JPG");
	private Room td1 = new Room("TD1",
			"This is the room TD1",
			"resources/rooms/TD1.JPG",
			"resources/plans/RDC_TD1.JPG" );
	private Room meeting = new Room("Meeting room", 
			"This is the room for the meeting", 
			"resources/rooms/SalleReunion.JPG",
			"resources/plans/RDC_SalleReunion.JPG");
	private Room cafet = new Room("Cafeteria room", 
			"This is the room for the cafeteria", 
			"resources/rooms/Salle_cafet.JPG",
			"resources/plans/RDC_SalleCafet.JPG");
	private Room deskPgDom = new Room("PG and dominique desk");
	private Room deskAllan = new Room("Allan desk",
			"This is the desk of Allan",
			"resources/rooms/BureauAllan.JPG",
			"resources/plans/RDC_BureauAllan.JPG");
	private Room td4 = new Room("TD4", 
			"This is the room TD4", 
			"resources/rooms/TD4.JPG",
			"resources/plans/RDC_TD4.JPG");
	private Room deskSecretary = new Room("Secretary desk");
	private Room tp1 = new Room("TP1",
			"This is the room TP1", 
			"resources/rooms/TP1.JPG",
			"resources/plans/Etage_TP1.JPG");
	private Room classroom = new Room("Classroom",
			"This is the Classroom", 
			"resources/rooms/Cours.JPG",
			"resources/plans/Etage_salleCours.JPG");
	private Room corridor1Floor= new Room("Corridor of the floor", 
			"This is the corridor of the floor",
			"resources/rooms/Couloir_vue_salleCours.JPG",
			"resources/plans/Etage_Couloir_vue_SalleCoursTP2.JPG");
	private Room corridor2Floor= new Room("Corridor of the floor",
			"This is the corridor of the floor",
			"resources/rooms/Couloir_vue_TD2.JPG",
			"resources/plans/Etage_Couloir_vue_TD2.JPG");
	private Room corridor3Floor= new Room("Corridor of the floor",
			"This is the corridor of the floor",
			"resources/rooms/Couloir_vue_TD3.JPG",
			"resources/plans/Etage_Couloir_vue_TD3.JPG");
	private Room corridor4Floor= new Room("Corridor of the floor",
			"This is the corridor of the floor",
			"resources/rooms/Couloir_vue_info1.JPG",
			"resources/plans/Etage_Couloir_vue_Info1.JPG");
	private Room corridor5Floor= new Room("Corridor of the floor",
			"This is the corridor of the floor",
			"resources/rooms/Couloir_vue_TP3.JPG",
			"resources/plans/Etage_Couloir_vue_TP3.JPG");
	private Room corridor6Floor= new Room("Corridor of the floor",
			"This is the corridor of the floor",
			"resources/rooms/Couloir_vue_toilettesHautB2.JPG",
			"resources/plans/Etage_Couloir_vue_ToilettesHaut.JPG");
	private Room hallFloor = new Room("Hall of the floor",
			"This is the corridor of the floor",
			"resources/rooms/Haut_escalier_entreeB2.JPG",
			"resources/plans/Etage_Haut_Escalier.JPG");
	private Room tp2 = new Room("TP2",
			"This is the room TP2",
			"resources/rooms/TP2.JPG",
			"resources/plans/Etage_TP2.JPG");
	private Room td2 = new Room("TD2",
			"This is the room TD2",
			"resources/rooms/TD2.JPG",
			"resources/plans/Etage_TD2.JPG");
	private Room lp1 = new Room("LP1");
	private Room td3 = new Room("TD3",
			"This is the room TP3",
			"resources/rooms/TD3.JPG",
			"resources/plans/Etage_TD3.JPG");
	private Room lp2 = new Room("LP2");
	private Room info1 = new Room("Info1",
			"This is the room Info1",
			"resources/rooms/Info1.JPG",
			"resources/plans/Etage_ENT1.JPG");
	private Room ent1 = new Room("ENT1",
			"This is the room ENT1",
			"resources/rooms/ENT1.JPG",
			"resources/plans/Etage_ENT1.JPG");
	private Room tp3 = new Room("TP3",
			"This is the room TP3",
			"resources/rooms/TP3.JPG",
			"resources/plans/Etage_TP3.JPG");
	private Room ent3 = new Room("ENT3",
			"This is the room ENT3",
			"resources/rooms/ENT3.JPG",
			"resources/plans/Etage_ENT3.JPG");
	private Room aegp = new Room("AEGP",
			"This is the room AEGP",
			"resources/rooms/Salle_AEGP.JPG",
			"resources/plans/Etage_AEGP.JPG");
	private Room toilet = new Room("Toilet", 
			"This is the toilet",
			"resources/rooms/Toilettes_haut_B2.JPG",
			"resources/plans/Etage_ToilettesHaut.JPG");
	
	/**
	 * Creation of all the keys of the game with doors linked to these keys
	 */
	
	private Key woodenKey = new Key("Key TD1");
	private Lock lockTD1 = new Lock(woodenKey);
	private Door td1_corridor1RDC= new Door(lockTD1, td1, corridor1RDC);
	
	private Key keyTD4 = new Key("Key TD4");
	private Lock lockTD4 = new Lock(keyTD4);
	private Door td4_corridor4 = new Door(lockTD4, td4, corridor4RDC);
	
	private Key copperKey = new Key("Key TP3");
	private Lock lockTP3 = new Lock(copperKey);
	private Door tp3_corridor5Floor = new Door(lockTP3, tp3, corridor5Floor);
	
	private Key ironKey = new Key("Key ENT1");
	private Lock lockENT1 = new Lock(ironKey);
	private Door ent1_corridor4 = new Door(lockENT1, ent1, corridor4Floor);

	
	private Code codeTD3 = new Code ("Canberra");
	private Door td3_corridor3 = new Door(codeTD3, td3, corridor3Floor);
	
	private Key keyTD2 = new Key("Key TD2");
	private Lock lockTD2 = new Lock(keyTD2);
	private Door td2_corridor2 = new Door(lockTD2, td2, corridor2Floor);
	

	private Code codeCours = new Code ("Pikachu");
	private Door Cours_corridor1 = new Door(codeCours, classroom, corridor1Floor);
	
	private Key longKey = new Key("Key info 1");
	private Lock lockInfo1 = new Lock(longKey);
	private Door info1_corridor4 = new Door(lockInfo1, info1, corridor4Floor);
	
	private Key silverKey = new Key("Useless key");
	
	private OpenedBolt openbolt = new OpenedBolt();
	
	/**
	 * Creation of all the doors of the game
	 */
	
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
	
	/**
	 * Creation of all the objects of the game
	 */
	

	private PhysicalObject laptopCharger = new PhysicalObject("laptopCharger", "Astemir's laptop charger", "resources/PhysicalObjects_Icon/Laptop_charger.PNG");
	private PhysicalObject fourtyCents = new PhysicalObject("fourtyCents", "40 cents of euro", "resources/PhysicalObjects_Icon/40_euro_cents.PNG");
	private PhysicalObject hotChocolate = new PhysicalObject("hotChocolate", "a cup of hot chocolate", "resources/PhysicalObjects_Icon/Hot_chocolate.PNG");
	private PhysicalObject briocheVendeenne = new PhysicalObject("briocheVendeenne", "a brioche vendeenne", "resources/PhysicalObjects_Icon/Brioche_vendéenne.PNG");
	private PhysicalObject tennisRacket = new PhysicalObject("tennisRacket", "a tennis racket", "resources/PhysicalObjects_Icon/Tennis_racket.PNG");
	private PhysicalObject toiletPaperRoll = new PhysicalObject("toiletPaperRoll", "a toilet paper roll", "resources/PhysicalObjects_Icon/Toilet_paper_roll.PNG");
	private PhysicalObject lighter = new PhysicalObject("lighter", "a lighter", "resources/PhysicalObjects_Icon/Lighter.PNG");
	private PhysicalObject coilOfWire = new PhysicalObject("coilOfWire", "a coil of wire", "resources/PhysicalObjects_Icon/Coil_of_wire.PNG");
	private PhysicalObject cartonOfSoup = new PhysicalObject("cartonOfSoup", "a carton of soup", "resources/PhysicalObjects_Icon/Soup_Carton.PNG");
	private PhysicalObject sushi = new PhysicalObject("sushi", "a sushi", "resources/PhysicalObjects_Icon/Sushi.PNG");
	private PhysicalObject hairpin = new PhysicalObject("hairpin", "a hairpin", "resources/PhysicalObjects_Icon/Hairpin.PNG");
	private PhysicalObject bikeWheel = new PhysicalObject("bikeWheel", "a bike wheel", "resources/PhysicalObjects_Icon/Bike_wheel.PNG");
	private PhysicalObject pikachuCuddlyToy = new PhysicalObject("pikachuCuddlyToy", "a pikachu cuddly toy", "resources/PhysicalObjects_Icon/Pikachu_cuddly_toy.PNG");
	private PhysicalObject scarf = new PhysicalObject("scarf", "a scarf", "resources/PhysicalObjects_Icon/Scarf.PNG");
	private PhysicalObject chineseChopsticks = new PhysicalObject("chineseChopsticks", "a pair of chinese chopsticks", "resources/PhysicalObjects_Icon/Chinese_chopsticks.PNG");
	private PhysicalObject banknote = new PhysicalObject("banknote", "a simple banknote to pay something" , "resources/PhysicalObjects_Icon/banknote.PNG");
	/**
	 * Creation of all the information of the game
	 */
	
	private Information annieInfo = new Information("Annie's Info", "There is only one killer.");
	private Information patrickInfo = new Information("patrick's Info", "The killer is not Simon because he was absent the day of the murder.");
	private Information astemirInfo = new Information("astemir's Info", "There was an AEGP office meeting the day before the murder and the atmosphere was extremely tense.");
	private Information antoineInfo = new Information("antoine's Info", "The killer is not a girl from the AEGP office");
	private Information nicolasInfo = new Information("nicolas's Info", "The killer is from the AEGP.");
	private Information aegpRoomInfo = new Information("aegpRoom 's Info", "The safe is open and empty.");
	private Information aegpToiletInfo = new Information("aegpToilet's Info", "Blood stains in the sink.");
	private Information chloeInfo = new Information("Chloe's Info", "password for TD3 room is the capital city of Australia");
	private Information delphineInfo = new Information("Delphine's Info", "password for cours room is Pikachu");
	
	
	/**
	 * Creation of all the enigmas of the game
	 */
	
	private Enigma steveEnigma = new Enigma("Hey ! You come late, there is no more coffee. "
			+ "Do you want a hot chocolate instead ? it's 40 cents.", fourtyCents , 
			"Take it. Beware it's hot", hotChocolate);
	
	private Enigma claireEnigma = new Enigma("Ah, i’m so tired, I worked until way too late at night yesterday. "
			+ "Luckily, I got some brioche vendéenne with me! You want some? What? Alex, killed? "
			+ "Oh, you almost got me. You make a good actor you know. But I think you shouldn’t joke with those kind of things. "
			+ "You are really pale, take some to regain strength! If you want your reward, answer this question : "
			+ "What is the best department in France ?", 
			"Vendee", "You’re damn right! Take it. My pleasure", 
			briocheVendeenne);
	
	private Enigma babujhiEnigma = new Enigma("It’s so sad what happened to Alexandre."
			+ "I really want to help you to find the killer. Take that key if you answer my question correctly, "
			+ "I don’t know what room it opens but I hope it will help you in your investigation."
			+ "If you want your reward, answer this question : “What does GFP mean ?", 
			"Green fluorescent protein", 
			"Yeah man, that's right", 
			silverKey);
	
	private Enigma delphineEnigma = new Enigma("Hello young detective, if you give me the good answer to this question, "
			+ "then i will give you a clue. But be careful, for that you will have to get back to your L3 physiology courses"
			+ "and the answer has to be in hexadecimal :  What is the first property of the cardiac function ?", 
			"4175746f6d617469736d",
			"Well done, you are a true physiologist", delphineInfo);
	
	private Enigma annieEnigma = new Enigma("Hello, you came for a clue i guess ? Well ok, but i don’t give it that easily !"
			+ "Here is my question : From which historical character comes from the first computer language you learned in L3 ?", 
			"Ada lovelace", "GOOOOOOD !!! I know who is the killer but I am too scared to tell anything."
			+ "The only clue i can give you is that there is only one killer and I spread 8 clues hidden "
			+ "in 8 different rooms.You will have to discover them all and gather them for a vital clue.", 
			annieInfo);
	
	private Enigma patrickEnigma = new Enigma("So you are attempting to find the coward that killed Alexandre? "
			+ "Of course I can help you but can you help me before? I got that dawn riddle a former GPhy sent me this morning. "
			+ "If I don’t find the solution quickly, he will begin to taunt me : "
			+ "I am an Indian Ocean island,"
			+ "Bali nearly touches my sand."
			+ "I house the Indonesian capital city,"
			+ "What is the name Ramayana gave me?", 
			"Java", "Hum you find the answer, good", 
			patrickInfo);
	
	private Enigma allanEnigma = new Enigma("Brrr ! It’s so cold outside ! I wish I have something to warm me up ! "
			+ "Do you have something for me ?", 
			hotChocolate, 
			"Oooh thank you so much! Well, Annie told me you try to find who killed Alexandre. "
			+ "I don’t know if it will help you but take this. Good luck.", keyTD4);
	
	private Enigma chloeEnigma = new Enigma("Ahh I’m so hungry !!! Wouldn’t you have something to eat by any chance ???" ,
			briocheVendeenne, "ALLLLL RIIIIIGHT !!! Thank you so much! Well, what can I give you in exchange? "
			+ "Oh, I know! Do you  know how to open the TD3 room door? "
			+ "You can open it with a password which is the capital city of Australia. Be sure to write it well.", 
			chloeInfo);
	
	private Enigma astemirEnigma = new Enigma("Hey ! Damn I have to work with Simon on his computer because i’m running out of battery. "
			+ "I wish i could recharge my laptop.", 
			laptopCharger, 
			"Thanks. You know I’m a bit sad : There was a meeting of the office of the AEGP yesterday afternoon and the atmosphere was tense…", 
			astemirInfo);
	
	private Enigma simonEnigma = new Enigma("Hey you ! How’s it going ? For me, it could be better. As you can see, "
			+ "I broke my leg and lost my tennis racket. I know it’s a GPhy student who brought it back in the B2 "
			+ "but i don’t know where and I don’t want to move. Can you find it for me please ?", 
			tennisRacket, 
			"Oh great! I was afraid it was lost. Thank you very much! Take that key.", 
			copperKey);
	
	private Enigma agatheEnigma = new Enigma("Hey there ! How’s it going ? I’m so hungryyy ! I could eat a whole cow ! "
			+ "I know you are looking for Alex’s killer. It happened that I got a key for you even if I have no freaking idea which door it open. "
			+ "Just answer this question : Tell me what you can bought at the cafeteria and have a female name?", 
			"Amandine", 
			"That’s right! The key is yours.", 
			longKey);
	
	private Enigma fpEnigma = new Enigma("AAAaaaah, I can’t wait for the holidays ! I want to travel, it’s been a long time. "
			+ "So, now i’m a student again, i won’t go that far.  I need to choose a place in France to stay. "
			+ "By the way, do you know with which country the France has its longest border ? You will earn TD 2 key so think well.", 
			"Brasil", 
			"That’s Correct. Never forget the overseas bro! Take the key. I hope that you will find what you are looking for", 
			keyTD2);
	
	private Enigma fabienEnigma = new Enigma("Hey you, are you going round and round in circles to find the killer ? "
			+ "Well it turns out that I have an object for you if you answer correctly to this question. "
			+ "How many gold coins I found during my treasure hunt with my fellow friend Steve ?", 
			"0", 
			"Yes… zero… What a shame… Anyway, you answered well so take the item.", 
			bikeWheel);
	
	private Enigma gcell1Enigma = new Enigma("Oh my god I’m so stressed! Will I find a job after my master's degree ?", 
			"No", 
			"There is no need to rub salt in the wound! Take that soup carton and leave! I can’t eat one more of this.", 
			cartonOfSoup);
	
	//private Enigma gcell2Enigma = new Enigma("Leave me alone, I don’t have time for you, I have too much work to do.", null, null, null);
	
	private Enigma marinEnigma = new Enigma("You like Enigmas? Answer this one : "
			+ "In which country there is the biggest amount of redhead people ?", 
			"Scotland", 
			"You find the right answer. And so  what ? You want a cookie ? Get out of here, I got nothing for you !", banknote);
	
	private Enigma antoineEnigma = new Enigma("So, do you learned you genetics lesson or you spend the whole night playing video games ? "
			+ "What is the name of the sequencing technique using the luciferin as a substrate ?", 
			"Pyrosequencing", 
			"The killer is not a girl of the AEGP office, because I was with Claire and caroline working on the annual project the night of the murder.", 
			antoineInfo);
	
	private Enigma nicolasEnigma = new Enigma("I hope you learned your GB lessons ! "
			+ "What is the radioactive transformation allowing an excited nucleus to go to a weaker energy level "
			+ "or to join its fundamental state by transferring its excess of energy to an electron ?", 
			"Internal conversion", "Wow! To be honest, I did not expect you to answer that. "
			+ "Well, I did not see the killer but he or she is necessarily someone from AEGP "
			+ "because he or she got the key to open the AEGP office. I heard him or her open it, "
			+ "I was on the other side of the wall.", 
			nicolasInfo);
	
	private Enigma gcelll2Enigma = new Enigma(" Leave me alone, I don’t have time for you, I have too much work to do.");
	
	/**
	 * Creation of all the NPC of the game
	 */
	
	private NPC steve = new NPC("Steve", steveEnigma);
	private NPC babujhi = new NPC("Babujhi", babujhiEnigma);
	private NPC claire = new NPC("Claire", claireEnigma);
	private NPC delphine = new NPC("Delphine", delphineEnigma);
	private NPC annie = new NPC("Annie", annieEnigma);
	private NPC patrick = new NPC("Patrick", patrickEnigma);
	private NPC allan = new NPC("Allan", allanEnigma);
	private NPC chloe = new NPC("Chloé", chloeEnigma);
	private NPC astemir = new NPC("Astemir", astemirEnigma);
	private NPC simon = new NPC("Simon", simonEnigma);
	private NPC fp = new NPC("FP", fpEnigma);
	private NPC agathe = new NPC("Agathe", agatheEnigma);
	private NPC fabien = new NPC("Fabien", fabienEnigma);
	private NPC gcell1 = new NPC("Gcell1", gcell1Enigma);
	private NPC gcell2 = new NPC("Gcell2", null);
	private NPC marin = new NPC("Marin", marinEnigma);
	private NPC antoine = new NPC("Antoine", antoineEnigma);
	private NPC nicolas = new NPC("Nicolas", nicolasEnigma);
	
	
	
	
	public Game(String name) 
	{
		
		
		if ((name==null)||(name.isEmpty())) {
			this.myPlayer = new Player("Sherlock", hall1RDC);
		}
		else
		{
			this.myPlayer= new Player(name, hall1RDC);
			
		}
		setDoor();
		putItemsInRoom();
		setKiller(babujhi);
		putNPCInRoom();
		
	    
		
		
		
	}
	
	private void setDoor(){
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
	
	private void putItemsInRoom(){
		hall1RDC.addItem(woodenKey);
		meeting.addItem(lighter);
		meeting.addItem(ironKey);
	    deskPgDom.addItem(pikachuCuddlyToy);
	    deskAllan.addItem(coilOfWire);
	    tp2.addItem(scarf);
	    td2.addItem(tennisRacket);
	    info1.addItem(laptopCharger);
	    ent1.addItem(fourtyCents);
	    ent1.addItem(hairpin);
	    tp3.addItem(chineseChopsticks);
	    ent3.addItem(sushi);
	    toilet.addItem(toiletPaperRoll);
	    toilet.addItem(aegpToiletInfo);
	    aegp.addItem(aegpRoomInfo);
	}
	
	
	private void putNPCInRoom(){
		hall1RDC.addPNJ(steve);
		hall1RDC.addPNJ(claire);
		hall1RDC.addPNJ(babujhi);
		td1.addPNJ(delphine);
		deskAnnie.addPNJ(annie);
		deskPgDom.addPNJ(patrick);
		deskAllan.addPNJ(allan);
		tp1.addPNJ(simon);
		tp1.addPNJ(astemir);
		classroom.addPNJ(fp);
		tp2.addPNJ(agathe);
		td3.addPNJ(fabien);
		info1.addPNJ(marin);
		ent1.addPNJ(gcell1);
		ent1.addPNJ(gcell2);
		tp3.addPNJ(antoine);
		ent3.addPNJ(nicolas);
		
	}
	
	private void initEnigmas(){
		
	}

	/**
	 * Method to set the NPC who is the killer
	 * The killer cannot be set more than one time
	 * @param thekiller
	 */
	public void setKiller(NPC thekiller){
		if (this.killer==null){
			this.killer=thekiller;
		}
	}

	/**
	 * Accessor to get the killer
	 * @return the Killer of the game
	 * @see NPC
	 */
	public NPC getKiller(){
		return killer;
	}

	/**
	 * Accessor to get if the game is win or not
	 * @return boolean True if win, and false if it is not
	 */
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
