package Core;

public class Lock extends Bolt {
	private Key key;
	
	public Lock (Boolean locked, Key key){
		super();
		this.key = key;

	}

	private boolean checkKey(Key key_given)
	{
		return false;
	}

	public void opened(Key key_given) 
	{
	}
	
}
