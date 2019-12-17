package eg2;

public class Player extends Person{
	private String teamName;
	private long score;
	
	public Player() {
		System.out.println("MmHmM");
	}
	
	public Player(int id, String name, String teamName, long score) {
		super(id, name);
		this.teamName = teamName;
		this.score = score;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public long getScore() {
		return score;
	}

	public void setScore(long score) {
		this.score = score;
	}
	
	public void printPlayer() {
		System.out.println("Team Name: " + teamName);
		System.out.println("Score: " + score);
		System.out.println("ID: " + this.getId());
		System.out.println("Name: " + this.getName());
	}
}
