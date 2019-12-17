package eg;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product(100, "TV", 50.11d);
		//p1.id = 100; //product leakage
		//data manipulation should be trackable
		p1.printProduct();
		p1.setId(20);
		p1.printProduct();
	}

}
