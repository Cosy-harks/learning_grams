package snakegame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// Creates an object instance of SnakeGame
		SnakeGame g = new SnakeGame();
		char play = 'y';
		new BufferedReader(new InputStreamReader(System.in)).readLine();
		do {
			g.play();
			//delete g;
			g = new SnakeGame();
			// Sets up the game to be played
			
			System.out.println("\nDo you want to play again(y/n)?");
			play = new BufferedReader(new InputStreamReader(System.in)).readLine().charAt(0);
		} while (play == 'y');
		//delete g;
		// Pauses display before exiting out.
		//system("pause");
	}

}
