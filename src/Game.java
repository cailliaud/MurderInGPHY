import java.lang.reflect.Constructor;
import java.util.ArrayList;

public class Game {

	private Parser parser;
	private Player myPlayer;
	private ArrayList<PNJ> listPNJ;
	public Room hall,td1;
	
	public Game() 
	{
		parser = new Parser();
		myPlayer = new Player(outside);
	}
	
	public void play()
	{
	
	}
}
