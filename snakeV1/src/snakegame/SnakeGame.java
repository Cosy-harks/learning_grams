package snakegame;

import java.util.Scanner;
import java.lang.Thread;

public class SnakeGame {
	// initializes time between updates and
	//playing to false because the game hasn't started
	SnakeGame() {
		sleepTime = 500;
		playing = false;
		myScan = new Scanner(System.in);
		myScan.useDelimiter("");
		theBoard = new Board();
	}
	// Enables the game
	void play() {
		// sets theSnake into board tiles and prints the board, tile by tile, to the console
		theBoard.display();
		
		// Pause lets user read the instructions and get themselves ready to play
		//system("pause"), getUserInput();

		// Player has pressed something causing the game to start
		playing = true;

		while (playing)
		{

			// Determines if keyboard character was hit and which one
			getUserInput();

			// Places fruit in new spot and or moves the snake
			theBoard.update();

			// clears the console of printed information
			//system("cls");

			theBoard.display();

			sleepTime = (sleepTime > 200) ? sleepTime-- : sleepTime; 
			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			playing = theBoard.isPlaying();
		}

		System.out.println("\nGAME OVER\n\n");
	};

	// reads each input from the keyboard
	void getUserInput() {
		theBoard.parseInput(myScan.next().charAt(0));
		//_kbhit == keyboard hit
		/*if (_kbhit())
		{
			//_getch() == getchar() == get input
			theBoard.parseInput(_getch());
		}*/
	};

	
	// time between updates
	private int sleepTime;
	// if true snake moves
	private boolean playing;
	// The SnakeGame needs a board to play on
	private Board theBoard;
	
	private Scanner myScan;
}
