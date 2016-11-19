package mig.core;
import java.util.ArrayList;
import java.util.Hashtable;

/**
 * <b>Room is the class representing a room, in a building for example.</b>
 * <p>
 * A door contains these elements :
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
	 * 
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



}
