package snakegame;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creates an object instance of SnakeGame
		Scanner myScan;
		myScan = new Scanner(System.in);
		myScan.useDelimiter("");
		SnakeGame g = new SnakeGame();
		char play = 'y';
		
		do {
			g.play();
			//delete g;
			g = new SnakeGame();
			myScan.next();
			// Sets up the game to be played
			
			System.out.println("\nDo you want to play again(y/n)?");
			play = myScan.next().charAt(0);
		} while (play == 'y');
		myScan.close();
		//delete g;
		// Pauses display before exiting out.
		//system("pause");
	}

}
