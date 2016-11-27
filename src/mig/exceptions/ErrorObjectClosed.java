package mig.exceptions;

public class ErrorObjectClosed extends Exception {
	public ErrorObjectClosed(){
		System.out.println("It is locked, you cannot open it.");
	}
	
	

}
