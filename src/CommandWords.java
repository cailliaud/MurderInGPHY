
public class CommandWords {

	/**
	 * Constructor - initialize the command words
	 */
	public CommandWords()
	{
		// to complete
	}
	
	/**
	 * Check whether a given String is a valid command word.
	 * @return true if a given string is a valid command,
	 * false if it isn't.
	 */
	public boolean isCommand(String aString)
	{
		for(int i = 0; i < validCommands.length; i++) {
			if(validCommands[i].equals(aString))
				return true;
		}
		// if we get there, the string has not been found in the commands
		return false;
		
	}
}