package free_money;

public class CustomerCheck {
	
	//private static Map<String, Customer> login = new HashMap<String, Customer>();
	
	public static boolean isName(String s) {
		// TODO Auto-generated method stub
			if(!s.matches("[a-zA-Z0-9]{4,}")) {
				if(s.matches("[^a-zA-Z0-9]")) {
					System.out.println("No special Characters please");
				}
				return false;
			}
		return true;
	}
	
	public static boolean isPass(String s) {
		// TODO Auto-generated method stub
			if(!s.matches("[^a-zA-Z0-9]+[a-zA-Z0-9]+[^a-zA-Z0-9]+")) {
				System.out.println("Passwords need at least 2 special characters not next to each other.");
				return false;
			}
		return true;
	}
	
	public static boolean newUser(String name, String pass) {
		if(CustomerStorage.getLogin().get(pass) == null) {
			CustomerStorage.addLogin(pass, new Customer(name));
			return true;
		}
		return false;
	}
	
	public static Customer login(String name, String pass) {
		Customer tmp = CustomerStorage.getLogin().get(pass);
		if(tmp == null) {
			return null;
		}else if(tmp.getUserName().equals(name)) {
			return tmp;
		}
		//TODO Throw / Make error
		return null;
	}
}
