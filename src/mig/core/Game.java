package mig.core;


import mig.exceptions.GameOver;



/**
 * <b>The Class game is the principal class in the core</b>
 * what do this class does :
 * <ul>
 * <li> instentiates all Items (PhysicalObject, Key, Information)</li>
 * <li> instentiates all enigmas </li>
 * <li> instentiates all Bolt and Door linked with </li>
 * <li> instentiates all NPC</li>
 * <li> instentiates all Room</li>
 * </ul>
 * 
 * To win the game it has to give the good killer
 * 
 */
public class Game {

	/**
	 * The player of the game
	 * It is public to access to it easily
	 */
	public Player myPlayer;

	/**
	 * The NPC who is the killer in the game
	 */
	private NPC killer ;

	/**
	 * Boolean to know if the game is won or not
	 */
	private boolean gameWin = false;


	/**
	 * Creation of the room hall1RDC
	 */
	private Room hall1RDC = new Room("Hall",
			"Hall of B2",
			"Hall.jpg",
			"RDC_hall.jpg");

	/**
	 * Creation of the room desk annie
	 */
	private Room deskAnnie = new Room("Annie desk",
			"This is the desk of Annie",
			"BureauAnnie.JPG",
			"RDC_BureauAnnie.jpg" );

	/**
	 * Creation of the room corridor1RDC
	 */
	private Room corridor1RDC = new Room("Corridor of the RDC", 
			"This is the corridor of the RDC",
			"Couloir_vue_hall_salleAnnieTD1.JPG",
			"RDC_Couloir_vue_TD1_Annie.jpg");

	/**
	 * Creation of the room corridor2RDC
	 */
	private Room corridor2RDC = new Room("Corridor of the RDC", 
			"This is the corridor of the RDC",
			"Couloir_vue_salleCafet.JPG",
			"RDC_Couloir_vue_Cafet_Reunion.jpg");

	/**
	 * Creation of the room corridor3RDC
	 */
	private Room corridor3RDC = new Room("Corridor of the RDC",
			"This is the corridor of the RDC",
			"Couloir_BureauxPG_Allan.JPG",
			"RDC_Couloir_BureauxPG_Allan.jpg");

	/**
	 * Creation of the room corridor4RDC
	 */
	private Room corridor4RDC = new Room("Corridor of the RDC",
			"This is the corridor of the RDC",
			"Couloir_vue_TD4.JPG",
			"RDC_Couloir_TD4.jpg");

	/**
	 * Creation of the room corridor5RDC
	 */
	private Room corridor5RDC = new Room("Corridor of the RDC",
			"This is the corridor of the RDC",
			"Escalier_du_Font.JPG",
			"RDC_Escalier.jpg");
	/**
	 * Creation of the room TD1
	 */
	private Room td1 = new Room("TD1",
			"This is the room TD1",
			"TD1.JPG",
			"RDC_TD1.jpg" );

	/**
	 * Creation of the room meeting
	 */
	private Room meeting = new Room("Meeting room", 
			"This is the room for the meeting", 
			"SalleReunion.JPG",
			"RDC_SalleReunion.jpg");

	/**
	 * Creation of the room cefeteria
	 */
	private Room cafet = new Room("Cafeteria room", 
			"This is the room for the cafeteria", 
			"Salle_cafet.JPG",
			"RDC_SalleCafet.jpg");

	/**
	 * Creation of the room desk of Patrick and Dominique
	 */
	private Room deskPgDom = new Room("PG and dominique desk",
			"This is the desk of Patrick and Dominique",
			"deskPGDom.jpg",
			"RDC_BureauPG.jpg");

	/**
	 * Creation of the room desk of Allan
	 */
	private Room deskAllan = new Room("Allan desk",
			"This is the desk of Allan",
			"BureauAllan.JPG",
			"RDC_BureauAllan.jpg");

	/**
	 * Creation of the room TD4
	 */
	private Room td4 = new Room("TD4", 
			"This is the room TD4", 
			"TD4.JPG",
			"RDC_TD4.jpg");

	/**
	 * Creation of the room  TP1
	 */
	private Room tp1 = new Room("TP1",
			"This is the room TP1", 
			"TP1.JPG",
			"Etage_TP1.jpg");

	/**
	 * Creation of the room classroom
	 */
	private Room classroom = new Room("Classroom",
			"This is the Classroom", 
			"Cours.JPG",
			"Etage_SalleCours.jpg");

	/**
	 * Creation of the room of the corridor1floor
	 */
	private Room corridor1Floor= new Room("Corridor of the floor", 
			"This is the corridor of the floor",
			"Couloir_vue_salleCours.JPG",
			"Etage_Couloir_vue_SalleCoursTP2.jpg");

	/**
	 * Creation of the room of the corridor2floor
	 */
	private Room corridor2Floor= new Room("Corridor of the floor",
			"This is the corridor of the floor",
			"Couloir_vue_TD2.JPG",
			"Etage_Couloir_vue_TD2.jpg");

	/**
	 * Creation of the room of the corridor 3 floor
	 */
	private Room corridor3Floor= new Room("Corridor of the floor",
			"This is the corridor of the floor",
			"Couloir_vue_TD3.JPG",
			"Etage_Couloir_vue_TD3.jpg");

	/**
	 * Creation of the room of the corridor 4 floor
	 */
	private Room corridor4Floor= new Room("Corridor of the floor",
			"This is the corridor of the floor",
			"Couloir_vue_info1.JPG",
			"Etage_Couloir_vue_Info1.jpg");

	/**
	 * Creation of the room of the corridor 5 floor
	 */
	private Room corridor5Floor= new Room("Corridor of the floor",
			"This is the corridor of the floor",
			"Couloir_vue_TP3.JPG",
			"Etage_Couloir_vue_TP3.jpg");

	/**
	 * Creation of the room of the corridor 6 floor
	 */
	private Room corridor6Floor= new Room("Corridor of the floor",
			"This is the corridor of the floor",
			"Couloir_vue_toilettesHautB2.JPG",
			"Etage_Couloir_vue_ToilettesHaut.jpg");

	/**
	 * Creation of the room of the hall in the floor
	 */
	private Room hallFloor = new Room("Hall of the floor",
			"This is the corridor of the floor",
			"Haut_escalier_entreeB2.JPG",
			"Etage_Haut_Escalier.jpg");

	/**
	 * Creation of the room of the TP2
	 */
	private Room tp2 = new Room("TP2",
			"This is the room TP2",
			"TP2.JPG",
			"Etage_TP2.jpg");

	/**
	 * Creation of the room of the TD2
	 */
	private Room td2 = new Room("TD2",
			"This is the room TD2",
			"TD2.JPG",
			"Etage_TD2.jpg");

	/**
	 * Creation of the room of the TD3
	 */
	private Room td3 = new Room("TD3",
			"This is the room TP3",
			"TD3.jpg",
			"Etage_TD3.jpg");

	/**
	 * Creation of the room of the info 1
	 */
	private Room info1 = new Room("Info1",
			"This is the room Info1",
			"Info1.JPG",
			"Etage_Info1.jpg");

	/**
	 * Creation of the room of the ent1
	 */
	private Room ent1 = new Room("ENT1",
			"This is the room ENT1",
			"ENT1.JPG",
			"Etage_ENT1.jpg");

	/**
	 * Creation of the room of the room tp3
	 */
	private Room tp3 = new Room("TP3",
			"This is the room TP3",
			"TP3.JPG",
			"Etage_TP3.jpg");

	/**
	 * Creation of the room ent3
	 */
	private Room ent3 = new Room("ENT3",
			"This is the room ENT3",
			"ENT3.JPG",
			"Etage_ENT3.jpg");

	/**
	 * Creation of the room the aegp
	 */
	private Room aegp = new Room("AEGP",
			"This is the room AEGP",
			"AEGP.jpg",
			"Etage_AEGP.jpg");

	/**
	 * Creation of the room toilet
	 */
	private Room toilet = new Room("Toilet", 
			"This is the toilet",
			"Toilettes_haut_B2.JPG",
			"Etage_ToilettesHaut.jpg");

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

	private Key silverKey = new Key("PowerFull key of the AEGP");

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


	private PhysicalObject laptopCharger = new PhysicalObject("laptopCharger", "Astemir's laptop charger", "Laptop_charger.png");
	private PhysicalObject fourtyCents = new PhysicalObject("fourtyCents", "40 cents of euro", "40_euro_cents.png");
	private PhysicalObject hotChocolate = new PhysicalObject("hotChocolate", "a cup of hot chocolate", "Hot_chocolate.png");
	private PhysicalObject briocheVendeenne = new PhysicalObject("briocheVendeenne", "a brioche vendeenne", "Brioche_vendeenne.png");
	private PhysicalObject tennisRacket = new PhysicalObject("tennisRacket", "a tennis racket", "Tennis_racket.png");
	private PhysicalObject toiletPaperRoll = new PhysicalObject("toiletPaperRoll", "a toilet paper roll", "Toilet_paper_roll.png");
	private PhysicalObject lighter = new PhysicalObject("lighter", "a lighter", "lighter.png");
	private PhysicalObject coilOfWire = new PhysicalObject("coilOfWire", "a coil of wire", "Coil_of_wire.png");
	private PhysicalObject cartonOfSoup = new PhysicalObject("cartonOfSoup", "a carton of soup", "Soup_Carton.png");
	private PhysicalObject sushi = new PhysicalObject("sushi", "a sushi", "Sushi.png");
	private PhysicalObject hairpin = new PhysicalObject("hairpin", "a hairpin", "Hairpin.png");
	private PhysicalObject bikeWheel = new PhysicalObject("bikeWheel", "a bike wheel", "Bike_wheel.png");
	private PhysicalObject pikachuCuddlyToy = new PhysicalObject("pikachuCuddlyToy", "a pikachu cuddly toy", "Pikachu_cuddly_toy.png");
	private PhysicalObject scarf = new PhysicalObject("scarf", "a scarf", "Scarf.png");
	private PhysicalObject chineseChopsticks = new PhysicalObject("chineseChopsticks", "a pair of chinese chopsticks", "Chinese_chopsticks.png");
	private PhysicalObject banknote = new PhysicalObject("banknote", "a simple banknote to pay something" , "banknote.png");
	private PhysicalObject adaBook = new PhysicalObject("Ada for Dumbs" , "The best book to learn ada", "ada_for_dumbs.png");
	private PhysicalObject surfBoard = new PhysicalObject("SurfBoard", "Constance's SurfBoard","surfboard.png" );
	private PhysicalObject weddingRing = new PhysicalObject("Wedding Ring", "Fran�ois-Pierre's Wedding Ring", "wedding_ring.png");
	@SuppressWarnings("unused")
	private PhysicalObject vendeanFlag = new PhysicalObject("Vendean Flag", "Vendean Flag foreach vendeans", "vendean_flag.png");
	private PhysicalObject paperClip = new PhysicalObject("Paper Clip", "To avoid abandoned paper","paper_clip.png" );
	private PhysicalObject goldLouis = new PhysicalObject("Louis d'or", "You have to make pancakes with it" , "louis_dor.png");
	private PhysicalObject kingCard = new PhysicalObject("King Card", "A simple card with a king", "king_card.png");
	private PhysicalObject highHeel = new PhysicalObject("Hight Heel" , "It's looking for its twin sister","high_heel.png");
	private PhysicalObject fishingPole = new PhysicalObject("Fishing Rode", "The best to fish tuna" , "fishing_pole.png");
	private PhysicalObject controler = new PhysicalObject("XBOX controler", "a simple controler","controler.png");
	private PhysicalObject carKey = new PhysicalObject("Car Key", "Someone has again lose it", "car_key.png");
	private PhysicalObject camera = new PhysicalObject("Camera", "THe best tool to take nude pictures", "camera.png");
	private PhysicalObject boomrang = new PhysicalObject("Boomrang", "Where does it come back ?", "boomerang.png");
	private PhysicalObject beerBottle = new PhysicalObject("Beer", "Quench your thirst", "beer_bottle.png");
	private PhysicalObject mouse = new PhysicalObject("Mouse", "The power in your hand" , "mouse.png");
	private PhysicalObject present = new PhysicalObject("A Present", "Chirstmas is coming ! like Winter !","present.png");
	private PhysicalObject milkBottle = new PhysicalObject("A Bottle of milk", "Can have a good taste with chocolate", "milkBottle.png");
	private PhysicalObject whoolBall = new PhysicalObject("A Whool Ball", "the best gift for a cat","whoolBall.png");
	private PhysicalObject chocolatine = new PhysicalObject("Chocolatine", "A Rotten chocolatine better than a fresh chocolat bread", "chocolatine.png");
	private PhysicalObject sqlBook = new PhysicalObject("Sql for dumbs", "the standard for sql", "sql_for_dumbs.png");
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
	private Information marionInfo = new Information("Marion's Info","Maybe you will have wrong information");
	private Information pierreInfo = new Information ("Pierre's Info","The killer has a car, i'm sure because i heard squeal sound this morning.");
	private Information mathiasInfo = new Information("Mathias's info", "Dude, he killed himself trying to steal the association");
	/**
	 * Creation of all the enigmas of the game
	 */

	private Enigma steveEnigma = new Enigma("<p>Hey !</p><p>You come late, there is no more coffee.</p> "
			+ "<p>Do you want a hot chocolate instead ?</p><p>It's 40 cents.</p>", fourtyCents , 
			"Take it. Beware it's hot", hotChocolate);

	private Enigma claireEnigma = new Enigma("<p>Ah, i�m so tired, I worked until way too late at night yesterday.</p> "
			+ "<p>Luckily, I got some brioche vend�enne with me!</p><p>You want some? What? Alex, killed?</p> "
			+ "<p>Oh, you almost got me. You make a good actor you know.</p><p> But I think you shouldn�t joke with those kind of things.</p> "
			+ "<p>You are really pale, take some to regain strength!</p>"
			+ "<p>If you want your reward, answer this question : </p>"
			+ "<p>What is the best department in France ?</p>", 
			"vendee", "You�re damn right! Take it. My pleasure", 
			briocheVendeenne);

	private Enigma babujhiEnigma = new Enigma("<p>It�s so sad what happened to Alexandre.</p>"
			+ "<p>I really want to help you to find the killer.</p>"
			+ "<p>Take that key if you answer my question correctly,</p> "
			+ "<p>I don�t know what room it opens but I hope it will help you in your investigation.</p>"
			+ "<p>If you want your reward, answer this question :</p>"
			+ "<p> �What does GFP mean ?</p>", 
			"green fluorescent protein", 
			"<p>Yeah man, that's right, i love GFP. </p>"
					+ "<p>This key is for you but keep it for you.</p>", 
					silverKey);

	private Enigma delphineEnigma = new Enigma("<p>Hello young detective, if you give me the good answer to this question.</p>"
			+ "<p>Then i will give you a clue.</p> <p>But be careful, for that you will have to get back to your L3 physiology courses</p>"
			+ "<p>he answer has to be in hexadecimal :</p><p>  What is the first property of the cardiac function ?</p>", 
			"4175746f6d617469736d",
			"Well done, you are a true physiologist !", delphineInfo);

	private Enigma annieEnigma = new Enigma("<p>Hello, you came for a clue i guess ?</p>"
			+ "<p>Well ok, but i don�t give it that easily !</p>"
			+ "<p>Here is my question :</p>"
			+ "<p>From which historical character comes from</p><p>the first computer language you learned in L3 ?</p>", 
			"ada lovelace",
			"<p>GOOOOOOD !!!</p>"
					+ "<p>I know who is the killer but I am too scared to tell anything.</p>"
					+ "<p>The only clue i can give you is that there is only one killer and I spread 8 clues hidden"
					+ "in 8 different rooms.</p><p>You will have to discover them all and gather them for a vital clue.</p>", 
					annieInfo);

	private Enigma patrickEnigma = new Enigma("<p>So you are attempting to find the coward that killed Alexandre? </p>"
			+ "<p>Of course I can help you but can you help me before?</p>"
			+ "<p> I got that dawn riddle a former GPhy sent me this morning.</p> "
			+ "<p>If I don�t find the solution quickly, he will begin to taunt me :</p> "
			+ "<p>I am an Indian Ocean island,</p>"
			+ "<p>Bali nearly touches my sand.</p>"
			+ "<p>I house the Indonesian capital city,</p>"
			+ "<p>What is the name Ramayana gave me?</p>", 
			"java", "<p>Hum you find the answer, good.</p>"
					+ " <p>Now you have to make me a summary of what is Java !</p> ", 
					patrickInfo);

	private Enigma allanEnigma = new Enigma("<p>Brrr ! It�s so cold outside !</p><p>I wish I have something to warm me up !</p> "
			+ "<p>Do you have something for me ?</p>", 
			hotChocolate, 
			"<p>Oooh thank you so much!</p><p>Well, Annie told me you try to find who killed Alexandre.</p> "
					+ "I don�t know if it will help you but take this. Good luck.", keyTD4);

	private Enigma chloeEnigma = new Enigma("<p>Ahh I�m so hungry !!!</p><p>Wouldn�t you have something to eat by any chance ???</p>" ,
			briocheVendeenne, "<p>ALLLLL RIIIIIGHT !!!</p><p>Thank you so much! Well, what can I give you in exchange? </p>"
					+ "<p>Oh, I know! Do you  know how to open the TD3 room door? </p>"
					+ "<p>You can open it with a password which is the capital city of Australia. Be sure to write it well.</p>", 
					chloeInfo);

	private Enigma astemirEnigma = new Enigma("<p>Hey !</p><p>Damn I have to work with Simon on his computer because i�m running out of battery.</p> "
			+ "<p>I wish i could recharge my laptop.</p>", 
			laptopCharger, 
			"<p>Thanks.</p><p>You know I�m a bit sad : There was a meeting of the office of the AEGP yesterday afternoon and the atmosphere was tense�</p>", 
			astemirInfo);

	private Enigma simonEnigma = new Enigma("<p>Hey you ! How�s it going ?</p><p>For me, it could be better.</p><p>As you can see, "
			+ "I broke my leg and lost my tennis racket.</p><p>I know it�s a GPhy student who brought it back in the B2 "
			+ "but i don�t know where and I don�t want to move.</p><p> Can you find it for me please ?</p>", 
			tennisRacket, 
			"<p>Oh great! I was afraid it was lost.</p><p> Thank you very much! Take that key.</p>", 
			copperKey);

	private Enigma agatheEnigma = new Enigma("<p>Hey there ! How�s it going ?</p><p>I�m so hungryyy !</p><p>I could eat a whole cow !</p> "
			+ "<p>I know you are looking for Alex�s killer.</p>"
			+ "<p>It happened that I got a key for you even if I have no freaking idea which door it open.</p> "
			+ "<p>Just answer this question :</p>"
			+ "<p>Tell me what you can bought at the cafeteria and have a woman name?</p>", 
			"amandine", 
			"<p>That�s right! The key is yours.</p>", 
			longKey);

	private Enigma fpEnigma = new Enigma(
			"<p>AAAaaaah, My wife will kill me!</p>"
					+ "<p>I really need to find my wedding ring</p> "
					+ "<p>I lost it yesterday, when i ate my sandwich.</p>"
					+ "<p>I already see the light at the end of the tunnel.</p> ",
					weddingRing, 
					"<p>Oh my god !!!.</p><p>I will never forget what you have done!</p><p> Take the key. I hope that you will find what you are looking for</p>", 
					keyTD2);

	private Enigma fabienEnigma = new Enigma("<p>Hey you, are you going round and round in circles to find the killer ?</p>"
			+ "<p>Well it turns out that I have an object for you if you answer correctly to this question.</p> "
			+ "<p>How many gold coins I found during my treasure hunt with my fellow friend Steve ?</p>", 
			"0", 
			"<p>Yes� zero� What a shame� </p><p>Anyway, you answered well so take the item.</p>", 
			bikeWheel);

	private Enigma gcell1Enigma = new Enigma("<p>Oh my god I�m so stressed!</p>"
			+ "<p>Will I pass my high school exams ?</p>", 
			"no", 
			"<p>There is no need to rub salt in the wound!</p>"
					+ "<p>Take that soup carton and leave!</p>"
					+ "<p>I can�t eat one more of this.</p>", 
					cartonOfSoup);


	private Enigma marinEnigma = new Enigma("<p>You like Enigmas?</p><p>Answer this one :</p> "
			+ "<p>In which country there is the biggest amount of redhead people ?</p>", 
			"scotland", 
			"<p>You find the right answer.</p>"
					+ "<p> And so  what ? You want a cookie ?</p>"
					+ "<p> Get out of here !</p>"
					+ "<p> *he throws on you a paper* !</p>",
					banknote);

	private Enigma antoineEnigma = new Enigma("<p>So, do you learned you genetics lesson or you spend the whole night playing video games ?</p> "
			+ "<p>What is the name of the sequencing technique using the luciferin as a substrate ?</p>", 
			"pyrosequencing", 
			"<p>The killer is not a girl of the AEGP office, because I was with Claire and caroline working on the annual project the night of the murder.</p>", 
			antoineInfo);

	private Enigma nicolasEnigma = new Enigma("<p>I hope you learned your GB lessons !</p> "
			+ "<p>What is the radioactive transformation allowing an excited nucleus to go to a weaker energy level</p> "
			+ "<p>or to join its fundamental state by transferring its excess of energy to an electron ?</p>", 
			"internal conversion", "<p>Wow! To be honest, I did not expect you to answer that.</p> "
					+ "<p>Well, I did not see the killer but he or she is necessarily someone from AEGP</p> "
					+ "<p>Because he or she got the key to open the AEGP office.</p>"
					+ "<p> I heard him or her open it, "
					+ "I was on the other side of the wall.</p>", 
					nicolasInfo);

	private Enigma gcelll2Enigma = new Enigma(" Leave me alone, I don�t have time for you, I have too much work to do.");
	private Enigma jeanneEnigma = new Enigma("Another that dies in GPHY, it should not become usual");
	private Enigma marineGcellEnigma = new Enigma("<p>Hey, i'm bored.</p>"
			+ "<p>If you answer me correctly i will give you a gift !</p>"
			+ "<p>What is the latin name of a mice ?</p>",
			"mus musculus",
			"<p>Cute isn't it ?</p>"
					+ "This a gphy mice model for you"
					+ "<p>*blink*</p>",
					mouse
			);
	private Enigma marionEnigma = new Enigma("<p>I'm sure , the murderer is a girl</p>",
			antoineInfo,
			"<p>Impossible, be careful about this information</p>",
			marionInfo);
	private Enigma jonathanEnigma = new Enigma("<p>BEEEEeeeerrrr !</p>"
			+ "<p>*He looks like a pokemon*</p>",
			beerBottle,
			"<p>*Empty the beer in one shot*</p>"
					+ "<p>*He throws on you a shiny object*",
					weddingRing);

	private Enigma clementEnigma = new Enigma("<p>Have you some tips to catch a girl ?</p>",
			fishingPole,
			"<p>This day is my day ! This is for you ! Thanks </p>",
			paperClip
			);

	private Enigma pierreENigma = new Enigma("<p>Hey ! I know who is the killer but i don't give a shit.</p>",
			toiletPaperRoll,
			"<p> Ah ah ah so funny, faggot !</p>",
			pierreInfo
			);

	private Enigma carolineEnigma = new Enigma("<p>*Cat eyes*</p>",
			milkBottle,
			"<p>Meowwww</p>",
			whoolBall);

	private Enigma mathiasEnigma = new Enigma(
			"<p>What's up bro ?</p><p>Who is dead ?</p>",
			"alexandre",
			"<p>Holy shit!</p>",
			mathiasInfo);
	private Enigma dominiqueEnigma = new Enigma("<p>How many engineers does it take to change a lightbulb at Microsoft ?</p>",
			"0",
			"<p>Yes it is no one.</p>"
					+ "<p>Everybody stay in the dark</p>"
					+ "<p>And Billou decides that is a new standard !</p>",
					sqlBook);

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
	private NPC chloe = new NPC("Chlo�", chloeEnigma);
	private NPC astemir = new NPC("Astemir", astemirEnigma);
	private NPC simon = new NPC("Simon", simonEnigma);
	private NPC fp = new NPC("FP", fpEnigma);
	private NPC agathe = new NPC("Agathe", agatheEnigma);
	private NPC fabien = new NPC("Fabien", fabienEnigma);
	private NPC gcell1 = new NPC("Jackie", gcell1Enigma);
	private NPC gcell2 = new NPC("Michele", gcelll2Enigma);
	private NPC marin = new NPC("Marin", marinEnigma);
	private NPC antoine = new NPC("Antoine", antoineEnigma);
	private NPC nicolas = new NPC("Nicolas", nicolasEnigma);
	private NPC marineGcell = new NPC("Marine",marineGcellEnigma);
	private NPC jeanne = new NPC("Jeanne",jeanneEnigma);
	private NPC marion = new NPC("Marion",marionEnigma);
	private NPC jonathan = new NPC("Jonathan",jonathanEnigma);
	private NPC clement = new NPC("Cl�ment", clementEnigma);
	private NPC pierre = new NPC("Pierre",pierreENigma);
	private NPC caroline = new NPC("Caroline", carolineEnigma);
	private NPC mathias = new NPC("Mathias", mathiasEnigma);
	private NPC dominique = new NPC ("Dominique", dominiqueEnigma);


	/**
	 * Constructor for the class Game
	 * @param name the name of the player
	 * If it is null, the player will be called "Sherlock"
	 * The player begin the aegp room
	 * 
	 * The constructor will :
	 * <ul>
	 * <li>Set doors</li>
	 * <li>Put items in rooms</li>
	 * <li> set the killer : Babujhi</li>
	 * <li>put NPC in room</li>
	 * </ul>
	 */
	public Game(String name) 
	{
		if ((name==null)||(name.isEmpty())) {
			this.myPlayer = new Player("Sherlock", aegp);
		}
		else
		{
			this.myPlayer= new Player(name, aegp);
		}
		setDoor();
		// Uncomment to put all item in the hall to test
		//testPutAllIteminHall();
		putItemsInRoom();
		setKiller(babujhi);
		putNPCInRoom();
	}

	/**
	 * Method to set Doors
	 */
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

	/**
	 * Method to put all item in the Hall of the B2
	 * It is used to test all items
	 * If their image are correctly displayed
	 */
	@SuppressWarnings("unused")
	private void testPutAllIteminHall(){
		hall1RDC.addItem(woodenKey);
		hall1RDC.addItem(lighter);
		hall1RDC.addItem(ironKey);
		hall1RDC.addItem(pikachuCuddlyToy);
		hall1RDC.addItem(coilOfWire);
		hall1RDC.addItem(scarf);
		hall1RDC.addItem(tennisRacket);
		hall1RDC.addItem(laptopCharger);
		hall1RDC.addItem(fourtyCents);
		hall1RDC.addItem(hairpin);
		hall1RDC.addItem(chineseChopsticks);
		hall1RDC.addItem(sushi);
		hall1RDC.addItem(toiletPaperRoll);
		hall1RDC.addItem(aegpToiletInfo);
		hall1RDC.addItem(aegpRoomInfo);
		hall1RDC.addItem(annieInfo);
		hall1RDC.addItem(antoineInfo);
		hall1RDC.addItem(astemirInfo);

	}
	
	/**
	 * Method to put items in rooms
	 */
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
		ent3.addItem(camera);
		aegp.addItem(surfBoard);
		aegp.addItem(boomrang);
		aegp.addItem(kingCard);
		aegp.addItem(beerBottle);
		td1.addItem(goldLouis);
		corridor2Floor.addItem(highHeel);
		tp3.addItem(controler);
		td1.addItem(carKey);
		hall1RDC.addItem(present);
		deskAnnie.addItem(adaBook);
		hall1RDC.addItem(chocolatine);
		cafet.addItem(fishingPole);
		meeting.addItem(milkBottle);
	}


	/**
	 * Method to put NPC in rooms
	 */
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
		ent3.addPNJ(gcell1);
		ent3.addPNJ(gcell2);
		tp3.addPNJ(antoine);
		ent3.addPNJ(nicolas);
		td4.addPNJ(chloe);
		ent1.addPNJ(jeanne);
		ent1.addPNJ(marineGcell);
		info1.addPNJ(marion);
		info1.addPNJ(jonathan);
		info1.addPNJ(clement);
		tp2.addPNJ(pierre);
		tp2.addPNJ(caroline);
		tp2.addPNJ(mathias);
		deskPgDom.addPNJ(dominique);
	}


	/**
	 * Method to set the NPC who is the killer
	 * The killer cannot be set more than one time
	 * @param thekiller It is the NPC who is the killer
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
	 * @throws GameOver if the player given is not the good
	 */
	public void giveKiller(String name) throws GameOver{
		String nameGiven,killerName;
		killerName = killer.getName().toLowerCase();
		nameGiven = name.toLowerCase();
		if (nameGiven.equals(killerName)){
			gameWin=true;
		}else{
			throw new GameOver();			
		}

	}
}
