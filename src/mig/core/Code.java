package mig.core;

/**
 * <b> Code is the class that creates a lock with a password to unlock it.</b>
 * <b> Code extends from Bolt.</b>
 * <p>
 * A Code contains this element
 * </p>
 * <ul>
 * <li>A password that is used to unlock the Chest</li>
 * <li>A boolean to know if a good password has been given</li>
 * </ul>
 * <p>A code is opened in 2 times </p>
 * <ul>
 * <li> First : you have to give the password</li>
 * <li> Second : you unlock the code if the pass given is good</li>
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
	
	/**
	 * boolean that will be false as default
	 * It represents if a good password has been given
	 */
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


	
	/**
	 * Public method to give the password
	 * Pay attention the case is important
	 * @param pass Password given to try to unlock the chest
	 * It will set the boolean good_pass True if it is the same password or else false
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
	 * Method to unlock the chest if the parameter good_pass is true
	 * It is an Overriding of the unlockIt method from the parent class Bolt
	 * @see Bolt#unlockIt()
	 */
	@Override
	public void unlockIt() 
	{
		if (good_pass) {
			super.unlockIt();
		}
	}
	

}
