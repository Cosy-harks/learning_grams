package static_nonstatic_eg;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product();
		p1.id=100;
		p1.name = "TV";
		p1.price=50.11;
		
		Product.discount = 10.5f;
		
		Product p2=new Product();
		p2.id=102;
		p2.name = "TV-big";
		p2.price=150.11;
		
		System.out.println("Printing Product - p1");
		p1.printProduct();
		
		System.out.println("\nPrinting Product - p2");
		p2.printProduct();
	}

}
