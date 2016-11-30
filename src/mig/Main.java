package mig;


import mig.core.Game;
import mig.view.Window;


public class Main {
	public static Game mygame;
	public static Window myWindow;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mygame = new Game("Nicolas");
		myWindow = new Window(mygame);
//		
	}
}




