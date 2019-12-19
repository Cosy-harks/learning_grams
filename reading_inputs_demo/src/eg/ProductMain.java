package eg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("How many products");
		int n=scanner.nextInt();
		List<Product> pList=new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			System.out.println("Product "+i);
			System.out.println("Enter id");
			int id = scanner.nextInt();
			System.out.println("Product name?");
			String s=scanner.next();
			pList.add(new Product(id, s));
		}
		
		System.out.println(pList);
	}

}
