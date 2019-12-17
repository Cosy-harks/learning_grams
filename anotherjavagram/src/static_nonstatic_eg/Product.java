package static_nonstatic_eg;

public class Product {
	int id;
	String name;
	double price;
	static float discount = 6.5f;
	
	public void printProduct() {
		System.out.println("id = " + id);
		System.out.println("name = " + name);
		System.out.println("price = " + price);
		System.out.println("discount = " + discount);
	}
}
