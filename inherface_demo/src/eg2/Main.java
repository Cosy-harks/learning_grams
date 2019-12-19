package eg2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p=new Implementor();//access only parent & object
		
		Child c = new Implementor();//access only child & object
		
		Child.Inner i = new Implementor();//access only inner & object
	}

}
