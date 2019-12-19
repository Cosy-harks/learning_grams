package eg3;

public class Player extends Person{
	private Team team; //has-a relation(composition/association)
	private long score;
	
	public Player() {
		System.out.println("MmHmM");
	}
	
	public void printPlayer() {
		super.printPerson();
		team.printTeam();
		System.out.println("Score: " + score);
	}

	public Player(int id, String name, Team team, long score) {
		super(id, name);
		this.team = team;
		this.score = score;
	}
	
}
