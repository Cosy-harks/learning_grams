package real_world_objects;

public class Flight implements Comparable<Flight> {
	private int id;
	private String name;
	private double cost;
	private float rating;
	public Flight(int id, String name, double cost, float rating) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.rating = rating;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return "Flight [id = " +id+", name = "+name+", cost = "+cost+", rating = "+rating+"]";
	}
	
	@Override
	public int compareTo(Flight o) {
		Integer i1=this.id;
		Integer i2=o.id;
		return i1.compareTo(i2);
	}
	
	
}
