package override_objectclass;

public class Player {
	private String teamName;
	private long score;
	
	public Player() {
		System.out.println("MmHmM");
	}
	
	public Player(String teamName, long score) {
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
	}
	
	@Override
	public String toString() {
		return ("Hello " + teamName);
	}
	
	@Override
	public boolean equals(Object o) {
		Player p = (Player)o;
		if (this.score == p.score) {return true;}else {return false;}
	}
}
