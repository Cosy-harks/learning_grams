package eg;

public class Product {
	private int id;
	private String name;
	private double price;
	
	// Always have an empty constructor
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public void printProduct() {
		System.out.println("id = " + id);
		System.out.println("name = " + name);
		System.out.println("price = " + price);
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
