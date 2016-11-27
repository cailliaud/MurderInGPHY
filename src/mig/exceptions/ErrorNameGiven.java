package mig.exceptions;

public class ErrorNameGiven extends Exception {
	public ErrorNameGiven(){
		System.out.println("There is no object with this name, maybe you write it with mistakes.");
	}

}
