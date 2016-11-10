package Core;

public class Key extends Item {
	
	private Lock lockOpened;
	
	public Key (String name, Lock lock){
		super(name);
		lockOpened=lock;
	}

}
