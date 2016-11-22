package mig.core;

/**
 * <b>DirectionWords is a class that contains the directions allowed in the Game Murder in GPHY</b>
 * <p> These are directions authorized : </p>
 * North, east, west, south, north-east, north-west, south-east, south-west, up and down
 * @author Group8
 * @version 19/11/2016
 * 
 *
 */
public class DirectionWords {
	/**
	 * It is the list of valid directions 
	 * It is a final parameter because it is forbidden to change it 
	 */
	private static final String[] validDirections = {
			"north", "east", "west" , "south",
			"north-east", "north-west",
			"south-east", "south-west","up","down"
	};
	
	/**
	 * Constructor of the class DirectionWords
	 * It is empty because this object 
	 */
	public DirectionWords()
	{
		// nothing to do at the moment...
	}

	/**
	 * Check whether a given String is a valid direction. 
	 * @param aString It is the String tested
	 * @return true if a given string is a valid direction,
	 * false if it is not.
	 */
	public  boolean isDirection(String aString)
	{
		for(int i = 0; i < validDirections.length; i++) {
			if(validDirections[i].equals(aString))
				return true;
		}
		// if we get here, the string was not found in the commands
		return false;
	}

}
