package mig.exceptions;

public class FailedResolvEnigma extends Exception {
	public FailedResolvEnigma(boolean isResolved){
		if (!isResolved) 
			System.out.println("THe answer is not good.");
		else 
			System.out.println("This enigma is already resolved");
	}

}
