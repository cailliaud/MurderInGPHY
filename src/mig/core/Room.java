package mig.core;
import java.util.ArrayList;
import java.util.Hashtable;

/**
 * <b>Room is the class representing a room, in a building for example.</b>
 * <p>
 * A room contains these elements :
 * </p>
 * <ul>
 * <li>A name, fixed when the room is created</li>
 * <li>A description, it can be changed</li>
 * <li>A list of exits, each exit is composed by :
 * 		<ul>
 * 			<li>A door : it brings to another room</li>
 * 			<li>A direction : it is where is the door in the room</li>
 * 		</ul> 
 * </li>
 * </ul>
 * 
 * <p>
 * If an exit is added to the list of exits, it has to have a direction and a door not null.
 * </p>
 * <p>
 * A direction has to be validated with the class DirectionWords
 * </p>
 * 
 * @see Door
 * @see DirectionWords
 * 
 * @author Group8
 * @version 19/11/2016
 */
public class Room {

	private DirectionWords directions;
	/**
	 * It is the name of the Room
	 * It is set in the constructor and cannot be changed after 
	 */
	private String name;
	
	/**
	 * It is the description of the Room
	 */
	private String description;
	
	/**
	 * It is the list of the exits enabled in the Room
	 * HashTable is used because null value is not authorized.
	 * 
	 * @see Hashtable
	 */
	private Hashtable<String,Door> myExits = new Hashtable<String,Door>();
	
	/**
	 * It is the list of PNJ present in the Room
	 * This list does not contain null value
	 * @see ArrayList
	 */
	//TODO faire une classe héritière de arrayList et @override add() & addAll() OU sécurité dans les methodes utilisants l'ArrayList
	private ArrayList<PNJ> occupants = new ArrayList<PNJ>();
	
	/**
	 * It is the list of items present in the Room
	 * This list does not contain null value
	 * @see ArrayList
	 */
	//TODO Même choser que pour la liste de PNJ : override plus interessant à ce moment là ???
	private ArrayList<Item> clues = new ArrayList<Item>();
	
	/** 
	 * Constructor of the Room
	 * @param nameRoom is the name of the Room (String)
	 * 
	 * @see Room#name
	 */
	public Room(String nameRoom)
	{
		this.name=nameRoom;
		this.directions=new DirectionWords();
	}

	/** 
	 * Getter for the name of the Room
	 * @return Name of the Room
	 * 
	 * @see Room#name
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * Private method to set the Name of the room
	 * @param aString new Name for the Room
	 * It is private because we does not allow another class to change the name of an object after its creation
	 */
	private void setName(String aString){
		
	}

	/**
	 * Getter for the description of the Room
	 * @return Description of the Room
	 * 
	 * @see Room#description
	 */
	public String getDescription(){
		return description;
	}

	/**
	 * Setter for the description of the Room
	 * @param newDescription It is the new description of the Room
	 * @return the description of the Room
	 * The description can be change after the creation of the Room
	 * @see Room#description
	 */
	public String setDescription(String newDescription){
		return this.description=newDescription;
	}

	/**
	 * Method to add a door in the room
	 * @param direction It is the direction taken to find the door in he Room. This direction has to be validated
	 * @param door is the Door to the next Roop, can't be null 
	 * 
	 * @see Door
	 * @see Room#myExits
	 */
	public void addDoor(String direction, Door door) 
	{

	}
	
	/**
	 * Method to remove a door in the room
	 * @param direction It is the direction of the door you want to remove
	 * This method only allows to remove an existing Door 
	 */
	public void removeDoor(String direction)
	{
		
	}

	/**
	 * Method to test if the direction given is in the validDirections list
	 * @param direction : String which contained the name of the direction
	 * @return boolean : true if the direction exists in the list, false if not.
	 * 
	 * @see DirectionWords
	 * @see DirectionWords#validDirections
	 */
	private boolean checkDirection (String direction)
	{
		// Uses of the Class DirectionWords
		DirectionWords tester = new DirectionWords();
		return tester.isDirection(direction);
	}

	/**
	 * Method to display exits enabled in the room
	 * @return The list of exits 
	 * 
	 * @see Room#myExits
	 */
	public String displayExits()
	{
		return null;

	}

	/**
	 * Method to know if there is a door in this direction
	 * @param direction It is the direction given
	 * @return true if a door is enabled in this direction
	 * False if it is not
	 * 
	 * @see Room#checkDirection(String)
	 */
	public boolean exitsPossible(String direction)
	{
		if (checkDirection(direction )){
			return true;
		}
		else {
		return false;
		}
	}
	
	/**
	 * Method to know if a PNJ given is in the Room
	 * @param pnj It is the PNJ that you want to know if he is in or not.
	 * @return true if it he is present in the room 
	 * false if it is not present;
	 * 
	 */
	public boolean isPresent (PNJ pnj){
		if (!pnj.isAlive())
		return false;
		else {
			//TODO test sa présence dans le ArrayList<PNJ>
			return true;
		}
		
	
		
	}
	
	/**
	 * Method to know if an Item given is present in the room
	 * @param item The item tested
	 * @return true if the item is present in the room
	 * False if it is not present.
	 */
	public boolean isPresent (Item item){
		if (!item.getExist())
			return false;
		else {
			//TODO test sa présence dans le ArrayList<Item>
			return true;
		}
		
	}
	
	
	/**
	 * Method to add a PNJ in the Room
	 * This PNJ cannot be null or already in another Room 
	 * @param newPNJ The PNJ added in the Room
	 * 
	 * @see PNJ
	 */
	public void addPNJ(PNJ newPNJ)
	{
		
	}
	
	/**
	 * Method to remove a PNJ from the room.
	 * Test before if the PNJ is in the Room.
	 * The PNJ won't exist after he will be removed.
	 * @param pnjRemoved The PNJ that you want to remove
	 * 
	 * @see PNJ
	 */
	public void removePNJ(PNJ pnjRemoved)
	{
		
	}

	
	
	/**
	 * Method to add an Item in the Room
	 * This Item cannot be null or  already in another Room 
	 * @param newItem The Item added in the Room
	 * 
	 * @see Item
	 */
	public void addItem(Item newItem)
	{
		
	}
	
	/**
	 * Method to remove an Item from the room.
	 * Test before if the Item is in the Room.
	 * The Item won't exist after he will be removed.
	 * 
	 * @param itemRemoved the item that you want to remove
	 * 
	 * @see Item
	 */
	public void removeItem(Item itemRemoved)
	{
		
	}
	
	/**
	 * Method to get the Item in the Room
	 * This method will 
	 * <ul>
	 * <li>Test if the Item exist in the Room</li>
	 * <li>remove the item from the Room</li>
	 * <li>Set true for the parameter exist from the Item </li>
	 * </ul>
	 * 
	 * @param itemName The name of the Item
	 * @return the item if it is present in the room
	 */
	public Item getItem(String itemName){
		//TODO trouver l'objet dans le jeu portant ce nom (class comportant les objets existants)
		//TODO récupérer l'objet avec ce nom et tester si il est dans la Room
		//TODO si oui retourner l'objet et le retirer de la room proprement, tout en conservant le fait qu'il existe.
		return null  ;
	}



}
