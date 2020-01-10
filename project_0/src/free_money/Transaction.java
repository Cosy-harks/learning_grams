package free_money;

public class Transaction {
	public static boolean doesUserHaveAccess(Customer c, Long l) {
		if(c.getAcctNums().contains(l)) {
			return true;
		}
		return false;
	}
	
	//TODO Move money - between accounts
	//TODO Send money - to someone else account
}
