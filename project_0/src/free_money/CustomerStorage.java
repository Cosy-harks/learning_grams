package free_money;

import java.util.HashMap;
import java.util.Map;

public class CustomerStorage {
	private static Map<String, Customer> login = new HashMap<String, Customer>();

	public static Map<String, Customer> getLogin() {
		return login;
	}
	
	public static Customer getCustomer(String pass, String username) {
		if(login.get(pass).getUserName().equals(username)) {
			return login.get(pass);
		}
		return null;
	}

	public static void setLogin(Map<String, Customer> login) {
		CustomerStorage.login = login;
	}
	
	public static boolean addLogin(String pass, Customer customer) {
		if(login.get(pass) == null) {
			login.put(pass, customer);
			return true;
		}
		return false;
	}
	
	
}
