import java.util.HashMap;

import Core.Door;

public class Room {

	private String name;
	private HashMap<String,Door> myExits = new HashMap<String,Door>();
	
	
	//constructor
	public Room(String nameRoom)
	{
		
	}
	
	public String getName(){
		return name;
	}
	
	public void addDoor(String direction, Door door) 
    {
    	
    }
    


   
    public Room getRoom() 
    {
    		return null;
    }
  
    
    
    public String getExits()
    {
    	return null;
    	
    }
    
    public boolean exitsPossible(String direction)
    {
    	return false;
    }

	
	
}
