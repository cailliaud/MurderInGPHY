package mig.exceptions;


public class NullQuestionException extends Exception{
	public NullQuestionException() {
		System.out.println("You have to enter a question for an enigma if you give an EnigmaItem or a String as answer.");
	}
}