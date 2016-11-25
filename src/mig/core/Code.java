package mig.core;

/**
 * <b> Code is the class that creates a lock with a password to unlock it.</b>
 * <b> Code extends from Bolt.</b>
 * <p>
 * A Code contains this element
 * </p>
 * <ul>
 * <li>A password that is used to unlock the Chest</li>
 * </ul>
 * 
 * 
 * @see Bolt
 * @see Chest
 * 
 * @author Group 8
 * @version 22/11/2016
 */
public class Code extends Bolt {
	
	/**
	 * String that contains the password to unlock he Bolt
	 */
	private String password;
	private boolean good_pass =false ;

	/**
	 * Default constructor
	 * @param mdp Password to unlock the Bolt
	 * 
	 * The Code is a Bolt locked as default.
	 * If the password given is null, the password will be "42"
	 */
	public Code(String mdp){
		super(true);
		if (mdp.isEmpty())
			{password= "42";}
		else {
			password= mdp;
		}
	}

//	/**
//	 * Method to get the password 
//	 * @return password
//	 * The password of the bolt
//	 */
//	public String getPass()
//	{
//		return password;
//	}
	
	/**
	 * Private Method to test if the password given is the same as the password of the Bolt
	 * If the password given by the player is false, it returns an error message that tells the player the password is wrong
	 * @param pass Password given to try to unlock the chest
	 * @return Boolean
	 * True if it is the same password or else false
	 */
	public void givePassword(String pass)
	{
		if (pass.equals(password))
		{
			this.good_pass= true;
		}
		else {
			this.good_pass= false;
		}
	}

	/**
	 * The complete method to try to unlock the Code
	 * @param mdp Password given to try to unlock the chest
	 * throw an exception
	 */
	@Override
	public void unlockIt() 
	{
		if (good_pass) {
			super.unlockIt();
		}
	}
	

}
