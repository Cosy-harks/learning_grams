package snakegame;

import java.lang.Math;

public class Board {
	//why is this a const static int and not an int?

	// A const static int won't change and is only made
	//once to be used by all instances of class board.
	//w/out const we wouldn't be able to initialize it here
	//w/out static we wouldn't be able to initialize other 
	static int size = 18;

	// assign the size of the 3D board
	String tiles[][][];

	// The board holds the snake's positions
	Snake theSnake;

	//how can we use std::pair in this header?
	//why don't we have to include <utility> for it?

	// We can use std::pair because we include the <utility>
	//header in the included "snake.h" header.
	int[] fruit;

	// true if playing
	boolean playing;

	// This will contain the board then print it all at once
	StringBuilder angles;
	
	public Board() {
		// TODO Auto-generated constructor stub
		// makes a seed to randomize start position
		//and fruit locations
		//Math.srand(time(NULL));
		angles = new StringBuilder();
		
		tiles = new String[size][size][size];
		
		fruit = new int[3];

		// x increment till size
		for (int x = 0; x < size; x++)
		{
			// y increment till size for every x value
			for (int y = 0; y < size; y++)
			{
				for (int z = 0; z < size; z++) {
					// tiles 
					tiles[x][y][z] = "  ";
				}
			}
		}

		// assign boarder
		for (int i = 0; i < size; i++)
		{
			// Top and bottom walls
			tiles[i][0][0] = " -";
			tiles[i][size - 1][0] = "- ";
			tiles[0][0][i] = " -";
			tiles[i][0][size - 1] = " -";
			tiles[i][size - 1][size - 1] = "- ";
			tiles[0][size - 1][i] = " -";
			tiles[size - 1][0][i] = "- ";
			// Left and right walls
			tiles[0][i][0] = " |";
			tiles[size - 1][i][0] = "| ";
			tiles[0][i][size - 1] = " |";
			tiles[size - 1][i][size - 1] = "| ";
			tiles[0][size - 1][i] = " |";
			tiles[size - 1][size - 1][i] = "- ";
		}
		tiles[0][size - 1][0] = "- ";// asthetics

		// Assign snake head position and makes sure the snake
		//is w/in the board.
		theSnake = new Snake();

		// idkw.
		theSnake.setBound(size - 2);

		// Picks a spot for the fruit w/in
		//bounds and not on thesnake
		placeFruit();

		playing = true;
	}
	
	// The board gets new locations for content
	void update()
	{
		// the snake moves this function records it
		theSnake.update();

		// checks if the snake is alive
		playing = theSnake.isAlive();

		// checks if the snake has eaten a fruit
		if (theSnake.getXofPartI(0) == fruit[0] && theSnake.getYofPartI(0) == fruit[1] && theSnake.getZofPartI(0) == fruit[2])
		{
			// the snake grows
			theSnake.grow();
			// a new fruit location needs to be determined
			placeFruit();
		}
	}
	
	// picks a spot for the fruit
	void placeFruit()
	{
		// .first is x-coordinate, it gets a number between 1 and 16
		fruit[0] = randomPoint();
		// .second is y-coordinate, it gets a number between 1 and 16
		fruit[1] = randomPoint();
		fruit[2] = randomPoint();

		// loops the snakes length
		for (int i = 0; i < theSnake.getLength(); i++)
		{
			// checks for fruit being on/under snake
			if (theSnake.getXofPartI(i) == fruit[0] && theSnake.getYofPartI(i) == fruit[1] && theSnake.getZofPartI(i) == fruit[2])
			{
				// Picks new spot for fruit, because it was found on the snake
				fruit[0] = randomPoint();
				fruit[1] = randomPoint();
				fruit[2] = randomPoint();
				// just in case the fruit landed on the snake again
				i = 0;
			}
		}
	}
	
	void display()
	{
		// place fruit in its determined place
		tiles[fruit[0]][fruit[1]][fruit[2]] = " *";

		// does not write over head
		if (theSnake.getLength() == 3)
		{
			for (int i = 1; i < theSnake.getLength(); i++)
			{
				// Places snake body parts onto the board
				//in each of its positions
				tiles[theSnake.getXofPartI(i)][theSnake.getYofPartI(i)][theSnake.getZofPartI(i)] = " @";
			}
		}
		else {
			for (int i = theSnake.getLength() - 1; tiles[theSnake.getXofPartI(i)][theSnake.getYofPartI(i)][theSnake.getZofPartI(i)] != " @"
				&& i != 0; i--)
			{
				// Places snake body parts onto the board
				//in each of its positions
				tiles[theSnake.getXofPartI(i)][theSnake.getYofPartI(i)][theSnake.getZofPartI(i)] = " @";
			}
			// places snake body part where its head was in the previous update
			tiles[theSnake.getXofPartI(1)][theSnake.getYofPartI(1)][theSnake.getZofPartI(1)] = " @";
		}

		// Print basic instructions
		angles.append("\n\tq: to quit\n\t8: up\t5: down\t\t\t\t\t\t8: up\t5: down\n\t4: left\t6: right\t\t\t\t\t9: left\t3:right\n\t9:");
		angles.append("surfacing\t3: deeper\t\t\t\t4: surfacing\t6: deeper\n");

		// print the board to console
		for (int y = 0; y < size; y++){
			angles.append("\t");
			displayLine(y, "xy");

			angles.append("\t\t");
			displayLine(y, "zy");
			angles.append("\n");
		}

		angles.append("\n\n");
		for (int z = 0; z < size; z++) {
			angles.append("\t");
			displayLine(z, "xz");
			angles.append("\n");
		}
		
		System.out.println(angles);
		angles.replace(0, angles.length(), "");

		// removes snake from board completely so we don't have to keep track
		//of conditions.
		//for (int i = 0; i < theSnake.getLength(); i++)
		//{

		// Only the last snake body part will need to be taken off
		tiles[theSnake.getXofPartI(theSnake.getLength() - 1)][theSnake.getYofPartI(theSnake.getLength() - 1)][theSnake.getZofPartI(theSnake.getLength() - 1)] = "  ";
		//}
	}
	
	void displayLine(int row, String orientation) {

		if (orientation == "xy") {
			// determines direction of snake head and
			//puts in char specified for each direction
			switch (theSnake.getDirection())
			{
			case 'u':// up
				tiles[theSnake.getXofPartI(0)][theSnake.getYofPartI(0)][theSnake.getZofPartI(0)] = " ^";
				break;
			case 'd':// down
				tiles[theSnake.getXofPartI(0)][theSnake.getYofPartI(0)][theSnake.getZofPartI(0)] = " v";
				break;
			case 'l':// left
				tiles[theSnake.getXofPartI(0)][theSnake.getYofPartI(0)][theSnake.getZofPartI(0)] = " <";
				break;
			case 'r':// right
				tiles[theSnake.getXofPartI(0)][theSnake.getYofPartI(0)][theSnake.getZofPartI(0)] = " >";
				break;
			case 's':// surfacing
				tiles[theSnake.getXofPartI(0)][theSnake.getYofPartI(0)][theSnake.getZofPartI(0)] = " X";
				break;
			case'g':// deepening
				tiles[theSnake.getXofPartI(0)][theSnake.getYofPartI(0)][theSnake.getZofPartI(0)] = " a";
				break;
			default:
				break;
			}
			// y == row, Z - axis is searched at X for a character other than "  "
			for (int x = 0, z = 0; x < size; x++) {
				for (z = 0; z < size - 1; z++) {
					if (tiles[x][row][z] != "  ") {
						break;
					}
				}
				angles.append(tiles[x][row][z]);
			}
		}
		else if (orientation == "zy") {
			// determines direction of snake head and
			//puts in char specified for each direction
			switch (theSnake.getDirection())
			{
			case 'u':// up
				tiles[theSnake.getXofPartI(0)][theSnake.getYofPartI(0)][theSnake.getZofPartI(0)] = " ^";
				break;
			case 'd':// down
				tiles[theSnake.getXofPartI(0)][theSnake.getYofPartI(0)][theSnake.getZofPartI(0)] = " v";
				break;
			case 'l':// left
				tiles[theSnake.getXofPartI(0)][theSnake.getYofPartI(0)][theSnake.getZofPartI(0)] = " a";
				break;
			case 'r':// right
				tiles[theSnake.getXofPartI(0)][theSnake.getYofPartI(0)][theSnake.getZofPartI(0)] = " X";
				break;
			case 's':// surfacing
				tiles[theSnake.getXofPartI(0)][theSnake.getYofPartI(0)][theSnake.getZofPartI(0)] = " <";
				break;
			case'g':// deepening
				tiles[theSnake.getXofPartI(0)][theSnake.getYofPartI(0)][theSnake.getZofPartI(0)] = " >";
				break;
			default:
				break;
			}
			for (int x = 0, z = 0; z < size; z++) {
				for (x = size - 1; x > 1; x--) {
					if (tiles[x][row][z] != "  ") {
						break;
					}
				}
				angles.append(tiles[x][row][z]);
			}
		}
		else if (orientation == "xz") {
			// determines direction of snake head and
			//puts in char specified for each direction
			switch (theSnake.getDirection())
			{
			case 'u':// up
				tiles[theSnake.getXofPartI(0)][theSnake.getYofPartI(0)][theSnake.getZofPartI(0)] = " a";
				break;
			case 'd':// down
				tiles[theSnake.getXofPartI(0)][theSnake.getYofPartI(0)][theSnake.getZofPartI(0)] = " X";
				break;
			case 'l':// left
				tiles[theSnake.getXofPartI(0)][theSnake.getYofPartI(0)][theSnake.getZofPartI(0)] = " <";
				break;
			case 'r':// right
				tiles[theSnake.getXofPartI(0)][theSnake.getYofPartI(0)][theSnake.getZofPartI(0)] = " >";
				break;
			case 's':// surfacing
				tiles[theSnake.getXofPartI(0)][theSnake.getYofPartI(0)][theSnake.getZofPartI(0)] = " ^";
				break;
			case'g':// deepening
				tiles[theSnake.getXofPartI(0)][theSnake.getYofPartI(0)][theSnake.getZofPartI(0)] = " v";
				break;
			default:
				break;
			}
			for (int x = 0, y = 0; x < size; x++) {
				for (y = size - 1; y > 0; y--) {
					if (tiles[x][y][row] != "  ") {
						break;
					}
				}
				angles.append(tiles[x][y][row]);
			}
		}
	}
	
	void parseInput(char c)
	{
		// input for changing direction
		switch (c)
		{
		case 'q':// quit
				 // No longer playing
			playing = false;
			// theSnake.gaveUp == true makes theSnake.alive == false
			theSnake.gaveUp(!playing);
			System.out.println("\nEXITING\n");
			break;
		case '4':// left
			theSnake.changeDirection('l');
			break;
		case '8':// up
			theSnake.changeDirection('u');
			break;
		case '6':// right
			theSnake.changeDirection('r');
			break;
		case '5':// down
			theSnake.changeDirection('d');
			break;
		case '3':// depth
			theSnake.changeDirection('g');
			break;
		case '9':// depth
			theSnake.changeDirection('s');
			break;
		default: // characters other than "dawqs"
			break;
		}
	}

	// Returns integer between 1 and 16; just w/in the boarders.
	int randomPoint() { return 1 + (int)Math.round((Math.random()*20) % (size - 2)); }

	// boolean true if playing.
	boolean isPlaying() { return playing; }
}
