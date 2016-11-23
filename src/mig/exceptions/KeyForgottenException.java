package mig.exceptions;

public class KeyForgottenException extends Exception {
	public KeyForgottenException(){
		System.out.println("You try to instanciate a Bolt without a key, it is impossible.");
	}

}
