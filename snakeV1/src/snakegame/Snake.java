package snakegame;
import java.util.Vector;

public class Snake {
	private int bound;
	private char direction;
	private boolean alive;
	private Vector<int[]> pos;
	
	public Snake() {
		// checks that the snake is w/in the board
		bound = 16;

		// starting direction is down
		direction = 'd';

		// starting position is saved
		pos = new Vector<int[]>();
		for (int i = 0; i < 3; i++)
		{
			//use the {} to construct a pair within the push_back method
			pos.add(new int[]{8, 8 - i, 8 - i});
		}
		// It's ALIVE!
		alive = true;
	}

	public Snake(int bound, char direction, boolean alive, Vector<int[]> pos) {
		super();
		this.bound = bound;
		this.direction = direction;
		this.alive = alive;
		this.pos = pos;
	}
	
	// i = index of snake body length; ".first"/".second.first"/".second.second" = 'x'/'y'/'z'
	public int getXofPartI(int i) { return pos.elementAt(i)[0]; }
	public int getYofPartI(int i) { return pos.elementAt(i)[1]; }
	public int getZofPartI(int i) { return pos.elementAt(i)[2]; }

	// returns the length of the snake
	public int getLength() { return pos.size(); }

	public int getBound() {
		return bound;
	}

	public void setBound(int bound) {
		this.bound = bound;
	}

	public char getDirection() {
		return direction;
	}

	public void setDirection(char direction) {
		this.direction = direction;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public Vector<int[]> getPos() {
		return pos;
	}

	public void setPos(Vector<int[]> pos) {
		this.pos = pos;
	}
	
	//true giveUp ==> false alive
	public void gaveUp(boolean b) { alive = !b; }
	
	// Update the direction
	public void changeDirection(char d) { direction = d; }
	
	public void grow()
	{
		// adds a body position at the end of the snake
		pos.add(pos.elementAt(pos.size() - 1));
	}
	
	public void update()
	{
		// moves each snake position forward one so the snake can move
		for (int i = pos.size() - 1; i > 0; i--)
		{
			// gets the pair's position ahead of it
			pos.setElementAt(pos.elementAt(i - 1), i);
		}
		// This makes for an interesting game
		//pos[pos.size() - 1].first = pos[0].first;
		//pos[pos.size() - 1].second = pos[0].second;

		// (de/in)crement head position based on the direction
		switch (direction)
		{
		case 'g':// deepening
			// z position incremented
			pos.elementAt(0)[2]++;
			break;
		case 's':// shallowing
			// z position decrementing
			pos.elementAt(0)[2]--;
			break;
		case 'u':// up
				 // y position decremented
			pos.elementAt(0)[1]--;
			break;
		case 'd':// down
				 // y position incremented
			pos.elementAt(0)[1]++;
			break;
		case 'l':// left
				 // x position decremented
			pos.elementAt(0)[0]--;
			break;
		case 'r':// right
				 // x position incremented
			pos.elementAt(0)[0]++;
			break;
		default:
			break;
		}

		// check for hitting a wall
		outOfBounds();
		// check for eating itself
		didEatSelf();
	}
	
	// determines if the snake ate a wall
	private boolean outOfBounds()
	{
		// Checks to see if snake head ate the left or right wall
		//it uses pos[0] because that's where the head is and the
		//body alway follows the path of the head so it won't go out of bounds
		//before the head.
		if (pos.elementAt(0)[0] < 1 || pos.elementAt(0)[0] > bound)
		{
			// Condition met the snake ate a wall and ruined his
			//digestion, killing himself
			alive = false;
			System.out.println("\n\nYOU WENT OUT OF BOUNDS\n\n");
		}
		// Checks to see if snake head ate the top or bottom wall.
		//"..."
		else if (pos.elementAt(0)[1] < 1 || pos.elementAt(0)[1] > bound)
		{
			// Condition met the snake ate a wall and ruined his
			//digestion, killing himself
			alive = false;
			System.out.println("\n\nYOU WENT OUT OF BOUNDS\n\n");
		}
		// Checks to see if snake head ate the ground or the ceiling.
		//"..."
		else if (pos.elementAt(0)[2] < 1 || pos.elementAt(0)[2] > bound)
		{
			// Condition met the snake ate a wall and ruined his
			//digestion, killing himself
			alive = false;
			System.out.println("\n\nYOU WENT OUT OF BOUNDS\n\n");
		}

		// returns boolean determining if the snake is dead
		return alive;
	}
	
	// Determines if the snake ate itself
	private boolean didEatSelf()
	{
		// Loop for the size of the snake if it's alive
		for (int i = 1; i < pos.size() && alive; i++)
		{
			// compares the head position to each body sections position
			if (pos.elementAt(0) == pos.elementAt(i))
			{
				// Condition is met the snake ate itself resulting in death
				alive = false;
				// Prints the words in "..." to the display
				System.out.println("\n\nYOU ATE YOURSELF!\n\tYOU CANNIBAL!\n\n");
				// breaks from loop
				break;
			}
		}
		// returns boolean determining if the snake is dead
		return alive;
	}
}
