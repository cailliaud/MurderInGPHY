package Core;

public class Code extends Bolt {
	private String password;

	public Code(String mdp){
		super();
		password= mdp;
	}

	public String getPass()
	{
		return password;
	}
	private boolean checkPassword(String pass)
	{
		if (pass.equals(password))
		{
			return true;
		}
		else {
			return false;
		}
	}

	public void opened(String mdp) 
	{
	}
}
