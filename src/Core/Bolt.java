package Core;

public abstract class Bolt {

	private boolean locked;
	
	public Bolt(){
		locked = false; 
	}
	
	public boolean checkState () {
		return false;
	}
}
