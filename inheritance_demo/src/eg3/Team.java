package eg3;

public class Team {
	int id;
	String coach;
	String country;
	
	public Team(int id, String coach, String country) {
		this.id = id;
		this.coach = coach;
		this.country = country;
	}
	
	public void printTeam() {
		System.out.println("id: " + id + "\ncoach: " + coach + "\ncountry: " + country);
	}
}
