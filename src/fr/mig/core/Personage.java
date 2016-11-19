package fr.mig.core;

public abstract class Personage {

	private String name;
	private Room currentRoom;
	private boolean isKiller;
	
	//constructor of personage class
	public Personage(String name, Room currentRoom, Boolean isKiller){
	}
	
	//return the name of the personage
	public   String getName(String name){
		return null;
	}

	//return the boolean if the character is the killer
	public Boolean getIsKiller(Boolean isKiller){
		return false;
	}

	//return the room where the character is
	public String getRoom(String currentRoom){
		return null;
	}
	
	//go in a new room
	public void setCurrentRoom(Room newRoom){
		
	}
	
}
